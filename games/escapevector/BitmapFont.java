/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class BitmapFont extends DualLinkNode {
    private int[] field_w;
    int field_x;
    private static StringBuilder field_H;
    private byte[] field_v;
    int field_r;
    private int[] field_B;
    int field_y;
    private int[] field_G;
    private int[] field_t;
    private int[] field_M;
    private int[] field_D;
    private static int field_C;
    private static int field_A;
    private static int field_K;
    private static int field_s;
    private static int field_I;
    private static int field_F;
    private IndexedSpriteState[] field_q;
    private static int field_J;
    int field_N;
    private static int field_u;
    private static int field_L;
    private static String[] field_z;
    private static int field_E;

    private final void decodeFontMetrics(byte[] data) {
        int var2;
        this.field_t = new int[256];
        if (data.length == 257) {
          for (var2 = 0; var2 < this.field_t.length; var2++) {
            this.field_t[var2] = data[var2] & 255;
          }
          this.field_y = data[256] & 255;
        } else {
          var2 = 0;
          for (int var3_int = 0; var3_int < 256; var3_int++) {
            int incrementValue$6 = var2;
            var2++;
            this.field_t[var3_int] = data[incrementValue$6] & 255;
          }
          int[] var14 = new int[256];
          int[] var10 = var14;
          int[] var3 = var10;
          int[] var17 = new int[256];
          int[] var13 = var17;
          int[] var4 = var13;
          for (int var5_int = 0; var5_int < 256; var5_int++) {
            int incrementValue$5 = var2;
            var2++;
            var3[var5_int] = data[incrementValue$5] & 255;
          }
          for (int var5_intLifetime1 = 0; var5_intLifetime1 < 256; var5_intLifetime1++) {
            int incrementValue$4 = var2;
            var2++;
            var4[var5_intLifetime1] = data[incrementValue$4] & 255;
          }
          byte[][] var15 = new byte[256][];
          byte[][] var11 = var15;
          byte[][] var5 = var11;
          for (int var6_int = 0; var6_int < 256; var6_int++) {
            byte[] array$2 = new byte[var14[var6_int]];
            var5[var6_int] = array$2;
            int var7 = 0;
            for (int var8 = 0; var8 < var15[var6_int].length; var8++) {
              int incrementValue$3 = var2;
              var2++;
              var7 = (byte)(var7 + data[incrementValue$3]);
              var15[var6_int][var8] = (byte)var7;
            }
          }
          byte[][] var16 = new byte[256][];
          byte[][] var12 = var16;
          byte[][] var6 = var12;
          for (int var7Lifetime1 = 0; var7Lifetime1 < 256; var7Lifetime1++) {
            byte[] array$0 = new byte[var14[var7Lifetime1]];
            var6[var7Lifetime1] = array$0;
            int var8Lifetime1 = 0;
            for (int var9 = 0; var9 < var16[var7Lifetime1].length; var9++) {
              int incrementValue$1 = var2;
              var2++;
              var8Lifetime1 = (byte)(var8Lifetime1 + data[incrementValue$1]);
              var16[var7Lifetime1][var9] = (byte)var8Lifetime1;
            }
          }
          this.field_v = new byte[65536];
          for (int var7Lifetime2 = 0; var7Lifetime2 < 256; var7Lifetime2++) {
            if (var7Lifetime2 != 32 &&
              var7Lifetime2 != 160) {
              for (int var8Lifetime2 = 0; var8Lifetime2 < 256; var8Lifetime2++) {
                if (var8Lifetime2 != 32 &&
                  var8Lifetime2 != 160) {
                  this.field_v[(var7Lifetime2 << 8) + var8Lifetime2] = (byte)BitmapFont.computePairKerning(var15, var16, var17, this.field_t, var14, var7Lifetime2, var8Lifetime2);
                }
              }
            }
          }
          this.field_y = var17[32] + var14[32];
        }
    }

    private final void a(String param0, int param1, int param2) {
        int stackIn_27_0 = 0;
        int var10 = 0;
        param2 = param2 - this.field_y;
        int var4 = -1;
        int var5 = 0;
        int var6 = param0.length();
        for (int var7 = 0; var7 < var6; var7++) {
          boolean decompiledFrameRemainder0 = true;
          int var8 = param0.charAt(var7);
          if (var8 != 60) {
            if (var8 == 62 &&
              var4 != -1) {
              String var9_ref_String = param0.substring(var4 + 1, var7).toLowerCase();
              var4 = -1;
              if (var9_ref_String.equals("lt")) {
                var8 = 60;
              } else if (var9_ref_String.equals("gt")) {
                var8 = 62;
              } else if (var9_ref_String.equals("nbsp")) {
                var8 = 160;
              } else if (var9_ref_String.equals("shy")) {
                var8 = 173;
              } else if (var9_ref_String.equals("times")) {
                var8 = 215;
              } else if (var9_ref_String.equals("euro")) {
                var8 = 8364;
              } else if (var9_ref_String.equals("copy")) {
                var8 = 169;
              } else if (!var9_ref_String.equals("reg")) {
                if (!var9_ref_String.startsWith("img=")) {
                  this.a(var9_ref_String);
                } else {
                  try {
                    CharSequence var13 = (CharSequence) ((Object) var9_ref_String.substring(4));
                    var10 = gn.a(16777215, var13);
                    IndexedSpriteState var11_ref_fi = this.field_q[var10];
                    if (this.field_w == null) {
                      stackIn_27_0 = var11_ref_fi.field_h;
                    } else {
                      stackIn_27_0 = this.field_w[var10];
                    }
                    int var12 = stackIn_27_0;
                    if (field_A != 256) {
                      var11_ref_fi.drawAlpha(param1, param2 + this.field_y - var12, field_A);
                    } else {
                      var11_ref_fi.draw(param1, param2 + this.field_y - var12);
                    }
                    param1 = param1 + var11_ref_fi.field_a;
                    var5 = 0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    Throwable decompiledCaughtException = decompiledCaughtParameter0;
                    Exception var10_ref_Exception = (Exception) (Object) decompiledCaughtException;
                  }
                }
                decompiledFrameRemainder0 = false;
              } else {
                var8 = 174;
              }
            }
            if (decompiledFrameRemainder0 &&
              var4 == -1) {
              var8 = (char)(hf.a(23, (char) var8) & 255);
              if (this.field_v != null &&
                var5 != 0) {
                param1 = param1 + this.field_v[(var5 << 8) + var8];
              }
              int var9 = this.field_G[var8];
              var10 = this.field_M[var8];
              int var11 = param1;
              if (var8 == 32) {
                if (field_L > 0) {
                  field_F = field_F + field_L;
                  param1 = param1 + (field_F >> 8);
                  field_F = field_F & 255;
                }
              } else if (field_A != 256) {
                if (field_C != -1) {
                  this.a(var8, param1 + this.field_D[var8] + 1, param2 + this.field_B[var8] + 1, var9, var10, field_C, field_A, true);
                }
                this.a(var8, param1 + this.field_D[var8], param2 + this.field_B[var8], var9, var10, field_E, field_A, false);
              } else {
                if (field_C != -1) {
                  this.a(var8, param1 + this.field_D[var8] + 1, param2 + this.field_B[var8] + 1, var9, var10, field_C, true);
                }
                this.a(var8, param1 + this.field_D[var8], param2 + this.field_B[var8], var9, var10, field_E, false);
              }
              param1 = param1 + this.field_t[var8];
              if (field_u != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, param2 + (int)((double)this.field_y * 0.7), param1 - var11, field_u);
              }
              if (field_K != -1) {
                SoftwareRasterizer.drawHorizontalLine(var11, param2 + this.field_y + 1, param1 - var11, field_K);
              }
              var5 = var8;
            }
          } else {
            var4 = var7;
          }
        }
    }

    final void b(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.a(param0, param1 - this.b(param0) / 2, param2);
    }

    private final void b(int param0, int param1) {
        field_u = -1;
        field_K = -1;
        field_I = param1;
        field_C = param1;
        field_s = param0;
        field_E = param0;
        field_J = 256;
        field_A = 256;
        field_L = 0;
        field_F = 0;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7);

    final void a(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.b(param3, param4);
        this.a(param0, param1, param2);
    }

    final int a(String param0, int param1) {
        return this.a(param0, new int[]{param1}, field_z);
    }

    private final void a(int param0, int param1, int param2) {
        field_u = -1;
        field_K = -1;
        field_I = param1;
        field_C = param1;
        field_s = param0;
        field_E = param0;
        field_J = param2;
        field_A = param2;
        field_L = 0;
        field_F = 0;
    }

    private final void prepareJustification(String text, int targetWidth) {
        int var3 = 0;
        boolean var4 = false;
        int var5 = text.length();
        for (int var6 = 0; var6 < var5; var6++) {
          int var7 = text.charAt(var6);
          if (var7 == 60) {
            var4 = true;
          } else if (var7 == 62) {
            var4 = false;
          } else if (!var4 &&
            var7 == 32) {
            var3++;
          }
        }
        if (var3 > 0) {
          field_L = (targetWidth - this.b(text) << 8) / var3;
        }
    }

    final void c(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.a(param0, param1, param2);
    }

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        return this.a(param0, param1, param2, param3, param4, param5, param6, 256, param7, param8, param9);
    }

    final int b(String param0) {
        if (param0 == null) {
          return 0;
        }
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        int var5 = param0.length();
        for (int var6 = 0; var6 < var5; var6++) {
          boolean decompiledFrameRemainder0 = true;
          int var7 = param0.charAt(var6);
          if (var7 != 60) {
            if (var7 == 62 &&
              var2 != -1) {
              String var8 = param0.substring(var2 + 1, var6).toLowerCase();
              var2 = -1;
              if (var8.equals("lt")) {
                var7 = 60;
              } else if (var8.equals("gt")) {
                var7 = 62;
              } else if (var8.equals("nbsp")) {
                var7 = 160;
              } else if (var8.equals("shy")) {
                var7 = 173;
              } else if (var8.equals("times")) {
                var7 = 215;
              } else if (var8.equals("euro")) {
                var7 = 8364;
              } else if (var8.equals("copy")) {
                var7 = 169;
              } else if (!var8.equals("reg")) {
                if (var8.startsWith("img=")) {
                  try {
                    CharSequence var10 = (CharSequence) ((Object) var8.substring(4));
                    int var9_int = gn.a(16777215, var10);
                    var4 = var4 + this.field_q[var9_int].field_a;
                    var3 = 0;
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    Throwable decompiledCaughtException = decompiledCaughtParameter0;
                    Exception var9 = (Exception) (Object) decompiledCaughtException;
                  }
                }
                decompiledFrameRemainder0 = false;
              } else {
                var7 = 174;
              }
            }
            if (decompiledFrameRemainder0 &&
              var2 == -1) {
              var7 = (char)(hf.a(46, (char) var7) & 255);
              var4 = var4 + this.field_t[var7];
              if (this.field_v != null &&
                var3 != 0) {
                var4 = var4 + this.field_v[(var3 << 8) + var7];
              }
              var3 = var7;
            }
          } else {
            var2 = var6;
          }
        }
        return var4;
    }

    final int b(String param0, int param1, int param2) {
        if (param2 == 0) {
          param2 = this.field_y;
        }
        int var4 = this.a(param0, new int[]{param1}, field_z);
        int var5 = (var4 - 1) * param2;
        return this.field_r + var5 + this.field_x;
    }

    public static void a() {
        field_H = null;
        field_z = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6);

    final int a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var14;
        if (param0 == null) {
          return 0;
        }
        this.a(param5, param6, param7);
        if (param10 == 0) {
          param10 = this.field_y;
        }
        int[] var12 = new int[]{param3};
        if (param4 < this.field_r + this.field_x + param10 &&
          param4 < param10 + param10) {
          var12 = null;
        }
        int var13 = this.a(param0, var12, field_z);
        if (param9 == 3 &&
          var13 == 1) {
          param9 = 1;
        }
        if (param9 == 0) {
          var14 = param2 + this.field_r;
        } else if (param9 == 1) {
          var14 = param2 + this.field_r + (param4 - this.field_r - this.field_x - (var13 - 1) * param10) / 2;
        } else if (param9 != 2) {
          int var15 = (param4 - this.field_r - this.field_x - (var13 - 1) * param10) / (var13 + 1);
          if (var15 < 0) {
            var15 = 0;
          }
          var14 = param2 + this.field_r + var15;
          param10 = param10 + var15;
        } else {
          var14 = param2 + param4 - this.field_x - (var13 - 1) * param10;
        }
        for (int var15Lifetime1 = 0; var15Lifetime1 < var13; var15Lifetime1++) {
          if (param8 == 0) {
            this.a(field_z[var15Lifetime1], param1, var14);
            var14 = var14 + param10;
          } else if (param8 == 1) {
            this.a(field_z[var15Lifetime1], param1 + (param3 - this.b(field_z[var15Lifetime1])) / 2, var14);
            var14 = var14 + param10;
          } else if (param8 != 2) {
            if (var15Lifetime1 != var13 - 1) {
              this.prepareJustification(field_z[var15Lifetime1], param3);
              this.a(field_z[var15Lifetime1], param1, var14);
              field_L = 0;
            } else {
              this.a(field_z[var15Lifetime1], param1, var14);
            }
            var14 = var14 + param10;
          } else {
            this.a(field_z[var15Lifetime1], param1 + param3 - this.b(field_z[var15Lifetime1]), var14);
            var14 = var14 + param10;
          }
        }
        return var13;
    }

    final void c(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.b(param3, param4);
        this.a(param0, param1 - this.b(param0) / 2, param2);
    }

    final int a(char param0) {
        return this.field_t[hf.a(40, param0) & 255];
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 == null) {
          return;
        }
        this.a(param3, param4, param5);
        this.a(param0, param1 - this.b(param0), param2);
    }

    private final void a(String param0) {
        try {
          if (param0.startsWith("col=")) {
            CharSequence var3 = (CharSequence) ((Object) param0.substring(4));
            field_E = GameAppletShell.a(16, 27672, var3);
          } else if (param0.equals("/col")) {
            field_E = field_s;
          } else if (param0.startsWith("trans=")) {
            CharSequence var4 = (CharSequence) ((Object) param0.substring(6));
            field_A = gn.a(16777215, var4);
          } else if (param0.equals("/trans")) {
            field_A = field_J;
          } else if (param0.startsWith("str=")) {
            CharSequence var5 = (CharSequence) ((Object) param0.substring(4));
            field_u = GameAppletShell.a(16, 27672, var5);
          } else if (param0.equals("str")) {
            field_u = 8388608;
          } else if (param0.equals("/str")) {
            field_u = -1;
          } else if (param0.startsWith("u=")) {
            CharSequence var6 = (CharSequence) ((Object) param0.substring(2));
            field_K = GameAppletShell.a(16, 27672, var6);
          } else if (param0.equals("u")) {
            field_K = 0;
          } else if (param0.equals("/u")) {
            field_K = -1;
          } else if (param0.startsWith("shad=")) {
            CharSequence var7 = (CharSequence) ((Object) param0.substring(5));
            field_C = GameAppletShell.a(16, 27672, var7);
          } else if (param0.equals("shad")) {
            field_C = 0;
          } else if (param0.equals("/shad")) {
            field_C = field_I;
          } else if (param0.equals("br")) {
            this.a(field_s, field_I, field_J);
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var2 = (Exception) (Object) decompiledCaughtException;
        }
    }

    final int a(String param0, int[] param1, String[] param2) {
        int stackIn_70_2 = 0;
        Object var17 = null;
        if (param0 == null) {
          return 0;
        }
        ri.a(0, ' ', field_H, (byte) 56);
        int var4 = 0;
        int var5 = 0;
        int var6 = -1;
        int var7 = 0;
        int var8 = 0;
        int var9 = -1;
        int var10 = 0;
        int var11 = 0;
        int var12 = param0.length();
        for (int var13 = 0; var13 < var12; var13++) {
          int var14 = param0.charAt(var13);
          if (var14 != 60) {
            if (var14 == 62 &&
              var9 != -1) {
              String var15 = param0.substring(var9 + 1, var13).toLowerCase();
              var9 = -1;
              StringBuilder discarded$0 = field_H.append('<');
              StringBuilder discarded$1 = field_H.append(var15);
              StringBuilder discarded$2 = field_H.append('>');
              if (var15.equals("br")) {
                param2[var11] = field_H.toString().substring(var5, field_H.length());
                var11++;
                var5 = field_H.length();
                var4 = 0;
                var6 = -1;
                var10 = 0;
              } else if (var15.equals("lt")) {
                var4 = var4 + this.a('<');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 60];
                }
                var10 = 60;
              } else if (var15.equals("gt")) {
                var4 = var4 + this.a('>');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 62];
                }
                var10 = 62;
              } else if (var15.equals("nbsp")) {
                var4 = var4 + this.a(' ');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 160];
                }
                var10 = 160;
              } else if (var15.equals("shy")) {
                var4 = var4 + this.a('­');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 173];
                }
                var10 = 173;
              } else if (var15.equals("times")) {
                var4 = var4 + this.a('×');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 215];
                }
                var10 = 215;
              } else if (var15.equals("euro")) {
                var4 = var4 + this.a('€');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 128];
                }
                var10 = 8364;
              } else if (var15.equals("copy")) {
                var4 = var4 + this.a('©');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 169];
                }
                var10 = 169;
              } else if (var15.equals("reg")) {
                var4 = var4 + this.a('®');
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + 174];
                }
                var10 = 174;
              } else if (var15.startsWith("img=")) {
                try {
                  CharSequence var18 = (CharSequence) ((Object) var15.substring(4));
                  int var16_int = gn.a(16777215, var18);
                  var4 = var4 + this.field_q[var16_int].field_a;
                  var10 = 0;
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  Throwable decompiledCaughtException = decompiledCaughtParameter0;
                  Exception var16 = (Exception) (Object) decompiledCaughtException;
                }
              }
              var14 = 0;
            }
            if (var9 == -1) {
              if (var14 != 0) {
                StringBuilder discarded$3 = field_H.append((char) var14);
                var14 = (char)(hf.a(99, (char) var14) & 255);
                var4 = var4 + this.field_t[var14];
                if (this.field_v != null &&
                  var10 != 0) {
                  var4 = var4 + this.field_v[(var10 << 8) + var14];
                }
                var10 = var14;
              }
              if (var14 == 32) {
                var6 = field_H.length();
                var7 = var4;
                var8 = 1;
              }
              if (param1 != null) {
                int stackIn_69_0 = var4;
                int[] stackIn_69_1 = (int[]) (param1);
                if (var11 >= param1.length) {
                  stackIn_70_2 = param1.length - 1;
                } else {
                  stackIn_70_2 = var11;
                }
                if (stackIn_69_0 > stackIn_69_1[stackIn_70_2] &&
                  var6 >= 0) {
                  param2[var11] = field_H.toString().substring(var5, var6 - var8);
                  var11++;
                  var5 = var6;
                  var6 = -1;
                  var4 = var4 - var7;
                  var10 = 0;
                }
              }
              if (var14 == 45) {
                var6 = field_H.length();
                var7 = var4;
                var8 = 0;
              }
            }
          } else {
            var9 = var13;
          }
        }
        if (field_H.length() > var5) {
          param2[var11] = field_H.toString().substring(var5, field_H.length());
          var11++;
        }
        return var11;
    }

    private final static int computePairKerning(byte[][] param0, byte[][] param1, int[] param2, int[] param3, int[] param4, int param5, int param6) {
        int var7 = param2[param5];
        int var8 = var7 + param4[param5];
        int var9 = param2[param6];
        int var10 = var9 + param4[param6];
        int var11 = var7;
        if (var9 > var7) {
          var11 = var9;
        }
        int var12 = var8;
        if (var10 < var8) {
          var12 = var10;
        }
        int var13 = param3[param5];
        if (param3[param6] < var13) {
          var13 = param3[param6];
        }
        byte[] var14 = param1[param5];
        byte[] var15 = param0[param6];
        int var16 = var11 - var7;
        int var17 = var11 - var9;
        for (int var18 = var11; var18 < var12; var18++) {
          int incrementValue$6 = var16;
          var16++;
          int incrementValue$7 = var17;
          var17++;
          int var19 = var14[incrementValue$6] + var15[incrementValue$7];
          if (var19 < var13) {
            var13 = var19;
          }
        }
        return -var13;
    }

    BitmapFont(byte[] param0, int[] param1, int[] param2, int[] param3, int[] param4) {
        this.field_y = 0;
        this.field_D = param1;
        this.field_B = param2;
        this.field_G = param3;
        this.field_M = param4;
        this.decodeFontMetrics(param0);
        int var6 = 2147483647;
        int var7 = -2147483648;
        for (int var8 = 0; var8 < 256; var8++) {
          if (this.field_B[var8] < var6 &&
            this.field_M[var8] != 0) {
            var6 = this.field_B[var8];
          }
          if (this.field_B[var8] + this.field_M[var8] > var7) {
            var7 = this.field_B[var8] + this.field_M[var8];
          }
        }
        this.field_r = this.field_y - var6;
        this.field_x = var7 - this.field_y;
        this.field_N = this.field_y - this.field_B[88];
    }

    final void b(String param0, int param1, int param2, int param3, int param4) {
        if (param0 == null) {
          return;
        }
        this.b(param3, param4);
        this.a(param0, param1 - this.b(param0), param2);
    }

    static {
        field_H = new StringBuilder(100);
        field_K = -1;
        field_F = 0;
        field_C = -1;
        field_u = -1;
        field_I = -1;
        field_J = 256;
        field_z = new String[100];
        field_s = 0;
        field_E = 0;
        field_L = 0;
        field_A = 256;
    }
}
