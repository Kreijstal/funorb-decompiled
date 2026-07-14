/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk extends rh {
    int field_P;
    static int field_N;
    static byte[][] field_M;
    private qh field_J;
    static String field_O;
    private int field_L;
    static String field_K;
    int field_I;

    final static String b(boolean param0) {
        if (param0) {
            wj discarded$7 = qk.j(125);
            if (!(oe.field_b != fd.field_h)) {
                return bf.field_f;
            }
            return lf.field_T;
        }
        if (!(oe.field_b != fd.field_h)) {
            return bf.field_f;
        }
        return lf.field_T;
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          var2 = param1.length();
          if ((var2 ^ -1) >= -21) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        var8 = new char[var2];
        var7 = var8;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var2 <= var4) {
            if (param0 > -85) {
              field_O = null;
              return new String(var8);
            } else {
              return new String(var8);
            }
          } else {
            L2: {
              var5 = param1.charAt(var4);
              if (var5 < 65) {
                break L2;
              } else {
                if (var5 > 90) {
                  break L2;
                } else {
                  var3[var4] = (char)(var5 + -65 + 97);
                  var4++;
                  var4++;
                  continue L1;
                }
              }
            }
            L3: {
              L4: {
                if (var5 < 97) {
                  break L4;
                } else {
                  if (var5 <= 122) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (var5 < 48) {
                  break L5;
                } else {
                  if (57 < var5) {
                    break L5;
                  } else {
                    break L3;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              var4++;
              continue L1;
            }
            var3[var4] = (char)var5;
            var4++;
            var4++;
            continue L1;
          }
        }
    }

    final static Object a(byte[] param0, boolean param1, byte param2) {
        pi var3_ref = null;
        int var3 = 0;
        if (param0 != null) {
          if (-137 > (param0.length ^ -1)) {
            var3_ref = new pi();
            ((fh) (Object) var3_ref).a(param0, 13673);
            return (Object) (Object) var3_ref;
          } else {
            var3 = 97 / ((72 - param2) / 37);
            if (!param1) {
              return (Object) (Object) param0;
            } else {
              return (Object) (Object) qd.a(param0, (byte) 58);
            }
          }
        } else {
          return null;
        }
    }

    final boolean a(al param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = TrackController.field_F ? 1 : 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          L0: {
            var8 = param2 + -param5 + -((qk) this).field_I;
            var9 = ((qk) this).field_x + -(2 * ((qk) this).field_I);
            if (var9 < var8) {
              var8 = var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((var8 ^ -1) > -1) {
              var8 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          var8 = var8 * ((qk) this).field_L / var9;
          if (1 != param3) {
            if (2 == param3) {
              var10 = 2147483647;
              var11 = -1;
              var12 = 0;
              L2: while (true) {
                if (((qk) this).field_J.b(-1) <= var12) {
                  if (var11 < 0) {
                    return true;
                  } else {
                    ((qk) this).field_J.a(var11, -12759);
                    return true;
                  }
                } else {
                  var13 = ((qk) this).field_J.c((byte) -82, var12) - var8;
                  var13 = var13 * var13;
                  if (var13 < var10) {
                    var10 = var13;
                    var11 = var12;
                    var12++;
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    var12++;
                    continue L2;
                  }
                }
              }
            } else {
              return true;
            }
          } else {
            ((qk) this).field_J.a((byte) -120, var8);
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(int param0, int param1) {
        if (param0 == -1) {
          if (param1 >= 0) {
            if (((qk) this).field_J.b(param0 + 0) <= param1) {
              return -1;
            } else {
              return ((qk) this).field_J.c((byte) 70, param1);
            }
          } else {
            return -1;
          }
        } else {
          int discarded$7 = ((qk) this).a(-40, 98);
          if (param1 >= 0) {
            if (((qk) this).field_J.b(param0 + 0) <= param1) {
              return -1;
            } else {
              return ((qk) this).field_J.c((byte) 70, param1);
            }
          } else {
            return -1;
          }
        }
    }

    final static wj j(int param0) {
        if (param0 != -17514) {
            field_O = null;
            return (wj) (Object) new eb();
        }
        return (wj) (Object) new eb();
    }

    final int c(boolean param0) {
        if (!param0) {
            String discarded$0 = qk.b(true);
            return ((qk) this).field_J.b(-1);
        }
        return ((qk) this).field_J.b(-1);
    }

    final int k(int param0) {
        if (param0 != 26856) {
            Object var3 = null;
            Object discarded$0 = qk.a((byte[]) null, true, (byte) 68);
            return ((qk) this).field_L;
        }
        return ((qk) this).field_L;
    }

    public static void a(byte param0) {
        field_M = null;
        field_K = null;
        field_O = null;
        if (param0 <= 22) {
            field_O = null;
        }
    }

    private qk() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_N = 20;
        field_K = "Name is available";
    }
}
