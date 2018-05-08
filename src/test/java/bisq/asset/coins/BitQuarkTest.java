/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.asset.coins;

import bisq.asset.AbstractAssetTest;

import org.junit.Test;

public class BitQuarkTest extends AbstractAssetTest {

    public BitQuarkTest() {
        super(new BitQuark.Mainnet());
    }

    @Test
    public void testValidAddresses() {
        assertValidAddress("1MnPwdnYGGGDHN9eoYorzSYJE7bosNARNf");
        assertValidAddress("1KWkfupbwX1up1pMLg43jdqBG5X2Pdmg5p");
        assertValidAddress("18PFygCob3Mr2Fu3WyBYELh66yZ2XHjEcv");

    }

    @Test
    public void testInvalidAddresses() {
        assertInvalidAddress("X8PFygCob3Mr2Fu3WyBYELh66yZ2XHjEcv");
        assertInvalidAddress("XKWkfupbwX1up1pMLg43jdqBG5X2Pdmg5p");
        assertInvalidAddress("X8PFygCob3Mr2Fu3WyBYELh66yZ2XHjEcv#");
    }
}
