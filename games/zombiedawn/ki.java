/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ki extends pn {
    private int field_ab;
    static String field_V;
    private int field_cb;
    private ga field_W;
    private wl field_U;
    private mh field_Y;
    private int field_T;
    private int field_db;
    private int field_Z;
    static String field_bb;
    static int[] field_X;

    final boolean e(byte param0) {
        ((ki) this).f((byte) -48);
        if (param0 != 28) {
            ((ki) this).field_U = null;
        }
        return super.e((byte) 28);
    }

    final void l(int param0) {
        if (((ki) this).field_U == j.field_h) {
            return;
        }
        ((ki) this).field_U = dn.field_I;
        ((ki) this).field_cb = 0;
        this.a(((ki) this).field_W, (byte) -98);
        ((ki) this).field_Y.field_H = 0;
        ((ki) this).field_W = null;
        if (param0 != -7476) {
            ((ki) this).field_cb = -54;
        }
    }

    void b(int param0, ga param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                field_bb = null;
                break L1;
              }
            }
            L2: {
              ((ki) this).field_W = param1;
              if (sj.field_c != ((ki) this).field_U) {
                if (((ki) this).field_U != j.field_h) {
                  ((ki) this).field_U = j.field_h;
                  ((ki) this).field_cb = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                ((ki) this).a(false, ((ki) this).field_W.field_n + 12 - -((ki) this).field_db, 12 + ((ki) this).field_W.field_i, ((ki) this).field_ab);
                ((ki) this).field_cb = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ki.DB(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static boolean a(int param0, CharSequence param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_35_0 = var5;
                stackIn_36_0 = stackOut_35_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (var8 == 0) {
                      if (45 != var9) {
                        if (43 != var9) {
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var4_int = 1;
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 >= var9) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    return stackIn_18_0 != 0;
                  }
                  if (10 <= var9) {
                    stackOut_22_0 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0 != 0;
                  } else {
                    L8: {
                      if (var4_int != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * 10 + var9;
                    if (var10 / 10 != var6) {
                      stackOut_29_0 = 0;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("ki.LA(").append(10).append(',');
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L9;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L9;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ',' + -123 + ',' + true + ')');
        }
        return stackIn_36_0 != 0;
    }

    private final void a(ga param0, byte param1) {
        try {
            if (((ki) this).field_Y != null) {
                ((ki) this).field_Y.b(-27598);
            }
            int var3_int = -45 / ((-21 - param1) / 52);
            if (param0 == null) {
                ((ki) this).field_Y = new mh();
            } else {
                param0.a(-73, 6 + ((ki) this).field_db, 6, param0.field_i, param0.field_n);
                ((ki) this).field_Y = new mh(param0);
            }
            ((ki) this).a((ga) (Object) ((ki) this).field_Y, 10);
            ((ki) this).field_W = null;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ki.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(-122, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                var5_int = 0;
                if (((ki) this).field_Y == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param1) {
                      break L2;
                    } else {
                      boolean discarded$4 = ((ki) this).field_Y.a((byte) 121, param2);
                      break L2;
                    }
                  }
                  if (99 != param1) {
                    break L1;
                  } else {
                    boolean discarded$5 = ((ki) this).field_Y.a((byte) 82, param2);
                    return false;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("ki.I(").append(-115).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param3 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static void a(byte param0, vn param1) {
        hk.i(1584);
        if (param0 >= -76) {
            return;
        }
        try {
            bi.a(param1.field_z, param1.field_r, param1.field_q);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ki.EB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(byte param0) {
        if (!(((ki) this).field_U == null)) {
            if (!(((ki) this).field_U == dn.field_I)) {
                ((ki) this).a((byte) 105, ((ki) this).field_W.field_n + (12 + ((ki) this).field_db), ((ki) this).field_W.field_i + 12);
                this.a(((ki) this).field_W, (byte) 94);
            }
            ((ki) this).field_U = null;
            ((ki) this).field_Y.field_H = 256;
        }
        int var2 = -96 % ((param0 - 22) / 59);
        super.f((byte) -58);
    }

    ki(dn param0, ga param1, int param2, int param3, int param4) {
        super(param0, param1.field_i + 12, 12 + (param2 + param1.field_n));
        try {
            ((ki) this).field_ab = param4;
            ((ki) this).field_db = param2;
            ((ki) this).field_T = param3;
            ((ki) this).field_Z = param3;
            this.a(param1, (byte) -104);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean j(int param0) {
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (((ki) this).field_U == null) {
            break L0;
          } else {
            if (((ki) this).field_U == j.field_h) {
              int fieldTemp$38 = ((ki) this).field_cb + 1;
              ((ki) this).field_cb = ((ki) this).field_cb + 1;
              if (((ki) this).field_Z != fieldTemp$38) {
                ((ki) this).field_Y.field_H = -((((ki) this).field_cb << 8) / ((ki) this).field_Z) + 256;
                break L0;
              } else {
                ((ki) this).field_U = sj.field_c;
                ((ki) this).a(false, ((ki) this).field_W.field_n + 12 - -((ki) this).field_db, 12 + ((ki) this).field_W.field_i, ((ki) this).field_ab);
                ((ki) this).field_cb = 0;
                ((ki) this).field_Y.field_H = 0;
                break L0;
              }
            } else {
              if (dn.field_I != ((ki) this).field_U) {
                break L0;
              } else {
                int fieldTemp$39 = ((ki) this).field_cb + 1;
                ((ki) this).field_cb = ((ki) this).field_cb + 1;
                if (((ki) this).field_T == fieldTemp$39) {
                  ((ki) this).field_Y.field_H = 256;
                  ((ki) this).field_U = null;
                  break L0;
                } else {
                  ((ki) this).field_Y.field_H = (((ki) this).field_cb << 8) / ((ki) this).field_T;
                  break L0;
                }
              }
            }
          }
        }
        if (param0 == 2634) {
          return super.j(2634);
        } else {
          return true;
        }
    }

    public static void g(byte param0) {
        field_V = null;
        field_bb = null;
        field_X = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Cancel";
        field_X = new int[]{-1, 160, 342, 435};
    }
}
