/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class il extends od {
    private rka[] field_l;
    private int[] field_I;
    private int[] field_u;
    private int[] field_C;
    private byte[] field_F;
    private static StringBuilder field_t;
    private int[] field_s;
    int field_k;
    private int[] field_B;
    private int[] field_n;
    int field_w;
    int field_G;
    int field_m;
    private static int field_v;
    private static int field_z;
    private static String[] field_H;
    private static int field_q;
    private static int field_r;
    private static int field_x;
    private static int field_D;
    private static int field_A;
    private static int field_y;
    private static int field_o;
    private static int field_p;

    final int b(String param0) {
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
                                  var9_int = jb.a(var10, (byte) 70);
                                  var4 = var4 + this.field_l[var9_int].field_c;
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
              var7 = (char)(io.a(-377, (char) var7) & 255);
              var4 = var4 + this.field_B[var7];
              if (this.field_F != null &&
                var3 != 0) {
                var4 = var4 + this.field_F[(var3 << 8) + var7];
              }
              var3 = var7;
            }
          } else {
            var2 = var6;
          }
        }
        return var4;
    }

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - this.b(param0) / 2, param2);
    }

    final static String c(String param0) {
        int var3_int = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var1;
        int var2;
        int var4;
        StringBuilder var3;
        int var5;
        int var4Lifetime1;
        var1 = param0.length();
        var2 = 0;
        for (var3_int = 0; var3_int < var1; var3_int++) {
          var4 = param0.charAt(var3_int);
          if (var4 != 60) {
            if (var4 == 62) {
              var2 += 3;
            }
          } else {
            var2 += 3;
          }
        }
        var3 = new StringBuilder(var1 + var2);
        for (var4Lifetime1 = 0; var4Lifetime1 < var1; var4Lifetime1++) {
          var5 = param0.charAt(var4Lifetime1);
          if (var5 != 60) {
            if (var5 != 62) {
              discarded$0 = var3.append((char) var5);
            } else {
              discarded$1 = var3.append("<gt>");
            }
          } else {
            discarded$2 = var3.append("<lt>");
          }
        }
        return var3.toString();
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4);
        this.b(param0, param1, param2);
    }

    final void b(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1, param2);
    }

    final int a(String param0, int param1) {
        return this.a(param0, new int[]{param1}, field_H);
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
        this.field_B = new int[256];
        if (param0.length == 257) {
          for (var2 = 0; var2 < this.field_B.length; var2++) {
            this.field_B[var2] = param0[var2] & 255;
          }
          this.field_m = param0[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.field_B[var3_int] = param0[incrementValue$6] & 255;
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
          this.field_F = new byte[65536];
          for (var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.field_F[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)il.a(var15, var16, var17, this.field_B, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.field_m = var17[32] + var14[32];
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

    private final void b(String param0, int param1) {
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
          field_y = (param1 - this.b(param0) << 8) / var3;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final int c(String param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var3 = this.a(param0, new int[]{param1}, field_H);
        var4 = 0;
        for (var5 = 0; var5 < var3; var5++) {
          var6 = this.b(field_H[var5]);
          if (var6 > var4) {
            var4 = var6;
          }
        }
        return var4;
    }

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - this.b(param0), param2);
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - this.b(param0), param2);
    }

    public static void a() {
        field_t = null;
        field_H = null;
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final int a(char param0) {
        return this.field_B[io.a(-377, param0) & 255];
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
        rka var11_ref_rka = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        param2 = param2 - this.field_m;
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
                                this.a(var9_ref_String);
                              } else {
                                try {
                                  var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                                  var10 = jb.a(var13, (byte) 70);
                                  var11_ref_rka = this.field_l[var10];
                                  if (this.field_I == null) {
                                    stackIn_27_0 = var11_ref_rka.field_f;
                                  } else {
                                    stackIn_27_0 = this.field_I[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (field_v != 256) {
                                    var11_ref_rka.a(param1, param2 + this.field_m - var12, field_v);
                                  } else {
                                    var11_ref_rka.b(param1, param2 + this.field_m - var12);
                                  }
                                  param1 = param1 + var11_ref_rka.field_c;
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
              var8 = (char)(io.a(-377, (char) var8) & 255);
              if (this.field_F != null &&
                var5 != 0) {
                param1 = param1 + this.field_F[(var5 << 8) + var8];
              }
              var9 = this.field_u[var8];
              var10 = this.field_C[var8];
              var11 = param1;
              if (var8 == 32) {
                if (field_y > 0) {
                  field_D = field_D + field_y;
                  param1 = param1 + (field_D >> 8);
                  field_D = field_D & 255;
                }
              } else {
                if (field_v != 256) {
                  if (field_p != -1) {
                    this.a(var8, param1 + this.field_n[var8] + 1, param2 + this.field_s[var8] + 1, var9, var10, field_p, field_v, true);
                  }
                  this.a(var8, param1 + this.field_n[var8], param2 + this.field_s[var8], var9, var10, field_x, field_v, false);
                } else {
                  if (field_p != -1) {
                    this.a(var8, param1 + this.field_n[var8] + 1, param2 + this.field_s[var8] + 1, var9, var10, field_p, true);
                  }
                  this.a(var8, param1 + this.field_n[var8], param2 + this.field_s[var8], var9, var10, field_x, false);
                }
              }
              param1 = param1 + this.field_B[var8];
              if (field_o != -1) {
                bea.c(var11, param2 + (int)((double)this.field_m * 0.7), param1 - var11, field_o);
              }
              if (field_q != -1) {
                bea.c(var11, param2 + this.field_m + 1, param1 - var11, field_q);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        field_o = -1;
        field_q = -1;
        field_A = param1;
        field_p = param1;
        field_z = param0;
        field_x = param0;
        field_r = param2;
        field_v = param2;
        field_y = 0;
        field_D = 0;
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
        ana.a(0, ' ', -11, field_t);
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
              discarded$0 = field_t.append('<');
              discarded$1 = field_t.append(var15);
              discarded$2 = field_t.append('>');
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
                                    var16_int = jb.a(var18, (byte) 70);
                                    var4 = var4 + this.field_l[var16_int].field_c;
                                    var10 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                              } else {
                                var4 = var4 + this.a('®');
                                if (this.field_F != null &&
                                  var10 != 0) {
                                  var4 = var4 + this.field_F[(var10 << 8) + 174];
                                }
                                var10 = 174;
                              }
                            } else {
                              var4 = var4 + this.a('©');
                              if (this.field_F != null &&
                                var10 != 0) {
                                var4 = var4 + this.field_F[(var10 << 8) + 169];
                              }
                              var10 = 169;
                            }
                          } else {
                            var4 = var4 + this.a('€');
                            if (this.field_F != null &&
                              var10 != 0) {
                              var4 = var4 + this.field_F[(var10 << 8) + 128];
                            }
                            var10 = 8364;
                          }
                        } else {
                          var4 = var4 + this.a('×');
                          if (this.field_F != null &&
                            var10 != 0) {
                            var4 = var4 + this.field_F[(var10 << 8) + 215];
                          }
                          var10 = 215;
                        }
                      } else {
                        var4 = var4 + this.a('­');
                        if (this.field_F != null &&
                          var10 != 0) {
                          var4 = var4 + this.field_F[(var10 << 8) + 173];
                        }
                        var10 = 173;
                      }
                    } else {
                      var4 = var4 + this.a(' ');
                      if (this.field_F != null &&
                        var10 != 0) {
                        var4 = var4 + this.field_F[(var10 << 8) + 160];
                      }
                      var10 = 160;
                    }
                  } else {
                    var4 = var4 + this.a('>');
                    if (this.field_F != null &&
                      var10 != 0) {
                      var4 = var4 + this.field_F[(var10 << 8) + 62];
                    }
                    var10 = 62;
                  }
                } else {
                  var4 = var4 + this.a('<');
                  if (this.field_F != null &&
                    var10 != 0) {
                    var4 = var4 + this.field_F[(var10 << 8) + 60];
                  }
                  var10 = 60;
                }
              } else {
                param2[var11] = field_t.toString().substring(var5, field_t.length());
                var11++;
                var5 = field_t.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = field_t.append((char) var14);
                var14 = (char)(io.a(-377, (char) var14) & 255);
                var4 = var4 + this.field_B[var14];
                if (this.field_F != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_F[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = field_t.length();
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
                  param2[var11] = field_t.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = field_t.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (field_t.length() > var5) {
          param2[var11] = field_t.toString().substring(var5, field_t.length());
          var11++;
        }
        return var11;
    }

    private final void a(String param0) {
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
                                      this.a(field_z, field_A, field_r);
                                    }
                                  } else {
                                    field_p = field_A;
                                  }
                                } else {
                                  field_p = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) param0.substring(5));
                                field_p = eba.a(var7, -39, 16);
                              }
                            } else {
                              field_q = -1;
                            }
                          } else {
                            field_q = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) param0.substring(2));
                          field_q = eba.a(var6, -97, 16);
                        }
                      } else {
                        field_o = -1;
                      }
                    } else {
                      field_o = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) param0.substring(4));
                    field_o = eba.a(var5, -69, 16);
                  }
                } else {
                  field_v = field_r;
                }
              } else {
                var4 = (CharSequence) ((Object) param0.substring(6));
                field_v = jb.a(var4, (byte) 70);
              }
            } else {
              field_x = field_z;
            }
          } else {
            var3 = (CharSequence) ((Object) param0.substring(4));
            field_x = eba.a(var3, -94, 16);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final void a(rka[] param0, int[] param1) {
        if (param1 != null &&
          param1.length != param0.length) {
          throw new IllegalArgumentException();
        }
        this.field_l = param0;
        this.field_I = param1;
    }

    private final void a(int param0, int param1) {
        field_o = -1;
        field_q = -1;
        field_A = param1;
        field_p = param1;
        field_z = param0;
        field_x = param0;
        field_r = 256;
        field_v = 256;
        field_y = 0;
        field_D = 0;
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
          param10 = this.field_m;
        }
        var12 = new int[]{param3};
        if (param4 < this.field_w + this.field_k + param10 &&
          param4 < param10 + param10) {
          var12 = null;
        }
        var13 = this.a(param0, var12, field_H);
        if (param9 == 3 &&
          var13 == 1) {
          param9 = 1;
        }
        if (param9 != 0) {
          if (param9 != 1) {
            if (param9 != 2) {
              var15 = (param4 - this.field_w - this.field_k - (var13 - 1) * param10) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = param2 + this.field_w + var15;
              param10 = param10 + var15;
            } else {
              var14 = param2 + param4 - this.field_k - (var13 - 1) * param10;
            }
          } else {
            var14 = param2 + this.field_w + (param4 - this.field_w - this.field_k - (var13 - 1) * param10) / 2;
          }
        } else {
          var14 = param2 + this.field_w;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (param8 != 0) {
            if (param8 != 1) {
              if (param8 != 2) {
                if (var15Lifetime1 != var13 - 1) {
                  this.b(field_H[var15Lifetime1], param3);
                  this.b(field_H[var15Lifetime1], param1, var14);
                  field_y = 0;
                } else {
                  this.b(field_H[var15Lifetime1], param1, var14);
                }
                var14 = var14 + param10;
              } else {
                this.b(field_H[var15Lifetime1], param1 + param3 - this.b(field_H[var15Lifetime1]), var14);
                var14 = var14 + param10;
              }
            } else {
              this.b(field_H[var15Lifetime1], param1 + (param3 - this.b(field_H[var15Lifetime1])) / 2, var14);
              var14 = var14 + param10;
            }
          } else {
            this.b(field_H[var15Lifetime1], param1, var14);
            var14 = var14 + param10;
          }
        }
        return var13;
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - this.b(param0) / 2, param2);
    }

    final static String a(il param0, String param1, int param2) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        if (param0.b(param1) <= param2) {
          return param1;
        }
        var3 = param0.b("...");
        var4 = param2 - var3;
        var5 = 0;
        for (var6 = 0; var6 < param1.length(); var6++) {
          var7 = param0.a(param1.charAt(var6));
          if (var5 + var7 > var4) {
            return param1.substring(0, var6 - 1) + "...";
          }
          var5 = var5 + var7;
        }
        return null;
    }

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
          param2 = this.field_m;
        }
        int var4 = this.a(param0, new int[]{param1}, field_H);
        int var5 = (var4 - 1) * param2;
        return this.field_w + var5 + this.field_k;
    }

    il(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var8 = 0;
        int var6;
        int var7;
        this.field_m = 0;
        this.field_n = param1;
        this.field_s = param2;
        this.field_u = param3;
        this.field_C = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
          if (this.field_s[var8] < var6 &&
            this.field_C[var8] != 0) {
            var6 = this.field_s[var8];
          }
          if (this.field_s[var8] + this.field_C[var8] > var7) {
            var7 = this.field_s[var8] + this.field_C[var8];
          }
        }
        this.field_w = this.field_m - var6;
        this.field_k = var7 - this.field_m;
        this.field_G = this.field_m - this.field_s[88];
    }

    static {
        field_t = new StringBuilder(100);
        field_v = 256;
        field_D = 0;
        field_z = 0;
        field_y = 0;
        field_r = 256;
        field_A = -1;
        field_q = -1;
        field_x = 0;
        field_H = new String[100];
        field_o = -1;
        field_p = -1;
    }
}
