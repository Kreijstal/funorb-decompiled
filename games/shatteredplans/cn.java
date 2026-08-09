/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cn extends vp {
    cn field_u;
    cn field_x;
    static String field_v;
    static int field_w;

    final static String a(CharSequence param0, byte param1) {
        int var2_int = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length();
              if (var2_int > 20) {
                var2_int = 20;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var8 = new char[var2_int];
              var7 = var8;
              var3 = var7;
              if (param1 == 53) {
                break L2;
              } else {
                cn.e(false);
                break L2;
              }
            }
            var4 = 0;
            L3: while (true) {
              if (var4 >= var2_int) {
                stackIn_22_0 = new String(var8);
                break L0;
              } else {
                L4: {
                  L5: {
                    var5 = param0.charAt(var4);
                    if (var5 < 65) {
                      break L5;
                    } else {
                      if (var5 <= 90) {
                        var3[var4] = (char)(var5 - 65 + 97);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    L7: {
                      if (var5 < 97) {
                        break L7;
                      } else {
                        if (var5 <= 122) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var5 < 48) {
                        break L8;
                      } else {
                        if (var5 > 57) {
                          break L8;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var3[var4] = (char)95;
                    break L4;
                  }
                  var3[var4] = (char)var5;
                  break L4;
                }
                var4++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("cn.D(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    final void f(byte param0) {
        if (!(this.field_u != null)) {
            return;
        }
        this.field_u.field_x = this.field_x;
        this.field_x.field_u = this.field_u;
        if (param0 != -62) {
            this.f((byte) -89);
        }
        this.field_x = null;
        this.field_u = null;
    }

    public static void e(boolean param0) {
        field_v = null;
        if (!param0) {
            CharSequence var2 = (CharSequence) null;
            cn.a((CharSequence) null, (byte) 57);
        }
    }

    protected cn() {
    }

    final static int a(byte param0, int param1, int param2) {
        if (param0 > -67) {
            field_v = (String) null;
        }
        int var3 = param1 >>> -772668161;
        return -var3 + (param1 + var3) / param2;
    }

    static {
        field_v = "Email: ";
    }
}
