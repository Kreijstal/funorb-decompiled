/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class po extends eo {
    private int[] field_o;
    private byte[] field_s;
    int field_B;
    int field_F;
    int field_u;
    private int[] field_r;
    private int[] field_E;
    private int[] field_n;
    private int[] field_C;
    private th[] field_K;
    int field_v;
    private static StringBuilder field_A;
    private int[] field_y;
    private static int field_x;
    private static int field_D;
    private static int field_I;
    private static int field_H;
    private static int field_z;
    private static int field_q;
    private static int field_w;
    private static String[] field_p;
    private static int field_t;
    private static int field_G;
    private static int field_J;

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
            param2 = ((po) this).field_F;
        }
        int var4 = ((po) this).a(param0, new int[1], field_p);
        int var5 = (var4 - 1) * param2;
        return ((po) this).field_u + var5 + ((po) this).field_B;
    }

    final int b(String param0, int param1) {
        return ((po) this).a(param0, new int[1], field_p);
    }

    private final void b(String param0) {
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
                                          this.a(field_t, field_z, field_w);
                                          break L1;
                                        }
                                      } else {
                                        field_D = field_z;
                                        break L1;
                                      }
                                    } else {
                                      field_D = 0;
                                      break L1;
                                    }
                                  } else {
                                    var7 = (CharSequence) (Object) param0.substring(5);
                                    field_D = en.a(16, var7, -63);
                                    break L1;
                                  }
                                } else {
                                  field_H = -1;
                                  break L1;
                                }
                              } else {
                                field_H = 0;
                                break L1;
                              }
                            } else {
                              var6 = (CharSequence) (Object) param0.substring(2);
                              field_H = en.a(16, var6, 98);
                              break L1;
                            }
                          } else {
                            field_J = -1;
                            break L1;
                          }
                        } else {
                          field_J = 8388608;
                          break L1;
                        }
                      } else {
                        var5 = (CharSequence) (Object) param0.substring(4);
                        field_J = en.a(16, var5, 121);
                        break L1;
                      }
                    } else {
                      field_G = field_w;
                      break L1;
                    }
                  } else {
                    var4 = (CharSequence) (Object) param0.substring(6);
                    field_G = pd.a((byte) 47, var4);
                    break L1;
                  }
                } else {
                  field_I = field_t;
                  break L1;
                }
              } else {
                var3 = (CharSequence) (Object) param0.substring(4);
                field_I = en.a(16, var3, -8);
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

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return ((po) this).a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - ((po) this).a(param0) / 2, param2);
    }

    public static void a() {
        field_A = null;
        field_p = null;
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
        th var11_ref_th = null;
        int var12 = 0;
        CharSequence var13 = null;
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        param2 = param2 - ((po) this).field_F;
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
                                      this.b(var9_ref_String);
                                      var7++;
                                      continue L0;
                                    } else {
                                      try {
                                        L2: {
                                          L3: {
                                            var13 = (CharSequence) (Object) var9_ref_String.substring(4);
                                            var10 = pd.a((byte) 47, var13);
                                            var11_ref_th = ((po) this).field_K[var10];
                                            if (((po) this).field_n == null) {
                                              stackOut_25_0 = var11_ref_th.field_b;
                                              stackIn_26_0 = stackOut_25_0;
                                              break L3;
                                            } else {
                                              stackOut_24_0 = ((po) this).field_n[var10];
                                              stackIn_26_0 = stackOut_24_0;
                                              break L3;
                                            }
                                          }
                                          L4: {
                                            var12 = stackIn_26_0;
                                            if (field_G != 256) {
                                              var11_ref_th.a(param1, param2 + ((po) this).field_F - var12, field_G);
                                              break L4;
                                            } else {
                                              var11_ref_th.a(param1, param2 + ((po) this).field_F - var12);
                                              break L4;
                                            }
                                          }
                                          param1 = param1 + var11_ref_th.field_a;
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
                  var8 = (char)(aca.a((char) var8, 8220) & 255);
                  if (((po) this).field_s == null) {
                    break L6;
                  } else {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      param1 = param1 + ((po) this).field_s[(var5 << 8) + var8];
                      break L6;
                    }
                  }
                }
                L7: {
                  var9 = ((po) this).field_E[var8];
                  var10 = ((po) this).field_C[var8];
                  var11 = param1;
                  if (var8 == 32) {
                    if (field_x <= 0) {
                      break L7;
                    } else {
                      field_q = field_q + field_x;
                      param1 = param1 + (field_q >> 8);
                      field_q = field_q & 255;
                      break L7;
                    }
                  } else {
                    if (field_G != 256) {
                      L8: {
                        if (field_D == -1) {
                          break L8;
                        } else {
                          ((po) this).a(var8, param1 + ((po) this).field_r[var8] + 1, param2 + ((po) this).field_y[var8] + 1, var9, var10, field_D, field_G, true);
                          break L8;
                        }
                      }
                      ((po) this).a(var8, param1 + ((po) this).field_r[var8], param2 + ((po) this).field_y[var8], var9, var10, field_I, field_G, false);
                      break L7;
                    } else {
                      L9: {
                        if (field_D == -1) {
                          break L9;
                        } else {
                          ((po) this).a(var8, param1 + ((po) this).field_r[var8] + 1, param2 + ((po) this).field_y[var8] + 1, var9, var10, field_D, true);
                          break L9;
                        }
                      }
                      ((po) this).a(var8, param1 + ((po) this).field_r[var8], param2 + ((po) this).field_y[var8], var9, var10, field_I, false);
                      break L7;
                    }
                  }
                }
                L10: {
                  param1 = param1 + ((po) this).field_o[var8];
                  if (field_J == -1) {
                    break L10;
                  } else {
                    dg.e(var11, param2 + (int)((double)((po) this).field_F * 0.7), param1 - var11, field_J);
                    break L10;
                  }
                }
                L11: {
                  if (field_H == -1) {
                    break L11;
                  } else {
                    dg.e(var11, param2 + ((po) this).field_F + 1, param1 - var11, field_H);
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

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1, param2);
    }

    final static String a(po param0, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0.a(param1) > param2) {
          var3 = param0.a("...");
          var4 = param2 - var3;
          var5 = 0;
          var6 = 0;
          L0: while (true) {
            if (var6 < param1.length()) {
              var7 = param0.a(param1.charAt(var6));
              if (var5 + var7 <= var4) {
                var5 = var5 + var7;
                var6++;
                continue L0;
              } else {
                return param1.substring(0, var6 - 1) + "...";
              }
            } else {
              return null;
            }
          }
        } else {
          return param1;
        }
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
          ((po) this).field_o = new int[256];
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
                                ((po) this).field_s = new byte[65536];
                                var7 = 0;
                                L6: while (true) {
                                  if (var7 >= 256) {
                                    ((po) this).field_F = var25[32] + var22[32];
                                    break L0;
                                  } else {
                                    if (var7 != 32) {
                                      if (var7 != 160) {
                                        var8 = 0;
                                        L7: while (true) {
                                          if (var8 < 256) {
                                            if (var8 != 32) {
                                              if (var8 != 160) {
                                                ((po) this).field_s[(var7 << 8) + var8] = (byte)po.a(var23, var24, var25, ((po) this).field_o, var22, var7, var8);
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
                ((po) this).field_o[var3_int] = param0[incrementValue$9] & 255;
                var3_int++;
                continue L1;
              }
            }
          } else {
            var2 = 0;
            L10: while (true) {
              if (var2 >= ((po) this).field_o.length) {
                ((po) this).field_F = param0[256] & 255;
                break L0;
              } else {
                ((po) this).field_o[var2] = param0[var2] & 255;
                var2++;
                continue L10;
              }
            }
          }
        }
    }

    private final void a(String param0, int param1) {
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
                field_x = (param1 - ((po) this).a(param0) << 8) / var3;
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

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - ((po) this).a(param0) / 2, param2);
    }

    final void b(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1, param2);
    }

    private final void a(int param0, int param1) {
        field_J = -1;
        field_H = -1;
        field_z = param1;
        field_D = param1;
        field_t = param0;
        field_I = param0;
        field_w = 256;
        field_G = 256;
        field_x = 0;
        field_q = 0;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - ((po) this).a(param0), param2);
    }

    final int c(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = ((po) this).a(param0, new int[1], field_p);
        var4 = 0;
        var5 = 0;
        L0: while (true) {
          if (var5 >= var3) {
            return var4;
          } else {
            var6 = ((po) this).a(field_p[var5]);
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

    private final void a(int param0, int param1, int param2) {
        field_J = -1;
        field_H = -1;
        field_z = param1;
        field_D = param1;
        field_t = param0;
        field_I = param0;
        field_w = param2;
        field_G = param2;
        field_x = 0;
        field_q = 0;
    }

    final static String c(String param0) {
        int var1 = 0;
        int var2 = 0;
        int var3_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        int var5 = 0;
        var1 = param0.length();
        var2 = 0;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= var1) {
            var3 = new StringBuilder(var1 + var2);
            var4 = 0;
            L1: while (true) {
              if (var4 >= var1) {
                return var3.toString();
              } else {
                var5 = param0.charAt(var4);
                if (var5 != 60) {
                  if (var5 != 62) {
                    StringBuilder discarded$3 = var3.append((char) var5);
                    var4++;
                    continue L1;
                  } else {
                    StringBuilder discarded$4 = var3.append("<gt>");
                    var4++;
                    continue L1;
                  }
                } else {
                  StringBuilder discarded$5 = var3.append("<lt>");
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            var4 = param0.charAt(var3_int);
            if (var4 != 60) {
              if (var4 != 62) {
                var3_int++;
                continue L0;
              } else {
                var2 += 3;
                var3_int++;
                continue L0;
              }
            } else {
              var2 += 3;
              var3_int++;
              continue L0;
            }
          }
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
          int discarded$6 = 32;
          StringBuilder discarded$7 = sw.a(field_A, 4, 0);
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
                        StringBuilder discarded$8 = field_A.append('<');
                        StringBuilder discarded$9 = field_A.append(var15);
                        StringBuilder discarded$10 = field_A.append('>');
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
                                                var16_int = pd.a((byte) 47, var18);
                                                var4 = var4 + ((po) this).field_K[var16_int].field_a;
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
                                            var4 = var4 + ((po) this).a('®');
                                            if (((po) this).field_s == null) {
                                              break L6;
                                            } else {
                                              if (var10 == 0) {
                                                break L6;
                                              } else {
                                                var4 = var4 + ((po) this).field_s[(var10 << 8) + 174];
                                                break L6;
                                              }
                                            }
                                          }
                                          var10 = 174;
                                          break L3;
                                        }
                                      } else {
                                        L7: {
                                          var4 = var4 + ((po) this).a('©');
                                          if (((po) this).field_s == null) {
                                            break L7;
                                          } else {
                                            if (var10 == 0) {
                                              break L7;
                                            } else {
                                              var4 = var4 + ((po) this).field_s[(var10 << 8) + 169];
                                              break L7;
                                            }
                                          }
                                        }
                                        var10 = 169;
                                        break L3;
                                      }
                                    } else {
                                      L8: {
                                        var4 = var4 + ((po) this).a('€');
                                        if (((po) this).field_s == null) {
                                          break L8;
                                        } else {
                                          if (var10 == 0) {
                                            break L8;
                                          } else {
                                            var4 = var4 + ((po) this).field_s[(var10 << 8) + 128];
                                            break L8;
                                          }
                                        }
                                      }
                                      var10 = 8364;
                                      break L3;
                                    }
                                  } else {
                                    L9: {
                                      var4 = var4 + ((po) this).a('×');
                                      if (((po) this).field_s == null) {
                                        break L9;
                                      } else {
                                        if (var10 == 0) {
                                          break L9;
                                        } else {
                                          var4 = var4 + ((po) this).field_s[(var10 << 8) + 215];
                                          break L9;
                                        }
                                      }
                                    }
                                    var10 = 215;
                                    break L3;
                                  }
                                } else {
                                  L10: {
                                    var4 = var4 + ((po) this).a('­');
                                    if (((po) this).field_s == null) {
                                      break L10;
                                    } else {
                                      if (var10 == 0) {
                                        break L10;
                                      } else {
                                        var4 = var4 + ((po) this).field_s[(var10 << 8) + 173];
                                        break L10;
                                      }
                                    }
                                  }
                                  var10 = 173;
                                  break L3;
                                }
                              } else {
                                L11: {
                                  var4 = var4 + ((po) this).a(' ');
                                  if (((po) this).field_s == null) {
                                    break L11;
                                  } else {
                                    if (var10 == 0) {
                                      break L11;
                                    } else {
                                      var4 = var4 + ((po) this).field_s[(var10 << 8) + 160];
                                      break L11;
                                    }
                                  }
                                }
                                var10 = 160;
                                break L3;
                              }
                            } else {
                              L12: {
                                var4 = var4 + ((po) this).a('>');
                                if (((po) this).field_s == null) {
                                  break L12;
                                } else {
                                  if (var10 == 0) {
                                    break L12;
                                  } else {
                                    var4 = var4 + ((po) this).field_s[(var10 << 8) + 62];
                                    break L12;
                                  }
                                }
                              }
                              var10 = 62;
                              break L3;
                            }
                          } else {
                            L13: {
                              var4 = var4 + ((po) this).a('<');
                              if (((po) this).field_s == null) {
                                break L13;
                              } else {
                                if (var10 == 0) {
                                  break L13;
                                } else {
                                  var4 = var4 + ((po) this).field_s[(var10 << 8) + 60];
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
                        StringBuilder discarded$11 = field_A.append((char) var14);
                        var14 = (char)(aca.a((char) var14, 8220) & 255);
                        var4 = var4 + ((po) this).field_o[var14];
                        if (((po) this).field_s == null) {
                          break L15;
                        } else {
                          if (var10 == 0) {
                            break L15;
                          } else {
                            var4 = var4 + ((po) this).field_s[(var10 << 8) + var14];
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

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
            return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - ((po) this).a(param0), param2);
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
              param10 = ((po) this).field_F;
              break L0;
            }
          }
          L1: {
            var12 = new int[]{param3};
            if (param4 >= ((po) this).field_u + ((po) this).field_B + param10) {
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
            var13 = ((po) this).a(param0, var12, field_p);
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
                    var15 = (param4 - ((po) this).field_u - ((po) this).field_B - (var13 - 1) * param10) / (var13 + 1);
                    if (var15 >= 0) {
                      break L4;
                    } else {
                      var15 = 0;
                      break L4;
                    }
                  }
                  var14 = param2 + ((po) this).field_u + var15;
                  param10 = param10 + var15;
                  break L3;
                } else {
                  var14 = param2 + param4 - ((po) this).field_B - (var13 - 1) * param10;
                  break L3;
                }
              } else {
                var14 = param2 + ((po) this).field_u + (param4 - ((po) this).field_u - ((po) this).field_B - (var13 - 1) * param10) / 2;
                break L3;
              }
            } else {
              var14 = param2 + ((po) this).field_u;
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
                        this.a(field_p[var15], param3);
                        this.b(field_p[var15], param1, var14);
                        field_x = 0;
                        break L6;
                      } else {
                        this.b(field_p[var15], param1, var14);
                        break L6;
                      }
                    }
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  } else {
                    this.b(field_p[var15], param1 + param3 - ((po) this).a(field_p[var15]), var14);
                    var14 = var14 + param10;
                    var15++;
                    continue L5;
                  }
                } else {
                  this.b(field_p[var15], param1 + (param3 - ((po) this).a(field_p[var15])) / 2, var14);
                  var14 = var14 + param10;
                  var15++;
                  continue L5;
                }
              } else {
                this.b(field_p[var15], param1, var14);
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

    final int a(String param0) {
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
                                            var9_int = pd.a((byte) 47, var10);
                                            var4 = var4 + ((po) this).field_K[var9_int].field_a;
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
                    var7 = (char)(aca.a((char) var7, 8220) & 255);
                    var4 = var4 + ((po) this).field_o[var7];
                    if (((po) this).field_s == null) {
                      break L4;
                    } else {
                      if (var3 == 0) {
                        break L4;
                      } else {
                        var4 = var4 + ((po) this).field_s[(var3 << 8) + var7];
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

    final void a(th[] param0, int[] param1) {
        if (param1 != null) {
            if (param1.length != param0.length) {
                throw new IllegalArgumentException();
            }
        }
        ((po) this).field_K = param0;
        ((po) this).field_n = param1;
    }

    po(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ((po) this).field_F = 0;
        ((po) this).field_r = param1;
        ((po) this).field_y = param2;
        ((po) this).field_E = param3;
        ((po) this).field_C = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 256) {
            ((po) this).field_u = ((po) this).field_F - var6;
            ((po) this).field_B = var7 - ((po) this).field_F;
            ((po) this).field_v = ((po) this).field_F - ((po) this).field_y[88];
            return;
          } else {
            L1: {
              if (((po) this).field_y[var8] >= var6) {
                break L1;
              } else {
                if (((po) this).field_C[var8] == 0) {
                  break L1;
                } else {
                  var6 = ((po) this).field_y[var8];
                  break L1;
                }
              }
            }
            if (((po) this).field_y[var8] + ((po) this).field_C[var8] > var7) {
              var7 = ((po) this).field_y[var8] + ((po) this).field_C[var8];
              var8++;
              continue L0;
            } else {
              var8++;
              continue L0;
            }
          }
        }
    }

    final int a(char param0) {
        return ((po) this).field_o[aca.a(param0, 8220) & 255];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new StringBuilder(100);
        field_I = 0;
        field_H = -1;
        field_D = -1;
        field_q = 0;
        field_G = 256;
        field_z = -1;
        field_x = 0;
        field_w = 256;
        field_J = -1;
        field_t = 0;
        field_p = new String[100];
    }
}
