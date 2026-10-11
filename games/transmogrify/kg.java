/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kg extends ri {
    private byte[] field_p;
    private int[] field_x;
    private k[] field_A;
    int field_y;
    private static StringBuilder field_E;
    private int[] field_z;
    private int[] field_G;
    int field_D;
    private static int field_m;
    private int[] field_o;
    private static int field_n;
    int field_C;
    int field_t;
    private static int field_l;
    private static int field_w;
    private static int field_I;
    private static int field_u;
    private static int field_F;
    private static int field_q;
    private static int field_v;
    private static String[] field_s;
    private static int field_H;
    private int[] field_r;
    private int[] field_B;

    private final void b(String param0) {
        Throwable decompiledCaughtException = null;
        Exception var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        try {
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
                                    if (param0.equals("br")) {
                                      this.a(field_q, field_v, field_u);
                                    }
                                  } else {
                                    field_n = field_v;
                                  }
                                } else {
                                  field_n = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) param0.substring(5));
                                field_n = ej.a(-1, 16, var7);
                              }
                            } else {
                              field_m = -1;
                            }
                          } else {
                            field_m = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) param0.substring(2));
                          field_m = ej.a(-1, 16, var6);
                        }
                      } else {
                        field_w = -1;
                      }
                    } else {
                      field_w = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) param0.substring(4));
                    field_w = ej.a(-1, 16, var5);
                  }
                } else {
                  field_H = field_u;
                }
              } else {
                var4 = (CharSequence) ((Object) param0.substring(6));
                field_H = aa.a(-121, var4);
              }
            } else {
              field_F = field_q;
            }
          } else {
            var3 = (CharSequence) ((Object) param0.substring(4));
            field_F = ej.a(-1, 16, var3);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    private final static int a(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
        int var18 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        byte[] var14;
        byte[] var15;
        int var16;
        int var17;
        int var19;
        var7 = param2[param5];
        var8 = var7 + param4[param5];
        var9 = param2[param6];
        var10 = var9 + param4[param6];
        var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        var13 = param3[param5];
        if (param3[param6] < var13) {
          var13 = param3[param6];
        }
        var14 = param1[param5];
        var15 = param0[param6];
        var16 = var11 - var7;
        var17 = var11 - var9;
        for (var18 = var11; var18 < var12; var18++) {
          incrementValue$6 = var16;
          var16++;
          incrementValue$7 = var17;
          var17++;
          var19 = var14[incrementValue$6] + var15[incrementValue$7];
          if (var19 < var13) {
            var13 = var19;
          }
        }
        return -var13;
    }

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
          param2 = this.field_C;
        }
        int var4 = this.a(param0, new int[]{param1}, field_s);
        int var5 = (var4 - 1) * param2;
        return this.field_y + var5 + this.field_t;
    }

    final void a(char param0, int param1, int param2, int param3) {
        int var5 = 0;
        if (param0 != 32) {
          param2 = param2 - this.field_C;
          var5 = de.a(126, param0) & 255;
          this.a(var5, param1 + this.field_o[var5], param2 + this.field_G[var5], this.field_r[var5], this.field_z[var5], param3, false);
        }
    }

    private final void a(String param0, int param1) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        for (var6 = 0; var6 < var5; var6++) {
          var7 = param0.charAt(var6);
          if (var7 != 60) {
            if (var7 != 62) {
              if (var4 == 0 &&
                var7 == 32) {
                var3++;
              }
            } else {
              var4 = 0;
            }
          } else {
            var4 = 1;
          }
        }
        if (var3 > 0) {
          field_l = (param1 - this.a(param0) << 8) / var3;
        }
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.b(param3, param4);
        this.b(param0, param1 - this.a(param0) / 2, param2);
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final int a(char param0) {
        return this.field_x[de.a(69, param0) & 255];
    }

    final int a(String param0, int[] param1, String[] param2) {
        int var13 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int stackIn_69_0 = 0;
        int[] stackIn_69_1 = null;
        int stackIn_70_2 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        String var15 = null;
        int var16_int = 0;
        Exception var16 = null;
        Object var17 = null;
        CharSequence var18 = null;
        var17 = null;
        if (param0 == null) {
          return 0;
        }
        ub.a(field_E, 117, ' ', 0);
        var4 = 0;
        var5 = 0;
        var6 = -1;
        var7 = 0;
        var8 = 0;
        var9 = -1;
        var10 = 0;
        var11 = 0;
        var12 = param0.length();
        for (var13 = 0; var13 < var12; var13++) {
          var14 = param0.charAt(var13);
          if (var14 != 60) {
            if (var14 == 62 &&
              var9 != -1) {
              var15 = param0.substring(var9 + 1, var13).toLowerCase();
              var9 = -1;
              discarded$0 = field_E.append('<');
              discarded$1 = field_E.append(var15);
              discarded$2 = field_E.append('>');
              if (!var15.equals("br")) {
                if (!var15.equals("lt")) {
                  if (!var15.equals("gt")) {
                    if (!var15.equals("nbsp")) {
                      if (!var15.equals("shy")) {
                        if (!var15.equals("times")) {
                          if (!var15.equals("euro")) {
                            if (!var15.equals("copy")) {
                              if (!var15.equals("reg")) {
                                if (var15.startsWith("img=")) {
                                  try {
                                    var18 = (CharSequence) ((Object) var15.substring(4));
                                    var16_int = aa.a(110, var18);
                                    var4 = var4 + this.field_A[var16_int].field_d;
                                    var10 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                              } else {
                                var4 = var4 + this.a('®');
                                if (this.field_p != null &&
                                  var10 != 0) {
                                  var4 = var4 + this.field_p[(var10 << 8) + 174];
                                }
                                var10 = 174;
                              }
                            } else {
                              var4 = var4 + this.a('©');
                              if (this.field_p != null &&
                                var10 != 0) {
                                var4 = var4 + this.field_p[(var10 << 8) + 169];
                              }
                              var10 = 169;
                            }
                          } else {
                            var4 = var4 + this.a('€');
                            if (this.field_p != null &&
                              var10 != 0) {
                              var4 = var4 + this.field_p[(var10 << 8) + 128];
                            }
                            var10 = 8364;
                          }
                        } else {
                          var4 = var4 + this.a('×');
                          if (this.field_p != null &&
                            var10 != 0) {
                            var4 = var4 + this.field_p[(var10 << 8) + 215];
                          }
                          var10 = 215;
                        }
                      } else {
                        var4 = var4 + this.a('­');
                        if (this.field_p != null &&
                          var10 != 0) {
                          var4 = var4 + this.field_p[(var10 << 8) + 173];
                        }
                        var10 = 173;
                      }
                    } else {
                      var4 = var4 + this.a(' ');
                      if (this.field_p != null &&
                        var10 != 0) {
                        var4 = var4 + this.field_p[(var10 << 8) + 160];
                      }
                      var10 = 160;
                    }
                  } else {
                    var4 = var4 + this.a('>');
                    if (this.field_p != null &&
                      var10 != 0) {
                      var4 = var4 + this.field_p[(var10 << 8) + 62];
                    }
                    var10 = 62;
                  }
                } else {
                  var4 = var4 + this.a('<');
                  if (this.field_p != null &&
                    var10 != 0) {
                    var4 = var4 + this.field_p[(var10 << 8) + 60];
                  }
                  var10 = 60;
                }
              } else {
                param2[var11] = field_E.toString().substring(var5, field_E.length());
                var11++;
                var5 = field_E.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = field_E.append((char) var14);
                var14 = (char)(de.a(6, (char) var14) & 255);
                var4 = var4 + this.field_x[var14];
                if (this.field_p != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_p[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = field_E.length();
                var7 = var4;
                var8 = 1;
              }
              if (param1 != null) {
                stackIn_69_0 = var4;
                stackIn_69_1 = (int[]) (param1);
                if (var11 >= param1.length) {
                  stackIn_70_2 = param1.length - 1;
                } else {
                  stackIn_70_2 = var11;
                }
                if (stackIn_69_0 > stackIn_69_1[stackIn_70_2] &&
                  var6 >= 0) {
                  param2[var11] = field_E.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = field_E.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (field_E.length() > var5) {
          param2[var11] = field_E.toString().substring(var5, field_E.length());
          var11++;
        }
        return var11;
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.b(param3, param4);
        this.b(param0, param1 - this.a(param0), param2);
    }

    final void a(String param0, int param1, int param2, int[] param3, int[] param4) {
        int var10 = 0;
        int stackIn_33_0 = 0;
        Throwable decompiledCaughtException = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        String var12_ref_String = null;
        int var12 = 0;
        int var13 = 0;
        Exception var13_ref_Exception = null;
        int var14 = 0;
        int var15 = 0;
        k var16_ref_k = null;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        CharSequence var19 = null;
        var18 = null;
        param2 = param2 - this.field_C;
        var6 = -1;
        var7 = 0;
        var8 = 0;
        var9 = param0.length();
        for (var10 = 0; var10 < var9; var10++) {
          boolean decompiledFrameRemainder0 = true;
          var11 = param0.charAt(var10);
          if (var11 != 60) {
            if (var11 == 62 &&
              var6 != -1) {
              var12_ref_String = param0.substring(var6 + 1, var10).toLowerCase();
              var6 = -1;
              if (!var12_ref_String.equals("lt")) {
                if (!var12_ref_String.equals("gt")) {
                  if (!var12_ref_String.equals("nbsp")) {
                    if (!var12_ref_String.equals("shy")) {
                      if (!var12_ref_String.equals("times")) {
                        if (!var12_ref_String.equals("euro")) {
                          if (!var12_ref_String.equals("copy")) {
                            if (!var12_ref_String.equals("reg")) {
                              if (!var12_ref_String.startsWith("img=")) {
                                this.b(var12_ref_String);
                              } else {
                                try {
                                  if (param3 == null) {
                                    var13 = 0;
                                  } else {
                                    var13 = param3[var8];
                                  }
                                  if (param4 == null) {
                                    var14 = 0;
                                  } else {
                                    var14 = param4[var8];
                                  }
                                  var8++;
                                  var19 = (CharSequence) ((Object) var12_ref_String.substring(4));
                                  var15 = aa.a(-109, var19);
                                  var16_ref_k = this.field_A[var15];
                                  if (this.field_B == null) {
                                    stackIn_33_0 = var16_ref_k.field_h;
                                  } else {
                                    stackIn_33_0 = this.field_B[var15];
                                  }
                                  var17 = stackIn_33_0;
                                  if (field_H != 256) {
                                    var16_ref_k.a(param1 + var13, param2 + this.field_C - var17 + var14, field_H);
                                  } else {
                                    var16_ref_k.a(param1 + var13, param2 + this.field_C - var17 + var14);
                                  }
                                  param1 = param1 + var16_ref_k.field_d;
                                  var7 = 0;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var13_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                }
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              var11 = 174;
                            }
                          } else {
                            var11 = 169;
                          }
                        } else {
                          var11 = 8364;
                        }
                      } else {
                        var11 = 215;
                      }
                    } else {
                      var11 = 173;
                    }
                  } else {
                    var11 = 160;
                  }
                } else {
                  var11 = 62;
                }
              } else {
                var11 = 60;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var6 == -1)) {
              var11 = (char)(de.a(32, (char) var11) & 255);
              if (this.field_p != null &&
                var7 != 0) {
                param1 = param1 + this.field_p[(var7 << 8) + var11];
              }
              var12 = this.field_r[var11];
              var13 = this.field_z[var11];
              if (param3 == null) {
                var14 = 0;
              } else {
                var14 = param3[var8];
              }
              if (param4 == null) {
                var15 = 0;
              } else {
                var15 = param4[var8];
              }
              var8++;
              if (var11 == 32) {
                if (field_l > 0) {
                  field_I = field_I + field_l;
                  param1 = param1 + (field_I >> 8);
                  field_I = field_I & 255;
                }
              } else {
                if (field_H != 256) {
                  if (field_n != -1) {
                    this.a(var11, param1 + this.field_o[var11] + 1 + var14, param2 + this.field_G[var11] + 1 + var15, var12, var13, field_n, field_H, true);
                  }
                  this.a(var11, param1 + this.field_o[var11] + var14, param2 + this.field_G[var11] + var15, var12, var13, field_F, field_H, false);
                } else {
                  if (field_n != -1) {
                    this.a(var11, param1 + this.field_o[var11] + 1 + var14, param2 + this.field_G[var11] + 1 + var15, var12, var13, field_n, true);
                  }
                  this.a(var11, param1 + this.field_o[var11] + var14, param2 + this.field_G[var11] + var15, var12, var13, field_F, false);
                }
              }
              var16 = this.field_x[var11];
              if (field_w != -1) {
                sb.d(param1, param2 + (int)((double)this.field_C * 0.7), var16, field_w);
              }
              if (field_m != -1) {
                sb.d(param1, param2 + this.field_C, var16, field_m);
              }
              param1 = param1 + var16;
              var7 = var11;
            }
          } else {
            var6 = var10;
          }
        }
    }

    private final void b(String param0, int param1, int param2) {
        int var7 = 0;
        int stackIn_27_0 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        Exception var10_ref_Exception = null;
        k var11_ref_k = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        param2 = param2 - this.field_C;
        var4 = -1;
        var5 = 0;
        var6 = param0.length();
        for (var7 = 0; var7 < var6; var7++) {
          boolean decompiledFrameRemainder0 = true;
          var8 = param0.charAt(var7);
          if (var8 != 60) {
            if (var8 == 62 &&
              var4 != -1) {
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
                                this.b(var9_ref_String);
                              } else {
                                try {
                                  var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                                  var10 = aa.a(-117, var13);
                                  var11_ref_k = this.field_A[var10];
                                  if (this.field_B == null) {
                                    stackIn_27_0 = var11_ref_k.field_h;
                                  } else {
                                    stackIn_27_0 = this.field_B[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (field_H != 256) {
                                    var11_ref_k.a(param1, param2 + this.field_C - var12, field_H);
                                  } else {
                                    var11_ref_k.a(param1, param2 + this.field_C - var12);
                                  }
                                  param1 = param1 + var11_ref_k.field_d;
                                  var5 = 0;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                                }
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              var8 = 174;
                            }
                          } else {
                            var8 = 169;
                          }
                        } else {
                          var8 = 8364;
                        }
                      } else {
                        var8 = 215;
                      }
                    } else {
                      var8 = 173;
                    }
                  } else {
                    var8 = 160;
                  }
                } else {
                  var8 = 62;
                }
              } else {
                var8 = 60;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var4 == -1)) {
              var8 = (char)(de.a(73, (char) var8) & 255);
              if (this.field_p != null &&
                var5 != 0) {
                param1 = param1 + this.field_p[(var5 << 8) + var8];
              }
              var9 = this.field_r[var8];
              var10 = this.field_z[var8];
              var11 = param1;
              if (var8 == 32) {
                if (field_l > 0) {
                  field_I = field_I + field_l;
                  param1 = param1 + (field_I >> 8);
                  field_I = field_I & 255;
                }
              } else {
                if (field_H != 256) {
                  if (field_n != -1) {
                    this.a(var8, param1 + this.field_o[var8] + 1, param2 + this.field_G[var8] + 1, var9, var10, field_n, field_H, true);
                  }
                  this.a(var8, param1 + this.field_o[var8], param2 + this.field_G[var8], var9, var10, field_F, field_H, false);
                } else {
                  if (field_n != -1) {
                    this.a(var8, param1 + this.field_o[var8] + 1, param2 + this.field_G[var8] + 1, var9, var10, field_n, true);
                  }
                  this.a(var8, param1 + this.field_o[var8], param2 + this.field_G[var8], var9, var10, field_F, false);
                }
              }
              param1 = param1 + this.field_x[var8];
              if (field_w != -1) {
                sb.d(var11, param2 + (int)((double)this.field_C * 0.7), param1 - var11, field_w);
              }
              if (field_m != -1) {
                sb.d(var11, param2 + this.field_C + 1, param1 - var11, field_m);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var12;
        int var13;
        int var14;
        int var15;
        int var15Lifetime1;
        if (param0 == null) {
          return 0;
        }
        this.a(param5, param6, param7);
        if (param10 == 0) {
          param10 = this.field_C;
        }
        var12 = new int[]{param3};
        if (param4 < this.field_y + this.field_t + param10 &&
          param4 < param10 + param10) {
          var12 = null;
        }
        var13 = this.a(param0, var12, field_s);
        if (param9 == 3 &&
          var13 == 1) {
          param9 = 1;
        }
        if (param9 != 0) {
          if (param9 != 1) {
            if (param9 != 2) {
              var15 = (param4 - this.field_y - this.field_t - (var13 - 1) * param10) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = param2 + this.field_y + var15;
              param10 = param10 + var15;
            } else {
              var14 = param2 + param4 - this.field_t - (var13 - 1) * param10;
            }
          } else {
            var14 = param2 + this.field_y + (param4 - this.field_y - this.field_t - (var13 - 1) * param10) / 2;
          }
        } else {
          var14 = param2 + this.field_y;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (param8 != 0) {
            if (param8 != 1) {
              if (param8 != 2) {
                if (var15Lifetime1 != var13 - 1) {
                  this.a(field_s[var15Lifetime1], param3);
                  this.b(field_s[var15Lifetime1], param1, var14);
                  field_l = 0;
                } else {
                  this.b(field_s[var15Lifetime1], param1, var14);
                }
                var14 = var14 + param10;
              } else {
                this.b(field_s[var15Lifetime1], param1 + param3 - this.a(field_s[var15Lifetime1]), var14);
                var14 = var14 + param10;
              }
            } else {
              this.b(field_s[var15Lifetime1], param1 + (param3 - this.a(field_s[var15Lifetime1])) / 2, var14);
              var14 = var14 + param10;
            }
          } else {
            this.b(field_s[var15Lifetime1], param1, var14);
            var14 = var14 + param10;
          }
        }
        return var13;
    }

    final void b(int param0, int param1) {
        field_w = -1;
        field_m = -1;
        field_v = param1;
        field_n = param1;
        field_q = param0;
        field_F = param0;
        field_u = 256;
        field_H = 256;
        field_l = 0;
        field_I = 0;
    }

    private final void a(int param0, int param1, int param2) {
        field_w = -1;
        field_m = -1;
        field_v = param1;
        field_n = param1;
        field_q = param0;
        field_F = param0;
        field_u = param2;
        field_H = param2;
        field_l = 0;
        field_I = 0;
    }

    final void a(k[] param0, int[] param1) {
        if (param1 != null &&
          param1.length != param0.length) {
          throw new IllegalArgumentException();
        }
        this.field_A = param0;
        this.field_B = param1;
    }

    final int b(String param0, int param1) {
        return this.a(param0, new int[]{param1}, field_s);
    }

    public static void a() {
        field_E = null;
        field_s = null;
    }

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.b(param3, param4);
        this.b(param0, param1, param2);
    }

    final int a(String param0) {
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        String var8 = null;
        int var9_int = 0;
        Exception var9 = null;
        CharSequence var10 = null;
        if (param0 == null) {
          return 0;
        }
        var2 = -1;
        var3 = 0;
        var4 = 0;
        var5 = param0.length();
        for (var6 = 0; var6 < var5; var6++) {
          boolean decompiledFrameRemainder0 = true;
          var7 = param0.charAt(var6);
          if (var7 != 60) {
            if (var7 == 62 &&
              var2 != -1) {
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
                              if (!(!var8.startsWith("img="))) {
                                try {
                                  var10 = (CharSequence) ((Object) var8.substring(4));
                                  var9_int = aa.a(111, var10);
                                  var4 = var4 + this.field_A[var9_int].field_d;
                                  var3 = 0;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var9 = (Exception) (Object) decompiledCaughtException;
                                }
                              }
                              decompiledFrameRemainder0 = false;
                            }
                            else {
                              var7 = 174;
                            }
                          } else {
                            var7 = 169;
                          }
                        } else {
                          var7 = 8364;
                        }
                      } else {
                        var7 = 215;
                      }
                    } else {
                      var7 = 173;
                    }
                  } else {
                    var7 = 160;
                  }
                } else {
                  var7 = 62;
                }
              } else {
                var7 = 60;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (var2 == -1)) {
              var7 = (char)(de.a(53, (char) var7) & 255);
              var4 = var4 + this.field_x[var7];
              if (this.field_p != null &&
                var3 != 0) {
                var4 = var4 + this.field_p[(var3 << 8) + var7];
              }
              var3 = var7;
            }
          } else {
            var2 = var6;
          }
        }
        return var4;
    }

    private final void a(byte[] param0) {
        int var3_int = 0;
        int incrementValue$6 = 0;
        int incrementValue$5 = 0;
        int incrementValue$4 = 0;
        int var6_int = 0;
        byte[] array$2 = null;
        int incrementValue$3 = 0;
        byte[] array$0 = null;
        int var9 = 0;
        int incrementValue$1 = 0;
        int var2;
        int[] var3;
        int[] var4;
        int var5_int;
        byte[][] var5;
        byte[][] var6;
        int var7;
        int var8;
        int[] var10;
        byte[][] var11;
        byte[][] var12;
        int[] var13;
        int[] var14;
        byte[][] var15;
        byte[][] var16;
        int[] var17;
        int var5_intLifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        this.field_x = new int[256];
        if (param0.length == 257) {
          for (var2 = 0; var2 < this.field_x.length; var2++) {
            this.field_x[var2] = param0[var2] & 255;
          }
          this.field_C = param0[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.field_x[var3_int] = param0[incrementValue$6] & 255;
          }
          var14 = new int[256];
          var10 = var14;
          var3 = var10;
          var17 = new int[256];
          var13 = var17;
          var4 = var13;
          for (var5_int = 0; var5_int < 256; var5_int++) {
            incrementValue$5 = var2;
            var2++;
            var3[var5_int] = param0[incrementValue$5] & 255;
          }
          for (var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = param0[incrementValue$4] & 255;
          }
          var15 = new byte[256][];
          var11 = var15;
          var5 = var11;
          for (var6_int = 0; var6_int < 256; var6_int++) {
            array$2 = new byte[var14[var6_int]];
            var5[var6_int] = array$2;
            var7 = 0;
            for (var8 = 0; var8 < var15[var6_int].length; var8++) {
              incrementValue$3 = var2;
              var2++;
              var7 = (byte)(var7 + param0[incrementValue$3]);
              var15[var6_int][var8] = (byte)var7;
            }
          }
          var16 = new byte[256][];
          var12 = var16;
          var6 = var12;
          for (var7Lifetime1 = 0; var7Lifetime1 < 256; var7Lifetime1++) {
            array$0 = new byte[var14[var7Lifetime1]];
            var6[var7Lifetime1] = array$0;
            var8Lifetime1 = 0;
            for (var9 = 0; var9 < var16[var7Lifetime1].length; var9++) {
              incrementValue$1 = var2;
              var2++;
              var8Lifetime1 = (byte)(var8Lifetime1 + param0[incrementValue$1]);
              var16[var7Lifetime1][var9] = (byte)var8Lifetime1;
            }
          }
          this.field_p = new byte[65536];
          for (var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.field_p[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)kg.a(var15, var16, var17, this.field_x, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.field_C = var17[32] + var14[32];
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    kg(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var8 = 0;
        int var6;
        int var7;
        this.field_C = 0;
        this.field_o = param1;
        this.field_G = param2;
        this.field_r = param3;
        this.field_z = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
          if (this.field_G[var8] < var6 &&
            this.field_z[var8] != 0) {
            var6 = this.field_G[var8];
          }
          if (this.field_G[var8] + this.field_z[var8] > var7) {
            var7 = this.field_G[var8] + this.field_z[var8];
          }
        }
        this.field_y = this.field_C - var6;
        this.field_t = var7 - this.field_C;
        this.field_D = this.field_C - this.field_G[88];
    }

    static {
        field_E = new StringBuilder(100);
        field_w = -1;
        field_F = 0;
        field_l = 0;
        field_u = 256;
        field_v = -1;
        field_n = -1;
        field_s = new String[100];
        field_I = 0;
        field_m = -1;
        field_q = 0;
        field_H = 256;
    }
}
