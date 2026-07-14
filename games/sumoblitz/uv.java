/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uv extends gm {
    private ne[] field_p;
    static int[] field_o;
    static long field_n;

    final static int b(int param0) {
        if (param0 != -25843) {
            Object var2 = null;
            uv.a(-92, -128, -112, -123, (jn) null, -24);
            return -hu.field_b + dj.field_n;
        }
        return -hu.field_b + dj.field_n;
    }

    uv(ne[] param0) {
        ((uv) this).field_e = kw.field_b;
        ((uv) this).field_p = param0;
    }

    final static void a(int param0, int param1, int param2, int param3, jn param4, int param5) {
        int var6 = 0;
        float[] var7 = null;
        vt var8 = null;
        int var9 = 0;
        float[] var10 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var18 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        var6 = 0;
        if (param2 != -9) {
          return;
        } else {
          L0: while (true) {
            if (8 <= var6) {
              var6 = 0;
              L1: while (true) {
                if ((var6 ^ -1) <= -9) {
                  return;
                } else {
                  var7 = new float[]{0.0f, (float)(-(1 + fi.a(param5, he.field_o, (byte) -96)))};
                  var15 = kt.a((byte) -92, var7, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6)));
                  var7 = kt.a((byte) -92, var7, (float)(0.0 + 0.017453292519943295 * (double)(2048.0f / (float)var6)));
                  var8 = new vt(24, param3, param1, param0, (int)var15[0] << 283696296, (int)var15[1] << -373036440, 1);
                  param4.a((ms) (Object) var8, (byte) 39);
                  var6++;
                  continue L1;
                }
              }
            } else {
              var7 = new float[]{0.0f, (float)(-(fi.a(param5, he.field_o, (byte) -96) + 1))};
              var18 = kt.a((byte) -115, var7, (float)(0.0 + (double)(2048.0f / (float)var6) * 0.017453292519943295));
              var14 = var18;
              var13 = var14;
              var12 = var13;
              var10 = var12;
              var7 = var10;
              var8 = new vt(24, param3, param1, param0, (int)var18[0] << 814838792, (int)var18[1] << 545108968, 0);
              param4.a((ms) (Object) var8, (byte) 39);
              var6++;
              continue L0;
            }
          }
        }
    }

    public final void a(pk param0, int param1, int param2, boolean param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ne var14 = null;
        ne var15 = null;
        ne var16 = null;
        ne var17 = null;
        ne var18 = null;
        ne var20 = null;
        ne var20_ref = null;
        ne var21 = null;
        ne var22 = null;
        ne var23 = null;
        ne var25 = null;
        ne var26 = null;
        ne var27 = null;
        ne var28 = null;
        ne var29 = null;
        ne var30 = null;
        ne var31 = null;
        ne var32 = null;
        ne var33 = null;
        ne var34 = null;
        ne var35 = null;
        ne var35_ref = null;
        ne var36 = null;
        ne var36_ref = null;
        ne var37 = null;
        ne var37_ref = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_111_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_92_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        lk.b(param0.field_r + param4, param0.field_v + param1, param0.field_q, param0.field_p, 10197915);
        if (param3) {
          if (((wp) (Object) param0).field_C) {
            var6 = 1;
            if (param2 == 5592405) {
              L0: {
                L1: {
                  if (!param3) {
                    break L1;
                  } else {
                    if (!param0.d(-1)) {
                      break L1;
                    } else {
                      stackOut_104_0 = 1;
                      stackIn_106_0 = stackOut_104_0;
                      break L0;
                    }
                  }
                }
                stackOut_105_0 = 0;
                stackIn_106_0 = stackOut_105_0;
                break L0;
              }
              L2: {
                var7 = stackIn_106_0;
                var8 = 0;
                if (var7 == 0) {
                  break L2;
                } else {
                  var8 = var8 | 2;
                  break L2;
                }
              }
              L3: {
                if (var6 != 0) {
                  stackOut_110_0 = 2394342;
                  stackIn_111_0 = stackOut_110_0;
                  break L3;
                } else {
                  stackOut_109_0 = 16777215;
                  stackIn_111_0 = stackOut_109_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_111_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              var37_ref = ((uv) this).field_p[var8];
              var11 = param4 - (-param0.field_r - (param0.field_q + -var37_ref.field_e) / 2);
              var12 = (param0.field_p + -var37_ref.field_a) / 2 + (param0.field_v + param1);
              var13 = param0.field_q / 2 + (param4 + param0.field_r);
              var37_ref.a(var11, var12);
              ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
              return;
            } else {
              L5: {
                L6: {
                  int discarded$3 = uv.b(124);
                  if (!param3) {
                    break L6;
                  } else {
                    if (!param0.d(-1)) {
                      break L6;
                    } else {
                      stackOut_91_0 = 1;
                      stackIn_93_0 = stackOut_91_0;
                      break L5;
                    }
                  }
                }
                stackOut_92_0 = 0;
                stackIn_93_0 = stackOut_92_0;
                break L5;
              }
              L7: {
                var7 = stackIn_93_0;
                var8 = 0;
                if (var7 == 0) {
                  break L7;
                } else {
                  var8 = var8 | 2;
                  break L7;
                }
              }
              L8: {
                if (var6 != 0) {
                  stackOut_97_0 = 2394342;
                  stackIn_98_0 = stackOut_97_0;
                  break L8;
                } else {
                  stackOut_96_0 = 16777215;
                  stackIn_98_0 = stackOut_96_0;
                  break L8;
                }
              }
              L9: {
                var9 = stackIn_98_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              var36_ref = ((uv) this).field_p[var8];
              var37 = var36_ref;
              var37 = var36_ref;
              var11 = param4 - (-param0.field_r - (param0.field_q + -var36_ref.field_e) / 2);
              var12 = (param0.field_p + -var36_ref.field_a) / 2 + (param0.field_v + param1);
              var13 = param0.field_q / 2 + (param4 + param0.field_r);
              var36_ref.a(var11, var12);
              ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
              return;
            }
          } else {
            var6 = 0;
            if (param2 == 5592405) {
              L10: {
                L11: {
                  if (!param3) {
                    break L11;
                  } else {
                    if (!param0.d(-1)) {
                      break L11;
                    } else {
                      stackOut_77_0 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      break L10;
                    }
                  }
                }
                stackOut_78_0 = 0;
                stackIn_79_0 = stackOut_78_0;
                break L10;
              }
              L12: {
                var7 = stackIn_79_0;
                var8 = 0;
                if (var7 == 0) {
                  break L12;
                } else {
                  var8 = var8 | 2;
                  break L12;
                }
              }
              L13: {
                if (var6 != 0) {
                  stackOut_83_0 = 2394342;
                  stackIn_84_0 = stackOut_83_0;
                  break L13;
                } else {
                  stackOut_82_0 = 16777215;
                  stackIn_84_0 = stackOut_82_0;
                  break L13;
                }
              }
              L14: {
                var9 = stackIn_84_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              var35 = ((uv) this).field_p[var8];
              var37 = var35;
              var37 = var35;
              var11 = param4 - (-param0.field_r - (param0.field_q + -var35.field_e) / 2);
              var12 = (param0.field_p + -var35.field_a) / 2 + (param0.field_v + param1);
              var13 = param0.field_q / 2 + (param4 + param0.field_r);
              var35.a(var11, var12);
              ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
              return;
            } else {
              int discarded$4 = uv.b(124);
              if (param3) {
                if (param0.d(-1)) {
                  L15: {
                    var7 = 1;
                    var8 = 0;
                    if (var7 == 0) {
                      break L15;
                    } else {
                      var8 = var8 | 2;
                      break L15;
                    }
                  }
                  L16: {
                    if (var6 != 0) {
                      stackOut_70_0 = 2394342;
                      stackIn_71_0 = stackOut_70_0;
                      break L16;
                    } else {
                      stackOut_69_0 = 16777215;
                      stackIn_71_0 = stackOut_69_0;
                      break L16;
                    }
                  }
                  L17: {
                    var9 = stackIn_71_0;
                    if (var6 != 0) {
                      var8 = var8 | 1;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  var34 = ((uv) this).field_p[var8];
                  var35_ref = var34;
                  var37 = var35_ref;
                  var35_ref = var34;
                  var11 = param4 - (-param0.field_r - (param0.field_q + -var34.field_e) / 2);
                  var12 = (param0.field_p + -var34.field_a) / 2 + (param0.field_v + param1);
                  var13 = param0.field_q / 2 + (param4 + param0.field_r);
                  var34.a(var11, var12);
                  ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
                  return;
                } else {
                  L18: {
                    var7 = 0;
                    var8 = 0;
                    if (var7 == 0) {
                      break L18;
                    } else {
                      var8 = var8 | 2;
                      break L18;
                    }
                  }
                  L19: {
                    if (var6 != 0) {
                      stackOut_61_0 = 2394342;
                      stackIn_62_0 = stackOut_61_0;
                      break L19;
                    } else {
                      stackOut_60_0 = 16777215;
                      stackIn_62_0 = stackOut_60_0;
                      break L19;
                    }
                  }
                  L20: {
                    var9 = stackIn_62_0;
                    if (var6 != 0) {
                      var8 = var8 | 1;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  var30 = ((uv) this).field_p[var8];
                  var31 = var30;
                  var32 = var31;
                  var33 = var32;
                  var31 = var30;
                  var11 = param4 - (-param0.field_r - (param0.field_q + -var30.field_e) / 2);
                  var12 = (param0.field_p + -var30.field_a) / 2 + (param0.field_v + param1);
                  var13 = param0.field_q / 2 + (param4 + param0.field_r);
                  var30.a(var11, var12);
                  ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
                  return;
                }
              } else {
                L21: {
                  var7 = 0;
                  var8 = 0;
                  if (var7 == 0) {
                    break L21;
                  } else {
                    var8 = var8 | 2;
                    break L21;
                  }
                }
                L22: {
                  if (var6 != 0) {
                    stackOut_51_0 = 2394342;
                    stackIn_52_0 = stackOut_51_0;
                    break L22;
                  } else {
                    stackOut_50_0 = 16777215;
                    stackIn_52_0 = stackOut_50_0;
                    break L22;
                  }
                }
                L23: {
                  var9 = stackIn_52_0;
                  if (var6 != 0) {
                    var8 = var8 | 1;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                var26 = ((uv) this).field_p[var8];
                var27 = var26;
                var28 = var27;
                var29 = var28;
                var27 = var26;
                var11 = param4 - (-param0.field_r - (param0.field_q + -var26.field_e) / 2);
                var12 = (param0.field_p + -var26.field_a) / 2 + (param0.field_v + param1);
                var13 = param0.field_q / 2 + (param4 + param0.field_r);
                var26.a(var11, var12);
                ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
                return;
              }
            }
          }
        } else {
          var6 = 0;
          if (param2 == 5592405) {
            if (param3) {
              if (param0.d(-1)) {
                L24: {
                  var7 = 1;
                  var8 = 0;
                  if (var7 == 0) {
                    break L24;
                  } else {
                    var8 = var8 | 2;
                    break L24;
                  }
                }
                L25: {
                  if (var6 != 0) {
                    stackOut_39_0 = 2394342;
                    stackIn_40_0 = stackOut_39_0;
                    break L25;
                  } else {
                    stackOut_38_0 = 16777215;
                    stackIn_40_0 = stackOut_38_0;
                    break L25;
                  }
                }
                L26: {
                  var9 = stackIn_40_0;
                  if (var6 != 0) {
                    var8 = var8 | 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                var25 = ((uv) this).field_p[var8];
                var36 = var25;
                var37 = var36;
                var36 = var25;
                var11 = param4 - (-param0.field_r - (param0.field_q + -var25.field_e) / 2);
                var12 = (param0.field_p + -var25.field_a) / 2 + (param0.field_v + param1);
                var13 = param0.field_q / 2 + (param4 + param0.field_r);
                var25.a(var11, var12);
                ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
                return;
              } else {
                L27: {
                  var7 = 0;
                  var8 = 0;
                  if (var7 == 0) {
                    break L27;
                  } else {
                    var8 = var8 | 2;
                    break L27;
                  }
                }
                L28: {
                  if (var6 != 0) {
                    stackOut_30_0 = 2394342;
                    stackIn_31_0 = stackOut_30_0;
                    break L28;
                  } else {
                    stackOut_29_0 = 16777215;
                    stackIn_31_0 = stackOut_29_0;
                    break L28;
                  }
                }
                L29: {
                  var9 = stackIn_31_0;
                  if (var6 != 0) {
                    var8 = var8 | 1;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                var20 = ((uv) this).field_p[var8];
                var21 = var20;
                var22 = var21;
                var23 = var22;
                var21 = var20;
                var11 = param4 - (-param0.field_r - (param0.field_q + -var20.field_e) / 2);
                var12 = (param0.field_p + -var20.field_a) / 2 + (param0.field_v + param1);
                var13 = param0.field_q / 2 + (param4 + param0.field_r);
                var20.a(var11, var12);
                ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
                return;
              }
            } else {
              L30: {
                var7 = 0;
                var8 = 0;
                if (var7 == 0) {
                  break L30;
                } else {
                  var8 = var8 | 2;
                  break L30;
                }
              }
              L31: {
                if (var6 != 0) {
                  stackOut_20_0 = 2394342;
                  stackIn_21_0 = stackOut_20_0;
                  break L31;
                } else {
                  stackOut_19_0 = 16777215;
                  stackIn_21_0 = stackOut_19_0;
                  break L31;
                }
              }
              L32: {
                var9 = stackIn_21_0;
                if (var6 != 0) {
                  var8 = var8 | 1;
                  break L32;
                } else {
                  break L32;
                }
              }
              var15 = ((uv) this).field_p[var8];
              var16 = var15;
              var17 = var16;
              var18 = var17;
              var16 = var15;
              var11 = param4 - (-param0.field_r - (param0.field_q + -var15.field_e) / 2);
              var12 = (param0.field_p + -var15.field_a) / 2 + (param0.field_v + param1);
              var13 = param0.field_q / 2 + (param4 + param0.field_r);
              var15.a(var11, var12);
              ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
              return;
            }
          } else {
            L33: {
              L34: {
                int discarded$5 = uv.b(124);
                if (!param3) {
                  break L34;
                } else {
                  if (!param0.d(-1)) {
                    break L34;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L33;
                  }
                }
              }
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L33;
            }
            L35: {
              var7 = stackIn_6_0;
              var8 = 0;
              if (var7 == 0) {
                break L35;
              } else {
                var8 = var8 | 2;
                break L35;
              }
            }
            L36: {
              if (var6 != 0) {
                stackOut_10_0 = 2394342;
                stackIn_11_0 = stackOut_10_0;
                break L36;
              } else {
                stackOut_9_0 = 16777215;
                stackIn_11_0 = stackOut_9_0;
                break L36;
              }
            }
            L37: {
              var9 = stackIn_11_0;
              if (var6 != 0) {
                var8 = var8 | 1;
                break L37;
              } else {
                break L37;
              }
            }
            var14 = ((uv) this).field_p[var8];
            var20_ref = var14;
            var21 = var20_ref;
            var22 = var21;
            var20_ref = var14;
            var11 = param4 - (-param0.field_r - (param0.field_q + -var14.field_e) / 2);
            var12 = (param0.field_p + -var14.field_a) / 2 + (param0.field_v + param1);
            var13 = param0.field_q / 2 + (param4 + param0.field_r);
            var14.a(var11, var12);
            ((uv) this).field_e.a(((uv) this).a(true, param0), var13, param1, var9, -1);
            return;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 != -31) {
            field_n = -34L;
            field_o = null;
            return;
        }
        field_o = null;
    }

    final static int a(int param0, CharSequence param1, boolean param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        if (-3 < (param0 ^ -1)) {
          throw new IllegalArgumentException("" + param0);
        } else {
          if (36 >= param0) {
            var4 = 0;
            var5 = 0;
            var6 = 0;
            if (param3 <= -78) {
              L0: {
                var7 = param1.length();
                var8 = 0;
                if ((var7 ^ -1) >= (var8 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    L2: {
                      var9 = param1.charAt(var8);
                      if (var8 == 0) {
                        L3: {
                          if (45 == var9) {
                            var4 = 1;
                            var8++;
                            break L3;
                          } else {
                            if (var9 != 43) {
                              break L2;
                            } else {
                              if (param2) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        var8++;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                    L4: {
                      L5: {
                        if (var9 < 48) {
                          break L5;
                        } else {
                          if (57 < var9) {
                            break L5;
                          } else {
                            var9 -= 48;
                            break L4;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 65) {
                          break L6;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var9 < 97) {
                          break L7;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param0) {
                      L8: {
                        if (var4 == 0) {
                          break L8;
                        } else {
                          var9 = -var9;
                          break L8;
                        }
                      }
                      var10 = var6 * param0 - -var9;
                      if ((var6 ^ -1) != (var10 / param0 ^ -1)) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        break L1;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  var8++;
                  var8++;
                  var8++;
                  break L0;
                }
              }
              if (var5 == 0) {
                throw new NumberFormatException();
              } else {
                return var6;
              }
            } else {
              field_n = 102L;
              var7 = param1.length();
              var8 = 0;
              L9: while (true) {
                if ((var7 ^ -1) >= (var8 ^ -1)) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L10: {
                    L11: {
                      var9 = param1.charAt(var8);
                      if (var8 == 0) {
                        if (45 == var9) {
                          var4 = 1;
                          break L10;
                        } else {
                          if (var9 != 43) {
                            break L11;
                          } else {
                            if (param2) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (var9 < 48) {
                          break L13;
                        } else {
                          if (57 < var9) {
                            break L13;
                          } else {
                            var9 -= 48;
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (var9 < 65) {
                          break L14;
                        } else {
                          if (var9 <= 90) {
                            var9 -= 55;
                            break L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (var9 < 97) {
                          break L15;
                        } else {
                          if (var9 <= 122) {
                            var9 -= 87;
                            break L12;
                          } else {
                            break L15;
                          }
                        }
                      }
                      throw new NumberFormatException();
                    }
                    if (var9 < param0) {
                      L16: {
                        if (var4 == 0) {
                          break L16;
                        } else {
                          var9 = -var9;
                          break L16;
                        }
                      }
                      var10 = var6 * param0 - -var9;
                      if ((var6 ^ -1) != (var10 / param0 ^ -1)) {
                        throw new NumberFormatException();
                      } else {
                        var6 = var10;
                        var5 = 1;
                        break L10;
                      }
                    } else {
                      throw new NumberFormatException();
                    }
                  }
                  var8++;
                  continue L9;
                }
              }
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        }
    }

    static {
    }
}
