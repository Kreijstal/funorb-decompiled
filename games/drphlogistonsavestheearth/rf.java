/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf extends uh {
    private int[] field_H;
    int field_E;
    private static StringBuilder field_Q;
    private byte[] field_A;
    int field_S;
    private int[] field_I;
    private int[] field_v;
    private int[] field_u;
    private int[] field_G;
    private pe[] field_N;
    private int[] field_B;
    private static int field_M;
    private static int field_K;
    private static int field_R;
    private static int field_y;
    private static int field_w;
    private static int field_D;
    private static int field_z;
    private static String[] field_C;
    int field_x;
    private static int field_P;
    int field_L;
    private static int field_O;
    private static int field_F;

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - this.b(param0), param2);
    }

    public static void a() {
        field_Q = null;
        field_C = null;
    }

    private final void b(String param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        Exception var10_ref_Exception = null;
        int var10 = 0;
        int var11 = 0;
        pe var11_ref_pe = null;
        int var12 = 0;
        CharSequence var13 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        param2 = param2 - this.field_E;
        var4 = -1;
        var5 = 0;
        var6 = param0.length();
        var7 = 0;
        L0: while (true) {
          if (var7 >= var6) {
            return;
          } else {
            var8 = param0.charAt(var7);
            if (var8 != 60) {
              L1: {
                if (var8 != 62) {
                  break L1;
                } else {
                  if (var4 == -1) {
                    break L1;
                  } else {
                    var9_ref_String = param0.substring(var4 + 1, var7).toLowerCase();
                    var4 = -1;
                    if (!var9_ref_String.equals("lt")) {
                      if (!var9_ref_String.equals("gt")) {
                        if (!var9_ref_String.equals("nbsp")) {
                          if (!var9_ref_String.equals("shy")) {
                            if (!var9_ref_String.equals("times")) {
                              if (!var9_ref_String.equals("euro")) {
                                if (!var9_ref_String.equals("copy")) {
                                  if (!var9_ref_String.equals("reg")) {
                                    if (!var9_ref_String.startsWith("img=")) {
                                      this.a(var9_ref_String);
                                      var7++;
                                      continue L0;
                                    } else {
                                      try {
                                        L2: {
                                          L3: {
                                            var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                                            var10 = hh.a(10, var13);
                                            var11_ref_pe = this.field_N[var10];
                                            if (this.field_I == null) {
                                              stackOut_25_0 = var11_ref_pe.field_c;
                                              stackIn_26_0 = stackOut_25_0;
                                              break L3;
                                            } else {
                                              stackOut_24_0 = this.field_I[var10];
                                              stackIn_26_0 = stackOut_24_0;
                                              break L3;
                                            }
                                          }
                                          L4: {
                                            var12 = stackIn_26_0;
                                            if (field_z != 256) {
                                              var11_ref_pe.a(param1, param2 + this.field_E - var12, field_z);
                                              break L4;
                                            } else {
                                              var11_ref_pe.a(param1, param2 + this.field_E - var12);
                                              break L4;
                                            }
                                          }
                                          param1 = param1 + var11_ref_pe.field_h;
                                          var5 = 0;
                                          var7++;
                                          break L2;
                                        }
                                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                                        decompiledCaughtException = decompiledCaughtParameter0;
                                        L5: {
                                          var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                          var7++;
                                          break L5;
                                        }
                                      }
                                      continue L0;
                                    }
                                  } else {
                                    var8 = 174;
                                    break L1;
                                  }
                                } else {
                                  var8 = 169;
                                  break L1;
                                }
                              } else {
                                var8 = 8364;
                                break L1;
                              }
                            } else {
                              var8 = 215;
                              break L1;
                            }
                          } else {
                            var8 = 173;
                            break L1;
                          }
                        } else {
                          var8 = 160;
                          break L1;
                        }
                      } else {
                        var8 = 62;
                        break L1;
                      }
                    } else {
                      var8 = 60;
                      break L1;
                    }
                  }
                }
              }
              if (var4 == -1) {
                L6: {
                  var8 = (char)(oj.a((byte) 124, (char) var8) & 255);
                  if (this.field_A == null) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      param1 = param1 + this.field_A[(var5 << 8) + var8];
                      break L6;
                    }
                  }
                }
                L7: {
                  var9 = this.field_G[var8];
                  var10 = this.field_H[var8];
                  var11 = param1;
                  if (var8 == 32) {
                    if (field_R <= 0) {
                      break L7;
                    } else {
                      field_M = field_M + field_R;
                      param1 = param1 + (field_M >> 8);
                      field_M = field_M & 255;
                      break L7;
                    }
                  } else {
                    if (field_z != 256) {
                      L8: {
                        if (field_P == -1) {
                          break L8;
                        } else {
                          this.a(var8, param1 + this.field_v[var8] + 1, param2 + this.field_B[var8] + 1, var9, var10, field_P, field_z, true);
                          break L8;
                        }
                      }
                      this.a(var8, param1 + this.field_v[var8], param2 + this.field_B[var8], var9, var10, field_y, field_z, false);
                      break L7;
                    } else {
                      L9: {
                        if (field_P == -1) {
                          break L9;
                        } else {
                          this.a(var8, param1 + this.field_v[var8] + 1, param2 + this.field_B[var8] + 1, var9, var10, field_P, true);
                          break L9;
                        }
                      }
                      this.a(var8, param1 + this.field_v[var8], param2 + this.field_B[var8], var9, var10, field_y, false);
                      break L7;
                    }
                  }
                }
                L10: {
                  param1 = param1 + this.field_u[var8];
                  if (field_D == -1) {
                    break L10;
                  } else {
                    wj.g(var11, param2 + (int)((double)this.field_E * 0.7), param1 - var11, field_D);
                    break L10;
                  }
                }
                L11: {
                  if (field_K == -1) {
                    break L11;
                  } else {
                    wj.g(var11, param2 + this.field_E + 1, param1 - var11, field_K);
                    break L11;
                  }
                }
                var5 = var8;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            } else {
              var4 = var7;
              var7++;
              continue L0;
            }
          }
        }
    }

    final int a(String param0, int param1) {
        return this.a(param0, new int[]{param1}, field_C);
    }

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1, param2);
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1, param2);
    }

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
            param2 = this.field_E;
        }
        int var4 = this.a(param0, new int[]{param1}, field_C);
        int var5 = (var4 - 1) * param2;
        return this.field_x + var5 + this.field_S;
    }

    private final void a(int param0, int param1, int param2) {
        field_D = -1;
        field_K = -1;
        field_F = param1;
        field_P = param1;
        field_w = param0;
        field_y = param0;
        field_O = param2;
        field_z = param2;
        field_R = 0;
        field_M = 0;
    }

    final int a(String param0, int[] param1, String[] param2) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        String var15 = null;
        Exception var16 = null;
        int var16_int = 0;
        Object var17 = null;
        CharSequence var18 = null;
        int stackIn_66_0 = 0;
        int[] stackIn_66_1 = null;
        int stackIn_67_0 = 0;
        int[] stackIn_67_1 = null;
        int stackIn_68_0 = 0;
        int[] stackIn_68_1 = null;
        int stackIn_68_2 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int[] stackOut_65_1 = null;
        int stackOut_67_0 = 0;
        int[] stackOut_67_1 = null;
        int stackOut_67_2 = 0;
        int stackOut_66_0 = 0;
        int[] stackOut_66_1 = null;
        int stackOut_66_2 = 0;
        var17 = null;
        if (param0 != null) {
          discarded$5 = vd.a(' ', field_Q, 0, false);
          var4 = 0;
          var5 = 0;
          var6 = -1;
          var7 = 0;
          var8 = 0;
          var9 = -1;
          var10 = 0;
          var11 = 0;
          var12 = param0.length();
          var13 = 0;
          L0: while (true) {
            if (var13 >= var12) {
              L1: {
                if (field_Q.length() <= var5) {
                  break L1;
                } else {
                  param2[var11] = field_Q.toString().substring(var5, field_Q.length());
                  var11++;
                  break L1;
                }
              }
              return var11;
            } else {
              var14 = param0.charAt(var13);
              if (var14 != 60) {
                L2: {
                  if (var14 != 62) {
                    break L2;
                  } else {
                    if (var9 == -1) {
                      break L2;
                    } else {
                      L3: {
                        var15 = param0.substring(var9 + 1, var13).toLowerCase();
                        var9 = -1;
                        discarded$6 = field_Q.append('<');
                        discarded$7 = field_Q.append(var15);
                        discarded$8 = field_Q.append('>');
                        if (!var15.equals("br")) {
                          if (!var15.equals("lt")) {
                            if (!var15.equals("gt")) {
                              if (!var15.equals("nbsp")) {
                                if (!var15.equals("shy")) {
                                  if (!var15.equals("times")) {
                                    if (!var15.equals("euro")) {
                                      if (!var15.equals("copy")) {
                                        if (!var15.equals("reg")) {
                                          if (!var15.startsWith("img=")) {
                                            break L3;
                                          } else {
                                            try {
                                              L4: {
                                                var18 = (CharSequence) ((Object) var15.substring(4));
                                                var16_int = hh.a(10, var18);
                                                var4 = var4 + this.field_N[var16_int].field_h;
                                                var10 = 0;
                                                break L4;
                                              }
                                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                                              decompiledCaughtException = decompiledCaughtParameter0;
                                              L5: {
                                                var16 = (Exception) (Object) decompiledCaughtException;
                                                break L5;
                                              }
                                            }
                                            break L3;
                                          }
                                        } else {
                                          L6: {
                                            var4 = var4 + this.a('®');
                                            if (this.field_A == null) {
                                              break L6;
                                            } else {
                                              if (var10 == 0) {
                                                break L6;
                                              } else {
                                                var4 = var4 + this.field_A[(var10 << 8) + 174];
                                                break L6;
                                              }
                                            }
                                          }
                                          var10 = 174;
                                          break L3;
                                        }
                                      } else {
                                        L7: {
                                          var4 = var4 + this.a('©');
                                          if (this.field_A == null) {
                                            break L7;
                                          } else {
                                            if (var10 == 0) {
                                              break L7;
                                            } else {
                                              var4 = var4 + this.field_A[(var10 << 8) + 169];
                                              break L7;
                                            }
                                          }
                                        }
                                        var10 = 169;
                                        break L3;
                                      }
                                    } else {
                                      L8: {
                                        var4 = var4 + this.a('€');
                                        if (this.field_A == null) {
                                          break L8;
                                        } else {
                                          if (var10 == 0) {
                                            break L8;
                                          } else {
                                            var4 = var4 + this.field_A[(var10 << 8) + 128];
                                            break L8;
                                          }
                                        }
                                      }
                                      var10 = 8364;
                                      break L3;
                                    }
                                  } else {
                                    L9: {
                                      var4 = var4 + this.a('×');
                                      if (this.field_A == null) {
                                        break L9;
                                      } else {
                                        if (var10 == 0) {
                                          break L9;
                                        } else {
                                          var4 = var4 + this.field_A[(var10 << 8) + 215];
                                          break L9;
                                        }
                                      }
                                    }
                                    var10 = 215;
                                    break L3;
                                  }
                                } else {
                                  L10: {
                                    var4 = var4 + this.a('­');
                                    if (this.field_A == null) {
                                      break L10;
                                    } else {
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        var4 = var4 + this.field_A[(var10 << 8) + 173];
                                        break L10;
                                      }
                                    }
                                  }
                                  var10 = 173;
                                  break L3;
                                }
                              } else {
                                L11: {
                                  var4 = var4 + this.a(' ');
                                  if (this.field_A == null) {
                                    break L11;
                                  } else {
                                    if (var10 == 0) {
                                      break L11;
                                    } else {
                                      var4 = var4 + this.field_A[(var10 << 8) + 160];
                                      break L11;
                                    }
                                  }
                                }
                                var10 = 160;
                                break L3;
                              }
                            } else {
                              L12: {
                                var4 = var4 + this.a('>');
                                if (this.field_A == null) {
                                  break L12;
                                } else {
                                  if (var10 == 0) {
                                    break L12;
                                  } else {
                                    var4 = var4 + this.field_A[(var10 << 8) + 62];
                                    break L12;
                                  }
                                }
                              }
                              var10 = 62;
                              break L3;
                            }
                          } else {
                            L13: {
                              var4 = var4 + this.a('<');
                              if (this.field_A == null) {
                                break L13;
                              } else {
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  var4 = var4 + this.field_A[(var10 << 8) + 60];
                                  break L13;
                                }
                              }
                            }
                            var10 = 60;
                            break L3;
                          }
                        } else {
                          param2[var11] = field_Q.toString().substring(var5, field_Q.length());
                          var11++;
                          var5 = field_Q.length();
                          var4 = 0;
                          var6 = -1;
                          var10 = 0;
                          break L3;
                        }
                      }
                      var14 = 0;
                      break L2;
                    }
                  }
                }
                if (var9 == -1) {
                  L14: {
                    if (var14 == 0) {
                      break L14;
                    } else {
                      L15: {
                        discarded$9 = field_Q.append((char) var14);
                        var14 = (char)(oj.a((byte) 127, (char) var14) & 255);
                        var4 = var4 + this.field_u[var14];
                        if (this.field_A == null) {
                          break L15;
                        } else {
                          if (var10 == 0) {
                            break L15;
                          } else {
                            var4 = var4 + this.field_A[(var10 << 8) + var14];
                            break L15;
                          }
                        }
                      }
                      var10 = var14;
                      break L14;
                    }
                  }
                  L16: {
                    if (var14 != 32) {
                      break L16;
                    } else {
                      var6 = field_Q.length();
                      var7 = var4;
                      var8 = 1;
                      break L16;
                    }
                  }
                  L17: {
                    if (param1 == null) {
                      break L17;
                    } else {
                      L18: {
                        stackOut_65_0 = var4;
                        stackOut_65_1 = (int[]) (param1);
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (var11 >= param1.length) {
                          stackOut_67_0 = stackIn_67_0;
                          stackOut_67_1 = (int[]) ((Object) stackIn_67_1);
                          stackOut_67_2 = param1.length - 1;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L18;
                        } else {
                          stackOut_66_0 = stackIn_66_0;
                          stackOut_66_1 = (int[]) ((Object) stackIn_66_1);
                          stackOut_66_2 = var11;
                          stackIn_68_0 = stackOut_66_0;
                          stackIn_68_1 = stackOut_66_1;
                          stackIn_68_2 = stackOut_66_2;
                          break L18;
                        }
                      }
                      if (stackIn_68_0 <= stackIn_68_1[stackIn_68_2]) {
                        break L17;
                      } else {
                        if (var6 < 0) {
                          break L17;
                        } else {
                          param2[var11] = field_Q.toString().substring(var5, var6 - var8);
                          var11++;
                          var5 = var6;
                          var6 = -1;
                          var4 = var4 - var7;
                          var10 = 0;
                          break L17;
                        }
                      }
                    }
                  }
                  if (var14 == 45) {
                    var6 = field_Q.length();
                    var7 = var4;
                    var8 = 0;
                    var13++;
                    continue L0;
                  } else {
                    var13++;
                    continue L0;
                  }
                } else {
                  var13++;
                  continue L0;
                }
              } else {
                var9 = var13;
                var13++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    private final void a(int param0, int param1) {
        field_D = -1;
        field_K = -1;
        field_F = param1;
        field_P = param1;
        field_w = param0;
        field_y = param0;
        field_O = 256;
        field_z = 256;
        field_R = 0;
        field_M = 0;
    }

    final void b(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - this.b(param0) / 2, param2);
    }

    final int a(char param0) {
        return this.field_u[oj.a((byte) 127, param0) & 255];
    }

    private final static int a(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        byte[] var14 = null;
        byte[] var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        L0: {
          var7 = param2[param5];
          var8 = var7 + param4[param5];
          var9 = param2[param6];
          var10 = var9 + param4[param6];
          var11 = var7;
          if (var9 <= var7) {
            break L0;
          } else {
            var11 = var9;
            break L0;
          }
        }
        L1: {
          var12 = var8;
          if (var10 >= var8) {
            break L1;
          } else {
            var12 = var10;
            break L1;
          }
        }
        L2: {
          var13 = param3[param5];
          if (param3[param6] >= var13) {
            break L2;
          } else {
            var13 = param3[param6];
            break L2;
          }
        }
        var14 = param1[param5];
        var15 = param0[param6];
        var16 = var11 - var7;
        var17 = var11 - var9;
        var18 = var11;
        L3: while (true) {
          if (var18 >= var12) {
            return -var13;
          } else {
            incrementValue$12 = var16;
            var16++;
            incrementValue$13 = var17;
            var17++;
            var19 = var14[incrementValue$12] + var15[incrementValue$13];
            if (var19 < var13) {
              var13 = var19;
              var18++;
              continue L3;
            } else {
              var18++;
              continue L3;
            }
          }
        }
    }

    private final void a(String param0) {
        Exception var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param0.startsWith("col=")) {
                if (!param0.equals("/col")) {
                  if (!param0.startsWith("trans=")) {
                    if (!param0.equals("/trans")) {
                      if (!param0.startsWith("str=")) {
                        if (!param0.equals("str")) {
                          if (!param0.equals("/str")) {
                            if (!param0.startsWith("u=")) {
                              if (!param0.equals("u")) {
                                if (!param0.equals("/u")) {
                                  if (!param0.startsWith("shad=")) {
                                    if (!param0.equals("shad")) {
                                      if (!param0.equals("/shad")) {
                                        if (!param0.equals("br")) {
                                          break L1;
                                        } else {
                                          this.a(field_w, field_F, field_O);
                                          break L1;
                                        }
                                      } else {
                                        field_P = field_F;
                                        break L1;
                                      }
                                    } else {
                                      field_P = 0;
                                      break L1;
                                    }
                                  } else {
                                    var7 = (CharSequence) ((Object) param0.substring(5));
                                    field_P = eg.a(16, 74, var7);
                                    break L1;
                                  }
                                } else {
                                  field_K = -1;
                                  break L1;
                                }
                              } else {
                                field_K = 0;
                                break L1;
                              }
                            } else {
                              var6 = (CharSequence) ((Object) param0.substring(2));
                              field_K = eg.a(16, 83, var6);
                              break L1;
                            }
                          } else {
                            field_D = -1;
                            break L1;
                          }
                        } else {
                          field_D = 8388608;
                          break L1;
                        }
                      } else {
                        var5 = (CharSequence) ((Object) param0.substring(4));
                        field_D = eg.a(16, 116, var5);
                        break L1;
                      }
                    } else {
                      field_z = field_O;
                      break L1;
                    }
                  } else {
                    var4 = (CharSequence) ((Object) param0.substring(6));
                    field_z = hh.a(10, var4);
                    break L1;
                  }
                } else {
                  field_y = field_w;
                  break L1;
                }
              } else {
                var3 = (CharSequence) ((Object) param0.substring(4));
                field_y = eg.a(16, 97, var3);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    private final void a(byte[] param0) {
        byte[] array$7 = null;
        int incrementValue$8 = 0;
        byte[] array$9 = null;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var2 = 0;
        int var3_int = 0;
        int[] var3 = null;
        int[] var4 = null;
        int var5_int = 0;
        byte[][] var5 = null;
        int var6_int = 0;
        byte[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        byte[][] var11 = null;
        byte[][] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        byte[][] var15 = null;
        byte[][] var16 = null;
        int[] var17 = null;
        L0: {
          this.field_u = new int[256];
          if (param0.length != 257) {
            var2 = 0;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 256) {
                var14 = new int[256];
                var10 = var14;
                var3 = var10;
                var17 = new int[256];
                var13 = var17;
                var4 = var13;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= 256) {
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= 256) {
                        var15 = new byte[256][];
                        var11 = var15;
                        var5 = var11;
                        var6_int = 0;
                        L4: while (true) {
                          if (var6_int >= 256) {
                            var16 = new byte[256][];
                            var12 = var16;
                            var6 = var12;
                            var7 = 0;
                            L5: while (true) {
                              if (var7 >= 256) {
                                this.field_A = new byte[65536];
                                var7 = 0;
                                L6: while (true) {
                                  if (var7 >= 256) {
                                    this.field_E = var17[32] + var14[32];
                                    break L0;
                                  } else {
                                    if (var7 != 32) {
                                      if (var7 != 160) {
                                        var8 = 0;
                                        L7: while (true) {
                                          if (var8 < 256) {
                                            if (var8 != 32) {
                                              if (var8 != 160) {
                                                this.field_A[(var7 << 8) + var8] = (byte)rf.a(var15, var16, var17, this.field_u, var14, var7, var8);
                                                var8++;
                                                continue L7;
                                              } else {
                                                var8++;
                                                continue L7;
                                              }
                                            } else {
                                              var8++;
                                              continue L7;
                                            }
                                          } else {
                                            var7++;
                                            continue L6;
                                          }
                                        }
                                      } else {
                                        var7++;
                                        continue L6;
                                      }
                                    } else {
                                      var7++;
                                      continue L6;
                                    }
                                  }
                                }
                              } else {
                                array$7 = new byte[var14[var7]];
                                var6[var7] = array$7;
                                var8 = 0;
                                var9 = 0;
                                L8: while (true) {
                                  if (var9 >= var16[var7].length) {
                                    var7++;
                                    continue L5;
                                  } else {
                                    incrementValue$8 = var2;
                                    var2++;
                                    var8 = (byte)(var8 + param0[incrementValue$8]);
                                    var16[var7][var9] = (byte)var8;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            array$9 = new byte[var14[var6_int]];
                            var5[var6_int] = array$9;
                            var7 = 0;
                            var8 = 0;
                            L9: while (true) {
                              if (var8 >= var15[var6_int].length) {
                                var6_int++;
                                continue L4;
                              } else {
                                incrementValue$10 = var2;
                                var2++;
                                var7 = (byte)(var7 + param0[incrementValue$10]);
                                var15[var6_int][var8] = (byte)var7;
                                var8++;
                                continue L9;
                              }
                            }
                          }
                        }
                      } else {
                        incrementValue$11 = var2;
                        var2++;
                        var4[var5_int] = param0[incrementValue$11] & 255;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    incrementValue$12 = var2;
                    var2++;
                    var3[var5_int] = param0[incrementValue$12] & 255;
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                incrementValue$13 = var2;
                var2++;
                this.field_u[var3_int] = param0[incrementValue$13] & 255;
                var3_int++;
                continue L1;
              }
            }
          } else {
            var2 = 0;
            L10: while (true) {
              if (var2 >= this.field_u.length) {
                this.field_E = param0[256] & 255;
                break L0;
              } else {
                this.field_u[var2] = param0[var2] & 255;
                var2++;
                continue L10;
              }
            }
          }
        }
    }

    final int b(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = this.a(param0, new int[]{param1}, field_C);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var3) {
            return var4;
          } else {
            var6 = this.b(field_C[var5]);
            if (var6 > var4) {
              var4 = var6;
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    private final void c(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        var6 = 0;
        L0: while (true) {
          if (var6 >= var5) {
            L1: {
              if (var3 <= 0) {
                break L1;
              } else {
                field_R = (param1 - this.b(param0) << 8) / var3;
                break L1;
              }
            }
            return;
          } else {
            var7 = param0.charAt(var6);
            if (var7 != 60) {
              if (var7 != 62) {
                if (var4 == 0) {
                  if (var7 == 32) {
                    var3++;
                    var6++;
                    continue L0;
                  } else {
                    var6++;
                    continue L0;
                  }
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var4 = 0;
                var6++;
                continue L0;
              }
            } else {
              var4 = 1;
              var6++;
              continue L0;
            }
          }
        }
    }

    final int b(String param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        Exception var9 = null;
        int var9_int = 0;
        CharSequence var10 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != null) {
          var2 = -1;
          var3 = 0;
          var4 = 0;
          var5 = param0.length();
          var6 = 0;
          L0: while (true) {
            if (var6 >= var5) {
              return var4;
            } else {
              var7 = param0.charAt(var6);
              if (var7 != 60) {
                L1: {
                  if (var7 != 62) {
                    break L1;
                  } else {
                    if (var2 == -1) {
                      break L1;
                    } else {
                      var8 = param0.substring(var2 + 1, var6).toLowerCase();
                      var2 = -1;
                      if (!var8.equals("lt")) {
                        if (!var8.equals("gt")) {
                          if (!var8.equals("nbsp")) {
                            if (!var8.equals("shy")) {
                              if (!var8.equals("times")) {
                                if (!var8.equals("euro")) {
                                  if (!var8.equals("copy")) {
                                    if (!var8.equals("reg")) {
                                      if (var8.startsWith("img=")) {
                                        try {
                                          L2: {
                                            var10 = (CharSequence) ((Object) var8.substring(4));
                                            var9_int = hh.a(10, var10);
                                            var4 = var4 + this.field_N[var9_int].field_h;
                                            var3 = 0;
                                            var6++;
                                            break L2;
                                          }
                                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                                          decompiledCaughtException = decompiledCaughtParameter0;
                                          L3: {
                                            var9 = (Exception) (Object) decompiledCaughtException;
                                            var6++;
                                            break L3;
                                          }
                                        }
                                        continue L0;
                                      } else {
                                        var6++;
                                        continue L0;
                                      }
                                    } else {
                                      var7 = 174;
                                      break L1;
                                    }
                                  } else {
                                    var7 = 169;
                                    break L1;
                                  }
                                } else {
                                  var7 = 8364;
                                  break L1;
                                }
                              } else {
                                var7 = 215;
                                break L1;
                              }
                            } else {
                              var7 = 173;
                              break L1;
                            }
                          } else {
                            var7 = 160;
                            break L1;
                          }
                        } else {
                          var7 = 62;
                          break L1;
                        }
                      } else {
                        var7 = 60;
                        break L1;
                      }
                    }
                  }
                }
                if (var2 == -1) {
                  L4: {
                    var7 = (char)(oj.a((byte) 125, (char) var7) & 255);
                    var4 = var4 + this.field_u[var7];
                    if (this.field_A == null) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        break L4;
                      } else {
                        var4 = var4 + this.field_A[(var3 << 8) + var7];
                        break L4;
                      }
                    }
                  }
                  var3 = var7;
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              } else {
                var2 = var6;
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - this.b(param0), param2);
    }

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - this.b(param0) / 2, param2);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    rf(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        this.field_E = 0;
        this.field_v = param1;
        this.field_B = param2;
        this.field_G = param3;
        this.field_H = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 256) {
            this.field_x = this.field_E - var6;
            this.field_S = var7 - this.field_E;
            this.field_L = this.field_E - this.field_B[88];
            return;
          } else {
            L1: {
              if (this.field_B[var8] >= var6) {
                break L1;
              } else {
                if (this.field_H[var8] == 0) {
                  break L1;
                } else {
                  var6 = this.field_B[var8];
                  break L1;
                }
              }
            }
            if (this.field_B[var8] + this.field_H[var8] > var7) {
              var7 = this.field_B[var8] + this.field_H[var8];
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (param0 != null) {
          L0: {
            this.a(param5, param6, param7);
            if (param10 != 0) {
              break L0;
            } else {
              param10 = this.field_E;
              break L0;
            }
          }
          L1: {
            var12 = new int[]{param3};
            if (param4 >= this.field_x + this.field_S + param10) {
              break L1;
            } else {
              if (param4 >= param10 + param10) {
                break L1;
              } else {
                var12 = null;
                break L1;
              }
            }
          }
          L2: {
            var13 = this.a(param0, var12, field_C);
            if (param9 != 3) {
              break L2;
            } else {
              if (var13 != 1) {
                break L2;
              } else {
                param9 = 1;
                break L2;
              }
            }
          }
          L3: {
            if (param9 != 0) {
              if (param9 != 1) {
                if (param9 != 2) {
                  L4: {
                    var15 = (param4 - this.field_x - this.field_S - (var13 - 1) * param10) / (var13 + 1);
                    if (var15 >= 0) {
                      break L4;
                    } else {
                      var15 = 0;
                      break L4;
                    }
                  }
                  var14 = param2 + this.field_x + var15;
                  param10 = param10 + var15;
                  break L3;
                } else {
                  var14 = param2 + param4 - this.field_S - (var13 - 1) * param10;
                  break L3;
                }
              } else {
                var14 = param2 + this.field_x + (param4 - this.field_x - this.field_S - (var13 - 1) * param10) / 2;
                break L3;
              }
            } else {
              var14 = param2 + this.field_x;
              break L3;
            }
          }
          var15 = 0;
          L5: while (true) {
            if (var15 >= var13) {
              return var13;
            } else {
              if (param8 != 0) {
                if (param8 != 1) {
                  if (param8 != 2) {
                    L6: {
                      if (var15 != var13 - 1) {
                        this.c(field_C[var15], param3);
                        this.b(field_C[var15], param1, var14);
                        field_R = 0;
                        break L6;
                      } else {
                        this.b(field_C[var15], param1, var14);
                        break L6;
                      }
                    }
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  } else {
                    this.b(field_C[var15], param1 + param3 - this.b(field_C[var15]), var14);
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  }
                } else {
                  this.b(field_C[var15], param1 + (param3 - this.b(field_C[var15])) / 2, var14);
                  var14 = var14 + param10;
                  var15++;
                  continue L5;
                }
              } else {
                this.b(field_C[var15], param1, var14);
                var14 = var14 + param10;
                var15++;
                continue L5;
              }
            }
          }
        } else {
          return 0;
        }
    }

    static {
        field_Q = new StringBuilder(100);
        field_M = 0;
        field_K = -1;
        field_w = 0;
        field_y = 0;
        field_R = 0;
        field_z = 256;
        field_C = new String[100];
        field_D = -1;
        field_P = -1;
        field_O = 256;
        field_F = -1;
    }
}
