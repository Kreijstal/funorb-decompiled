/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static String field_e;
    static int field_c;
    static int[] field_b;
    double field_f;
    double field_a;
    static bd field_d;

    final void a(int param0, byte param1, double param2) {
        Object var6 = null;
        param2 = param2 * 0.02454369260617026;
        if (param1 != 94) {
          var6 = null;
          og.a((byte) 120, (oc) null);
          ((og) this).field_f = ((og) this).field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        } else {
          ((og) this).field_f = ((og) this).field_f + (double)(-param0) * Math.sin(param2) / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param2) * (double)(-param0) / 20.0;
          return;
        }
    }

    final boolean[] a(int param0, double param1, oc param2, boolean param3, id param4) {
        if (param3) {
            return null;
        }
        return ((og) this).a(25302, false, param1, param0, param4, 1, param2);
    }

    final boolean[] a(double param0, oc param1, int param2, id param3, byte param4) {
        if (param4 >= -63) {
          ((og) this).field_f = 2.317784439522071;
          return ((og) this).a(25302, false, param0, param2, param3, 0, param1);
        } else {
          return ((og) this).a(25302, false, param0, param2, param3, 0, param1);
        }
    }

    final void a(og param0, int param1) {
        ((og) this).field_f = param0.field_f;
        ((og) this).field_a = param0.field_a;
        if (param1 == -28860) {
            return;
        }
        field_e = null;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        ne var4 = null;
        de var5 = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        var4 = (ne) (Object) n.field_v.g(-97);
        L0: while (true) {
          if (var4 == null) {
            if (param0 == -22248) {
              var5 = (de) (Object) ke.field_B.g(-47);
              L1: while (true) {
                if (var5 != null) {
                  km.a(var5, -19746, param1);
                  var5 = (de) (Object) ke.field_B.a(12684);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              og.a(-73, 61);
              var5 = (de) (Object) ke.field_B.g(-47);
              L2: while (true) {
                if (var5 != null) {
                  km.a(var5, -19746, param1);
                  var5 = (de) (Object) ke.field_B.a(12684);
                  continue L2;
                } else {
                  return;
                }
              }
            }
          } else {
            bl.a(1, var4, param1);
            var4 = (ne) (Object) n.field_v.a(12684);
            continue L0;
          }
        }
    }

    final boolean[] a(oc param0, double param1, int param2, int param3, id param4) {
        if (param2 != 1) {
          ((og) this).a(-128, (byte) 30, 0.14322233202140824);
          return ((og) this).a(25302, true, param1, param3, param4, 1, param0);
        } else {
          return ((og) this).a(25302, true, param1, param3, param4, 1, param0);
        }
    }

    final void a(double param0, double param1, int param2) {
        ((og) this).field_a = param0;
        if (param2 != 1) {
            og.a(47, -122);
            ((og) this).field_f = param1;
            return;
        }
        ((og) this).field_f = param1;
    }

    final static void a(byte param0, oc param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        vi.field_p = new oj[17];
        vi.field_p[0] = new oj(param1, 8, rl.field_c);
        vi.field_p[0].field_I = 1000;
        var2 = 1;
        var3 = -18 % ((param0 - -14) / 46);
        L0: while (true) {
          if (vi.field_p.length <= var2) {
            var5 = -1 + vi.field_p.length;
            var2 = var5;
            L1: while (true) {
              if (var5 >= 0) {
                mm.field_m[el.field_j] = vi.field_p[var5];
                el.field_j = el.field_j + 1;
                var5--;
                continue L1;
              } else {
                return;
              }
            }
          } else {
            vi.field_p[var2] = new oj(param1, 231, rl.field_c);
            vi.field_p[var2].field_I = 200;
            var2++;
            continue L0;
          }
        }
    }

    final boolean[] a(int param0, boolean param1, double param2, int param3, id param4, int param5, oc param6) {
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        int var19 = 0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var24_int = 0;
        int var25 = 0;
        double var26 = 0.0;
        int var26_int = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        Object var33 = null;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_149_0 = 0;
        int stackIn_152_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_172_0 = 0;
        int stackIn_177_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_186_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_213_0 = 0;
        int stackIn_224_0 = 0;
        int stackIn_227_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_249_0 = 0;
        int stackIn_252_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        int stackOut_168_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_181_0 = 0;
        int stackOut_185_0 = 0;
        int stackOut_184_0 = 0;
        int stackOut_248_0 = 0;
        int stackOut_247_0 = 0;
        int stackOut_251_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_235_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_238_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_226_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_212_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        L0: {
          var32 = HostileSpawn.field_I ? 1 : 0;
          var9 = 3.141592653589793 * param2 / 128.0;
          if (param0 == 25302) {
            break L0;
          } else {
            var33 = null;
            boolean[] discarded$1 = ((og) this).a(-112, 0.23920950584503275, (oc) null, true, (id) null);
            break L0;
          }
        }
        L1: {
          var11 = Math.sin(var9) * (double)(-param3) / 40.0;
          if (var11 <= -0.01) {
            break L1;
          } else {
            if (var11 < 0.01) {
              var11 = 0.0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          var13 = Math.cos(var9) * (double)(-param3) / 40.0;
          if (var13 <= -0.01) {
            break L2;
          } else {
            if (0.01 > var13) {
              var13 = 0.0;
              break L2;
            } else {
              L3: {
                var15 = var11;
                var17 = var13;
                var19 = param6.b(-4);
                var20 = var11;
                if (var11 * (((og) this).field_f - 0.5) <= 0.0) {
                  var20 = 0.0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var22 = var13;
                if (var13 * (((og) this).field_a - 0.5) <= 0.0) {
                  var22 = 0.0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                L6: {
                  if (var20 != 0.0) {
                    break L6;
                  } else {
                    if (var22 != 0.0) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                L7: {
                  if (0.0 <= var20) {
                    if (var20 > 0.0) {
                      stackOut_21_0 = 1;
                      stackIn_22_0 = stackOut_21_0;
                      break L7;
                    } else {
                      stackOut_20_0 = 0;
                      stackIn_22_0 = stackOut_20_0;
                      break L7;
                    }
                  } else {
                    stackOut_18_0 = -1;
                    stackIn_22_0 = stackOut_18_0;
                    break L7;
                  }
                }
                L8: {
                  var24_int = stackIn_22_0;
                  if (var22 >= 0.0) {
                    if (0.0 >= var22) {
                      stackOut_26_0 = 0;
                      stackIn_27_0 = stackOut_26_0;
                      break L8;
                    } else {
                      stackOut_25_0 = param4.field_d;
                      stackIn_27_0 = stackOut_25_0;
                      break L8;
                    }
                  } else {
                    stackOut_23_0 = -param4.field_d;
                    stackIn_27_0 = stackOut_23_0;
                    break L8;
                  }
                }
                L9: {
                  var25 = stackIn_27_0;
                  var26_int = var19 - -var24_int;
                  var27 = var26_int - -var25;
                  var28 = var25 + var19;
                  if (param1) {
                    stackOut_29_0 = param4.b(param5, 5857, var27);
                    stackIn_30_0 = stackOut_29_0;
                    break L9;
                  } else {
                    stackOut_28_0 = param4.c(param5, -2, var27);
                    stackIn_30_0 = stackOut_28_0;
                    break L9;
                  }
                }
                L10: {
                  var29 = stackIn_30_0;
                  if (param1) {
                    stackOut_32_0 = param4.b(param5, param0 ^ 29751, var26_int);
                    stackIn_33_0 = stackOut_32_0;
                    break L10;
                  } else {
                    stackOut_31_0 = param4.c(param5, param0 ^ -25304, var26_int);
                    stackIn_33_0 = stackOut_31_0;
                    break L10;
                  }
                }
                L11: {
                  var30 = stackIn_33_0;
                  if (param1) {
                    stackOut_35_0 = param4.b(param5, 5857, var28);
                    stackIn_36_0 = stackOut_35_0;
                    break L11;
                  } else {
                    stackOut_34_0 = param4.c(param5, -2, var28);
                    stackIn_36_0 = stackOut_34_0;
                    break L11;
                  }
                }
                var31 = stackIn_36_0;
                if (var29 < -2) {
                  if (1 >= var30) {
                    var22 = 0.0;
                    var13 = 0.0;
                    break L5;
                  } else {
                    if ((var31 ^ -1) < -2) {
                      var20 = 0.0;
                      var22 = 0.0;
                      var11 = 0.0;
                      var13 = 0.0;
                      break L5;
                    } else {
                      var20 = 0.0;
                      var11 = 0.0;
                      break L5;
                    }
                  }
                } else {
                  L12: {
                    if (-2 >= var30) {
                      break L12;
                    } else {
                      var20 = 0.0;
                      var11 = 0.0;
                      break L12;
                    }
                  }
                  if (1 < var31) {
                    var13 = 0.0;
                    var22 = 0.0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L13: {
                ((og) this).field_a = ((og) this).field_a + var13;
                ((og) this).field_f = ((og) this).field_f + var11;
                var24 = var11 - var15;
                if (0.0 > var24) {
                  var24 = -var24;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var26 = -var17 + var13;
                if (0.0 <= var26) {
                  break L14;
                } else {
                  var26 = -var26;
                  break L14;
                }
              }
              L15: {
                if (0.01 >= var24) {
                  stackOut_54_0 = 0;
                  stackIn_55_0 = stackOut_54_0;
                  break L15;
                } else {
                  stackOut_53_0 = 1;
                  stackIn_55_0 = stackOut_53_0;
                  break L15;
                }
              }
              L16: {
                var28 = stackIn_55_0;
                if (0.01 >= var26) {
                  stackOut_57_0 = 0;
                  stackIn_58_0 = stackOut_57_0;
                  break L16;
                } else {
                  stackOut_56_0 = 1;
                  stackIn_58_0 = stackOut_56_0;
                  break L16;
                }
              }
              var29 = stackIn_58_0;
              return new boolean[]{var28 != 0, var29 != 0};
            }
          }
        }
        L17: {
          var15 = var11;
          var17 = var13;
          var19 = param6.b(-4);
          var20 = var11;
          if (var11 * (((og) this).field_f - 0.5) <= 0.0) {
            var20 = 0.0;
            break L17;
          } else {
            break L17;
          }
        }
        L18: {
          var22 = var13;
          if (var13 * (((og) this).field_a - 0.5) <= 0.0) {
            var22 = 0.0;
            break L18;
          } else {
            break L18;
          }
        }
        if (var20 == 0.0) {
          if (var22 != 0.0) {
            L19: {
              if (0.0 <= var20) {
                if (var20 > 0.0) {
                  stackOut_171_0 = 1;
                  stackIn_172_0 = stackOut_171_0;
                  break L19;
                } else {
                  stackOut_170_0 = 0;
                  stackIn_172_0 = stackOut_170_0;
                  break L19;
                }
              } else {
                stackOut_168_0 = -1;
                stackIn_172_0 = stackOut_168_0;
                break L19;
              }
            }
            L20: {
              var24_int = stackIn_172_0;
              if (var22 >= 0.0) {
                if (0.0 >= var22) {
                  stackOut_176_0 = 0;
                  stackIn_177_0 = stackOut_176_0;
                  break L20;
                } else {
                  stackOut_175_0 = param4.field_d;
                  stackIn_177_0 = stackOut_175_0;
                  break L20;
                }
              } else {
                stackOut_173_0 = -param4.field_d;
                stackIn_177_0 = stackOut_173_0;
                break L20;
              }
            }
            L21: {
              var25 = stackIn_177_0;
              var26_int = var19 - -var24_int;
              var27 = var26_int - -var25;
              var28 = var25 + var19;
              if (param1) {
                stackOut_179_0 = param4.b(param5, 5857, var27);
                stackIn_180_0 = stackOut_179_0;
                break L21;
              } else {
                stackOut_178_0 = param4.c(param5, -2, var27);
                stackIn_180_0 = stackOut_178_0;
                break L21;
              }
            }
            L22: {
              var29 = stackIn_180_0;
              if (param1) {
                stackOut_182_0 = param4.b(param5, param0 ^ 29751, var26_int);
                stackIn_183_0 = stackOut_182_0;
                break L22;
              } else {
                stackOut_181_0 = param4.c(param5, param0 ^ -25304, var26_int);
                stackIn_183_0 = stackOut_181_0;
                break L22;
              }
            }
            L23: {
              var30 = stackIn_183_0;
              if (param1) {
                stackOut_185_0 = param4.b(param5, 5857, var28);
                stackIn_186_0 = stackOut_185_0;
                break L23;
              } else {
                stackOut_184_0 = param4.c(param5, -2, var28);
                stackIn_186_0 = stackOut_184_0;
                break L23;
              }
            }
            var31 = stackIn_186_0;
            if (var29 < -2) {
              if (1 < var30) {
                if ((var31 ^ -1) >= -2) {
                  L24: {
                    var20 = 0.0;
                    var11 = 0.0;
                    ((og) this).field_a = ((og) this).field_a + var13;
                    ((og) this).field_f = ((og) this).field_f + var11;
                    var24 = var11 - var15;
                    if (0.0 > var24) {
                      var24 = -var24;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    var26 = -var17 + var13;
                    if (0.0 <= var26) {
                      break L25;
                    } else {
                      var26 = -var26;
                      break L25;
                    }
                  }
                  L26: {
                    if (0.01 >= var24) {
                      stackOut_248_0 = 0;
                      stackIn_249_0 = stackOut_248_0;
                      break L26;
                    } else {
                      stackOut_247_0 = 1;
                      stackIn_249_0 = stackOut_247_0;
                      break L26;
                    }
                  }
                  L27: {
                    var28 = stackIn_249_0;
                    if (0.01 >= var26) {
                      stackOut_251_0 = 0;
                      stackIn_252_0 = stackOut_251_0;
                      break L27;
                    } else {
                      stackOut_250_0 = 1;
                      stackIn_252_0 = stackOut_250_0;
                      break L27;
                    }
                  }
                  var29 = stackIn_252_0;
                  return new boolean[]{var28 != 0, var29 != 0};
                } else {
                  L28: {
                    var20 = 0.0;
                    var22 = 0.0;
                    var11 = 0.0;
                    var13 = 0.0;
                    ((og) this).field_a = ((og) this).field_a + var13;
                    ((og) this).field_f = ((og) this).field_f + var11;
                    var24 = var11 - var15;
                    if (0.0 > var24) {
                      var24 = -var24;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    var26 = -var17 + var13;
                    if (0.0 <= var26) {
                      break L29;
                    } else {
                      var26 = -var26;
                      break L29;
                    }
                  }
                  L30: {
                    if (0.01 >= var24) {
                      stackOut_236_0 = 0;
                      stackIn_237_0 = stackOut_236_0;
                      break L30;
                    } else {
                      stackOut_235_0 = 1;
                      stackIn_237_0 = stackOut_235_0;
                      break L30;
                    }
                  }
                  L31: {
                    var28 = stackIn_237_0;
                    if (0.01 >= var26) {
                      stackOut_239_0 = 0;
                      stackIn_240_0 = stackOut_239_0;
                      break L31;
                    } else {
                      stackOut_238_0 = 1;
                      stackIn_240_0 = stackOut_238_0;
                      break L31;
                    }
                  }
                  var29 = stackIn_240_0;
                  return new boolean[]{var28 != 0, var29 != 0};
                }
              } else {
                L32: {
                  var22 = 0.0;
                  var13 = 0.0;
                  ((og) this).field_a = ((og) this).field_a + var13;
                  ((og) this).field_f = ((og) this).field_f + var11;
                  var24 = var11 - var15;
                  if (0.0 > var24) {
                    var24 = -var24;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  var26 = -var17 + var13;
                  if (0.0 <= var26) {
                    break L33;
                  } else {
                    var26 = -var26;
                    break L33;
                  }
                }
                L34: {
                  if (0.01 >= var24) {
                    stackOut_223_0 = 0;
                    stackIn_224_0 = stackOut_223_0;
                    break L34;
                  } else {
                    stackOut_222_0 = 1;
                    stackIn_224_0 = stackOut_222_0;
                    break L34;
                  }
                }
                L35: {
                  var28 = stackIn_224_0;
                  if (0.01 >= var26) {
                    stackOut_226_0 = 0;
                    stackIn_227_0 = stackOut_226_0;
                    break L35;
                  } else {
                    stackOut_225_0 = 1;
                    stackIn_227_0 = stackOut_225_0;
                    break L35;
                  }
                }
                var29 = stackIn_227_0;
                return new boolean[]{var28 != 0, var29 != 0};
              }
            } else {
              L36: {
                if (-2 >= var30) {
                  break L36;
                } else {
                  var20 = 0.0;
                  var11 = 0.0;
                  break L36;
                }
              }
              if (1 >= var31) {
                L37: {
                  ((og) this).field_a = ((og) this).field_a + var13;
                  ((og) this).field_f = ((og) this).field_f + var11;
                  var24 = var11 - var15;
                  if (0.0 > var24) {
                    var24 = -var24;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  var26 = -var17 + var13;
                  if (0.0 <= var26) {
                    break L38;
                  } else {
                    var26 = -var26;
                    break L38;
                  }
                }
                L39: {
                  if (0.01 >= var24) {
                    stackOut_209_0 = 0;
                    stackIn_210_0 = stackOut_209_0;
                    break L39;
                  } else {
                    stackOut_208_0 = 1;
                    stackIn_210_0 = stackOut_208_0;
                    break L39;
                  }
                }
                L40: {
                  var28 = stackIn_210_0;
                  if (0.01 >= var26) {
                    stackOut_212_0 = 0;
                    stackIn_213_0 = stackOut_212_0;
                    break L40;
                  } else {
                    stackOut_211_0 = 1;
                    stackIn_213_0 = stackOut_211_0;
                    break L40;
                  }
                }
                var29 = stackIn_213_0;
                return new boolean[]{var28 != 0, var29 != 0};
              } else {
                L41: {
                  var13 = 0.0;
                  var22 = 0.0;
                  ((og) this).field_a = ((og) this).field_a + var13;
                  ((og) this).field_f = ((og) this).field_f + var11;
                  var24 = var11 - var15;
                  if (0.0 > var24) {
                    var24 = -var24;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  var26 = -var17 + var13;
                  if (0.0 <= var26) {
                    break L42;
                  } else {
                    var26 = -var26;
                    break L42;
                  }
                }
                L43: {
                  if (0.01 >= var24) {
                    stackOut_197_0 = 0;
                    stackIn_198_0 = stackOut_197_0;
                    break L43;
                  } else {
                    stackOut_196_0 = 1;
                    stackIn_198_0 = stackOut_196_0;
                    break L43;
                  }
                }
                L44: {
                  var28 = stackIn_198_0;
                  if (0.01 >= var26) {
                    stackOut_200_0 = 0;
                    stackIn_201_0 = stackOut_200_0;
                    break L44;
                  } else {
                    stackOut_199_0 = 1;
                    stackIn_201_0 = stackOut_199_0;
                    break L44;
                  }
                }
                var29 = stackIn_201_0;
                return new boolean[]{var28 != 0, var29 != 0};
              }
            }
          } else {
            L45: {
              ((og) this).field_a = ((og) this).field_a + var13;
              ((og) this).field_f = ((og) this).field_f + var11;
              var24 = var11 - var15;
              if (0.0 > var24) {
                var24 = -var24;
                break L45;
              } else {
                break L45;
              }
            }
            L46: {
              var26 = -var17 + var13;
              if (0.0 <= var26) {
                break L46;
              } else {
                var26 = -var26;
                break L46;
              }
            }
            L47: {
              if (0.01 >= var24) {
                stackOut_162_0 = 0;
                stackIn_163_0 = stackOut_162_0;
                break L47;
              } else {
                stackOut_161_0 = 1;
                stackIn_163_0 = stackOut_161_0;
                break L47;
              }
            }
            L48: {
              var28 = stackIn_163_0;
              if (0.01 >= var26) {
                stackOut_165_0 = 0;
                stackIn_166_0 = stackOut_165_0;
                break L48;
              } else {
                stackOut_164_0 = 1;
                stackIn_166_0 = stackOut_164_0;
                break L48;
              }
            }
            var29 = stackIn_166_0;
            return new boolean[]{var28 != 0, var29 != 0};
          }
        } else {
          L49: {
            if (0.0 <= var20) {
              if (var20 > 0.0) {
                stackOut_71_0 = 1;
                stackIn_72_0 = stackOut_71_0;
                break L49;
              } else {
                stackOut_70_0 = 0;
                stackIn_72_0 = stackOut_70_0;
                break L49;
              }
            } else {
              stackOut_68_0 = -1;
              stackIn_72_0 = stackOut_68_0;
              break L49;
            }
          }
          L50: {
            var24_int = stackIn_72_0;
            if (var22 >= 0.0) {
              if (0.0 >= var22) {
                stackOut_76_0 = 0;
                stackIn_77_0 = stackOut_76_0;
                break L50;
              } else {
                stackOut_75_0 = param4.field_d;
                stackIn_77_0 = stackOut_75_0;
                break L50;
              }
            } else {
              stackOut_73_0 = -param4.field_d;
              stackIn_77_0 = stackOut_73_0;
              break L50;
            }
          }
          L51: {
            var25 = stackIn_77_0;
            var26_int = var19 - -var24_int;
            var27 = var26_int - -var25;
            var28 = var25 + var19;
            if (param1) {
              stackOut_79_0 = param4.b(param5, 5857, var27);
              stackIn_80_0 = stackOut_79_0;
              break L51;
            } else {
              stackOut_78_0 = param4.c(param5, -2, var27);
              stackIn_80_0 = stackOut_78_0;
              break L51;
            }
          }
          L52: {
            var29 = stackIn_80_0;
            if (param1) {
              stackOut_82_0 = param4.b(param5, param0 ^ 29751, var26_int);
              stackIn_83_0 = stackOut_82_0;
              break L52;
            } else {
              stackOut_81_0 = param4.c(param5, param0 ^ -25304, var26_int);
              stackIn_83_0 = stackOut_81_0;
              break L52;
            }
          }
          L53: {
            var30 = stackIn_83_0;
            if (param1) {
              stackOut_85_0 = param4.b(param5, 5857, var28);
              stackIn_86_0 = stackOut_85_0;
              break L53;
            } else {
              stackOut_84_0 = param4.c(param5, -2, var28);
              stackIn_86_0 = stackOut_84_0;
              break L53;
            }
          }
          var31 = stackIn_86_0;
          if (var29 < -2) {
            if (1 < var30) {
              if ((var31 ^ -1) >= -2) {
                L54: {
                  var20 = 0.0;
                  var11 = 0.0;
                  ((og) this).field_a = ((og) this).field_a + var13;
                  ((og) this).field_f = ((og) this).field_f + var11;
                  var24 = var11 - var15;
                  if (0.0 > var24) {
                    var24 = -var24;
                    break L54;
                  } else {
                    break L54;
                  }
                }
                L55: {
                  var26 = -var17 + var13;
                  if (0.0 <= var26) {
                    break L55;
                  } else {
                    var26 = -var26;
                    break L55;
                  }
                }
                L56: {
                  if (0.01 >= var24) {
                    stackOut_148_0 = 0;
                    stackIn_149_0 = stackOut_148_0;
                    break L56;
                  } else {
                    stackOut_147_0 = 1;
                    stackIn_149_0 = stackOut_147_0;
                    break L56;
                  }
                }
                L57: {
                  var28 = stackIn_149_0;
                  if (0.01 >= var26) {
                    stackOut_151_0 = 0;
                    stackIn_152_0 = stackOut_151_0;
                    break L57;
                  } else {
                    stackOut_150_0 = 1;
                    stackIn_152_0 = stackOut_150_0;
                    break L57;
                  }
                }
                var29 = stackIn_152_0;
                return new boolean[]{var28 != 0, var29 != 0};
              } else {
                L58: {
                  var20 = 0.0;
                  var22 = 0.0;
                  var11 = 0.0;
                  var13 = 0.0;
                  ((og) this).field_a = ((og) this).field_a + var13;
                  ((og) this).field_f = ((og) this).field_f + var11;
                  var24 = var11 - var15;
                  if (0.0 > var24) {
                    var24 = -var24;
                    break L58;
                  } else {
                    break L58;
                  }
                }
                L59: {
                  var26 = -var17 + var13;
                  if (0.0 <= var26) {
                    break L59;
                  } else {
                    var26 = -var26;
                    break L59;
                  }
                }
                L60: {
                  if (0.01 >= var24) {
                    stackOut_136_0 = 0;
                    stackIn_137_0 = stackOut_136_0;
                    break L60;
                  } else {
                    stackOut_135_0 = 1;
                    stackIn_137_0 = stackOut_135_0;
                    break L60;
                  }
                }
                L61: {
                  var28 = stackIn_137_0;
                  if (0.01 >= var26) {
                    stackOut_139_0 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    break L61;
                  } else {
                    stackOut_138_0 = 1;
                    stackIn_140_0 = stackOut_138_0;
                    break L61;
                  }
                }
                var29 = stackIn_140_0;
                return new boolean[]{var28 != 0, var29 != 0};
              }
            } else {
              L62: {
                var22 = 0.0;
                var13 = 0.0;
                ((og) this).field_a = ((og) this).field_a + var13;
                ((og) this).field_f = ((og) this).field_f + var11;
                var24 = var11 - var15;
                if (0.0 > var24) {
                  var24 = -var24;
                  break L62;
                } else {
                  break L62;
                }
              }
              L63: {
                var26 = -var17 + var13;
                if (0.0 <= var26) {
                  break L63;
                } else {
                  var26 = -var26;
                  break L63;
                }
              }
              L64: {
                if (0.01 >= var24) {
                  stackOut_123_0 = 0;
                  stackIn_124_0 = stackOut_123_0;
                  break L64;
                } else {
                  stackOut_122_0 = 1;
                  stackIn_124_0 = stackOut_122_0;
                  break L64;
                }
              }
              L65: {
                var28 = stackIn_124_0;
                if (0.01 >= var26) {
                  stackOut_126_0 = 0;
                  stackIn_127_0 = stackOut_126_0;
                  break L65;
                } else {
                  stackOut_125_0 = 1;
                  stackIn_127_0 = stackOut_125_0;
                  break L65;
                }
              }
              var29 = stackIn_127_0;
              return new boolean[]{var28 != 0, var29 != 0};
            }
          } else {
            L66: {
              if (-2 >= var30) {
                break L66;
              } else {
                var20 = 0.0;
                var11 = 0.0;
                break L66;
              }
            }
            if (1 >= var31) {
              L67: {
                ((og) this).field_a = ((og) this).field_a + var13;
                ((og) this).field_f = ((og) this).field_f + var11;
                var24 = var11 - var15;
                if (0.0 > var24) {
                  var24 = -var24;
                  break L67;
                } else {
                  break L67;
                }
              }
              L68: {
                var26 = -var17 + var13;
                if (0.0 <= var26) {
                  break L68;
                } else {
                  var26 = -var26;
                  break L68;
                }
              }
              L69: {
                if (0.01 >= var24) {
                  stackOut_109_0 = 0;
                  stackIn_110_0 = stackOut_109_0;
                  break L69;
                } else {
                  stackOut_108_0 = 1;
                  stackIn_110_0 = stackOut_108_0;
                  break L69;
                }
              }
              L70: {
                var28 = stackIn_110_0;
                if (0.01 >= var26) {
                  stackOut_112_0 = 0;
                  stackIn_113_0 = stackOut_112_0;
                  break L70;
                } else {
                  stackOut_111_0 = 1;
                  stackIn_113_0 = stackOut_111_0;
                  break L70;
                }
              }
              var29 = stackIn_113_0;
              return new boolean[]{var28 != 0, var29 != 0};
            } else {
              L71: {
                var13 = 0.0;
                var22 = 0.0;
                ((og) this).field_a = ((og) this).field_a + var13;
                ((og) this).field_f = ((og) this).field_f + var11;
                var24 = var11 - var15;
                if (0.0 > var24) {
                  var24 = -var24;
                  break L71;
                } else {
                  break L71;
                }
              }
              L72: {
                var26 = -var17 + var13;
                if (0.0 <= var26) {
                  break L72;
                } else {
                  var26 = -var26;
                  break L72;
                }
              }
              L73: {
                if (0.01 >= var24) {
                  stackOut_97_0 = 0;
                  stackIn_98_0 = stackOut_97_0;
                  break L73;
                } else {
                  stackOut_96_0 = 1;
                  stackIn_98_0 = stackOut_96_0;
                  break L73;
                }
              }
              L74: {
                var28 = stackIn_98_0;
                if (0.01 >= var26) {
                  stackOut_100_0 = 0;
                  stackIn_101_0 = stackOut_100_0;
                  break L74;
                } else {
                  stackOut_99_0 = 1;
                  stackIn_101_0 = stackOut_99_0;
                  break L74;
                }
              }
              var29 = stackIn_101_0;
              return new boolean[]{var28 != 0, var29 != 0};
            }
          }
        }
    }

    public final String toString() {
        return "(" + oc.a(-1, ((og) this).field_f) + "," + oc.a(-1, ((og) this).field_a) + ")";
    }

    final void b(double param0, double param1, int param2) {
        if (param2 <= 92) {
          ((og) this).a(41, (byte) -101, 1.4898316096248228);
          param1 = param1 * 0.02454369260617026;
          ((og) this).field_f = ((og) this).field_f + Math.sin(param1) * -param0 / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        } else {
          param1 = param1 * 0.02454369260617026;
          ((og) this).field_f = ((og) this).field_f + Math.sin(param1) * -param0 / 20.0;
          ((og) this).field_a = ((og) this).field_a + Math.cos(param1) * -param0 / 20.0;
          return;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        if (param0 == -50) {
            return;
        }
        field_c = -117;
    }

    og() {
        ((og) this).field_f = 0.0;
        ((og) this).field_a = 0.0;
    }

    og(og param0) {
        ((og) this).field_f = param0.field_f;
        ((og) this).field_a = param0.field_a;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Vengeance";
        og discarded$0 = new og();
    }
}
