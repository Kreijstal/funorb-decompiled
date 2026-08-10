/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cg extends k implements pi {
    static lh field_e;
    static int field_h;
    static kc field_i;
    private hf field_g;
    static boolean field_f;

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackIn_8_0 = 1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (0 == param1) {
                break L3;
              } else {
                var6 = se.field_K;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if ((param1 ^ -1) != (var4 ^ -1)) {
                      var3++;
                      continue L4;
                    } else {
                      stackIn_16_0 = 1;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
            }
            L5: {
              if (param0 >= 94) {
                break L5;
              } else {
                field_f = true;
                break L5;
              }
            }
            stackIn_21_0 = 0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "cg.P(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    public static void f(int param0) {
        field_e = null;
        if (param0 != 1) {
            return;
        }
        field_i = null;
    }

    public final boolean a(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        if (param0 <= -1) {
          if (null != this.field_g.field_r) {
            if (this.field_g.field_r.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackIn_11_0 = 1;
            return stackIn_11_0 != 0;
          }
        } else {
          this.field_g = (hf) null;
          if (null == this.field_g.field_r) {
            return true;
          } else {
            L0: {
              if (this.field_g.field_r.length() != 0) {
                stackIn_5_0 = 0;
                break L0;
              } else {
                stackIn_5_0 = 1;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final sg e(int param0) {
        if (param0 != 14) {
          field_i = (kc) null;
          return this.a(this.field_g.field_r, -103);
        } else {
          return this.a(this.field_g.field_r, -103);
        }
    }

    abstract sg a(String param0, int param1);

    final static aj b(boolean param0) {
        L0: {
          if (aj.field_a == null) {
            aj.field_a = new aj();
            aj.field_a.a(-1, j.field_C);
            aj.field_a.field_d = 2763306;
            aj.field_a.field_e = 0;
            aj.field_a.field_l = 6;
            aj.field_a.field_o = me.field_c;
            aj.field_a.field_g = 7697781;
            aj.field_a.field_f = 4;
            aj.field_a.field_j = 5;
            aj.field_a.field_c = 14;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return (aj) null;
        } else {
          return aj.field_a;
        }
    }

    public final void a(hf param0, int param1) {
        try {
            this.a(-98);
            if (param1 != 12891) {
                field_f = true;
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "cg.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, hf param1) {
        try {
            if (param0 != -1) {
                this.a((byte) -37);
            }
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "cg.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String d(int param0) {
        if (param0 != -5777) {
            return (String) null;
        }
        return this.a(this.field_g.field_r, false);
    }

    abstract String a(String param0, boolean param1);

    cg(hf param0) {
        try {
            this.field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new lh(1);
    }
}
