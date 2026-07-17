/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends pn implements Cloneable {
    static dl[] field_u;
    gh field_o;
    gh field_p;
    static String[] field_r;
    static int field_n;
    static String field_t;
    int field_m;
    static String field_s;
    static dl field_q;

    final f a(mj param0, byte param1, boolean param2, f[][] param3) {
        dl var5 = null;
        RuntimeException var5_ref = null;
        ma stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -74) {
                break L1;
              } else {
                ro.g(-49);
                break L1;
              }
            }
            var5 = param0.a(13214, ((ro) this).field_m);
            stackOut_2_0 = new ma(var5, (f) this, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("ro.S(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return (f) (Object) stackIn_3_0;
    }

    private final void a(int param0, byte param1, int param2, int param3, boolean param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        wm var10 = null;
        var10 = jf.a(kh.field_j, param2, 0, param0 * 2 + param2, kh.field_b);
        if (var10 == null) {
          return;
        } else {
          var8 = 2 * (param0 * ((ro) this).field_o.field_m) / ((ro) this).field_o.field_p;
          var9 = 2 * ((ro) this).field_o.field_m * param5 / ((ro) this).field_o.field_p;
          if (param1 >= -38) {
            ((ro) this).field_o = null;
            ((ro) this).field_o.a(param4, ((ro) this).field_o.field_o * var8 + param2, param0, param5, param3 + ((ro) this).field_o.field_s * var9, 4261);
            var10.a((byte) -84);
            return;
          } else {
            ((ro) this).field_o.a(param4, ((ro) this).field_o.field_o * var8 + param2, param0, param5, param3 + ((ro) this).field_o.field_s * var9, 4261);
            var10.a((byte) -84);
            return;
          }
        }
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (!param0) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("ro.A(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final static void g(int param0) {
        int var1 = -38 % ((18 - param0) / 61);
        wk.a(dg.field_a, true, fh.field_i, false);
        ud.field_U = true;
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        dl var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        dl stackIn_22_0 = null;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_39_0 = 0;
        dl stackIn_44_0 = null;
        dl stackIn_48_0 = null;
        dl stackIn_70_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_87_0 = 0;
        dl stackIn_92_0 = null;
        dl stackIn_96_0 = null;
        dl stackIn_123_0 = null;
        int stackIn_126_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_136_0 = 0;
        int stackIn_140_0 = 0;
        dl stackIn_145_0 = null;
        dl stackIn_149_0 = null;
        dl stackIn_171_0 = null;
        int stackIn_174_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_188_0 = 0;
        dl stackIn_193_0 = null;
        dl stackIn_197_0 = null;
        int stackIn_219_0 = 0;
        int stackIn_225_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_233_0 = 0;
        dl stackIn_238_0 = null;
        dl stackIn_242_0 = null;
        int stackIn_291_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_299_0 = 0;
        dl stackIn_304_0 = null;
        dl stackIn_336_0 = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_227_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        int stackOut_232_0 = 0;
        int stackOut_231_0 = 0;
        dl stackOut_241_0 = null;
        dl stackOut_240_0 = null;
        dl stackOut_237_0 = null;
        dl stackOut_236_0 = null;
        dl stackOut_170_0 = null;
        dl stackOut_169_0 = null;
        int stackOut_173_0 = 0;
        int stackOut_172_0 = 0;
        int stackOut_183_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_186_0 = 0;
        dl stackOut_196_0 = null;
        dl stackOut_195_0 = null;
        dl stackOut_192_0 = null;
        dl stackOut_191_0 = null;
        dl stackOut_122_0 = null;
        dl stackOut_121_0 = null;
        int stackOut_125_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        dl stackOut_148_0 = null;
        dl stackOut_147_0 = null;
        dl stackOut_144_0 = null;
        dl stackOut_143_0 = null;
        dl stackOut_69_0 = null;
        dl stackOut_68_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_85_0 = 0;
        dl stackOut_95_0 = null;
        dl stackOut_94_0 = null;
        dl stackOut_91_0 = null;
        dl stackOut_90_0 = null;
        dl stackOut_21_0 = null;
        dl stackOut_20_0 = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        dl stackOut_47_0 = null;
        dl stackOut_46_0 = null;
        dl stackOut_43_0 = null;
        dl stackOut_42_0 = null;
        int stackOut_294_0 = 0;
        int stackOut_293_0 = 0;
        int stackOut_290_0 = 0;
        int stackOut_289_0 = 0;
        int stackOut_298_0 = 0;
        int stackOut_297_0 = 0;
        dl stackOut_335_0 = null;
        dl stackOut_334_0 = null;
        dl stackOut_303_0 = null;
        dl stackOut_302_0 = null;
        L0: {
          var15 = CrazyCrystals.field_B;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          var10 = 0;
          if (((ro) this).field_m != 1) {
            var11 = ig.field_q;
            break L0;
          } else {
            var11 = nf.field_g;
            break L0;
          }
        }
        if (((ro) this).field_p != null) {
          L1: {
            var12 = ((ro) this).field_p.field_G;
            var13 = ((ro) this).field_p.field_x;
            if (1 == ((ro) this).field_m) {
              L2: {
                if (0 >= var13 + -var12) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L2;
                }
              }
              var7 = stackIn_13_0;
              break L1;
            } else {
              L3: {
                if (var13 + var12 <= 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L3;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L3;
                }
              }
              var7 = stackIn_9_0;
              break L1;
            }
          }
          if (0 != ((ro) this).field_p.field_m) {
            if (((ro) this).field_p.field_m <= 6) {
              L4: {
                if (var7 != 0) {
                  stackOut_218_0 = 0;
                  stackIn_219_0 = stackOut_218_0;
                  break L4;
                } else {
                  stackOut_217_0 = 1;
                  stackIn_219_0 = stackOut_217_0;
                  break L4;
                }
              }
              L5: {
                var9 = stackIn_219_0;
                if (null != ((ro) this).field_o) {
                  L6: {
                    var12 = ((ro) this).field_o.field_G;
                    var13 = ((ro) this).field_o.field_x;
                    if (((ro) this).field_m == 1) {
                      L7: {
                        if (-var12 + var13 >= 0) {
                          stackOut_228_0 = 0;
                          stackIn_229_0 = stackOut_228_0;
                          break L7;
                        } else {
                          stackOut_227_0 = 1;
                          stackIn_229_0 = stackOut_227_0;
                          break L7;
                        }
                      }
                      var8 = stackIn_229_0;
                      break L6;
                    } else {
                      L8: {
                        if (var13 - -var12 >= 0) {
                          stackOut_224_0 = 0;
                          stackIn_225_0 = stackOut_224_0;
                          break L8;
                        } else {
                          stackOut_223_0 = 1;
                          stackIn_225_0 = stackOut_223_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_225_0;
                      break L6;
                    }
                  }
                  L9: {
                    if (var8 != 0) {
                      stackOut_232_0 = 0;
                      stackIn_233_0 = stackOut_232_0;
                      break L9;
                    } else {
                      stackOut_231_0 = 1;
                      stackIn_233_0 = stackOut_231_0;
                      break L9;
                    }
                  }
                  var10 = stackIn_233_0;
                  if (((ro) this).field_o.field_m >= 6) {
                    break L5;
                  } else {
                    var14 = ((ro) this).field_o.field_m;
                    if (1 != ((ro) this).field_m) {
                      L10: {
                        if (var13 + var12 >= 0) {
                          stackOut_241_0 = en.field_K[var14];
                          stackIn_242_0 = stackOut_241_0;
                          break L10;
                        } else {
                          stackOut_240_0 = db.field_j[var14];
                          stackIn_242_0 = stackOut_240_0;
                          break L10;
                        }
                      }
                      var11 = stackIn_242_0;
                      break L5;
                    } else {
                      L11: {
                        if (0 <= var12 + -var13) {
                          stackOut_237_0 = ja.field_h[var14];
                          stackIn_238_0 = stackOut_237_0;
                          break L11;
                        } else {
                          stackOut_236_0 = tk.field_h[var14];
                          stackIn_238_0 = stackOut_236_0;
                          break L11;
                        }
                      }
                      var11 = stackIn_238_0;
                      break L5;
                    }
                  }
                } else {
                  break L5;
                }
              }
              L12: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                L15: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L15;
                  } else {
                    if (param2 == 24) {
                      var11.a(param4, -param2 + param5);
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L14;
              }
              L16: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L17;
                } else {
                  break L17;
                }
              }
              return;
            } else {
              L18: {
                if (((ro) this).field_p.field_m == 0) {
                  var14 = 0;
                  break L18;
                } else {
                  var14 = -((ro) this).field_p.field_m + 12;
                  break L18;
                }
              }
              if (((ro) this).field_m != 1) {
                L19: {
                  if (var12 + var13 > 0) {
                    stackOut_170_0 = db.field_j[var14];
                    stackIn_171_0 = stackOut_170_0;
                    break L19;
                  } else {
                    stackOut_169_0 = en.field_K[var14];
                    stackIn_171_0 = stackOut_169_0;
                    break L19;
                  }
                }
                L20: {
                  var11 = stackIn_171_0;
                  if (var7 != 0) {
                    stackOut_173_0 = 0;
                    stackIn_174_0 = stackOut_173_0;
                    break L20;
                  } else {
                    stackOut_172_0 = 1;
                    stackIn_174_0 = stackOut_172_0;
                    break L20;
                  }
                }
                L21: {
                  var9 = stackIn_174_0;
                  if (null != ((ro) this).field_o) {
                    L22: {
                      var12 = ((ro) this).field_o.field_G;
                      var13 = ((ro) this).field_o.field_x;
                      if (((ro) this).field_m == 1) {
                        L23: {
                          if (-var12 + var13 >= 0) {
                            stackOut_183_0 = 0;
                            stackIn_184_0 = stackOut_183_0;
                            break L23;
                          } else {
                            stackOut_182_0 = 1;
                            stackIn_184_0 = stackOut_182_0;
                            break L23;
                          }
                        }
                        var8 = stackIn_184_0;
                        break L22;
                      } else {
                        L24: {
                          if (var13 - -var12 >= 0) {
                            stackOut_179_0 = 0;
                            stackIn_180_0 = stackOut_179_0;
                            break L24;
                          } else {
                            stackOut_178_0 = 1;
                            stackIn_180_0 = stackOut_178_0;
                            break L24;
                          }
                        }
                        var8 = stackIn_180_0;
                        break L22;
                      }
                    }
                    L25: {
                      if (var8 != 0) {
                        stackOut_187_0 = 0;
                        stackIn_188_0 = stackOut_187_0;
                        break L25;
                      } else {
                        stackOut_186_0 = 1;
                        stackIn_188_0 = stackOut_186_0;
                        break L25;
                      }
                    }
                    var10 = stackIn_188_0;
                    if (((ro) this).field_o.field_m >= 6) {
                      break L21;
                    } else {
                      var14 = ((ro) this).field_o.field_m;
                      if (1 != ((ro) this).field_m) {
                        L26: {
                          if (var13 + var12 >= 0) {
                            stackOut_196_0 = en.field_K[var14];
                            stackIn_197_0 = stackOut_196_0;
                            break L26;
                          } else {
                            stackOut_195_0 = db.field_j[var14];
                            stackIn_197_0 = stackOut_195_0;
                            break L26;
                          }
                        }
                        var11 = stackIn_197_0;
                        break L21;
                      } else {
                        L27: {
                          if (0 <= var12 + -var13) {
                            stackOut_192_0 = ja.field_h[var14];
                            stackIn_193_0 = stackOut_192_0;
                            break L27;
                          } else {
                            stackOut_191_0 = tk.field_h[var14];
                            stackIn_193_0 = stackOut_191_0;
                            break L27;
                          }
                        }
                        var11 = stackIn_193_0;
                        break L21;
                      }
                    }
                  } else {
                    break L21;
                  }
                }
                L28: {
                  if (var7 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (var8 != 0) {
                    this.a(param1, (byte) -64, param4, param5, param3, param2);
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  L31: {
                    var12 = -84 % ((param0 - 74) / 41);
                    if (param1 != 24) {
                      break L31;
                    } else {
                      if (param2 == 24) {
                        var11.a(param4, -param2 + param5);
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L30;
                }
                L32: {
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L33;
                  } else {
                    break L33;
                  }
                }
                return;
              } else {
                L34: {
                  if (-var13 + var12 <= 0) {
                    stackOut_122_0 = ja.field_h[var14];
                    stackIn_123_0 = stackOut_122_0;
                    break L34;
                  } else {
                    stackOut_121_0 = tk.field_h[var14];
                    stackIn_123_0 = stackOut_121_0;
                    break L34;
                  }
                }
                L35: {
                  var11 = stackIn_123_0;
                  if (var7 != 0) {
                    stackOut_125_0 = 0;
                    stackIn_126_0 = stackOut_125_0;
                    break L35;
                  } else {
                    stackOut_124_0 = 1;
                    stackIn_126_0 = stackOut_124_0;
                    break L35;
                  }
                }
                L36: {
                  var9 = stackIn_126_0;
                  if (null != ((ro) this).field_o) {
                    L37: {
                      var12 = ((ro) this).field_o.field_G;
                      var13 = ((ro) this).field_o.field_x;
                      if (((ro) this).field_m == 1) {
                        L38: {
                          if (-var12 + var13 >= 0) {
                            stackOut_135_0 = 0;
                            stackIn_136_0 = stackOut_135_0;
                            break L38;
                          } else {
                            stackOut_134_0 = 1;
                            stackIn_136_0 = stackOut_134_0;
                            break L38;
                          }
                        }
                        var8 = stackIn_136_0;
                        break L37;
                      } else {
                        L39: {
                          if (var13 - -var12 >= 0) {
                            stackOut_131_0 = 0;
                            stackIn_132_0 = stackOut_131_0;
                            break L39;
                          } else {
                            stackOut_130_0 = 1;
                            stackIn_132_0 = stackOut_130_0;
                            break L39;
                          }
                        }
                        var8 = stackIn_132_0;
                        break L37;
                      }
                    }
                    L40: {
                      if (var8 != 0) {
                        stackOut_139_0 = 0;
                        stackIn_140_0 = stackOut_139_0;
                        break L40;
                      } else {
                        stackOut_138_0 = 1;
                        stackIn_140_0 = stackOut_138_0;
                        break L40;
                      }
                    }
                    var10 = stackIn_140_0;
                    if (((ro) this).field_o.field_m >= 6) {
                      break L36;
                    } else {
                      var14 = ((ro) this).field_o.field_m;
                      if (1 != ((ro) this).field_m) {
                        L41: {
                          if (var13 + var12 >= 0) {
                            stackOut_148_0 = en.field_K[var14];
                            stackIn_149_0 = stackOut_148_0;
                            break L41;
                          } else {
                            stackOut_147_0 = db.field_j[var14];
                            stackIn_149_0 = stackOut_147_0;
                            break L41;
                          }
                        }
                        var11 = stackIn_149_0;
                        break L36;
                      } else {
                        L42: {
                          if (0 <= var12 + -var13) {
                            stackOut_144_0 = ja.field_h[var14];
                            stackIn_145_0 = stackOut_144_0;
                            break L42;
                          } else {
                            stackOut_143_0 = tk.field_h[var14];
                            stackIn_145_0 = stackOut_143_0;
                            break L42;
                          }
                        }
                        var11 = stackIn_145_0;
                        break L36;
                      }
                    }
                  } else {
                    break L36;
                  }
                }
                L43: {
                  if (var7 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                L44: {
                  if (var8 != 0) {
                    this.a(param1, (byte) -64, param4, param5, param3, param2);
                    break L44;
                  } else {
                    break L44;
                  }
                }
                L45: {
                  L46: {
                    var12 = -84 % ((param0 - 74) / 41);
                    if (param1 != 24) {
                      break L46;
                    } else {
                      if (param2 == 24) {
                        var11.a(param4, -param2 + param5);
                        break L45;
                      } else {
                        break L46;
                      }
                    }
                  }
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L45;
                }
                L47: {
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L47;
                  } else {
                    break L47;
                  }
                }
                L48: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L48;
                  } else {
                    break L48;
                  }
                }
                return;
              }
            }
          } else {
            L49: {
              if (((ro) this).field_p.field_m == 0) {
                var14 = 0;
                break L49;
              } else {
                var14 = -((ro) this).field_p.field_m + 12;
                break L49;
              }
            }
            if (((ro) this).field_m != 1) {
              L50: {
                if (var12 + var13 > 0) {
                  stackOut_69_0 = db.field_j[var14];
                  stackIn_70_0 = stackOut_69_0;
                  break L50;
                } else {
                  stackOut_68_0 = en.field_K[var14];
                  stackIn_70_0 = stackOut_68_0;
                  break L50;
                }
              }
              L51: {
                var11 = stackIn_70_0;
                if (var7 != 0) {
                  stackOut_72_0 = 0;
                  stackIn_73_0 = stackOut_72_0;
                  break L51;
                } else {
                  stackOut_71_0 = 1;
                  stackIn_73_0 = stackOut_71_0;
                  break L51;
                }
              }
              L52: {
                var9 = stackIn_73_0;
                if (null != ((ro) this).field_o) {
                  L53: {
                    var12 = ((ro) this).field_o.field_G;
                    var13 = ((ro) this).field_o.field_x;
                    if (((ro) this).field_m == 1) {
                      L54: {
                        if (-var12 + var13 >= 0) {
                          stackOut_82_0 = 0;
                          stackIn_83_0 = stackOut_82_0;
                          break L54;
                        } else {
                          stackOut_81_0 = 1;
                          stackIn_83_0 = stackOut_81_0;
                          break L54;
                        }
                      }
                      var8 = stackIn_83_0;
                      break L53;
                    } else {
                      L55: {
                        if (var13 - -var12 >= 0) {
                          stackOut_78_0 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          break L55;
                        } else {
                          stackOut_77_0 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          break L55;
                        }
                      }
                      var8 = stackIn_79_0;
                      break L53;
                    }
                  }
                  L56: {
                    if (var8 != 0) {
                      stackOut_86_0 = 0;
                      stackIn_87_0 = stackOut_86_0;
                      break L56;
                    } else {
                      stackOut_85_0 = 1;
                      stackIn_87_0 = stackOut_85_0;
                      break L56;
                    }
                  }
                  var10 = stackIn_87_0;
                  if (((ro) this).field_o.field_m >= 6) {
                    break L52;
                  } else {
                    var14 = ((ro) this).field_o.field_m;
                    if (1 != ((ro) this).field_m) {
                      L57: {
                        if (var13 + var12 >= 0) {
                          stackOut_95_0 = en.field_K[var14];
                          stackIn_96_0 = stackOut_95_0;
                          break L57;
                        } else {
                          stackOut_94_0 = db.field_j[var14];
                          stackIn_96_0 = stackOut_94_0;
                          break L57;
                        }
                      }
                      var11 = stackIn_96_0;
                      break L52;
                    } else {
                      L58: {
                        if (0 <= var12 + -var13) {
                          stackOut_91_0 = ja.field_h[var14];
                          stackIn_92_0 = stackOut_91_0;
                          break L58;
                        } else {
                          stackOut_90_0 = tk.field_h[var14];
                          stackIn_92_0 = stackOut_90_0;
                          break L58;
                        }
                      }
                      var11 = stackIn_92_0;
                      break L52;
                    }
                  }
                } else {
                  break L52;
                }
              }
              L59: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L59;
                } else {
                  break L59;
                }
              }
              L60: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L60;
                } else {
                  break L60;
                }
              }
              L61: {
                L62: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L62;
                  } else {
                    if (param2 == 24) {
                      var11.a(param4, -param2 + param5);
                      break L61;
                    } else {
                      break L62;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L61;
              }
              L63: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L63;
                } else {
                  break L63;
                }
              }
              L64: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L64;
                } else {
                  break L64;
                }
              }
              return;
            } else {
              L65: {
                if (-var13 + var12 <= 0) {
                  stackOut_21_0 = ja.field_h[var14];
                  stackIn_22_0 = stackOut_21_0;
                  break L65;
                } else {
                  stackOut_20_0 = tk.field_h[var14];
                  stackIn_22_0 = stackOut_20_0;
                  break L65;
                }
              }
              L66: {
                var11 = stackIn_22_0;
                if (var7 != 0) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  break L66;
                } else {
                  stackOut_23_0 = 1;
                  stackIn_25_0 = stackOut_23_0;
                  break L66;
                }
              }
              L67: {
                var9 = stackIn_25_0;
                if (null != ((ro) this).field_o) {
                  L68: {
                    var12 = ((ro) this).field_o.field_G;
                    var13 = ((ro) this).field_o.field_x;
                    if (((ro) this).field_m == 1) {
                      L69: {
                        if (-var12 + var13 >= 0) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L69;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L69;
                        }
                      }
                      var8 = stackIn_35_0;
                      break L68;
                    } else {
                      L70: {
                        if (var13 - -var12 >= 0) {
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L70;
                        } else {
                          stackOut_29_0 = 1;
                          stackIn_31_0 = stackOut_29_0;
                          break L70;
                        }
                      }
                      var8 = stackIn_31_0;
                      break L68;
                    }
                  }
                  L71: {
                    if (var8 != 0) {
                      stackOut_38_0 = 0;
                      stackIn_39_0 = stackOut_38_0;
                      break L71;
                    } else {
                      stackOut_37_0 = 1;
                      stackIn_39_0 = stackOut_37_0;
                      break L71;
                    }
                  }
                  var10 = stackIn_39_0;
                  if (((ro) this).field_o.field_m >= 6) {
                    break L67;
                  } else {
                    var14 = ((ro) this).field_o.field_m;
                    if (1 != ((ro) this).field_m) {
                      L72: {
                        if (var13 + var12 >= 0) {
                          stackOut_47_0 = en.field_K[var14];
                          stackIn_48_0 = stackOut_47_0;
                          break L72;
                        } else {
                          stackOut_46_0 = db.field_j[var14];
                          stackIn_48_0 = stackOut_46_0;
                          break L72;
                        }
                      }
                      var11 = stackIn_48_0;
                      break L67;
                    } else {
                      L73: {
                        if (0 <= var12 + -var13) {
                          stackOut_43_0 = ja.field_h[var14];
                          stackIn_44_0 = stackOut_43_0;
                          break L73;
                        } else {
                          stackOut_42_0 = tk.field_h[var14];
                          stackIn_44_0 = stackOut_42_0;
                          break L73;
                        }
                      }
                      var11 = stackIn_44_0;
                      break L67;
                    }
                  }
                } else {
                  break L67;
                }
              }
              L74: {
                if (var7 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L74;
                } else {
                  break L74;
                }
              }
              L75: {
                if (var8 != 0) {
                  this.a(param1, (byte) -64, param4, param5, param3, param2);
                  break L75;
                } else {
                  break L75;
                }
              }
              L76: {
                L77: {
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 != 24) {
                    break L77;
                  } else {
                    if (param2 == 24) {
                      var11.a(param4, -param2 + param5);
                      break L76;
                    } else {
                      break L77;
                    }
                  }
                }
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                break L76;
              }
              L78: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L78;
                } else {
                  break L78;
                }
              }
              L79: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L79;
                } else {
                  break L79;
                }
              }
              return;
            }
          }
        } else {
          if (null != ((ro) this).field_o) {
            L80: {
              var12 = ((ro) this).field_o.field_G;
              var13 = ((ro) this).field_o.field_x;
              if (((ro) this).field_m == 1) {
                L81: {
                  if (-var12 + var13 >= 0) {
                    stackOut_294_0 = 0;
                    stackIn_295_0 = stackOut_294_0;
                    break L81;
                  } else {
                    stackOut_293_0 = 1;
                    stackIn_295_0 = stackOut_293_0;
                    break L81;
                  }
                }
                var8 = stackIn_295_0;
                break L80;
              } else {
                L82: {
                  if (var13 - -var12 >= 0) {
                    stackOut_290_0 = 0;
                    stackIn_291_0 = stackOut_290_0;
                    break L82;
                  } else {
                    stackOut_289_0 = 1;
                    stackIn_291_0 = stackOut_289_0;
                    break L82;
                  }
                }
                var8 = stackIn_291_0;
                break L80;
              }
            }
            L83: {
              if (var8 != 0) {
                stackOut_298_0 = 0;
                stackIn_299_0 = stackOut_298_0;
                break L83;
              } else {
                stackOut_297_0 = 1;
                stackIn_299_0 = stackOut_297_0;
                break L83;
              }
            }
            L84: {
              var10 = stackIn_299_0;
              if (((ro) this).field_o.field_m >= 6) {
                break L84;
              } else {
                var14 = ((ro) this).field_o.field_m;
                if (1 != ((ro) this).field_m) {
                  L85: {
                    if (var13 + var12 >= 0) {
                      stackOut_335_0 = en.field_K[var14];
                      stackIn_336_0 = stackOut_335_0;
                      break L85;
                    } else {
                      stackOut_334_0 = db.field_j[var14];
                      stackIn_336_0 = stackOut_334_0;
                      break L85;
                    }
                  }
                  var11 = stackIn_336_0;
                  break L84;
                } else {
                  L86: {
                    if (0 <= var12 + -var13) {
                      stackOut_303_0 = ja.field_h[var14];
                      stackIn_304_0 = stackOut_303_0;
                      break L86;
                    } else {
                      stackOut_302_0 = tk.field_h[var14];
                      stackIn_304_0 = stackOut_302_0;
                      break L86;
                    }
                  }
                  L87: {
                    var11 = stackIn_304_0;
                    if (var7 != 0) {
                      this.a(param3, param1, 2, param5, param2, param4);
                      break L87;
                    } else {
                      break L87;
                    }
                  }
                  L88: {
                    if (var8 != 0) {
                      this.a(param1, (byte) -64, param4, param5, param3, param2);
                      break L88;
                    } else {
                      break L88;
                    }
                  }
                  var12 = -84 % ((param0 - 74) / 41);
                  if (param1 == 24) {
                    if (param2 == 24) {
                      L89: {
                        var11.a(param4, -param2 + param5);
                        if (var9 != 0) {
                          this.a(param3, param1, 2, param5, param2, param4);
                          break L89;
                        } else {
                          break L89;
                        }
                      }
                      L90: {
                        if (var10 != 0) {
                          this.a(param1, (byte) -125, param4, param5, param3, param2);
                          break L90;
                        } else {
                          break L90;
                        }
                      }
                      return;
                    } else {
                      L91: {
                        var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                        if (var9 != 0) {
                          this.a(param3, param1, 2, param5, param2, param4);
                          break L91;
                        } else {
                          break L91;
                        }
                      }
                      L92: {
                        if (var10 != 0) {
                          this.a(param1, (byte) -125, param4, param5, param3, param2);
                          break L92;
                        } else {
                          break L92;
                        }
                      }
                      return;
                    }
                  } else {
                    L93: {
                      var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                      if (var9 != 0) {
                        this.a(param3, param1, 2, param5, param2, param4);
                        break L93;
                      } else {
                        break L93;
                      }
                    }
                    L94: {
                      if (var10 != 0) {
                        this.a(param1, (byte) -125, param4, param5, param3, param2);
                        break L94;
                      } else {
                        break L94;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L95: {
              if (var7 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
                break L95;
              } else {
                break L95;
              }
            }
            L96: {
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
                break L96;
              } else {
                break L96;
              }
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 != 24) {
              L97: {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L97;
                } else {
                  break L97;
                }
              }
              L98: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L98;
                } else {
                  break L98;
                }
              }
              return;
            } else {
              if (param2 == 24) {
                L99: {
                  var11.a(param4, -param2 + param5);
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L99;
                  } else {
                    break L99;
                  }
                }
                L100: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L100;
                  } else {
                    break L100;
                  }
                }
                return;
              } else {
                L101: {
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  if (var9 != 0) {
                    this.a(param3, param1, 2, param5, param2, param4);
                    break L101;
                  } else {
                    break L101;
                  }
                }
                L102: {
                  if (var10 != 0) {
                    this.a(param1, (byte) -125, param4, param5, param3, param2);
                    break L102;
                  } else {
                    break L102;
                  }
                }
                return;
              }
            }
          } else {
            L103: {
              if (var7 != 0) {
                this.a(param3, param1, 2, param5, param2, param4);
                break L103;
              } else {
                break L103;
              }
            }
            L104: {
              if (var8 != 0) {
                this.a(param1, (byte) -64, param4, param5, param3, param2);
                break L104;
              } else {
                break L104;
              }
            }
            var12 = -84 % ((param0 - 74) / 41);
            if (param1 == 24) {
              L105: {
                if (param2 == 24) {
                  var11.a(param4, -param2 + param5);
                  break L105;
                } else {
                  var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                  break L105;
                }
              }
              L106: {
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L106;
                } else {
                  break L106;
                }
              }
              L107: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L107;
                } else {
                  break L107;
                }
              }
              return;
            } else {
              L108: {
                var11.b(param4, -param2 + param5, param1 * 2, 3 * param2);
                if (var9 != 0) {
                  this.a(param3, param1, 2, param5, param2, param4);
                  break L108;
                } else {
                  break L108;
                }
              }
              L109: {
                if (var10 != 0) {
                  this.a(param1, (byte) -125, param4, param5, param3, param2);
                  break L109;
                } else {
                  break L109;
                }
              }
              return;
            }
          }
        }
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 23525) {
                break L1;
              } else {
                ((ro) this).a(-44, -106, 68, (f[][]) null, 106, 20, 110, -87);
                break L1;
              }
            }
            stackOut_2_0 = ng.a(sn.field_b, param1, (f) (Object) new ro(((ro) this).field_m, (f) (Object) new kp(-1)), (byte) -83, qk.field_z);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ro.V(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            field_u = null;
            return (f) this;
        }
        return (f) this;
    }

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 92) {
                break L1;
              } else {
                f discarded$2 = ((ro) this).a(-61, (byte) -122, 116);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ro.HA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final int a(boolean param0, boolean param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            field_u = null;
            if (((ro) this).field_m == 1) {
              stackOut_7_0 = 8;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 4;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (((ro) this).field_m == 1) {
              stackOut_3_0 = 8;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 4;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        wm var10 = null;
        var10 = jf.a(kh.field_j, param5, param2 + -2, param5 - -(param1 * 2), kh.field_b);
        if (var10 == null) {
          return;
        } else {
          var8 = param2 * ((-((ro) this).field_p.field_p + ((ro) this).field_p.field_m) * param1) / ((ro) this).field_p.field_p;
          var9 = param4 * ((-((ro) this).field_p.field_p + ((ro) this).field_p.field_m) * 2) / ((ro) this).field_p.field_p;
          ((ro) this).field_p.a(param0, ((ro) this).field_p.field_o * var8 + param5, param1, param4, param3 + var9 * ((ro) this).field_p.field_s, param2 + 4259);
          var10.a((byte) -16);
          return;
        }
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_r = null;
        field_s = null;
        field_u = null;
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            if (param0 == 16736352) {
              stackOut_3_0 = param2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("ro.M(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param7 + 41);
        }
        return stackIn_4_0;
    }

    ro(int param0, f param1) {
        super(param1);
        ((ro) this).field_p = null;
        ((ro) this).field_o = null;
        try {
            ((ro) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ro.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean a(db param0, db param1, boolean param2, db param3) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (!param2) {
              if (!param0.a((byte) 102)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (param0.a(-20402, "commonui")) {
                  L1: {
                    if (!param1.a((byte) 102)) {
                      break L1;
                    } else {
                      if (param1.a(-20402, "commonui")) {
                        L2: {
                          if (!param3.a((byte) 102)) {
                            break L2;
                          } else {
                            if (!param3.a(-20402, "button.gif")) {
                              break L2;
                            } else {
                              return true;
                            }
                          }
                        }
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("ro.P(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          L4: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          L5: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L5;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
        return stackIn_17_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "These are members-only levels.";
        field_r = new String[]{"Easy", "Peasy", "Three Rooms", "An Electric Ball", "Get the Key", "Spider Box", "Bounce Around", "Bomb in the Hole", "Push the Rock", "Hammerhead", "Fiddle Dig", "Mining Disturbance", "Shuffle to Defuse", "Hole Hider", "Variety", "Boom Averted", "A Bit Handy", "Double Shuffles", "Bottom-Heavy", "Critical Mass", "Beyond the Bomb", "Precision", "Bottomless", "Air Raid Bunker", "Twang", "Mirror Fiddle", "Lurid", "Where is the Key?", "Ooh Look, Leaves", "Low Exit", "Star Feet", "Support! Timing!", "Rock Block", "Don't Rush", "Box Box Box", "One-Way", "Smoothly Does It", "Pink Suits You Sir!", "Piercing", "Elimination", "Mystifying", "Crossroads", "Falling Sky", "Balancing Act", "Demolition", "Laser Maze", "Controller", "Safe Madness", "Puzzle Rooms", "Ball Race", "Drop Nothing", "Psychedelic", "Funnel", "Cascade", "Rook", "Bomb Block Rock", "Magic Pervades", "Quick, Kill Them!", "Where to?", "Hot Feet", "Rather Hard", "Turbo Controller", "Funner Funnel", "Unexplainable", "Juggle Maze", "Fearsome", "Filter Effect", "It's a Goblin!", "It's Hostile!", "Grand Finale"};
        field_s = "achievements to collect";
    }
}
