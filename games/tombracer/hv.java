/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hv extends ci {
    static String field_n;
    private int field_p;
    static String field_o;
    private int field_m;

    public hv() {
        super(1, true);
        this.field_p = 0;
        this.field_m = 4096;
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param0 == 1) {
            break L0;
          } else {
            hv.a(true);
            break L0;
          }
        }
        L1: {
          var8 = this.field_i.a((byte) -112, param1);
          var3 = var8;
          if (!this.field_i.field_d) {
            break L1;
          } else {
            var4 = this.c(0, -125, param1);
            var5 = 0;
            L2: while (true) {
              if (var5 >= ns.field_g) {
                break L1;
              } else {
                L3: {
                  L4: {
                    var6 = var4[var5];
                    stackIn_8_0 = (int[]) (var8);

                    stackIn_8_1 = var5;

                    if (this.field_p > var6) {
                      break L4;
                    } else {




                      if (this.field_m >= var6) {
                        stackIn_10_0 = (int[]) ((Object) stackIn_8_0);
                        stackIn_10_1 = stackIn_8_1;
                        stackIn_10_2 = 4096;
                        break L3;
                      } else {
                        stackIn_8_0 = (int[]) ((Object) stackIn_8_0);

                        break L4;
                      }
                    }
                  }
                  stackIn_10_0 = (int[]) ((Object) stackIn_8_0);
                  stackIn_10_1 = stackIn_8_1;
                  stackIn_10_2 = 0;
                  break L3;
                }
                stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                var5++;
                continue L2;
              }
            }
          }
        }
        return var8;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.c(119, 60);
                break L1;
              }
            }
            L2: {
              var4_int = param2;
              if (var4_int == 0) {
                this.field_p = param1.d(125);
                break L2;
              } else {
                if (var4_int != 1) {
                  break L2;
                } else {
                  this.field_m = param1.d(124);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("hv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        field_o = null;
        if (param0) {
            field_n = (String) null;
        }
    }

    static {
        field_n = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_o = "Mirror mirror on the wall, who's the best at bouncing shiny light beams of death around the room?";
    }
}
