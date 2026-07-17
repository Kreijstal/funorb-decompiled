/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa extends pa {
    int field_y;
    private int[] field_D;
    private int[] field_G;
    private int[] field_I;
    private byte[] field_t;
    int field_H;
    private cm[] field_B;
    private int[] field_v;
    private int[] field_M;
    int field_N;
    int field_K;
    private static StringBuilder field_A;
    private static int field_E;
    private static int field_C;
    private static int field_r;
    private static int field_J;
    private static int field_u;
    private static int field_x;
    private int[] field_z;
    private static int field_F;
    private static String[] field_w;
    private static int field_s;
    private static int field_L;
    private static int field_q;

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.a(param0, param1 - ((fa) this).b(param0), param2);
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.a(param0, param1, param2);
    }

    private final void a(String param0, int param1, int param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        Exception var13_ref_Exception = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        cm var16_ref_cm = null;
        int var17 = 0;
        Object var18 = null;
        CharSequence var19 = null;
        int stackIn_32_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        var18 = null;
        param2 = param2 - ((fa) this).field_N;
        var6 = -1;
        var7 = 0;
        var8 = 0;
        var9 = param0.length();
        var10 = 0;
        L0: while (true) {
          if (var10 >= var9) {
            return;
          } else {
            var11 = param0.charAt(var10);
            if (var11 != 60) {
              L1: {
                if (var11 != 62) {
                  break L1;
                } else {
                  if (var6 == -1) {
                    break L1;
                  } else {
                    var12_ref_String = param0.substring(var6 + 1, var10).toLowerCase();
                    var6 = -1;
                    if (!var12_ref_String.equals((Object) (Object) "lt")) {
                      if (!var12_ref_String.equals((Object) (Object) "gt")) {
                        if (!var12_ref_String.equals((Object) (Object) "nbsp")) {
                          if (!var12_ref_String.equals((Object) (Object) "shy")) {
                            if (!var12_ref_String.equals((Object) (Object) "times")) {
                              if (!var12_ref_String.equals((Object) (Object) "euro")) {
                                if (!var12_ref_String.equals((Object) (Object) "copy")) {
                                  if (!var12_ref_String.equals((Object) (Object) "reg")) {
                                    if (!var12_ref_String.startsWith("img=")) {
                                      this.a(var12_ref_String);
                                      var10++;
                                      continue L0;
                                    } else {
                                      try {
                                        L2: {
                                          L3: {
                                            if (param3 == null) {
                                              var13 = 0;
                                              break L3;
                                            } else {
                                              var13 = param3[var8];
                                              break L3;
                                            }
                                          }
                                          L4: {
                                            if (param4 == null) {
                                              var14 = 0;
                                              break L4;
                                            } else {
                                              var14 = param4[var8];
                                              break L4;
                                            }
                                          }
                                          L5: {
                                            var8++;
                                            var19 = (CharSequence) (Object) var12_ref_String.substring(4);
                                            int discarded$2 = -9816;
                                            var15 = pl.a(var19);
                                            var16_ref_cm = ((fa) this).field_B[var15];
                                            if (((fa) this).field_G == null) {
                                              stackOut_31_0 = var16_ref_cm.field_d;
                                              stackIn_32_0 = stackOut_31_0;
                                              break L5;
                                            } else {
                                              stackOut_30_0 = ((fa) this).field_G[var15];
                                              stackIn_32_0 = stackOut_30_0;
                                              break L5;
                                            }
                                          }
                                          L6: {
                                            var17 = stackIn_32_0;
                                            if (field_s != 256) {
                                              var16_ref_cm.a(param1 + var13, param2 + ((fa) this).field_N - var17 + var14, field_s);
                                              break L6;
                                            } else {
                                              var16_ref_cm.a(param1 + var13, param2 + ((fa) this).field_N - var17 + var14);
                                              break L6;
                                            }
                                          }
                                          param1 = param1 + var16_ref_cm.field_e;
                                          var7 = 0;
                                          var10++;
                                          break L2;
                                        }
                                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                                        decompiledCaughtException = decompiledCaughtParameter0;
                                        L7: {
                                          var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                          var10++;
                                          break L7;
                                        }
                                      }
                                      continue L0;
                                    }
                                  } else {
                                    var11 = 174;
                                    break L1;
                                  }
                                } else {
                                  var11 = 169;
                                  break L1;
                                }
                              } else {
                                var11 = 8364;
                                break L1;
                              }
                            } else {
                              var11 = 215;
                              break L1;
                            }
                          } else {
                            var11 = 173;
                            break L1;
                          }
                        } else {
                          var11 = 160;
                          break L1;
                        }
                      } else {
                        var11 = 62;
                        break L1;
                      }
                    } else {
                      var11 = 60;
                      break L1;
                    }
                  }
                }
              }
              if (var6 == -1) {
                L8: {
                  int discarded$3 = 22861;
                  var11 = (char)(rc.a((char) var11) & 255);
                  if (((fa) this).field_t == null) {
                    break L8;
                  } else {
                    if (var7 == 0) {
                      break L8;
                    } else {
                      param1 = param1 + ((fa) this).field_t[(var7 << 8) + var11];
                      break L8;
                    }
                  }
                }
                L9: {
                  var12 = ((fa) this).field_M[var11];
                  var13 = ((fa) this).field_v[var11];
                  if (param3 == null) {
                    var14 = 0;
                    break L9;
                  } else {
                    var14 = param3[var8];
                    break L9;
                  }
                }
                L10: {
                  if (param4 == null) {
                    var15 = 0;
                    break L10;
                  } else {
                    var15 = param4[var8];
                    break L10;
                  }
                }
                L11: {
                  var8++;
                  if (var11 == 32) {
                    if (field_F <= 0) {
                      break L11;
                    } else {
                      field_r = field_r + field_F;
                      param1 = param1 + (field_r >> 8);
                      field_r = field_r & 255;
                      break L11;
                    }
                  } else {
                    if (field_s != 256) {
                      L12: {
                        if (field_x == -1) {
                          break L12;
                        } else {
                          ((fa) this).a(var11, param1 + ((fa) this).field_I[var11] + 1 + var14, param2 + ((fa) this).field_D[var11] + 1 + var15, var12, var13, field_x, field_s, true);
                          break L12;
                        }
                      }
                      ((fa) this).a(var11, param1 + ((fa) this).field_I[var11] + var14, param2 + ((fa) this).field_D[var11] + var15, var12, var13, field_E, field_s, false);
                      break L11;
                    } else {
                      L13: {
                        if (field_x == -1) {
                          break L13;
                        } else {
                          ((fa) this).a(var11, param1 + ((fa) this).field_I[var11] + 1 + var14, param2 + ((fa) this).field_D[var11] + 1 + var15, var12, var13, field_x, true);
                          break L13;
                        }
                      }
                      ((fa) this).a(var11, param1 + ((fa) this).field_I[var11] + var14, param2 + ((fa) this).field_D[var11] + var15, var12, var13, field_E, false);
                      break L11;
                    }
                  }
                }
                L14: {
                  var16 = ((fa) this).field_z[var11];
                  if (field_u == -1) {
                    break L14;
                  } else {
                    gb.b(param1, param2 + (int)((double)((fa) this).field_N * 0.7), var16, field_u);
                    break L14;
                  }
                }
                L15: {
                  if (field_J == -1) {
                    break L15;
                  } else {
                    gb.b(param1, param2 + ((fa) this).field_N, var16, field_J);
                    break L15;
                  }
                }
                param1 = param1 + var16;
                var7 = var11;
                var10++;
                continue L0;
              } else {
                var10++;
                continue L0;
              }
            } else {
              var6 = var10;
              var10++;
              continue L0;
            }
          }
        }
    }

    final int c(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = ((fa) this).a(param0, new int[1], field_w);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var3) {
            return var4;
          } else {
            var6 = ((fa) this).b(field_w[var5]);
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
                if (!param0.equals((Object) (Object) "/col")) {
                  if (!param0.startsWith("trans=")) {
                    if (!param0.equals((Object) (Object) "/trans")) {
                      if (!param0.startsWith("str=")) {
                        if (!param0.equals((Object) (Object) "str")) {
                          if (!param0.equals((Object) (Object) "/str")) {
                            if (!param0.startsWith("u=")) {
                              if (!param0.equals((Object) (Object) "u")) {
                                if (!param0.equals((Object) (Object) "/u")) {
                                  if (!param0.startsWith("shad=")) {
                                    if (!param0.equals((Object) (Object) "shad")) {
                                      if (!param0.equals((Object) (Object) "/shad")) {
                                        if (!param0.equals((Object) (Object) "br")) {
                                          break L1;
                                        } else {
                                          this.a(field_L, field_q, field_C);
                                          break L1;
                                        }
                                      } else {
                                        field_x = field_q;
                                        break L1;
                                      }
                                    } else {
                                      field_x = 0;
                                      break L1;
                                    }
                                  } else {
                                    var7 = (CharSequence) (Object) param0.substring(5);
                                    field_x = vf.a(16, (byte) 123, var7);
                                    break L1;
                                  }
                                } else {
                                  field_J = -1;
                                  break L1;
                                }
                              } else {
                                field_J = 0;
                                break L1;
                              }
                            } else {
                              var6 = (CharSequence) (Object) param0.substring(2);
                              field_J = vf.a(16, (byte) 122, var6);
                              break L1;
                            }
                          } else {
                            field_u = -1;
                            break L1;
                          }
                        } else {
                          field_u = 8388608;
                          break L1;
                        }
                      } else {
                        var5 = (CharSequence) (Object) param0.substring(4);
                        field_u = vf.a(16, (byte) 124, var5);
                        break L1;
                      }
                    } else {
                      field_s = field_C;
                      break L1;
                    }
                  } else {
                    var4 = (CharSequence) (Object) param0.substring(6);
                    int discarded$1 = -9816;
                    field_s = pl.a(var4);
                    break L1;
                  }
                } else {
                  field_E = field_L;
                  break L1;
                }
              } else {
                var3 = (CharSequence) (Object) param0.substring(4);
                field_E = vf.a(16, (byte) 97, var3);
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

    private final void a(int param0, int param1) {
        field_u = -1;
        field_J = -1;
        field_q = param1;
        field_x = param1;
        field_L = param0;
        field_E = param0;
        field_C = 256;
        field_s = 256;
        field_F = 0;
        field_r = 0;
    }

    public static void a() {
        field_A = null;
        field_w = null;
    }

    final int a(char param0) {
        int discarded$0 = 22861;
        return ((fa) this).field_z[rc.a(param0) & 255];
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
              param10 = ((fa) this).field_N;
              break L0;
            }
          }
          L1: {
            var12 = new int[]{param3};
            if (param4 >= ((fa) this).field_H + ((fa) this).field_K + param10) {
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
            var13 = ((fa) this).a(param0, var12, field_w);
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
                    var15 = (param4 - ((fa) this).field_H - ((fa) this).field_K - (var13 - 1) * param10) / (var13 + 1);
                    if (var15 >= 0) {
                      break L4;
                    } else {
                      var15 = 0;
                      break L4;
                    }
                  }
                  var14 = param2 + ((fa) this).field_H + var15;
                  param10 = param10 + var15;
                  break L3;
                } else {
                  var14 = param2 + param4 - ((fa) this).field_K - (var13 - 1) * param10;
                  break L3;
                }
              } else {
                var14 = param2 + ((fa) this).field_H + (param4 - ((fa) this).field_H - ((fa) this).field_K - (var13 - 1) * param10) / 2;
                break L3;
              }
            } else {
              var14 = param2 + ((fa) this).field_H;
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
                        this.b(field_w[var15], param3);
                        this.a(field_w[var15], param1, var14);
                        field_F = 0;
                        break L6;
                      } else {
                        this.a(field_w[var15], param1, var14);
                        break L6;
                      }
                    }
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  } else {
                    this.a(field_w[var15], param1 + param3 - ((fa) this).b(field_w[var15]), var14);
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  }
                } else {
                  this.a(field_w[var15], param1 + (param3 - ((fa) this).b(field_w[var15])) / 2, var14);
                  var14 = var14 + param10;
                  var15++;
                  continue L5;
                }
              } else {
                this.a(field_w[var15], param1, var14);
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

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.a(param0, param1 - ((fa) this).b(param0) / 2, param2);
    }

    private final void a(String param0, int param1, int param2) {
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
        cm var11_ref_cm = null;
        int var12 = 0;
        CharSequence var13 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        param2 = param2 - ((fa) this).field_N;
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
                    if (!var9_ref_String.equals((Object) (Object) "lt")) {
                      if (!var9_ref_String.equals((Object) (Object) "gt")) {
                        if (!var9_ref_String.equals((Object) (Object) "nbsp")) {
                          if (!var9_ref_String.equals((Object) (Object) "shy")) {
                            if (!var9_ref_String.equals((Object) (Object) "times")) {
                              if (!var9_ref_String.equals((Object) (Object) "euro")) {
                                if (!var9_ref_String.equals((Object) (Object) "copy")) {
                                  if (!var9_ref_String.equals((Object) (Object) "reg")) {
                                    if (!var9_ref_String.startsWith("img=")) {
                                      this.a(var9_ref_String);
                                      var7++;
                                      continue L0;
                                    } else {
                                      try {
                                        L2: {
                                          L3: {
                                            var13 = (CharSequence) (Object) var9_ref_String.substring(4);
                                            int discarded$2 = -9816;
                                            var10 = pl.a(var13);
                                            var11_ref_cm = ((fa) this).field_B[var10];
                                            if (((fa) this).field_G == null) {
                                              stackOut_25_0 = var11_ref_cm.field_d;
                                              stackIn_26_0 = stackOut_25_0;
                                              break L3;
                                            } else {
                                              stackOut_24_0 = ((fa) this).field_G[var10];
                                              stackIn_26_0 = stackOut_24_0;
                                              break L3;
                                            }
                                          }
                                          L4: {
                                            var12 = stackIn_26_0;
                                            if (field_s != 256) {
                                              var11_ref_cm.a(param1, param2 + ((fa) this).field_N - var12, field_s);
                                              break L4;
                                            } else {
                                              var11_ref_cm.a(param1, param2 + ((fa) this).field_N - var12);
                                              break L4;
                                            }
                                          }
                                          param1 = param1 + var11_ref_cm.field_e;
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
                  int discarded$3 = 22861;
                  var8 = (char)(rc.a((char) var8) & 255);
                  if (((fa) this).field_t == null) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      param1 = param1 + ((fa) this).field_t[(var5 << 8) + var8];
                      break L6;
                    }
                  }
                }
                L7: {
                  var9 = ((fa) this).field_M[var8];
                  var10 = ((fa) this).field_v[var8];
                  var11 = param1;
                  if (var8 == 32) {
                    if (field_F <= 0) {
                      break L7;
                    } else {
                      field_r = field_r + field_F;
                      param1 = param1 + (field_r >> 8);
                      field_r = field_r & 255;
                      break L7;
                    }
                  } else {
                    if (field_s != 256) {
                      L8: {
                        if (field_x == -1) {
                          break L8;
                        } else {
                          ((fa) this).a(var8, param1 + ((fa) this).field_I[var8] + 1, param2 + ((fa) this).field_D[var8] + 1, var9, var10, field_x, field_s, true);
                          break L8;
                        }
                      }
                      ((fa) this).a(var8, param1 + ((fa) this).field_I[var8], param2 + ((fa) this).field_D[var8], var9, var10, field_E, field_s, false);
                      break L7;
                    } else {
                      L9: {
                        if (field_x == -1) {
                          break L9;
                        } else {
                          ((fa) this).a(var8, param1 + ((fa) this).field_I[var8] + 1, param2 + ((fa) this).field_D[var8] + 1, var9, var10, field_x, true);
                          break L9;
                        }
                      }
                      ((fa) this).a(var8, param1 + ((fa) this).field_I[var8], param2 + ((fa) this).field_D[var8], var9, var10, field_E, false);
                      break L7;
                    }
                  }
                }
                L10: {
                  param1 = param1 + ((fa) this).field_z[var8];
                  if (field_u == -1) {
                    break L10;
                  } else {
                    gb.b(var11, param2 + (int)((double)((fa) this).field_N * 0.7), param1 - var11, field_u);
                    break L10;
                  }
                }
                L11: {
                  if (field_J == -1) {
                    break L11;
                  } else {
                    gb.b(var11, param2 + ((fa) this).field_N + 1, param1 - var11, field_J);
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

    final int b(String param0, int param1, int param2) {
        if (param2 == 0) {
            param2 = ((fa) this).field_N;
        }
        int var4 = ((fa) this).a(param0, new int[1], field_w);
        int var5 = (var4 - 1) * param2;
        return ((fa) this).field_H + var5 + ((fa) this).field_K;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    private final static int a(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
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
            int incrementValue$12 = var16;
            var16++;
            int incrementValue$13 = var17;
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
                      if (!var8.equals((Object) (Object) "lt")) {
                        if (!var8.equals((Object) (Object) "gt")) {
                          if (!var8.equals((Object) (Object) "nbsp")) {
                            if (!var8.equals((Object) (Object) "shy")) {
                              if (!var8.equals((Object) (Object) "times")) {
                                if (!var8.equals((Object) (Object) "euro")) {
                                  if (!var8.equals((Object) (Object) "copy")) {
                                    if (!var8.equals((Object) (Object) "reg")) {
                                      if (var8.startsWith("img=")) {
                                        try {
                                          L2: {
                                            var10 = (CharSequence) (Object) var8.substring(4);
                                            int discarded$2 = -9816;
                                            var9_int = pl.a(var10);
                                            var4 = var4 + ((fa) this).field_B[var9_int].field_e;
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
                    int discarded$3 = 22861;
                    var7 = (char)(rc.a((char) var7) & 255);
                    var4 = var4 + ((fa) this).field_z[var7];
                    if (((fa) this).field_t == null) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        break L4;
                      } else {
                        var4 = var4 + ((fa) this).field_t[(var3 << 8) + var7];
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

    final int a(String param0, int[] param1, String[] param2) {
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
          StringBuilder discarded$7 = uf.a(0, field_A, ' ', -118);
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
                if (field_A.length() <= var5) {
                  break L1;
                } else {
                  param2[var11] = field_A.toString().substring(var5, field_A.length());
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
                        StringBuilder discarded$8 = field_A.append(60);
                        StringBuilder discarded$9 = field_A.append(var15);
                        StringBuilder discarded$10 = field_A.append(62);
                        if (!var15.equals((Object) (Object) "br")) {
                          if (!var15.equals((Object) (Object) "lt")) {
                            if (!var15.equals((Object) (Object) "gt")) {
                              if (!var15.equals((Object) (Object) "nbsp")) {
                                if (!var15.equals((Object) (Object) "shy")) {
                                  if (!var15.equals((Object) (Object) "times")) {
                                    if (!var15.equals((Object) (Object) "euro")) {
                                      if (!var15.equals((Object) (Object) "copy")) {
                                        if (!var15.equals((Object) (Object) "reg")) {
                                          if (!var15.startsWith("img=")) {
                                            break L3;
                                          } else {
                                            try {
                                              L4: {
                                                var18 = (CharSequence) (Object) var15.substring(4);
                                                int discarded$11 = -9816;
                                                var16_int = pl.a(var18);
                                                var4 = var4 + ((fa) this).field_B[var16_int].field_e;
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
                                            var4 = var4 + ((fa) this).a('®');
                                            if (((fa) this).field_t == null) {
                                              break L6;
                                            } else {
                                              if (var10 == 0) {
                                                break L6;
                                              } else {
                                                var4 = var4 + ((fa) this).field_t[(var10 << 8) + 174];
                                                break L6;
                                              }
                                            }
                                          }
                                          var10 = 174;
                                          break L3;
                                        }
                                      } else {
                                        L7: {
                                          var4 = var4 + ((fa) this).a('©');
                                          if (((fa) this).field_t == null) {
                                            break L7;
                                          } else {
                                            if (var10 == 0) {
                                              break L7;
                                            } else {
                                              var4 = var4 + ((fa) this).field_t[(var10 << 8) + 169];
                                              break L7;
                                            }
                                          }
                                        }
                                        var10 = 169;
                                        break L3;
                                      }
                                    } else {
                                      L8: {
                                        var4 = var4 + ((fa) this).a('€');
                                        if (((fa) this).field_t == null) {
                                          break L8;
                                        } else {
                                          if (var10 == 0) {
                                            break L8;
                                          } else {
                                            var4 = var4 + ((fa) this).field_t[(var10 << 8) + 128];
                                            break L8;
                                          }
                                        }
                                      }
                                      var10 = 8364;
                                      break L3;
                                    }
                                  } else {
                                    L9: {
                                      var4 = var4 + ((fa) this).a('×');
                                      if (((fa) this).field_t == null) {
                                        break L9;
                                      } else {
                                        if (var10 == 0) {
                                          break L9;
                                        } else {
                                          var4 = var4 + ((fa) this).field_t[(var10 << 8) + 215];
                                          break L9;
                                        }
                                      }
                                    }
                                    var10 = 215;
                                    break L3;
                                  }
                                } else {
                                  L10: {
                                    var4 = var4 + ((fa) this).a('­');
                                    if (((fa) this).field_t == null) {
                                      break L10;
                                    } else {
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        var4 = var4 + ((fa) this).field_t[(var10 << 8) + 173];
                                        break L10;
                                      }
                                    }
                                  }
                                  var10 = 173;
                                  break L3;
                                }
                              } else {
                                L11: {
                                  var4 = var4 + ((fa) this).a(' ');
                                  if (((fa) this).field_t == null) {
                                    break L11;
                                  } else {
                                    if (var10 == 0) {
                                      break L11;
                                    } else {
                                      var4 = var4 + ((fa) this).field_t[(var10 << 8) + 160];
                                      break L11;
                                    }
                                  }
                                }
                                var10 = 160;
                                break L3;
                              }
                            } else {
                              L12: {
                                var4 = var4 + ((fa) this).a('>');
                                if (((fa) this).field_t == null) {
                                  break L12;
                                } else {
                                  if (var10 == 0) {
                                    break L12;
                                  } else {
                                    var4 = var4 + ((fa) this).field_t[(var10 << 8) + 62];
                                    break L12;
                                  }
                                }
                              }
                              var10 = 62;
                              break L3;
                            }
                          } else {
                            L13: {
                              var4 = var4 + ((fa) this).a('<');
                              if (((fa) this).field_t == null) {
                                break L13;
                              } else {
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  var4 = var4 + ((fa) this).field_t[(var10 << 8) + 60];
                                  break L13;
                                }
                              }
                            }
                            var10 = 60;
                            break L3;
                          }
                        } else {
                          param2[var11] = field_A.toString().substring(var5, field_A.length());
                          var11++;
                          var5 = field_A.length();
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
                        StringBuilder discarded$12 = field_A.append(var14);
                        int discarded$13 = 22861;
                        var14 = (char)(rc.a((char) var14) & 255);
                        var4 = var4 + ((fa) this).field_z[var14];
                        if (((fa) this).field_t == null) {
                          break L15;
                        } else {
                          if (var10 == 0) {
                            break L15;
                          } else {
                            var4 = var4 + ((fa) this).field_t[(var10 << 8) + var14];
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
                      var6 = field_A.length();
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
                        stackOut_65_1 = (int[]) param1;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        stackIn_66_0 = stackOut_65_0;
                        stackIn_66_1 = stackOut_65_1;
                        if (var11 >= param1.length) {
                          stackOut_67_0 = stackIn_67_0;
                          stackOut_67_1 = (int[]) (Object) stackIn_67_1;
                          stackOut_67_2 = param1.length - 1;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          break L18;
                        } else {
                          stackOut_66_0 = stackIn_66_0;
                          stackOut_66_1 = (int[]) (Object) stackIn_66_1;
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
                          param2[var11] = field_A.toString().substring(var5, var6 - var8);
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
                    var6 = field_A.length();
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

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final void b(String param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        int var7 = param0.length();
        int[] var8 = new int[var7];
        int[] var9 = new int[var7];
        for (var10 = 0; var10 < var7; var10++) {
            var8[var10] = (int)(Math.sin((double)var10 / 5.0 + (double)param5 / 5.0) * 5.0);
            var9[var10] = (int)(Math.sin((double)var10 / 3.0 + (double)param5 / 5.0) * 5.0);
        }
        this.a(param0, param1 - ((fa) this).b(param0) / 2, param2, var8, var9);
    }

    private final void b(String param0, int param1) {
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
                field_F = (param1 - ((fa) this).b(param0) << 8) / var3;
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

    final int a(String param0, int param1) {
        return ((fa) this).a(param0, new int[1], field_w);
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return ((fa) this).a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    private final void a(byte[] param0) {
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
        int[] var18 = null;
        byte[][] var19 = null;
        byte[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        byte[][] var23 = null;
        byte[][] var24 = null;
        int[] var25 = null;
        L0: {
          ((fa) this).field_z = new int[256];
          if (param0.length != 257) {
            var2 = 0;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 256) {
                var22 = new int[256];
                var18 = var22;
                var14 = var18;
                var10 = var14;
                var3 = var10;
                var25 = new int[256];
                var21 = var25;
                var17 = var21;
                var13 = var17;
                var4 = var13;
                var5_int = 0;
                L2: while (true) {
                  if (var5_int >= 256) {
                    var5_int = 0;
                    L3: while (true) {
                      if (var5_int >= 256) {
                        var23 = new byte[256][];
                        var19 = var23;
                        var15 = var19;
                        var11 = var15;
                        var5 = var11;
                        var6_int = 0;
                        L4: while (true) {
                          if (var6_int >= 256) {
                            var24 = new byte[256][];
                            var20 = var24;
                            var16 = var20;
                            var12 = var16;
                            var6 = var12;
                            var7 = 0;
                            L5: while (true) {
                              if (var7 >= 256) {
                                ((fa) this).field_t = new byte[65536];
                                var7 = 0;
                                L6: while (true) {
                                  if (var7 >= 256) {
                                    ((fa) this).field_N = var25[32] + var22[32];
                                    break L0;
                                  } else {
                                    if (var7 != 32) {
                                      if (var7 != 160) {
                                        var8 = 0;
                                        L7: while (true) {
                                          if (var8 < 256) {
                                            if (var8 != 32) {
                                              if (var8 != 160) {
                                                ((fa) this).field_t[(var7 << 8) + var8] = (byte)fa.a(var23, var24, var25, ((fa) this).field_z, var22, var7, var8);
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
                                var6[var7] = new byte[var22[var7]];
                                var8 = 0;
                                var9 = 0;
                                L8: while (true) {
                                  if (var9 >= var24[var7].length) {
                                    var7++;
                                    continue L5;
                                  } else {
                                    int incrementValue$5 = var2;
                                    var2++;
                                    var8 = (byte)(var8 + param0[incrementValue$5]);
                                    var24[var7][var9] = (byte)var8;
                                    var9++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                          } else {
                            var5[var6_int] = new byte[var22[var6_int]];
                            var7 = 0;
                            var8 = 0;
                            L9: while (true) {
                              if (var8 >= var23[var6_int].length) {
                                var6_int++;
                                continue L4;
                              } else {
                                int incrementValue$6 = var2;
                                var2++;
                                var7 = (byte)(var7 + param0[incrementValue$6]);
                                var23[var6_int][var8] = (byte)var7;
                                var8++;
                                continue L9;
                              }
                            }
                          }
                        }
                      } else {
                        int incrementValue$7 = var2;
                        var2++;
                        var4[var5_int] = param0[incrementValue$7] & 255;
                        var5_int++;
                        continue L3;
                      }
                    }
                  } else {
                    int incrementValue$8 = var2;
                    var2++;
                    var3[var5_int] = param0[incrementValue$8] & 255;
                    var5_int++;
                    continue L2;
                  }
                }
              } else {
                int incrementValue$9 = var2;
                var2++;
                ((fa) this).field_z[var3_int] = param0[incrementValue$9] & 255;
                var3_int++;
                continue L1;
              }
            }
          } else {
            var2 = 0;
            L10: while (true) {
              if (var2 >= ((fa) this).field_z.length) {
                ((fa) this).field_N = param0[256] & 255;
                break L0;
              } else {
                ((fa) this).field_z[var2] = param0[var2] & 255;
                var2++;
                continue L10;
              }
            }
          }
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.a(param0, param1, param2);
    }

    private final void a(int param0, int param1, int param2) {
        field_u = -1;
        field_J = -1;
        field_q = param1;
        field_x = param1;
        field_L = param0;
        field_E = param0;
        field_C = param2;
        field_s = param2;
        field_F = 0;
        field_r = 0;
    }

    fa(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ((fa) this).field_N = 0;
        ((fa) this).field_I = param1;
        ((fa) this).field_D = param2;
        ((fa) this).field_M = param3;
        ((fa) this).field_v = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 256) {
            ((fa) this).field_H = ((fa) this).field_N - var6;
            ((fa) this).field_K = var7 - ((fa) this).field_N;
            ((fa) this).field_y = ((fa) this).field_N - ((fa) this).field_D[88];
            return;
          } else {
            L1: {
              if (((fa) this).field_D[var8] >= var6) {
                break L1;
              } else {
                if (((fa) this).field_v[var8] == 0) {
                  break L1;
                } else {
                  var6 = ((fa) this).field_D[var8];
                  break L1;
                }
              }
            }
            if (((fa) this).field_D[var8] + ((fa) this).field_v[var8] > var7) {
              var7 = ((fa) this).field_D[var8] + ((fa) this).field_v[var8];
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new StringBuilder(100);
        field_r = 0;
        field_E = 0;
        field_C = 256;
        field_u = -1;
        field_x = -1;
        field_w = new String[100];
        field_F = 0;
        field_s = 256;
        field_L = 0;
        field_J = -1;
        field_q = -1;
    }
}
