/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class m extends rc {
    private int[] field_v;
    int field_p;
    private int[] field_A;
    private int[] field_J;
    private static StringBuilder field_r;
    int field_o;
    private ha[] field_s;
    private int[] field_C;
    private static int field_B;
    private static int field_n;
    private static int field_m;
    private byte[] field_x;
    private static int field_F;
    private static int field_G;
    private int[] field_I;
    private static int field_z;
    private static int field_u;
    private static String[] field_E;
    private static int field_t;
    int field_q;
    private int[] field_w;
    int field_y;
    private static int field_D;
    private static int field_H;

    private final void b(int param0, int param1) {
        field_H = -1;
        field_z = -1;
        field_n = param1;
        field_D = param1;
        field_G = param0;
        field_F = param0;
        field_B = 256;
        field_m = 256;
        field_t = 0;
        field_u = 0;
    }

    final int c(String param0, int param1) {
        int var5 = 0;
        int var3;
        int var4;
        int var6;
        var3 = this.a(param0, new int[]{param1}, field_E);
        var4 = 0;
        for (var5 = 0; var5 < var3; var5++) {
          var6 = this.a(field_E[var5]);
          if (var6 <= var4) {
            continue;
          }
          var4 = var6;
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
        L0: {
          this.field_v = new int[256];
          if (param0.length == 257) {
            for (var2 = 0; var2 < this.field_v.length; var2++) {
              this.field_v[var2] = param0[var2] & 255;
            }
            this.field_p = param0[256] & 255;
            break L0;
          }
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
          for (var5_int = 0; var5_int < 256; var5_int++) {
            incrementValue$4 = var2;
            var2++;
            var4[var5_int] = param0[incrementValue$4] & 255;
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
          for (var7 = 0; var7 < 256; var7++) {
            array$0 = new byte[var14[var7]];
            var6[var7] = array$0;
            var8 = 0;
            for (var9 = 0; var9 < var16[var7].length; var9++) {
              incrementValue$1 = var2;
              var2++;
              var8 = (byte)(var8 + param0[incrementValue$1]);
              var16[var7][var9] = (byte)var8;
            }
          }
          this.field_x = new byte[65536];
          var7 = 0;
          while (true) {
            if (var7 >= 256) {
              this.field_p = var17[32] + var14[32];
              break;
            }
            if (var7 == 32) {
              var7++;
              continue;
            }
            if (var7 == 160) {
              var7++;
              continue;
            }
            for (var8 = 0; var8 < 256; var8++) {
              if (var8 == 32) {
                continue;
              }
              if (var8 == 160) {
                continue;
              }
              this.field_x[(var7 << 8) + var8] = (byte)m.a(var15, var16, var17, this.field_v, var14, var7, var8);
            }
            var7++;
            continue;
          }
        }
    }

    public static void a() {
        field_r = null;
        field_E = null;
    }

    final int a(String param0, int[] param1, String[] param2) {
        int var13 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int stackIn_67_0 = 0;
        int[] stackIn_67_1 = null;
        int stackIn_68_2 = 0;
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
        ug.a(field_r, (byte) -126, ' ', 0);
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
          if (var14 == 60) {
            var9 = var13;
            continue;
          }
          if ((var14 == 62) &&
              (var9 != -1)) {
            var15 = param0.substring(var9 + 1, var13).toLowerCase();
            var9 = -1;
            discarded$0 = field_r.append('<');
            discarded$1 = field_r.append(var15);
            discarded$2 = field_r.append('>');
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
                                  var16_int = ol.a(false, var18);
                                  var4 = var4 + this.field_s[var16_int].field_e;
                                  var10 = 0;
                                } catch (java.lang.Exception decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  var16 = (Exception) (Object) decompiledCaughtException;
                                }
                              }
                            } else {
                              var4 = var4 + this.a('®');
                              if ((this.field_x != null) &&
                                  (var10 != 0)) {
                                var4 = var4 + this.field_x[(var10 << 8) + 174];
                              }
                              var10 = 174;
                            }
                          } else {
                            var4 = var4 + this.a('©');
                            if ((this.field_x != null) &&
                                (var10 != 0)) {
                              var4 = var4 + this.field_x[(var10 << 8) + 169];
                            }
                            var10 = 169;
                          }
                        } else {
                          var4 = var4 + this.a('€');
                          if ((this.field_x != null) &&
                              (var10 != 0)) {
                            var4 = var4 + this.field_x[(var10 << 8) + 128];
                          }
                          var10 = 8364;
                        }
                      } else {
                        var4 = var4 + this.a('×');
                        if ((this.field_x != null) &&
                            (var10 != 0)) {
                          var4 = var4 + this.field_x[(var10 << 8) + 215];
                        }
                        var10 = 215;
                      }
                    } else {
                      var4 = var4 + this.a('­');
                      if ((this.field_x != null) &&
                          (var10 != 0)) {
                        var4 = var4 + this.field_x[(var10 << 8) + 173];
                      }
                      var10 = 173;
                    }
                  } else {
                    var4 = var4 + this.a(' ');
                    if ((this.field_x != null) &&
                        (var10 != 0)) {
                      var4 = var4 + this.field_x[(var10 << 8) + 160];
                    }
                    var10 = 160;
                  }
                } else {
                  var4 = var4 + this.a('>');
                  if ((this.field_x != null) &&
                      (var10 != 0)) {
                    var4 = var4 + this.field_x[(var10 << 8) + 62];
                  }
                  var10 = 62;
                }
              } else {
                var4 = var4 + this.a('<');
                if ((this.field_x != null) &&
                    (var10 != 0)) {
                  var4 = var4 + this.field_x[(var10 << 8) + 60];
                }
                var10 = 60;
              }
            } else {
              param2[var11] = field_r.toString().substring(var5, field_r.length());
              var11++;
              var5 = field_r.length();
              var4 = 0;
              var6 = -1;
              var10 = 0;
            }
            var14 = 0;
          }
          if (var9 != -1) {
            continue;
          }
          if (var14 != 0) {
            discarded$3 = field_r.append((char) var14);
            var14 = (char)(qc.a((char) var14, true) & 255);
            var4 = var4 + this.field_v[var14];
            if ((this.field_x != null) &&
                (var10 != 0)) {
              var4 = var4 + this.field_x[(var10 << 8) + var14];
            }
            var10 = var14;
          }
          if (var14 == 32) {
            var6 = field_r.length();
            var7 = var4;
            var8 = 1;
          }
          if (param1 != null) {
            stackIn_67_0 = var4;
            stackIn_67_1 = (int[]) (param1);
            if (var11 >= param1.length) {
              stackIn_68_2 = param1.length - 1;
            } else {
              stackIn_68_2 = var11;
            }
            if ((stackIn_67_0 > stackIn_67_1[stackIn_68_2]) &&
                (var6 >= 0)) {
              param2[var11] = field_r.toString().substring(var5, var6 - var8);
              var11++;
              var5 = var6;
              var6 = -1;
              var4 = var4 - var7;
              var10 = 0;
            }
          }
          if (var14 != 45) {
            continue;
          }
          var6 = field_r.length();
          var7 = var4;
          var8 = 0;
        }
        if (field_r.length() > var5) {
          param2[var11] = field_r.toString().substring(var5, field_r.length());
          var11++;
        }
        return var11;
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
          if (var7 == 60) {
            var4 = 1;
            continue;
          }
          if (var7 == 62) {
            var4 = 0;
            continue;
          }
          if (var4 != 0) {
            continue;
          }
          if (var7 != 32) {
            continue;
          }
          var3++;
        }
        if (var3 > 0) {
          field_t = (param1 - this.a(param0) << 8) / var3;
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

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
                                      this.a(field_G, field_n, field_B);
                                    }
                                  } else {
                                    field_D = field_n;
                                  }
                                } else {
                                  field_D = 0;
                                }
                              } else {
                                var7 = (CharSequence) ((Object) param0.substring(5));
                                field_D = oa.a(16, var7, 8192);
                              }
                            } else {
                              field_z = -1;
                            }
                          } else {
                            field_z = 0;
                          }
                        } else {
                          var6 = (CharSequence) ((Object) param0.substring(2));
                          field_z = oa.a(16, var6, 8192);
                        }
                      } else {
                        field_H = -1;
                      }
                    } else {
                      field_H = 8388608;
                    }
                  } else {
                    var5 = (CharSequence) ((Object) param0.substring(4));
                    field_H = oa.a(16, var5, 8192);
                  }
                } else {
                  field_m = field_B;
                }
              } else {
                var4 = (CharSequence) ((Object) param0.substring(6));
                field_m = ol.a(false, var4);
              }
            } else {
              field_F = field_G;
            }
          } else {
            var3 = (CharSequence) ((Object) param0.substring(4));
            field_F = oa.a(16, var3, 8192);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int[] var12;
        int var13;
        int var14;
        int var15;
        if (param0 == null) {
          return 0;
        }
        this.a(param5, param6, param7);
        if (param10 == 0) {
          param10 = this.field_p;
        }
        var12 = new int[]{param3};
        if ((param4 < this.field_o + this.field_q + param10) &&
            (param4 < param10 + param10)) {
          var12 = null;
        }
        var13 = this.a(param0, var12, field_E);
        if ((param9 == 3) &&
            (var13 == 1)) {
          param9 = 1;
        }
        if (param9 != 0) {
          if (param9 != 1) {
            if (param9 != 2) {
              var15 = (param4 - this.field_o - this.field_q - (var13 - 1) * param10) / (var13 + 1);
              if (var15 < 0) {
                var15 = 0;
              }
              var14 = param2 + this.field_o + var15;
              param10 = param10 + var15;
            } else {
              var14 = param2 + param4 - this.field_q - (var13 - 1) * param10;
            }
          } else {
            var14 = param2 + this.field_o + (param4 - this.field_o - this.field_q - (var13 - 1) * param10) / 2;
          }
        } else {
          var14 = param2 + this.field_o;
        }
        for (var15 = 0; var15 < var13; var15++) {
          if (param8 == 0) {
            this.a(field_E[var15], param1, var14);
            var14 = var14 + param10;
            continue;
          }
          if (param8 == 1) {
            this.a(field_E[var15], param1 + (param3 - this.a(field_E[var15])) / 2, var14);
            var14 = var14 + param10;
            continue;
          }
          if (param8 == 2) {
            this.a(field_E[var15], param1 + param3 - this.a(field_E[var15]), var14);
            var14 = var14 + param10;
            continue;
          }
          if (var15 != var13 - 1) {
            this.a(field_E[var15], param3);
            this.a(field_E[var15], param1, var14);
            field_t = 0;
          } else {
            this.a(field_E[var15], param1, var14);
          }
          var14 = var14 + param10;
        }
        return var13;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final int b(String param0, int param1) {
        return this.a(param0, new int[]{param1}, field_E);
    }

    private final void a(int param0, int param1, int param2) {
        field_H = -1;
        field_z = -1;
        field_n = param1;
        field_D = param1;
        field_G = param0;
        field_F = param0;
        field_B = param2;
        field_m = param2;
        field_t = 0;
        field_u = 0;
    }

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.b(param3, param4);
        this.a(param0, param1 - this.a(param0) / 2, param2);
    }

    final int a(char param0) {
        return this.field_v[qc.a(param0, true) & 255];
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.b(param3, param4);
        this.a(param0, param1 - this.a(param0), param2);
    }

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
            return;
        }
        this.b(param3, param4);
        this.a(param0, param1, param2);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final int a(String param0) {
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
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
        var6 = 0;
        while (var6 < var5) {
          var7 = param0.charAt(var6);
          if (var7 == 60) {
            var2 = var6;
            var6++;
            continue;
          }
          if ((var7 == 62) &&
              (var2 != -1)) {
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
                            if (!var8.startsWith("img=")) {
                              var6++;
                              continue;
                            }
                            try {
                              var10 = (CharSequence) ((Object) var8.substring(4));
                              var9_int = ol.a(false, var10);
                              var4 = var4 + this.field_s[var9_int].field_e;
                              var3 = 0;
                              var6++;
                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              var9 = (Exception) (Object) decompiledCaughtException;
                              var6++;
                            }
                            continue;
                          }
                          var7 = 174;
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
          if (var2 != -1) {
            var6++;
            continue;
          }
          var7 = (char)(qc.a((char) var7, true) & 255);
          var4 = var4 + this.field_v[var7];
          if ((this.field_x != null) &&
              (var3 != 0)) {
            var4 = var4 + this.field_x[(var3 << 8) + var7];
          }
          var3 = var7;
          var6++;
        }
        return var4;
    }

    final int b(String param0, int param1, int param2) {
        if (param2 == 0) {
            param2 = this.field_p;
        }
        int var4 = this.a(param0, new int[]{param1}, field_E);
        int var5 = (var4 - 1) * param2;
        return this.field_o + var5 + this.field_q;
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
          if (var19 >= var13) {
            continue;
          }
          var13 = var19;
        }
        return -var13;
    }

    final void a(ha[] param0, int[] param1) {
        if (param1 != null && param1.length != param0.length) {
            throw new IllegalArgumentException();
        }
        this.field_s = param0;
        this.field_w = param1;
    }

    private final void a(String param0, int param1, int param2) {
        int stackIn_26_0 = 0;
        Throwable decompiledCaughtException = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        Exception var10_ref_Exception = null;
        ha var11_ref_ha = null;
        int var11 = 0;
        int var12 = 0;
        CharSequence var13 = null;
        param2 = param2 - this.field_p;
        var4 = -1;
        var5 = 0;
        var6 = param0.length();
        var7 = 0;
        while (true) {
          if (var7 >= var6) {
            return;
          }
          var8 = param0.charAt(var7);
          if (var8 == 60) {
            var4 = var7;
            var7++;
            continue;
          }
          if ((var8 == 62) &&
              (var4 != -1)) {
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
                              var7++;
                              continue;
                            }
                            try {
                              var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                              var10 = ol.a(false, var13);
                              var11_ref_ha = this.field_s[var10];
                              if (this.field_w == null) {
                                stackIn_26_0 = var11_ref_ha.field_c;
                              } else {
                                stackIn_26_0 = this.field_w[var10];
                              }
                              var12 = stackIn_26_0;
                              if (field_m != 256) {
                                var11_ref_ha.a(param1, param2 + this.field_p - var12, field_m);
                              } else {
                                var11_ref_ha.a(param1, param2 + this.field_p - var12);
                              }
                              param1 = param1 + var11_ref_ha.field_e;
                              var5 = 0;
                              var7++;
                            } catch (java.lang.Exception decompiledCaughtParameter0) {
                              decompiledCaughtException = decompiledCaughtParameter0;
                              var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                              var7++;
                            }
                            continue;
                          }
                          var8 = 174;
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
          if (var4 != -1) {
            var7++;
            continue;
          }
          var8 = (char)(qc.a((char) var8, true) & 255);
          if ((this.field_x != null) &&
              (var5 != 0)) {
            param1 = param1 + this.field_x[(var5 << 8) + var8];
          }
          var9 = this.field_J[var8];
          var10 = this.field_I[var8];
          var11 = param1;
          if (var8 == 32) {
            if (field_t > 0) {
              field_u = field_u + field_t;
              param1 = param1 + (field_u >> 8);
              field_u = field_u & 255;
            }
          } else {
            if (field_m != 256) {
              if (field_D != -1) {
                this.a(var8, param1 + this.field_A[var8] + 1, param2 + this.field_C[var8] + 1, var9, var10, field_D, field_m, true);
              }
              this.a(var8, param1 + this.field_A[var8], param2 + this.field_C[var8], var9, var10, field_F, field_m, false);
            } else {
              if (field_D != -1) {
                this.a(var8, param1 + this.field_A[var8] + 1, param2 + this.field_C[var8] + 1, var9, var10, field_D, true);
              }
              this.a(var8, param1 + this.field_A[var8], param2 + this.field_C[var8], var9, var10, field_F, false);
            }
          }
          param1 = param1 + this.field_v[var8];
          if (field_H != -1) {
            vb.c(var11, param2 + (int)((double)this.field_p * 0.7), param1 - var11, field_H);
          }
          if (field_z != -1) {
            vb.c(var11, param2 + this.field_p + 1, param1 - var11, field_z);
          }
          var5 = var8;
          var7++;
          continue;
        }
    }

    m(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        int var8 = 0;
        int var6;
        int var7;
        this.field_p = 0;
        this.field_A = param1;
        this.field_C = param2;
        this.field_J = param3;
        this.field_I = param4;
        this.a(param0);
        var6 = 2147483647;
        var7 = -2147483648;
        for (var8 = 0; var8 < 256; var8++) {
          if ((this.field_C[var8] < var6) &&
              (this.field_I[var8] != 0)) {
            var6 = this.field_C[var8];
          }
          if (this.field_C[var8] + this.field_I[var8] <= var7) {
            continue;
          }
          var7 = this.field_C[var8] + this.field_I[var8];
        }
        this.field_o = this.field_p - var6;
        this.field_q = var7 - this.field_p;
        this.field_y = this.field_p - this.field_C[88];
    }

    static {
        field_r = new StringBuilder(100);
        field_m = 256;
        field_B = 256;
        field_G = 0;
        field_n = -1;
        field_F = 0;
        field_u = 0;
        field_E = new String[100];
        field_z = -1;
        field_t = 0;
        field_D = -1;
        field_H = -1;
    }
}
