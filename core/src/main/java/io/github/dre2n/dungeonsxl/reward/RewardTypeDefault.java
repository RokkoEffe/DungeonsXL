/*
 * Copyright (C) 2012-2017 Frank Baumann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.dre2n.dungeonsxl.reward;

/**
 * Default implementation of RewardType.
 *
 * @author Daniel Saukel
 */
public enum RewardTypeDefault implements RewardType {

    ITEM("item", ItemReward.class),
    MONEY("money", MoneyReward.class),
    LEVEL("level", LevelReward.class);

    private String identifier;
    private Class<? extends Reward> handler;

    RewardTypeDefault(String identifier, Class<? extends Reward> handler) {
        this.identifier = identifier;
        this.handler = handler;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public Class<? extends Reward> getHandler() {
        return handler;
    }

}
