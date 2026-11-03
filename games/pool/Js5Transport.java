/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    DualLinkDeque urgentPending;
    static na field_k;
    static int[] field_s;
    static nl field_h;
    DualLinkDeque urgentInFlight;
    static Sprite field_q;
    DualLinkDeque prefetchPending;
    static int[] field_n;
    static hj field_g;
    DualLinkDeque prefetchInFlight;
    PacketBuffer outgoingControl;
    long field_d;
    int field_m;
    static String mpGamedrawn;
    static int field_l;
    PacketBuffer incomingHeader;
    volatile int field_a;
    byte field_c;
    volatile int field_e;
    NetworkArchiveRequest currentRequest;

    final boolean isUrgentCapacityReached(byte param0) {
        if (param0 == -125) {
          return 20 <= this.urgentCount(param0 + 4734) ? true : false;
        }
        this.processNetwork(-57);
        return 20 <= this.urgentCount(param0 + 4734) ? true : false;
    }

    abstract boolean processNetwork(int param0);

    abstract void attachConnection(int param0, boolean param1, Object param2);

    final boolean isPrefetchCapacityReached(int param0) {
        if (param0 == 20) {
          return 20 <= this.prefetchCount(false) ? true : false;
        }
        this.urgentCount(-49);
        return 20 <= this.prefetchCount(false) ? true : false;
    }

    abstract void resetAfterValidationFailure(byte param0);

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        long var18;
        long var20;
        long var22;
        long var24;
        int var26;
        int var27;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var16Lifetime2;
        int var17Lifetime1;
        int var17Lifetime2;
        long var18Lifetime1;
        long var18Lifetime2;
        long var20Lifetime1;
        long var20Lifetime2;
        long var22Lifetime1;
        long var22Lifetime2;
        long var24Lifetime1;
        long var24Lifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        var12 = param2 - param4;
        var13 = param0 - param6;
        if (param11 == ~var12 &&
          var13 == 0) {
          return -1;
        }
        var14 = -param9 + param7;
        var15 = -param10 + param5;
        if (NameEntryPopup.a(var14, false, var12) + NameEntryPopup.a(var15, false, var13) > 0) {
          return -1;
        }
        if (param3 > param1) {
          param9 = param9 + NameEntryPopup.a(-param1 + param3, false, param4);
          param10 = param10 + NameEntryPopup.a(param3 - param1, false, param6);
          param1 = param3;
          var15 = param5 - param10;
          var14 = param7 - param9;
          var16 = param8 * param8 * 4;
          var17 = NameEntryPopup.a(var12, false, var12) + NameEntryPopup.a(var13, false, var13);
          if (var17 == 0) {
            return -1;
          }
          var18 = 2L * (FullscreenFocusCanvas.multiplyFixedChecked((long)var14, (long)var12, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var15, (long)var13, false));
          if (var18 <= 2147483647L &&
            -2147483648L <= var18) {
            if ((var14 >> 16) * (var14 >> 16) <= 2147483647 &&
              2147483647 >= (var15 >> 16) * (var15 >> 16)) {
              var20 = FullscreenFocusCanvas.multiplyFixedChecked((long)var14, (long)var14, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var15, (long)var15, false) - (long)(var16 << 16);
              var22 = FullscreenFocusCanvas.multiplyFixedChecked(var18, var18, false) - 4L * FullscreenFocusCanvas.multiplyFixedChecked((long)var17, var20, false);
              if (0L > var22) {
                return -1;
              }
              var24 = IterableNodeHashTable.a(param11 ^ 106, var22);
              if (var24 > 2147483647L) {
                throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
              }
              if (var24 < -2147483648L) {
                throw new IllegalStateException("Out of range: 0x" + Long.toString(var24, 16));
              }
              var26 = (int)((-var18 + var24 << 15) / (long)var17);
              var27 = (int)((-var18 - var24 << 15) / (long)var17);
              if (var26 > 0 &&
                65536 - param1 >= var26 &&
                var26 <= var27) {
                return var26 + param1;
              }
              if (var27 > 0 &&
                65536 - param1 >= var27) {
                return param1 + var27;
              }
              if (var26 <= 0 &&
                0 < var27) {
                return 1 + param1;
              }
              if (var27 <= 0 &&
                var26 > 0) {
                return 1 + param1;
              }
              return -1;
            }
            return -1;
          }
          return -1;
        }
        if (param1 <= param3) {
          var16Lifetime1 = param8 * param8 * 4;
          var17Lifetime1 = NameEntryPopup.a(var12, false, var12) + NameEntryPopup.a(var13, false, var13);
          if (var17Lifetime1 == 0) {
            return -1;
          }
          var18Lifetime1 = 2L * (FullscreenFocusCanvas.multiplyFixedChecked((long)var14, (long)var12, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var15, (long)var13, false));
          if (var18Lifetime1 <= 2147483647L &&
            -2147483648L <= var18Lifetime1) {
            if ((var14 >> 16) * (var14 >> 16) <= 2147483647 &&
              2147483647 >= (var15 >> 16) * (var15 >> 16)) {
              var20Lifetime1 = FullscreenFocusCanvas.multiplyFixedChecked((long)var14, (long)var14, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var15, (long)var15, false) - (long)(var16Lifetime1 << 16);
              var22Lifetime1 = FullscreenFocusCanvas.multiplyFixedChecked(var18Lifetime1, var18Lifetime1, false) - 4L * FullscreenFocusCanvas.multiplyFixedChecked((long)var17Lifetime1, var20Lifetime1, false);
              if (0L > var22Lifetime1) {
                return -1;
              }
              var24Lifetime1 = IterableNodeHashTable.a(param11 ^ 106, var22Lifetime1);
              if (var24Lifetime1 <= 2147483647L &&
                var24Lifetime1 >= -2147483648L) {
                var26Lifetime1 = (int)((-var18Lifetime1 + var24Lifetime1 << 15) / (long)var17Lifetime1);
                var27Lifetime1 = (int)((-var18Lifetime1 - var24Lifetime1 << 15) / (long)var17Lifetime1);
                if (var26Lifetime1 > 0 &&
                  65536 - param1 >= var26Lifetime1 &&
                  var26Lifetime1 <= var27Lifetime1) {
                  return var26Lifetime1 + param1;
                }
                if (var27Lifetime1 > 0 &&
                  65536 - param1 >= var27Lifetime1) {
                  return param1 + var27Lifetime1;
                }
                if (var26Lifetime1 <= 0 &&
                  0 < var27Lifetime1) {
                  return 1 + param1;
                }
                if (var27Lifetime1 > 0) {
                  return -1;
                }
                if (var26Lifetime1 > 0) {
                  return 1 + param1;
                }
                return -1;
              }
              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24Lifetime1, 16));
            }
            return -1;
          }
          return -1;
        }
        param7 = param7 + NameEntryPopup.a(-param3 + param1, false, param2);
        param5 = param5 + NameEntryPopup.a(-param3 + param1, false, param0);
        param3 = param1;
        var14Lifetime1 = param7 - param9;
        var15Lifetime1 = param5 - param10;
        var16Lifetime2 = param8 * param8 * 4;
        var17Lifetime2 = NameEntryPopup.a(var12, false, var12) + NameEntryPopup.a(var13, false, var13);
        if (var17Lifetime2 == 0) {
          return -1;
        }
        var18Lifetime2 = 2L * (FullscreenFocusCanvas.multiplyFixedChecked((long)var14Lifetime1, (long)var12, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var15Lifetime1, (long)var13, false));
        if (var18Lifetime2 <= 2147483647L &&
          -2147483648L <= var18Lifetime2) {
          if ((var14Lifetime1 >> 16) * (var14Lifetime1 >> 16) <= 2147483647 &&
            2147483647 >= (var15Lifetime1 >> 16) * (var15Lifetime1 >> 16)) {
            var20Lifetime2 = FullscreenFocusCanvas.multiplyFixedChecked((long)var14Lifetime1, (long)var14Lifetime1, false) + FullscreenFocusCanvas.multiplyFixedChecked((long)var15Lifetime1, (long)var15Lifetime1, false) - (long)(var16Lifetime2 << 16);
            var22Lifetime2 = FullscreenFocusCanvas.multiplyFixedChecked(var18Lifetime2, var18Lifetime2, false) - 4L * FullscreenFocusCanvas.multiplyFixedChecked((long)var17Lifetime2, var20Lifetime2, false);
            if (0L > var22Lifetime2) {
              return -1;
            }
            var24Lifetime2 = IterableNodeHashTable.a(param11 ^ 106, var22Lifetime2);
            if (var24Lifetime2 > 2147483647L) {
              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24Lifetime2, 16));
            }
            if (var24Lifetime2 < -2147483648L) {
              throw new IllegalStateException("Out of range: 0x" + Long.toString(var24Lifetime2, 16));
            }
            var26Lifetime2 = (int)((-var18Lifetime2 + var24Lifetime2 << 15) / (long)var17Lifetime2);
            var27Lifetime2 = (int)((-var18Lifetime2 - var24Lifetime2 << 15) / (long)var17Lifetime2);
            if (var26Lifetime2 > 0 &&
              65536 - param1 >= var26Lifetime2 &&
              var26Lifetime2 <= var27Lifetime2) {
              return var26Lifetime2 + param1;
            }
            if (var27Lifetime2 > 0 &&
              65536 - param1 >= var27Lifetime2) {
              return param1 + var27Lifetime2;
            }
            if (var26Lifetime2 <= 0 &&
              0 < var27Lifetime2) {
              return 1 + param1;
            }
            if (var27Lifetime2 > 0) {
              return -1;
            }
            if (var26Lifetime2 > 0) {
              return 1 + param1;
            }
            return -1;
          }
          return -1;
        }
        return -1;
    }

    final int prefetchCount(boolean param0) {
        if (!param0) {
          return this.prefetchPending.size(0) + this.prefetchInFlight.size(0);
        }
        this.field_m = -3;
        return this.prefetchPending.size(0) + this.prefetchInFlight.size(0);
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        mpGamedrawn = null;
        field_k = null;
        field_q = null;
        field_n = null;
        field_h = null;
        if (param0 > 116) {
          field_g = null;
          return;
        }
    }

    abstract void closeSocket(byte param0);

    final NetworkArchiveRequest requestGroup(int param0, int param1, byte param2, boolean param3, int param4) {
        if (param4 != -154018400) {
          return (NetworkArchiveRequest) null;
        }
        long var6 = (long)param0 + ((long)param1 << 32);
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.field_x = param3 ? true : false;
        var8.reservedTailBytes = param2;
        var8.field_m = var6;
        if (!param3) {
          if (20 <= this.prefetchCount(false)) {
            throw new RuntimeException();
          }
          this.prefetchPending.a(var8, false);
        } else {
          if (!(this.urgentCount(4609) < 20)) {
            throw new RuntimeException();
          }
          this.urgentPending.a(var8, false);
        }
        return var8;
    }

    final int urgentCount(int param0) {
        if (param0 != 4609) {
          return 86;
        }
        return this.urgentPending.size(0) + this.urgentInFlight.size(0);
    }

    Js5Transport() {
        this.urgentPending = new DualLinkDeque();
        this.urgentInFlight = new DualLinkDeque();
        this.prefetchPending = new DualLinkDeque();
        this.prefetchInFlight = new DualLinkDeque();
        this.outgoingControl = new PacketBuffer(6);
        this.field_e = 0;
        this.field_a = 0;
        this.field_c = (byte) 0;
        this.incomingHeader = new PacketBuffer(10);
    }

    static {
        field_k = new na();
        field_s = new int[16];
        field_h = new nl();
        field_n = new int[16];
        field_g = new hj(8, 0, 4, 1);
        mpGamedrawn = "Game drawn";
    }
}
