/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf {
    private fa field_a;
    static vn[] field_b;
    private fa field_d;
    static pc field_c;

    final static int a(boolean param0, int param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_41_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_40_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param3 < 2) {
                break L1;
              } else {
                if (param3 <= 36) {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      if (var5 != 0) {
                        stackOut_40_0 = var6;
                        stackIn_41_0 = stackOut_40_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if (var8 == 0) {
                            if (var9 == 45) {
                              var4_int = 1;
                              var8++;
                              break L3;
                            } else {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          L6: {
                            if (var9 < 48) {
                              break L6;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (65 > var9) {
                              break L7;
                            } else {
                              if (90 < var9) {
                                break L7;
                              } else {
                                var9 -= 55;
                                break L5;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 97) {
                              break L8;
                            } else {
                              if (var9 <= 122) {
                                var9 -= 87;
                                break L5;
                              } else {
                                break L8;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (var9 < param3) {
                          L9: {
                            if (var4_int != 0) {
                              var9 = -var9;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var10 = param3 * var6 - -var9;
                          if (var6 != var10 / param3) {
                            throw new NumberFormatException();
                          } else {
                            var5 = 1;
                            var6 = var10;
                            var8++;
                            break L3;
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param3);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) var4;
            stackOut_42_1 = new StringBuilder().append("tf.A(").append(true).append(',').append(5).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param2 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L10;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L10;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + ',' + param3 + ')');
        }
        return stackIn_41_0;
    }

    final fa b(int param0) {
        fa var2 = null;
        int var3 = 0;
        var2 = ((tf) this).field_a.field_q;
        if (var2 == ((tf) this).field_a) {
          ((tf) this).field_d = null;
          return null;
        } else {
          var3 = 59 % ((-16 - param0) / 44);
          ((tf) this).field_d = var2.field_q;
          return var2;
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != -12220) {
            field_b = null;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int[] var1_array = null;
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            kd.field_nb[0] = sg.field_jb.d(16711680);
            kd.field_nb[1] = sg.field_jb.d(7829248);
            kd.field_nb[2] = sg.field_jb.d(16776960);
            kd.field_nb[3] = sg.field_jb.d(30464);
            kd.field_nb[4] = sg.field_jb.d(65280);
            kd.field_nb[5] = sg.field_jb.d(30583);
            kd.field_nb[6] = sg.field_jb.d(65535);
            kd.field_nb[7] = sg.field_jb.d(119);
            kd.field_nb[8] = sg.field_jb.d(255);
            kd.field_nb[9] = sg.field_jb.d(16745473);
            hm.field_L = sg.field_jb.d(16777215);
            t.field_c = sg.field_jb.d(6710886);
            var8 = sg.field_jb.field_O[0];
            var7 = var8;
            var6 = var7;
            var5 = var6;
            var4 = var5;
            var1_array = var4;
            sg.field_jb.field_O = new int[11][];
            sg.field_jb.field_O[0] = var8;
            sg.field_jb.field_O[4] = new int[sg.field_jb.field_O[0].length];
            var2 = 0;
            L1: while (true) {
              if (sg.field_jb.field_O[4].length <= var2) {
                rf.a(16777215, 2, 65793, 13369344, 119);
                rf.a(4194304, 0, 8388608, 16711680, 83);
                rf.a(16777215, 1, 65793, 5481009, 86);
                rf.a(4210688, 3, 8421376, 16776960, 76);
                rf.a(0, 5, 0, 0, 121);
                rf.a(0, 6, 4473924, 10066329, 79);
                rf.a(16777215, 7, 4473924, 10066329, 108);
                rf.a(0, 8, 4996418, 14540253, 69);
                rf.a(0, 9, 16777215, 14540253, 76);
                rf.a(4096, 10, 16384, 5481009, 106);
                break L0;
              } else {
                sg.field_jb.field_O[4][var2] = 16777215;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "tf.E(" + 119 + ')');
        }
    }

    public tf() {
        ((tf) this).field_a = new fa();
        ((tf) this).field_a.field_q = ((tf) this).field_a;
        ((tf) this).field_a.field_r = ((tf) this).field_a;
    }

    final fa a(int param0) {
        fa var2 = null;
        var2 = ((tf) this).field_d;
        if (((tf) this).field_a == var2) {
          ((tf) this).field_d = null;
          return null;
        } else {
          if (param0 != -6116) {
            tf.c(43);
            ((tf) this).field_d = var2.field_q;
            return var2;
          } else {
            ((tf) this).field_d = var2.field_q;
            return var2;
          }
        }
    }

    final void a(byte param0, fa param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (null == param1.field_r) {
                break L1;
              } else {
                param1.d(0);
                break L1;
              }
            }
            param1.field_r = ((tf) this).field_a.field_r;
            param1.field_q = ((tf) this).field_a;
            param1.field_r.field_q = param1;
            param1.field_q.field_r = param1;
            if (param0 > 16) {
              break L0;
            } else {
              ((tf) this).field_d = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("tf.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    static {
    }
}
