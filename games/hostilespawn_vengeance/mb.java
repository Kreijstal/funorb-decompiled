/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb extends ce {
    private int field_n;
    private int field_j;
    static String field_k;
    private int field_h;
    private boolean field_o;
    static int field_p;
    private vm field_q;
    private int field_t;
    private int field_r;
    static he field_s;
    static int field_i;
    static gb field_m;
    private String field_l;

    final void a(int param0, int param1, int param2, int param3, vm param4, String param5, int param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        String var18 = null;
        pm var19 = null;
        String var26 = null;
        pm var27 = null;
        String var32 = null;
        pm var33 = null;
        String var34 = null;
        pm var35 = null;
        String var36 = null;
        pm var37 = null;
        pm stackIn_28_0 = null;
        pm stackIn_28_1 = null;
        int stackIn_28_2 = 0;
        int stackIn_28_3 = 0;
        pm stackIn_29_0 = null;
        pm stackIn_29_1 = null;
        int stackIn_29_2 = 0;
        int stackIn_29_3 = 0;
        pm stackIn_30_0 = null;
        pm stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_30_3 = 0;
        int stackIn_30_4 = 0;
        int stackIn_34_0 = 0;
        pm stackIn_43_0 = null;
        pm stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        pm stackIn_44_0 = null;
        pm stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        pm stackIn_45_0 = null;
        pm stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        int stackIn_45_3 = 0;
        int stackIn_45_4 = 0;
        int stackIn_49_0 = 0;
        pm stackIn_57_0 = null;
        pm stackIn_57_1 = null;
        int stackIn_57_2 = 0;
        int stackIn_57_3 = 0;
        pm stackIn_58_0 = null;
        pm stackIn_58_1 = null;
        int stackIn_58_2 = 0;
        int stackIn_58_3 = 0;
        pm stackIn_59_0 = null;
        pm stackIn_59_1 = null;
        int stackIn_59_2 = 0;
        int stackIn_59_3 = 0;
        int stackIn_59_4 = 0;
        int stackIn_63_0 = 0;
        pm stackIn_69_0 = null;
        pm stackIn_69_1 = null;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        pm stackIn_70_0 = null;
        pm stackIn_70_1 = null;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        pm stackIn_71_0 = null;
        pm stackIn_71_1 = null;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        int stackIn_71_4 = 0;
        int stackIn_75_0 = 0;
        pm stackIn_83_0 = null;
        pm stackIn_83_1 = null;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        pm stackIn_84_0 = null;
        pm stackIn_84_1 = null;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        pm stackIn_85_0 = null;
        pm stackIn_85_1 = null;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        int stackIn_85_4 = 0;
        int stackIn_89_0 = 0;
        pm stackOut_27_0 = null;
        pm stackOut_27_1 = null;
        int stackOut_27_2 = 0;
        int stackOut_27_3 = 0;
        pm stackOut_29_0 = null;
        pm stackOut_29_1 = null;
        int stackOut_29_2 = 0;
        int stackOut_29_3 = 0;
        int stackOut_29_4 = 0;
        pm stackOut_28_0 = null;
        pm stackOut_28_1 = null;
        int stackOut_28_2 = 0;
        int stackOut_28_3 = 0;
        int stackOut_28_4 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        pm stackOut_82_0 = null;
        pm stackOut_82_1 = null;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        pm stackOut_84_0 = null;
        pm stackOut_84_1 = null;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        int stackOut_84_4 = 0;
        pm stackOut_83_0 = null;
        pm stackOut_83_1 = null;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        int stackOut_83_4 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        pm stackOut_68_0 = null;
        pm stackOut_68_1 = null;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        pm stackOut_70_0 = null;
        pm stackOut_70_1 = null;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        int stackOut_70_4 = 0;
        pm stackOut_69_0 = null;
        pm stackOut_69_1 = null;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        int stackOut_69_4 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        pm stackOut_56_0 = null;
        pm stackOut_56_1 = null;
        int stackOut_56_2 = 0;
        int stackOut_56_3 = 0;
        pm stackOut_58_0 = null;
        pm stackOut_58_1 = null;
        int stackOut_58_2 = 0;
        int stackOut_58_3 = 0;
        int stackOut_58_4 = 0;
        pm stackOut_57_0 = null;
        pm stackOut_57_1 = null;
        int stackOut_57_2 = 0;
        int stackOut_57_3 = 0;
        int stackOut_57_4 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        pm stackOut_42_0 = null;
        pm stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        pm stackOut_44_0 = null;
        pm stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        int stackOut_44_4 = 0;
        pm stackOut_43_0 = null;
        pm stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        int stackOut_43_4 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        L0: {
          var15 = HostileSpawn.field_I ? 1 : 0;
          if (param7 != 0) {
            break L0;
          } else {
            param7 = param4.field_u;
            break L0;
          }
        }
        if (param5 != null) {
          L1: {
            if (param4 != ((mb) this).field_q) {
              break L1;
            } else {
              if (((mb) this).field_o) {
                break L1;
              } else {
                if (param6 != ((mb) this).field_j) {
                  break L1;
                } else {
                  if (((mb) this).field_h != param3) {
                    break L1;
                  } else {
                    if (((mb) this).field_r != param7) {
                      break L1;
                    } else {
                      if (param1 != ((mb) this).field_t) {
                        break L1;
                      } else {
                        if (((mb) this).field_n != param2) {
                          break L1;
                        } else {
                          if (((mb) this).field_l == null) {
                            break L1;
                          } else {
                            if (!((mb) this).field_l.equals((Object) (Object) param5)) {
                              break L1;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          L2: {
            ((mb) this).field_t = param1;
            ((mb) this).field_h = param3;
            ((mb) this).field_o = false;
            ((mb) this).field_q = param4;
            ((mb) this).field_r = param7;
            ((mb) this).field_n = param2;
            ((mb) this).field_j = param6;
            ((mb) this).field_l = param5;
            var16 = new String[param4.a(param5, param2) - -1];
            var17 = var16;
            var10 = Math.max(1, param4.a(param5, new int[1], var17));
            if (-4 != (((mb) this).field_h ^ -1)) {
              break L2;
            } else {
              if ((var10 ^ -1) != -2) {
                break L2;
              } else {
                L3: {
                  ((mb) this).field_h = 1;
                  ((mb) this).field_d = new pm[var10];
                  if (param0 != ((mb) this).field_h) {
                    if (-2 != (((mb) this).field_h ^ -1)) {
                      if (2 == ((mb) this).field_h) {
                        var11 = -(var10 * ((mb) this).field_r) + (-param4.field_F + ((mb) this).field_t);
                        break L3;
                      } else {
                        L4: {
                          var12 = (-(((mb) this).field_r * var10) + ((mb) this).field_t) / (1 + var10);
                          if (-1 >= (var12 ^ -1)) {
                            break L4;
                          } else {
                            var12 = 0;
                            break L4;
                          }
                        }
                        var11 = param4.field_y - -var12;
                        ((mb) this).field_r = ((mb) this).field_r + var12;
                        break L3;
                      }
                    } else {
                      var11 = (((mb) this).field_t + -(var10 * ((mb) this).field_r) >> 364852865) + param4.field_y;
                      break L3;
                    }
                  } else {
                    var11 = param4.field_y;
                    break L3;
                  }
                }
                var12 = 0;
                L5: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L6: {
                      var18 = var16[var12];
                      stackOut_27_0 = null;
                      stackOut_27_1 = null;
                      stackOut_27_2 = -param4.field_y + var11;
                      stackOut_27_3 = param4.field_F + var11;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      stackIn_29_2 = stackOut_27_2;
                      stackIn_29_3 = stackOut_27_3;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      stackIn_28_2 = stackOut_27_2;
                      stackIn_28_3 = stackOut_27_3;
                      if (var18 != null) {
                        stackOut_29_0 = null;
                        stackOut_29_1 = null;
                        stackOut_29_2 = stackIn_29_2;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = var18.length();
                        stackIn_30_0 = stackOut_29_0;
                        stackIn_30_1 = stackOut_29_1;
                        stackIn_30_2 = stackOut_29_2;
                        stackIn_30_3 = stackOut_29_3;
                        stackIn_30_4 = stackOut_29_4;
                        break L6;
                      } else {
                        stackOut_28_0 = null;
                        stackOut_28_1 = null;
                        stackOut_28_2 = stackIn_28_2;
                        stackOut_28_3 = stackIn_28_3;
                        stackOut_28_4 = 0;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_30_1 = stackOut_28_1;
                        stackIn_30_2 = stackOut_28_2;
                        stackIn_30_3 = stackOut_28_3;
                        stackIn_30_4 = stackOut_28_4;
                        break L6;
                      }
                    }
                    L7: {
                      new pm(stackIn_30_2, stackIn_30_3, stackIn_30_4);
                      var19 = stackIn_30_0;
                      var19.field_b[0] = 0;
                      if (var18 == null) {
                        break L7;
                      } else {
                        L8: {
                          var19.field_b[var18.length()] = param4.a(var18);
                          if (-4 != (param6 ^ -1)) {
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            break L8;
                          } else {
                            stackOut_32_0 = ((mb) this).a(param4.a(var18), param2, 41, var18);
                            stackIn_34_0 = stackOut_32_0;
                            break L8;
                          }
                        }
                        ld.a(stackIn_34_0, (byte) 98, param4, var18, var19);
                        break L7;
                      }
                    }
                    ((mb) this).field_d[var12] = var19;
                    var11 = var11 + param7;
                    var12++;
                    continue L5;
                  }
                }
              }
            }
          }
          ((mb) this).field_d = new pm[var10];
          if (param0 != ((mb) this).field_h) {
            if (-2 != (((mb) this).field_h ^ -1)) {
              if (2 != ((mb) this).field_h) {
                L9: {
                  var12 = (-(((mb) this).field_r * var10) + ((mb) this).field_t) / (1 + var10);
                  if (-1 >= (var12 ^ -1)) {
                    break L9;
                  } else {
                    var12 = 0;
                    break L9;
                  }
                }
                var11 = param4.field_y - -var12;
                ((mb) this).field_r = ((mb) this).field_r + var12;
                var12 = 0;
                L10: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L11: {
                      var34 = var16[var12];
                      stackOut_82_0 = null;
                      stackOut_82_1 = null;
                      stackOut_82_2 = -param4.field_y + var11;
                      stackOut_82_3 = param4.field_F + var11;
                      stackIn_84_0 = stackOut_82_0;
                      stackIn_84_1 = stackOut_82_1;
                      stackIn_84_2 = stackOut_82_2;
                      stackIn_84_3 = stackOut_82_3;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      stackIn_83_2 = stackOut_82_2;
                      stackIn_83_3 = stackOut_82_3;
                      if (var34 != null) {
                        stackOut_84_0 = null;
                        stackOut_84_1 = null;
                        stackOut_84_2 = stackIn_84_2;
                        stackOut_84_3 = stackIn_84_3;
                        stackOut_84_4 = var34.length();
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        stackIn_85_2 = stackOut_84_2;
                        stackIn_85_3 = stackOut_84_3;
                        stackIn_85_4 = stackOut_84_4;
                        break L11;
                      } else {
                        stackOut_83_0 = null;
                        stackOut_83_1 = null;
                        stackOut_83_2 = stackIn_83_2;
                        stackOut_83_3 = stackIn_83_3;
                        stackOut_83_4 = 0;
                        stackIn_85_0 = stackOut_83_0;
                        stackIn_85_1 = stackOut_83_1;
                        stackIn_85_2 = stackOut_83_2;
                        stackIn_85_3 = stackOut_83_3;
                        stackIn_85_4 = stackOut_83_4;
                        break L11;
                      }
                    }
                    L12: {
                      new pm(stackIn_85_2, stackIn_85_3, stackIn_85_4);
                      var35 = stackIn_85_0;
                      var35.field_b[0] = 0;
                      if (var34 == null) {
                        break L12;
                      } else {
                        L13: {
                          var35.field_b[var34.length()] = param4.a(var34);
                          if (-4 != (param6 ^ -1)) {
                            stackOut_88_0 = 0;
                            stackIn_89_0 = stackOut_88_0;
                            break L13;
                          } else {
                            stackOut_87_0 = ((mb) this).a(param4.a(var34), param2, 41, var34);
                            stackIn_89_0 = stackOut_87_0;
                            break L13;
                          }
                        }
                        ld.a(stackIn_89_0, (byte) 98, param4, var34, var35);
                        break L12;
                      }
                    }
                    ((mb) this).field_d[var12] = var35;
                    var11 = var11 + param7;
                    var12++;
                    continue L10;
                  }
                }
              } else {
                var11 = -(var10 * ((mb) this).field_r) + (-param4.field_F + ((mb) this).field_t);
                var12 = 0;
                L14: while (true) {
                  if (var10 <= var12) {
                    return;
                  } else {
                    L15: {
                      var36 = var16[var12];
                      stackOut_68_0 = null;
                      stackOut_68_1 = null;
                      stackOut_68_2 = -param4.field_y + var11;
                      stackOut_68_3 = param4.field_F + var11;
                      stackIn_70_0 = stackOut_68_0;
                      stackIn_70_1 = stackOut_68_1;
                      stackIn_70_2 = stackOut_68_2;
                      stackIn_70_3 = stackOut_68_3;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      stackIn_69_3 = stackOut_68_3;
                      if (var36 != null) {
                        stackOut_70_0 = null;
                        stackOut_70_1 = null;
                        stackOut_70_2 = stackIn_70_2;
                        stackOut_70_3 = stackIn_70_3;
                        stackOut_70_4 = var36.length();
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        stackIn_71_2 = stackOut_70_2;
                        stackIn_71_3 = stackOut_70_3;
                        stackIn_71_4 = stackOut_70_4;
                        break L15;
                      } else {
                        stackOut_69_0 = null;
                        stackOut_69_1 = null;
                        stackOut_69_2 = stackIn_69_2;
                        stackOut_69_3 = stackIn_69_3;
                        stackOut_69_4 = 0;
                        stackIn_71_0 = stackOut_69_0;
                        stackIn_71_1 = stackOut_69_1;
                        stackIn_71_2 = stackOut_69_2;
                        stackIn_71_3 = stackOut_69_3;
                        stackIn_71_4 = stackOut_69_4;
                        break L15;
                      }
                    }
                    L16: {
                      new pm(stackIn_71_2, stackIn_71_3, stackIn_71_4);
                      var37 = stackIn_71_0;
                      var37.field_b[0] = 0;
                      if (var36 == null) {
                        break L16;
                      } else {
                        L17: {
                          var37.field_b[var36.length()] = param4.a(var36);
                          if (-4 != (param6 ^ -1)) {
                            stackOut_74_0 = 0;
                            stackIn_75_0 = stackOut_74_0;
                            break L17;
                          } else {
                            stackOut_73_0 = ((mb) this).a(param4.a(var36), param2, 41, var36);
                            stackIn_75_0 = stackOut_73_0;
                            break L17;
                          }
                        }
                        ld.a(stackIn_75_0, (byte) 98, param4, var36, var37);
                        break L16;
                      }
                    }
                    ((mb) this).field_d[var12] = var37;
                    var11 = var11 + param7;
                    var12++;
                    continue L14;
                  }
                }
              }
            } else {
              var11 = (((mb) this).field_t + -(var10 * ((mb) this).field_r) >> 364852865) + param4.field_y;
              var12 = 0;
              L18: while (true) {
                if (var10 > var12) {
                  L19: {
                    var32 = var16[var12];
                    stackOut_56_0 = null;
                    stackOut_56_1 = null;
                    stackOut_56_2 = -param4.field_y + var11;
                    stackOut_56_3 = param4.field_F + var11;
                    stackIn_58_0 = stackOut_56_0;
                    stackIn_58_1 = stackOut_56_1;
                    stackIn_58_2 = stackOut_56_2;
                    stackIn_58_3 = stackOut_56_3;
                    stackIn_57_0 = stackOut_56_0;
                    stackIn_57_1 = stackOut_56_1;
                    stackIn_57_2 = stackOut_56_2;
                    stackIn_57_3 = stackOut_56_3;
                    if (var32 != null) {
                      stackOut_58_0 = null;
                      stackOut_58_1 = null;
                      stackOut_58_2 = stackIn_58_2;
                      stackOut_58_3 = stackIn_58_3;
                      stackOut_58_4 = var32.length();
                      stackIn_59_0 = stackOut_58_0;
                      stackIn_59_1 = stackOut_58_1;
                      stackIn_59_2 = stackOut_58_2;
                      stackIn_59_3 = stackOut_58_3;
                      stackIn_59_4 = stackOut_58_4;
                      break L19;
                    } else {
                      stackOut_57_0 = null;
                      stackOut_57_1 = null;
                      stackOut_57_2 = stackIn_57_2;
                      stackOut_57_3 = stackIn_57_3;
                      stackOut_57_4 = 0;
                      stackIn_59_0 = stackOut_57_0;
                      stackIn_59_1 = stackOut_57_1;
                      stackIn_59_2 = stackOut_57_2;
                      stackIn_59_3 = stackOut_57_3;
                      stackIn_59_4 = stackOut_57_4;
                      break L19;
                    }
                  }
                  L20: {
                    new pm(stackIn_59_2, stackIn_59_3, stackIn_59_4);
                    var33 = stackIn_59_0;
                    var33.field_b[0] = 0;
                    if (var32 == null) {
                      break L20;
                    } else {
                      L21: {
                        var33.field_b[var32.length()] = param4.a(var32);
                        if (-4 != (param6 ^ -1)) {
                          stackOut_62_0 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          break L21;
                        } else {
                          stackOut_61_0 = ((mb) this).a(param4.a(var32), param2, 41, var32);
                          stackIn_63_0 = stackOut_61_0;
                          break L21;
                        }
                      }
                      ld.a(stackIn_63_0, (byte) 98, param4, var32, var33);
                      break L20;
                    }
                  }
                  ((mb) this).field_d[var12] = var33;
                  var11 = var11 + param7;
                  var12++;
                  continue L18;
                } else {
                  return;
                }
              }
            }
          } else {
            var11 = param4.field_y;
            var12 = 0;
            L22: while (true) {
              if (var10 > var12) {
                L23: {
                  var26 = var16[var12];
                  stackOut_42_0 = null;
                  stackOut_42_1 = null;
                  stackOut_42_2 = -param4.field_y + var11;
                  stackOut_42_3 = param4.field_F + var11;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  stackIn_44_3 = stackOut_42_3;
                  stackIn_43_0 = stackOut_42_0;
                  stackIn_43_1 = stackOut_42_1;
                  stackIn_43_2 = stackOut_42_2;
                  stackIn_43_3 = stackOut_42_3;
                  if (var26 != null) {
                    stackOut_44_0 = null;
                    stackOut_44_1 = null;
                    stackOut_44_2 = stackIn_44_2;
                    stackOut_44_3 = stackIn_44_3;
                    stackOut_44_4 = var26.length();
                    stackIn_45_0 = stackOut_44_0;
                    stackIn_45_1 = stackOut_44_1;
                    stackIn_45_2 = stackOut_44_2;
                    stackIn_45_3 = stackOut_44_3;
                    stackIn_45_4 = stackOut_44_4;
                    break L23;
                  } else {
                    stackOut_43_0 = null;
                    stackOut_43_1 = null;
                    stackOut_43_2 = stackIn_43_2;
                    stackOut_43_3 = stackIn_43_3;
                    stackOut_43_4 = 0;
                    stackIn_45_0 = stackOut_43_0;
                    stackIn_45_1 = stackOut_43_1;
                    stackIn_45_2 = stackOut_43_2;
                    stackIn_45_3 = stackOut_43_3;
                    stackIn_45_4 = stackOut_43_4;
                    break L23;
                  }
                }
                L24: {
                  new pm(stackIn_45_2, stackIn_45_3, stackIn_45_4);
                  var27 = stackIn_45_0;
                  var27.field_b[0] = 0;
                  if (var26 == null) {
                    break L24;
                  } else {
                    L25: {
                      var27.field_b[var26.length()] = param4.a(var26);
                      if (-4 != (param6 ^ -1)) {
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        break L25;
                      } else {
                        stackOut_47_0 = ((mb) this).a(param4.a(var26), param2, 41, var26);
                        stackIn_49_0 = stackOut_47_0;
                        break L25;
                      }
                    }
                    ld.a(stackIn_49_0, (byte) 98, param4, var26, var27);
                    break L24;
                  }
                }
                ((mb) this).field_d[var12] = var27;
                var11 = var11 + param7;
                var12++;
                continue L22;
              } else {
                return;
              }
            }
          }
        } else {
          ((mb) this).field_d = null;
          return;
        }
    }

    private final pm a(byte param0, String param1, vm param2, int param3) {
        pm var5 = null;
        pm var6 = null;
        if (param0 != 53) {
          return null;
        } else {
          var6 = new pm(param3 - param2.field_y, param3 - -param2.field_F, param1.length());
          var5 = var6;
          ((mb) this).field_d = new pm[]{var6};
          return var5;
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5_ref = null;
        ne var5_ref_ne = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        en var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        de var14 = null;
        int[] var15 = null;
        Object var16 = null;
        int[] var18 = null;
        L0: {
          var5_ref = null;
          var16 = null;
          var8 = HostileSpawn.field_I ? 1 : 0;
          var10 = sc.field_g;
          var2 = var10.l(32270);
          var3 = var10.l(32270);
          if (param0 == 65) {
            break L0;
          } else {
            mb.c(-95);
            break L0;
          }
        }
        if (var2 == 0) {
          var14 = (de) (Object) ke.field_B.g(-76);
          if (var14 == null) {
            le.c((byte) 122);
            return;
          } else {
            L1: {
              var5 = -var10.field_i + jd.field_q;
              var18 = var14.field_h;
              var15 = var18;
              var12 = var15;
              var11 = var12;
              var6 = var11;
              if (var5 <= var18.length << 423186914) {
                break L1;
              } else {
                var5 = var18.length << -3559518;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var5 <= var7) {
                var14.field_j = true;
                var14.b(param0 + -170);
                return;
              } else {
                var6[var7 >> -2087346942] = var6[var7 >> -2087346942] + (var10.l(32270) << (ua.a(var7, 3) << -1002333144));
                var7++;
                continue L2;
              }
            }
          }
        } else {
          if (1 == var2) {
            var4 = var10.i(param0 + -1);
            var5_ref_ne = (ne) (Object) n.field_v.g(-106);
            L3: while (true) {
              if (var5_ref_ne != null) {
                L4: {
                  if (var3 != var5_ref_ne.field_i) {
                    break L4;
                  } else {
                    if (var4 != var5_ref_ne.field_m) {
                      break L4;
                    } else {
                      if (var5_ref_ne == null) {
                        le.c((byte) 76);
                        return;
                      } else {
                        var5_ref_ne.b(param0 + 61);
                        return;
                      }
                    }
                  }
                }
                var5_ref_ne = (ne) (Object) n.field_v.a(12684);
                continue L3;
              } else {
                if (var5_ref_ne == null) {
                  le.c((byte) 76);
                  return;
                } else {
                  var5_ref_ne.b(param0 + 61);
                  return;
                }
              }
            }
          } else {
            ic.a((byte) -116, "LR1: " + gf.a((byte) -126), (Throwable) null);
            le.c((byte) 93);
            return;
          }
        }
    }

    final void a(int param0, int param1, String param2, vm param3, byte param4) {
        Object var7 = null;
        pm var10 = null;
        pm var11 = null;
        pm var12 = null;
        pm var13 = null;
        pm var14 = null;
        pm var15 = null;
        if (param2 == null) {
          ((mb) this).field_d = null;
          return;
        } else {
          if (((mb) this).field_q == param3) {
            if (((mb) this).field_o) {
              L0: {
                if (0 != ((mb) this).field_j) {
                  break L0;
                } else {
                  if (((mb) this).field_l == null) {
                    break L0;
                  } else {
                    if (!((mb) this).field_l.equals((Object) (Object) param2)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((mb) this).field_l = param2;
              ((mb) this).field_o = true;
              ((mb) this).field_q = param3;
              ((mb) this).field_j = 0;
              var14 = this.a((byte) 53, param2, param3, param0);
              var15 = var14;
              if (param4 != -2) {
                var7 = null;
                ((mb) this).a((vm) null, 45, -44, -47, (String) null);
                var14.field_b[0] = param1;
                var15.field_b[param2.length()] = param3.a(param2) + param1;
                ld.a(0, (byte) -69, param3, param2, var15);
                return;
              } else {
                var14.field_b[0] = param1;
                var15.field_b[param2.length()] = param3.a(param2) + param1;
                ld.a(0, (byte) -69, param3, param2, var15);
                return;
              }
            } else {
              ((mb) this).field_l = param2;
              ((mb) this).field_o = true;
              ((mb) this).field_q = param3;
              ((mb) this).field_j = 0;
              var12 = this.a((byte) 53, param2, param3, param0);
              var13 = var12;
              if (param4 != -2) {
                var7 = null;
                ((mb) this).a((vm) null, 45, -44, -47, (String) null);
                var12.field_b[0] = param1;
                var13.field_b[param2.length()] = param3.a(param2) + param1;
                ld.a(0, (byte) -69, param3, param2, var13);
                return;
              } else {
                var12.field_b[0] = param1;
                var13.field_b[param2.length()] = param3.a(param2) + param1;
                ld.a(0, (byte) -69, param3, param2, var13);
                return;
              }
            }
          } else {
            ((mb) this).field_l = param2;
            ((mb) this).field_o = true;
            ((mb) this).field_q = param3;
            ((mb) this).field_j = 0;
            var10 = this.a((byte) 53, param2, param3, param0);
            var11 = var10;
            if (param4 != -2) {
              var7 = null;
              ((mb) this).a((vm) null, 45, -44, -47, (String) null);
              var10.field_b[0] = param1;
              var11.field_b[param2.length()] = param3.a(param2) + param1;
              ld.a(0, (byte) -69, param3, param2, var11);
              return;
            } else {
              var10.field_b[0] = param1;
              var11.field_b[param2.length()] = param3.a(param2) + param1;
              ld.a(0, (byte) -69, param3, param2, var11);
              return;
            }
          }
        }
    }

    final void a(vm param0, int param1, int param2, int param3, String param4) {
        pm var8 = null;
        pm var10 = null;
        pm var11 = null;
        pm var12 = null;
        if (param4 == null) {
          ((mb) this).field_d = null;
          return;
        } else {
          if (((mb) this).field_q == param0) {
            if (((mb) this).field_o) {
              L0: {
                if ((((mb) this).field_j ^ -1) != -3) {
                  break L0;
                } else {
                  if (((mb) this).field_l == null) {
                    break L0;
                  } else {
                    if (!((mb) this).field_l.equals((Object) (Object) param4)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((mb) this).field_q = param0;
              ((mb) this).field_o = true;
              ((mb) this).field_j = 2;
              ((mb) this).field_l = param4;
              if (param2 != -1002333144) {
                return;
              } else {
                var8 = this.a((byte) 53, param4, param0, param1);
                var12 = var8;
                var12.field_b[0] = -param0.a(param4) + param3;
                var12.field_b[param4.length()] = param3;
                ld.a(0, (byte) 65, param0, param4, var12);
                return;
              }
            } else {
              ((mb) this).field_q = param0;
              ((mb) this).field_o = true;
              ((mb) this).field_j = 2;
              ((mb) this).field_l = param4;
              if (param2 != -1002333144) {
                return;
              } else {
                var8 = this.a((byte) 53, param4, param0, param1);
                var11 = var8;
                var11.field_b[0] = -param0.a(param4) + param3;
                var11.field_b[param4.length()] = param3;
                ld.a(0, (byte) 65, param0, param4, var11);
                return;
              }
            }
          } else {
            ((mb) this).field_q = param0;
            ((mb) this).field_o = true;
            ((mb) this).field_j = 2;
            ((mb) this).field_l = param4;
            if (param2 != -1002333144) {
              return;
            } else {
              var8 = this.a((byte) 53, param4, param0, param1);
              var10 = var8;
              var10.field_b[0] = -param0.a(param4) + param3;
              var10.field_b[param4.length()] = param3;
              ld.a(0, (byte) 65, param0, param4, var10);
              return;
            }
          }
        }
    }

    final static void d(int param0, int param1) {
        try {
            if (param1 != -22370) {
                nd discarded$0 = mb.c(-64, 48);
            }
            if (null != ag.field_t) {
                // if_icmpgt L50
                // if_acmpne L42
            } else {
                s.field_b.field_i = 0;
                return;
            }
            if (-1 == (s.field_b.field_i ^ -1)) {
                if (10000L + gf.field_h < hn.a((byte) 80)) {
                    s.field_b.i(param1 + 41689, param0);
                }
            }
            if (!(s.field_b.field_i <= 0)) {
                try {
                    ag.field_t.a(s.field_b.field_i, s.field_b.field_n, (byte) 112, 0);
                    gf.field_h = hn.a((byte) 80);
                } catch (IOException iOException) {
                    le.c((byte) 81);
                }
                s.field_b.field_i = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nd c(int param0, int param1) {
        nd[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        nd[] var5 = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var5 = gj.a(-17);
        var2 = var5;
        if (param0 == -22094) {
          var3 = 0;
          L0: while (true) {
            if (var5.length > var3) {
              if (param1 != var5[var3].field_c) {
                var3++;
                continue L0;
              } else {
                return var5[var3];
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        if (param0 <= 105) {
          mb.d(78, 82);
          field_m = null;
          field_k = null;
          field_s = null;
          return;
        } else {
          field_m = null;
          field_k = null;
          field_s = null;
          return;
        }
    }

    final void a(int param0, String param1, int param2, int param3, vm param4) {
        int var7 = 0;
        pm var9 = null;
        pm var10 = null;
        pm var11 = null;
        pm var12 = null;
        pm var13 = null;
        pm var14 = null;
        if (param1 == null) {
          ((mb) this).field_d = null;
          return;
        } else {
          if (param4 == ((mb) this).field_q) {
            if (((mb) this).field_o) {
              L0: {
                if (-2 != (((mb) this).field_j ^ -1)) {
                  break L0;
                } else {
                  if (null == ((mb) this).field_l) {
                    break L0;
                  } else {
                    if (!((mb) this).field_l.equals((Object) (Object) param1)) {
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((mb) this).field_o = true;
              if (param3 != 28916) {
                ((mb) this).field_l = null;
                ((mb) this).field_q = param4;
                ((mb) this).field_j = 1;
                var13 = this.a((byte) 53, param1, param4, param0);
                var7 = param4.a(param1);
                var13.field_b[0] = -(var7 >> 239503617) + param2;
                var13.field_b[param1.length()] = param2 + (var7 >> -832682751);
                ld.a(0, (byte) -54, param4, param1, var13);
                return;
              } else {
                ((mb) this).field_q = param4;
                ((mb) this).field_j = 1;
                var14 = this.a((byte) 53, param1, param4, param0);
                var7 = param4.a(param1);
                var14.field_b[0] = -(var7 >> 239503617) + param2;
                var14.field_b[param1.length()] = param2 + (var7 >> -832682751);
                ld.a(0, (byte) -54, param4, param1, var14);
                return;
              }
            } else {
              ((mb) this).field_o = true;
              if (param3 != 28916) {
                ((mb) this).field_l = null;
                ((mb) this).field_q = param4;
                ((mb) this).field_j = 1;
                var11 = this.a((byte) 53, param1, param4, param0);
                var7 = param4.a(param1);
                var11.field_b[0] = -(var7 >> 239503617) + param2;
                var11.field_b[param1.length()] = param2 + (var7 >> -832682751);
                ld.a(0, (byte) -54, param4, param1, var11);
                return;
              } else {
                ((mb) this).field_q = param4;
                ((mb) this).field_j = 1;
                var12 = this.a((byte) 53, param1, param4, param0);
                var7 = param4.a(param1);
                var12.field_b[0] = -(var7 >> 239503617) + param2;
                var12.field_b[param1.length()] = param2 + (var7 >> -832682751);
                ld.a(0, (byte) -54, param4, param1, var12);
                return;
              }
            }
          } else {
            ((mb) this).field_o = true;
            if (param3 != 28916) {
              ((mb) this).field_l = null;
              ((mb) this).field_q = param4;
              ((mb) this).field_j = 1;
              var9 = this.a((byte) 53, param1, param4, param0);
              var7 = param4.a(param1);
              var9.field_b[0] = -(var7 >> 239503617) + param2;
              var9.field_b[param1.length()] = param2 + (var7 >> -832682751);
              ld.a(0, (byte) -54, param4, param1, var9);
              return;
            } else {
              ((mb) this).field_q = param4;
              ((mb) this).field_j = 1;
              var10 = this.a((byte) 53, param1, param4, param0);
              var7 = param4.a(param1);
              var10.field_b[0] = -(var7 >> 239503617) + param2;
              var10.field_b[param1.length()] = param2 + (var7 >> -832682751);
              ld.a(0, (byte) -54, param4, param1, var10);
              return;
            }
          }
        }
    }

    public mb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Weapons";
        field_i = 0;
    }
}
