/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jl extends lm {
    int field_w;
    private sl[] field_I;
    private byte[] field_P;
    int field_D;
    private static StringBuilder field_B;
    private int[] field_u;
    private int[] field_E;
    private int[] field_v;
    int field_z;
    private static String[] field_J;
    private static int field_A;
    private int[] field_N;
    private static int field_F;
    private static int field_H;
    private int[] field_G;
    private static int field_y;
    private static int field_t;
    private static int field_x;
    int field_M;
    private int[] field_L;
    private static int field_Q;
    private static int field_K;
    private static int field_C;
    private static int field_O;

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - this.c(param0) / 2, param2);
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
                                      this.a(field_y, field_H, field_F);
                                    }
                                  } else {
                                    field_K = field_H;
                                  }
                                } else {
                                  field_K = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) param0.substring(5));
                                field_K = Pixelate.a(var7, 0, 16);
                              }
                            } else {
                              field_A = -1;
                            }
                          } else {
                            field_A = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) param0.substring(2));
                          field_A = Pixelate.a(var6, 0, 16);
                        }
                      } else {
                        field_x = -1;
                      }
                    } else {
                      field_x = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) param0.substring(4));
                    field_x = Pixelate.a(var5, 0, 16);
                  }
                } else {
                  field_O = field_F;
                }
              } else {
                var4 = (CharSequence) ((Object) param0.substring(6));
                field_O = na.a(var4, (byte) -33);
              }
            } else {
              field_C = field_y;
            }
          } else {
            var3 = (CharSequence) ((Object) param0.substring(4));
            field_C = Pixelate.a(var3, 0, 16);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final static String a(jl param0, String param1, int param2) {
        int var6 = 0;
        int var3;
        int var4;
        int var5;
        int var7;
        if (param0.c(param1) <= param2) {
          return param1;
        }
        var3 = param0.c("...");
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

    private final void c(String param0, int param1) {
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
          field_Q = (param1 - this.c(param0) << 8) / var3;
        }
    }

    final int a(String param0, int param1, int param2) {
        if (param2 == 0) {
          param2 = this.field_M;
        }
        int var4 = this.a(param0, new int[]{param1}, field_J);
        int var5 = (var4 - 1) * param2;
        return this.field_w + var5 + this.field_z;
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
          param10 = this.field_M;
        }
        var12 = new int[]{param3};
        if (param4 < this.field_w + this.field_z + param10 &&
          param4 < param10 + param10) {
          var12 = null;
        }
        var13 = this.a(param0, var12, field_J);
        if (param9 == 3 &&
          var13 == 1) {
          param9 = 1;
        }
        if (param9 != 0) {
          if (param9 != 1) {
            if (param9 != 2) {
              var15 = (param4 - this.field_w - this.field_z - (var13 - 1) * param10) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = param2 + this.field_w + var15;
              param10 = param10 + var15;
            } else {
              var14 = param2 + param4 - this.field_z - (var13 - 1) * param10;
            }
          } else {
            var14 = param2 + this.field_w + (param4 - this.field_w - this.field_z - (var13 - 1) * param10) / 2;
          }
        } else {
          var14 = param2 + this.field_w;
        }
        for (var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (param8 != 0) {
            if (param8 != 1) {
              if (param8 != 2) {
                if (var15Lifetime1 != var13 - 1) {
                  this.c(field_J[var15Lifetime1], param3);
                  this.b(field_J[var15Lifetime1], param1, var14);
                  field_Q = 0;
                } else {
                  this.b(field_J[var15Lifetime1], param1, var14);
                }
                var14 = var14 + param10;
              } else {
                this.b(field_J[var15Lifetime1], param1 + param3 - this.c(field_J[var15Lifetime1]), var14);
                var14 = var14 + param10;
              }
            } else {
              this.b(field_J[var15Lifetime1], param1 + (param3 - this.c(field_J[var15Lifetime1])) / 2, var14);
              var14 = var14 + param10;
            }
          } else {
            this.b(field_J[var15Lifetime1], param1, var14);
            var14 = var14 + param10;
          }
        }
        return var13;
    }

    final int b(String param0, int param1) {
        return this.a(param0, new int[]{param1}, field_J);
    }

    final int a(char param0) {
        return this.field_v[pf.a((byte) -118, param0) & 255];
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

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4);
        this.b(param0, param1 - this.c(param0), param2);
    }

    final void a(sl[] param0, int[] param1) {
        if (param1 != null &&
          param1.length != param0.length) {
          throw new IllegalArgumentException();
        }
        this.field_I = param0;
        this.field_N = param1;
    }

    private final void a(int param0, int param1, int param2) {
        field_x = -1;
        field_A = -1;
        field_H = param1;
        field_K = param1;
        field_y = param0;
        field_C = param0;
        field_F = param2;
        field_O = param2;
        field_Q = 0;
        field_t = 0;
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
        this.field_v = new int[256];
        if (param0.length == 257) {
          for (var2 = 0; var2 < this.field_v.length; var2++) {
            this.field_v[var2] = param0[var2] & 255;
          }
          this.field_M = param0[256] & 255;
        } else {
          var2 = 0;
          for (var3_int = 0; var3_int < 256; var3_int++) {
            incrementValue$6 = var2;
            var2++;
            this.field_v[var3_int] = param0[incrementValue$6] & 255;
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
          this.field_P = new byte[65536];
          for (var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.field_P[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)jl.a(var15, var16, var17, this.field_v, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.field_M = var17[32] + var14[32];
        }
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
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

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final static String b(String param0) {
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

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    private final void a(int param0, int param1) {
        field_x = -1;
        field_A = -1;
        field_H = param1;
        field_K = param1;
        field_y = param0;
        field_C = param0;
        field_F = 256;
        field_O = 256;
        field_Q = 0;
        field_t = 0;
    }

    final int c(String param0) {
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
                                  var9_int = na.a(var10, (byte) -33);
                                  var4 = var4 + this.field_I[var9_int].field_f;
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
              var7 = (char)(pf.a((byte) -118, (char) var7) & 255);
              var4 = var4 + this.field_v[var7];
              if (this.field_P != null &&
                var3 != 0) {
                var4 = var4 + this.field_P[(var3 << 8) + var7];
              }
              var3 = var7;
            }
          } else {
            var2 = var6;
          }
        }
        return var4;
    }

    public static void a() {
        field_B = null;
        field_J = null;
    }

    final int a(String param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var3 = this.a(param0, new int[]{param1}, field_J);
        var4 = 0;
        for (var5 = 0; var5 < var3; var5++) {
          var6 = this.c(field_J[var5]);
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
        this.b(param0, param1 - this.c(param0) / 2, param2);
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
        nk.a(field_B, 0, ' ', 16736352);
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
              discarded$0 = field_B.append('<');
              discarded$1 = field_B.append(var15);
              discarded$2 = field_B.append('>');
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
                                    var16_int = na.a(var18, (byte) -33);
                                    var4 = var4 + this.field_I[var16_int].field_f;
                                    var10 = 0;
                                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    var16 = (Exception) (Object) decompiledCaughtException;
                                  }
                                }
                              } else {
                                var4 = var4 + this.a('®');
                                if (this.field_P != null &&
                                  var10 != 0) {
                                  var4 = var4 + this.field_P[(var10 << 8) + 174];
                                }
                                var10 = 174;
                              }
                            } else {
                              var4 = var4 + this.a('©');
                              if (this.field_P != null &&
                                var10 != 0) {
                                var4 = var4 + this.field_P[(var10 << 8) + 169];
                              }
                              var10 = 169;
                            }
                          } else {
                            var4 = var4 + this.a('€');
                            if (this.field_P != null &&
                              var10 != 0) {
                              var4 = var4 + this.field_P[(var10 << 8) + 128];
                            }
                            var10 = 8364;
                          }
                        } else {
                          var4 = var4 + this.a('×');
                          if (this.field_P != null &&
                            var10 != 0) {
                            var4 = var4 + this.field_P[(var10 << 8) + 215];
                          }
                          var10 = 215;
                        }
                      } else {
                        var4 = var4 + this.a('­');
                        if (this.field_P != null &&
                          var10 != 0) {
                          var4 = var4 + this.field_P[(var10 << 8) + 173];
                        }
                        var10 = 173;
                      }
                    } else {
                      var4 = var4 + this.a(' ');
                      if (this.field_P != null &&
                        var10 != 0) {
                        var4 = var4 + this.field_P[(var10 << 8) + 160];
                      }
                      var10 = 160;
                    }
                  } else {
                    var4 = var4 + this.a('>');
                    if (this.field_P != null &&
                      var10 != 0) {
                      var4 = var4 + this.field_P[(var10 << 8) + 62];
                    }
                    var10 = 62;
                  }
                } else {
                  var4 = var4 + this.a('<');
                  if (this.field_P != null &&
                    var10 != 0) {
                    var4 = var4 + this.field_P[(var10 << 8) + 60];
                  }
                  var10 = 60;
                }
              } else {
                param2[var11] = field_B.toString().substring(var5, field_B.length());
                var11++;
                var5 = field_B.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                discarded$3 = field_B.append((char) var14);
                var14 = (char)(pf.a((byte) -118, (char) var14) & 255);
                var4 = var4 + this.field_v[var14];
                if (this.field_P != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_P[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = field_B.length();
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
                  param2[var11] = field_B.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = field_B.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (field_B.length() > var5) {
          param2[var11] = field_B.toString().substring(var5, field_B.length());
          var11++;
        }
        return var11;
    }

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.b(param0, param1 - this.c(param0), param2);
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
        sl var11_ref_sl = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        param2 = param2 - this.field_M;
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
                                  var10 = na.a(var13, (byte) -33);
                                  var11_ref_sl = this.field_I[var10];
                                  if (this.field_N == null) {
                                    stackIn_27_0 = var11_ref_sl.field_a;
                                  } else {
                                    stackIn_27_0 = this.field_N[var10];
                                  }
                                  var12 = stackIn_27_0;
                                  if (field_O != 256) {
                                    var11_ref_sl.a(param1, param2 + this.field_M - var12, field_O);
                                  } else {
                                    var11_ref_sl.a(param1, param2 + this.field_M - var12);
                                  }
                                  param1 = param1 + var11_ref_sl.field_f;
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
              var8 = (char)(pf.a((byte) -118, (char) var8) & 255);
              if (this.field_P != null &&
                var5 != 0) {
                param1 = param1 + this.field_P[(var5 << 8) + var8];
              }
              var9 = this.field_G[var8];
              var10 = this.field_u[var8];
              var11 = param1;
              if (var8 == 32) {
                if (field_Q > 0) {
                  field_t = field_t + field_Q;
                  param1 = param1 + (field_t >> 8);
                  field_t = field_t & 255;
                }
              } else {
                if (field_O != 256) {
                  if (field_K != -1) {
                    this.a(var8, param1 + this.field_E[var8] + 1, param2 + this.field_L[var8] + 1, var9, var10, field_K, field_O, true);
                  }
                  this.a(var8, param1 + this.field_E[var8], param2 + this.field_L[var8], var9, var10, field_C, field_O, false);
                } else {
                  if (field_K != -1) {
                    this.a(var8, param1 + this.field_E[var8] + 1, param2 + this.field_L[var8] + 1, var9, var10, field_K, true);
                  }
                  this.a(var8, param1 + this.field_E[var8], param2 + this.field_L[var8], var9, var10, field_C, false);
                }
              }
              param1 = param1 + this.field_v[var8];
              if (field_x != -1) {
                t.b(var11, param2 + (int)((double)this.field_M * 0.7), param1 - var11, field_x);
              }
              if (field_A != -1) {
                t.b(var11, param2 + this.field_M + 1, param1 - var11, field_A);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    jl(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var8 = 0;
        int var6;
        int var7;
        this.field_M = 0;
        this.field_E = param1;
        this.field_L = param2;
        this.field_G = param3;
        this.field_u = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
          if (this.field_L[var8] < var6 &&
            this.field_u[var8] != 0) {
            var6 = this.field_L[var8];
          }
          if (this.field_L[var8] + this.field_u[var8] > var7) {
            var7 = this.field_L[var8] + this.field_u[var8];
          }
        }
        this.field_w = this.field_M - var6;
        this.field_z = var7 - this.field_M;
        this.field_D = this.field_M - this.field_L[88];
    }

    static {
        field_B = new StringBuilder(100);
        field_t = 0;
        field_x = -1;
        field_K = -1;
        field_A = -1;
        field_J = new String[100];
        field_H = -1;
        field_C = 0;
        field_O = 256;
        field_Q = 0;
        field_y = 0;
        field_F = 256;
    }
}
