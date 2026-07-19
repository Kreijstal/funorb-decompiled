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
        this.f((byte) -48);
        if (param0 != 28) {
            this.field_U = (wl) null;
        }
        return super.e((byte) 28);
    }

    final void l(int param0) {
        if (this.field_U == j.field_h) {
            return;
        }
        this.field_U = dn.field_I;
        this.field_cb = 0;
        this.a(this.field_W, (byte) -98);
        this.field_Y.field_H = 0;
        this.field_W = null;
        if (param0 != -7476) {
            this.field_cb = -54;
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
                field_bb = (String) null;
                break L1;
              }
            }
            L2: {
              this.field_W = param1;
              if (sj.field_c != this.field_U) {
                if (this.field_U != j.field_h) {
                  this.field_U = j.field_h;
                  this.field_cb = 0;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                this.a(false, this.field_W.field_n + 12 - -this.field_db, 12 + this.field_W.field_i, this.field_ab);
                this.field_cb = 0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("ki.DB(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
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
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_42_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_36_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 > 36) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param1.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      L3: {
                        if (param2 == -123) {
                          break L3;
                        } else {
                          ki.g((byte) -94);
                          break L3;
                        }
                      }
                      stackOut_42_0 = var5;
                      stackIn_43_0 = stackOut_42_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L4: {
                        L5: {
                          var9 = param1.charAt(var8);
                          if (var8 == 0) {
                            if (45 != var9) {
                              if (43 != var9) {
                                break L5;
                              } else {
                                if (!param3) {
                                  break L5;
                                } else {
                                  var8++;
                                  continue L2;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (57 >= var9) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 > 90) {
                                break L8;
                              } else {
                                var9 -= 55;
                                break L6;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          stackOut_24_0 = 0;
                          stackIn_25_0 = stackOut_24_0;
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                        if (param0 <= var9) {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L10: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var10 = var6 * param0 + var9;
                          if (var10 / param0 != var6) {
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L4;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) (var4);
            stackOut_44_1 = new StringBuilder().append("ki.LA(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L11;
            } else {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L11;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_25_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_30_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_37_0 != 0;
            } else {
              return stackIn_43_0 != 0;
            }
          }
        }
    }

    private final void a(ga param0, byte param1) {
        try {
            if (this.field_Y != null) {
                this.field_Y.b(-27598);
            }
            int var3_int = -45 / ((-21 - param1) / 52);
            if (param0 == null) {
                this.field_Y = new mh();
            } else {
                param0.a(-73, 6 + this.field_db, 6, param0.field_i, param0.field_n);
                this.field_Y = new mh(param0);
            }
            this.a(this.field_Y, 10);
            this.field_W = null;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ki.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1, ga param2, char param3) {
        boolean discarded$4 = false;
        boolean discarded$5 = false;
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5_int = 8 % ((param0 - -83) / 32);
                if (this.field_Y == null) {
                  break L1;
                } else {
                  L2: {
                    if (98 != param1) {
                      break L2;
                    } else {
                      discarded$4 = this.field_Y.a((byte) 121, param2);
                      break L2;
                    }
                  }
                  if (99 != param1) {
                    break L1;
                  } else {
                    discarded$5 = this.field_Y.a((byte) 82, param2);
                    return false;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("ki.I(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_10_0 != 0;
        }
    }

    final static void a(byte param0, vn param1) {
        hk.i(1584);
        if (param0 >= -76) {
            return;
        }
        try {
            bi.a(param1.field_z, param1.field_r, param1.field_q);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ki.EB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void f(byte param0) {
        if (!(this.field_U == null)) {
            if (!(this.field_U == dn.field_I)) {
                this.a((byte) 105, this.field_W.field_n + (12 + this.field_db), this.field_W.field_i + 12);
                this.a(this.field_W, (byte) 94);
            }
            this.field_U = null;
            this.field_Y.field_H = 256;
        }
        int var2 = -96 % ((param0 - 22) / 59);
        super.f((byte) -58);
    }

    ki(dn param0, ga param1, int param2, int param3, int param4) {
        super(param0, param1.field_i + 12, 12 + (param2 + param1.field_n));
        try {
            this.field_ab = param4;
            this.field_db = param2;
            this.field_T = param3;
            this.field_Z = param3;
            this.a(param1, (byte) -104);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "ki.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    boolean j(int param0) {
        int fieldTemp$38 = 0;
        int fieldTemp$39 = 0;
        int var3 = 0;
        L0: {
          var3 = ZombieDawn.field_J;
          if (this.field_U == null) {
            break L0;
          } else {
            if (this.field_U == j.field_h) {
              fieldTemp$38 = this.field_cb + 1;
              this.field_cb = this.field_cb + 1;
              if (this.field_Z != fieldTemp$38) {
                this.field_Y.field_H = -((this.field_cb << -937865176) / this.field_Z) + 256;
                break L0;
              } else {
                this.field_U = sj.field_c;
                this.a(false, this.field_W.field_n + 12 - -this.field_db, 12 + this.field_W.field_i, this.field_ab);
                this.field_cb = 0;
                this.field_Y.field_H = 0;
                break L0;
              }
            } else {
              if (dn.field_I != this.field_U) {
                break L0;
              } else {
                fieldTemp$39 = this.field_cb + 1;
                this.field_cb = this.field_cb + 1;
                if (this.field_T == fieldTemp$39) {
                  this.field_Y.field_H = 256;
                  this.field_U = null;
                  break L0;
                } else {
                  this.field_Y.field_H = (this.field_cb << 1247311752) / this.field_T;
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
        if (param0 < 41) {
            vn var2 = (vn) null;
            ki.a((byte) 10, (vn) null);
        }
        field_V = null;
        field_bb = null;
        field_X = null;
    }

    static {
        field_bb = "Cancel";
        field_X = new int[]{-1, 160, 342, 435};
    }
}
