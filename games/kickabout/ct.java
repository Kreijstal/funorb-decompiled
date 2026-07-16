/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ct extends fd implements jp {
    static String field_w;
    static Calendar field_y;
    fd field_z;
    static String field_x;
    static int[][] field_v;

    void a(int param0, int param1, int param2, int param3) {
        if (param1 != 65) {
            int discarded$0 = ((ct) this).f((byte) -56);
        }
        if (0 == param0) {
            if (null != ((ct) this).field_r) {
                ((ct) this).field_r.a(121, true, param3, (fd) this, param2);
            }
        }
        if (null != ((ct) this).field_z) {
            ((ct) this).field_z.a(param0, 65, param2 + ((ct) this).field_t, param3 - -((ct) this).field_g);
        }
    }

    final boolean b(int param0) {
        if (param0 <= 10) {
            return true;
        }
        return null != ((ct) this).a(0) ? true : false;
    }

    fd a(int param0) {
        fd var2 = ((ct) this).field_z;
        if (var2 != null) {
            if (!(!var2.b(19))) {
                return var2;
            }
        }
        if (param0 == 0) {
            return null;
        }
        int discarded$0 = ct.a(9, 19, -25);
        return null;
    }

    final boolean a(fd param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == 0) {
            break L0;
          } else {
            ct.j(-18);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((ct) this).field_z) {
              break L2;
            } else {
              if (!((ct) this).field_z.a(param0, 0)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    ct(int param0, int param1, int param2, int param3, gj param4, jv param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    private final boolean b(byte param0, fd param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 99) {
            break L0;
          } else {
            field_y = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (((ct) this).field_z == null) {
              break L2;
            } else {
              if (((ct) this).field_z.b(param0 ^ 113)) {
                break L2;
              } else {
                if (!((ct) this).field_z.a(param1, 0)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final int f(byte param0) {
        if (param0 != 118) {
            String discarded$0 = ((ct) this).f(60);
        }
        return ((ct) this).field_z == null ? 0 : ((ct) this).field_z.f((byte) 118);
    }

    final static int a(boolean param0, int param1) {
        if (!param0) {
            return 89;
        }
        int var2 = 8;
        if (!((param1 ^ -1) >= -101)) {
            var2 = var2 + (-param1 + 100) / 30;
        }
        return var2;
    }

    final boolean a(char param0, byte param1, fd param2, int param3) {
        if (param1 >= -60) {
            field_y = null;
        }
        if (null != ((ct) this).field_z) {
            if (((ct) this).field_z.b(81)) {
                if (((ct) this).field_z.a(param0, (byte) -114, param2, param3)) {
                    return true;
                }
            }
        }
        int var5 = param3;
        if (80 != var5) {
            return false;
        }
        return !ne.field_G[81] ? this.b((byte) 99, param2) : this.a((byte) -86, param2);
    }

    void a(byte param0) {
        if (param0 != -32) {
            ((ct) this).a(43, 116, 100, 117, -104);
        }
        if (((ct) this).field_z != null) {
            ((ct) this).field_z.e(-1947);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var4 = 47 / ((26 - param0) / 61);
        int var3 = -1 + param2 & param1 >> -1711763649;
        return var3 + (param1 + (param1 >>> -1811481025)) % param2;
    }

    final boolean a(int param0, fd param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var8 = 53 / ((63 - param6) / 56);
            if (null == ((ct) this).field_z) {
              break L1;
            } else {
              if (!((ct) this).field_z.b(126)) {
                break L1;
              } else {
                if (!((ct) this).field_z.a(param0, param1, param2, param3, param4, param5, 123)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0) {
          L0: {
            L1: {
              if (null == ((ct) this).field_z) {
                break L1;
              } else {
                if (!((ct) this).field_z.a(true, ((ct) this).field_g + param1, param2, param3, param4, ((ct) this).field_t + param5, param6)) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    final void a(Hashtable param0, int param1, StringBuilder param2, int param3) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        StringBuilder discarded$4 = param2.append(10);
        if (param1 <= 122) {
            field_v = null;
        }
        for (var5 = 0; var5 <= param3; var5++) {
            StringBuilder discarded$5 = param2.append(32);
        }
        if (((ct) this).field_z == null) {
            StringBuilder discarded$7 = param2.append("null");
        } else {
            StringBuilder discarded$8 = ((ct) this).field_z.a(17883, param3 - -1, param0, param2);
        }
    }

    private final boolean a(byte param0, fd param1) {
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            var3 = -75 / ((18 - param0) / 53);
            if (null == ((ct) this).field_z) {
              break L1;
            } else {
              if (((ct) this).field_z.b(30)) {
                break L1;
              } else {
                if (!((ct) this).field_z.a(param1, 0)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
        if (param0 != 17883) {
            ct.j(31);
        }
        if (((ct) this).a(1, param3, param2, param1)) {
            ((ct) this).b(param1, param3, param2, -18568);
            ((ct) this).a(param2, 124, param3, param1);
        }
        return param3;
    }

    final void g(int param0) {
        if (!(null == ((ct) this).field_z)) {
            ((ct) this).field_z.g(84);
        }
        if (param0 != 84) {
            ((ct) this).a(99, 40, 102, 127, 55);
        }
    }

    void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        if (param4 != -1) {
            field_y = null;
        }
        if (!(((ct) this).field_z == null)) {
            ((ct) this).field_z.a(((ct) this).field_g + param0, param1, param2, param3, -1, ((ct) this).field_t + param5);
        }
    }

    void a(byte param0, fd param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (null != ((ct) this).field_z) {
            ((ct) this).field_z.a((byte) 12, param1, ((ct) this).field_t + param2, param3 - -((ct) this).field_g);
        }
    }

    final static void i(int param0) {
        try {
            java.lang.reflect.Method var1_ref_java_lang_reflect_Method = null;
            Exception var1_ref_Exception = null;
            int var1 = 0;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var1_ref_java_lang_reflect_Method = Runtime.class.getMethod("maxMemory", new Class[0]);
                  if (var1_ref_java_lang_reflect_Method == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        var2_ref = Runtime.getRuntime();
                        var4 = null;
                        var3 = (Long) var1_ref_java_lang_reflect_Method.invoke((Object) (Object) var2_ref, (Object[]) null);
                        nw.field_d = (int)(var3.longValue() / 1048576L) + 1;
                        break L2;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var2 = decompiledCaughtException;
                        break L3;
                      }
                    }
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var1_ref_Exception = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            var1 = 76 / ((param0 - 84) / 35);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j(int param0) {
        field_w = null;
        if (param0 != 31068) {
            return;
        }
        field_v = null;
        field_x = null;
        field_y = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ct) this).a((byte) -32);
    }

    String f(int param0) {
        String var3 = null;
        if (param0 != -1) {
            ((ct) this).a(82, -102, -71, 69, -83);
        }
        String var2 = super.f(param0 + 0);
        if (null != ((ct) this).field_z) {
            var3 = ((ct) this).field_z.f(-1);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Please wait while we find you an opponent";
        field_y = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_v = new int[7][4];
        field_v[0][2] = 0;
        field_v[0][1] = 0;
        field_v[0][3] = 0;
        field_v[0][0] = 100;
        field_v[1][2] = 0;
        field_v[1][1] = 0;
        field_v[1][3] = 0;
        field_v[1][0] = 100;
        field_v[2][1] = 50;
        field_v[2][0] = 50;
        field_v[2][2] = 0;
        field_v[2][3] = 0;
        field_v[3][2] = 0;
        field_v[3][0] = 30;
        field_v[3][1] = 70;
        field_v[3][3] = 0;
        field_v[4][2] = 30;
        field_v[4][0] = 20;
        field_v[4][3] = 0;
        field_v[4][1] = 50;
        field_v[5][2] = 60;
        field_v[5][1] = 30;
        field_v[5][3] = 0;
        field_v[5][0] = 10;
        field_v[6][1] = 20;
        field_v[6][0] = 0;
        field_v[6][2] = 80;
        field_v[6][3] = 0;
    }
}
