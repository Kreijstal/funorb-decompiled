/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aaa {
    lha field_c;
    rt[] field_i;
    lha field_h;
    rt[] field_f;
    static hla field_d;
    lha field_a;
    static int field_b;
    static String field_e;
    boolean field_g;

    public static void a(byte param0) {
        int var1 = 84 % ((83 - param0) / 35);
        field_d = null;
        field_e = null;
    }

    final static int a(boolean param0) {
        if (param0) {
            field_d = (hla) null;
            return mma.field_a;
        }
        return mma.field_a;
    }

    aaa(cka param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int var2_int = 0;
        lha var4 = null;
        int var5 = 0;
        mq var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        this.field_i = null;
        this.field_h = null;
        this.field_f = null;
        this.field_c = null;
        this.field_a = null;
        try {
          L0: {
            L1: {
              L2: {
                this.field_g = param0.field_V;
                kga.a(param0, 121);
                if (!this.field_g) {
                  break L2;
                } else {
                  L3: {
                    var20 = ir.a(hna.field_e, 13588, false);
                    this.field_h = new lha(param0, 6410, 128, 128, 16, var20, 6410);
                    var21 = ir.a(gu.field_l, 13588, false);
                    this.field_a = new lha(param0, 6410, 128, 128, 16, var21, 6410);
                    var10 = param0.field_zc;
                    if (!var10.a((byte) 11)) {
                      break L3;
                    } else {
                      L4: {
                        var22 = ir.a(uga.field_m, 13588, false);
                        this.field_c = new lha(param0, 6408, 128, 128, 16);
                        var4 = new lha(param0, 6409, 128, 128, 16, var22, 6409);
                        if (!var10.a(-112, 2.0f, var4, this.field_c)) {
                          this.field_c.b(0);
                          this.field_c = null;
                          break L4;
                        } else {
                          discarded$1 = this.field_c.e(9729);
                          if (var5 == 0) {
                            break L4;
                          } else {
                            this.field_c.b(0);
                            this.field_c = null;
                            break L4;
                          }
                        }
                      }
                      var4.b(0);
                      break L3;
                    }
                  }
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_f = new rt[16];
              var2_int = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (16 <= var2_int) {
                      break L7;
                    } else {
                      var23 = ua.a(hna.field_e, 32768, 32768 * var2_int, false);
                      this.field_f[var2_int] = new rt(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
                      var2_int++;
                      if (var5 != 0) {
                        break L6;
                      } else {
                        if (var5 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  this.field_i = new rt[16];
                  break L6;
                }
                var2_int = 0;
                L8: while (true) {
                  if (-17 >= (var2_int ^ -1)) {
                    break L1;
                  } else {
                    var24 = ua.a(gu.field_l, 32768, var2_int * 32768, false);
                    this.field_i[var2_int] = new rt(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
                    var2_int++;
                    if (var5 == 0) {
                      continue L8;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("aaa.<init>(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
    }

    static {
        field_e = "To play a multiplayer game, please log in or create a free account.";
    }
}
