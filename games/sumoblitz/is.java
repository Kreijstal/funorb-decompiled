/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    private ki field_d;
    static boolean field_b;
    private sd field_f;
    private ki field_e;
    static jn field_c;
    static boolean field_a;

    final static void b(int param0) {
        lf.a(256, (byte) -58);
        if (param0 <= 56) {
            field_b = false;
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (!param0) {
          L0: {
            field_a = true;
            if (-1 == (param1 & 33 ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-1 == (param1 & 33 ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final oq a(int param0, int param1) {
        oq var3;
        byte[] var4;
        var3 = (oq) (this.field_f.a((long)param0, 123));
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if ((param0 ^ -1) > -32769) {
              var4 = this.field_e.a((byte) 109, param0, 1);
              break L0;
            } else {
              var4 = this.field_d.a((byte) 115, param0 & 32767, 1);
              break L0;
            }
          }
          L1: {
            var3 = new oq();
            if (var4 != null) {
              var3.a(new fs(var4), true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param1 >= (param0 ^ -1)) {
              var3.e(param1 ^ 32885);
              break L2;
            } else {
              break L2;
            }
          }
          this.field_f.a((long)param0, var3, (byte) 19);
          return var3;
        }
    }

    final static void a(int param0) {
        String var2;
        if (param0 < 27) {
          var2 = (String) null;
          is.a((byte) 10, (String) null);
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, new dd(pu.field_e));
          return;
        } else {
          pu.field_e.a((byte) 123);
          pu.field_e.a((byte) 112, new dd(pu.field_e));
          return;
        }
    }

    final static cn a(byte param0, String param1) {
        String var2 = null;
        cn var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        cn stackIn_6_0 = null;
        cn stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (io.field_b != null) {
              var6 = (CharSequence) ((Object) param1);
              var2 = uk.a(-1, var6);
              if (param0 >= 89) {
                L1: {
                  if (var2 == null) {
                    var2 = param1;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (cn) ((Object) io.field_b.a((long)var2.hashCode(), -45));
                L2: while (true) {
                  if (var3 != null) {
                    L3: {
                      var7 = (CharSequence) ((Object) var3.field_jb);
                      var4 = uk.a(-1, var7);
                      if (var4 != null) {
                        break L3;
                      } else {
                        var4 = var3.field_jb;
                        break L3;
                      }
                    }
                    if (var4.equals(var2)) {
                      stackIn_18_0 = (cn) (var3);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var3 = (cn) ((Object) io.field_b.a(-109));
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_6_0 = (cn) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("is.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (cn) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_18_0;
          }
        }
    }

    private is() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            String var2 = (String) null;
            is.a((byte) 3, (String) null);
        }
    }

    static {
        field_b = false;
    }
}
