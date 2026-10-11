/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mk {
    private int field_l;
    int field_a;
    int field_b;
    int field_g;
    private dk field_i;
    private int field_n;
    static String field_h;
    int field_e;
    private int field_c;
    static String field_f;
    private int field_m;
    int field_d;
    int field_k;
    static uc field_j;

    public static void d(byte param0) {
        field_j = null;
        field_f = null;
        int var1 = 61 % ((-36 - param0) / 54);
        field_h = null;
    }

    final void b(int param0) {
        dl stackIn_107_0 = null;
        int stackIn_108_1 = 0;
        dl stackIn_112_0 = null;
        int stackIn_113_1 = 0;
        dl stackIn_118_0 = null;
        int stackIn_119_1 = 0;
        int var2 = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        if (1 == this.field_a) {
          if (this.field_b > 0) {
            this.field_b = this.field_b - 1;
            this.field_m = this.field_m + 1;
          }
          if (this.field_b < 0) {
            this.field_b = this.field_b + 1;
            this.field_m = this.field_m - 1;
          }
          if (this.field_m < 0) {
            this.field_m = this.field_m + 16;
          }
          if (16 <= this.field_m) {
            this.field_m = this.field_m - 16;
          }
        }
        if (0 < j.field_R) {
          j.field_R = j.field_R - 1;
        }
        if (this.field_a == 2) {
          if (this.field_b > 0) {
            this.field_b = this.field_b - 1;
            this.field_l = this.field_l + 4;
          }
          if (this.field_b < 0) {
            this.field_b = this.field_b + 1;
            this.field_l = this.field_l - 4;
          }
          if (this.field_l < 0) {
            this.field_l = this.field_l + 84;
          }
          if (this.field_l >= 84) {
            this.field_l = this.field_l - 84;
          }
        }
        var2 = -51 % ((param0 - 35) / 37);
        if (3 == this.field_a) {
          if (this.field_b > 0) {
            this.field_b = this.field_b - 1;
            this.field_n = this.field_n + 1;
          }
          if (this.field_b < 0) {
            this.field_n = this.field_n - 1;
            this.field_b = this.field_b + 1;
          }
          if (this.field_n < 0) {
            this.field_n = this.field_n + 80;
          }
          if (this.field_n >= 80) {
            this.field_n = this.field_n - 80;
          }
        }
        boolean decompiledFrameRemainder5 = true;
        if (this.field_g != 0 ||
          this.field_e != 0) {
          boolean decompiledFrameRemainder4 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          if ((null != this.field_i) &&
            (decompiledFrameRemainder5 = (uf.field_c != -1))) {
            var3 = this.field_i.field_f[uf.field_c][vf.field_a];
            if (this.field_a != 0) {
              if (var3 == null) {
                this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
              }
              var3 = this.field_i.field_f[uf.field_c][vf.field_a];
            }
            if (tg.field_l > 0 &&
              var3 != null) {
              if (null != var3.field_C &&
                tg.field_l > var3.field_r) {
                var3 = var3.field_C;
              }
              if (var3.field_C != null &&
                var3.field_r < tg.field_l) {
                var3 = var3.field_C;
              }
              if (null != var3.field_C &&
                tg.field_l > var3.field_r) {
                var3 = var3.field_C;
              }
              if (var3.field_C != null &&
                var3.field_r < tg.field_l) {
                var3 = var3.field_C;
              }
              while (true) {
                if (var3.field_r >= tg.field_l) {
                  break;
                }
                var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, this.field_i);
                var3.field_C.field_c = var3;
                var3 = var3.field_C;
                if (var5 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted1) {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameRemainder1 = true;
              var4 = this.field_a;
              if ((var4 != 0 ||
                var5 != 0) &&
                (decompiledFrameRemainder1 = (var4 != 1 ||
                var5 != 0)) &&
                (decompiledFrameRemainder2 = (var4 != 2 ||
                var5 != 0)) &&
                (decompiledFrameRemainder4 = (var4 == 3))) {
                decompiledFrameRemainder3 = (var5 != 0);
              }
              if ((decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                boolean decompiledFrameRemainder0 = true;
                if (this.field_g == 1) {
                  if (var3 == null) {
                    this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    while (true) {
                      if (null != var3.field_C) {
                        var3 = var3.field_C;
                        if (var5 == 0) {
                          continue;
                        }
                      } else {
                        var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, this.field_i);
                      }
                      break;
                    }
                    var3.field_C.field_c = var3;
                  }
                }
                decompiledFrameRemainder4 = (this.field_e == 2);
                if ((decompiledFrameRemainder4) &&
                  (decompiledFrameRemainder5 = (var3 != null))) {
                  while (true) {
                    if (null != var3.field_C) {
                      var3 = var3.field_C;
                      if (var5 == 0) {
                        continue;
                      }
                    } else {
                      if (var3.field_c != null) {
                        var3.field_c.field_C = null;
                        if (var5 == 0) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                      }
                      this.field_i.field_f[uf.field_c][vf.field_a] = null;
                    }
                    break;
                  }
                  if (decompiledFrameCompleted0) {
                    decompiledFrameRemainder4 = (var5 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (decompiledFrameCompleted0)) {
                if (1 == this.field_e) {
                  var3.field_b = this.field_m;
                }
                decompiledFrameRemainder4 = (this.field_e == 2);
                if (decompiledFrameRemainder4) {
                  var3.field_b = -1;
                  decompiledFrameRemainder4 = (var5 != 0);
                }
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameRemainder3) &&
                (decompiledFrameCompleted0)) {
                if (this.field_g == 2) {
                  stackIn_107_0 = var3;
                  if (~this.field_l == ~var3.field_k) {
                    stackIn_108_1 = -1;
                  } else {
                    stackIn_108_1 = this.field_l;
                  }
                  stackIn_107_0.field_k = stackIn_108_1;
                }
                decompiledFrameRemainder4 = (this.field_g == 1);
                if (decompiledFrameRemainder4) {
                  stackIn_112_0 = var3;
                  if (~var3.field_g != ~this.field_l) {
                    stackIn_113_1 = this.field_l;
                  } else {
                    stackIn_113_1 = -1;
                  }
                  stackIn_112_0.field_g = stackIn_113_1;
                  decompiledFrameRemainder4 = (var5 != 0);
                }
              }
              if ((decompiledFrameRemainder5) &&
                (decompiledFrameRemainder4) &&
                (decompiledFrameCompleted0)) {
                if (1 == this.field_g) {
                  stackIn_118_0 = var3;
                  if (~this.field_n != ~var3.field_j) {
                    stackIn_119_1 = this.field_n;
                  } else {
                    stackIn_119_1 = -1;
                  }
                  stackIn_118_0.field_j = stackIn_119_1;
                }
                decompiledFrameRemainder5 = (this.field_e == 2);
                if (decompiledFrameRemainder5) {
                  var3.field_j = -1;
                }
              }
            }
          }
        }

    }

    final void a(byte param0) {
        Object var2 = null;
        byte[] var2_array = of.field_k[this.field_c];
        if (var2_array == null) {
          this.field_i = new dk(16, 16);
          this.field_i.field_l = this;
          return;
        }
        this.a(false, var2_array);
        if (param0 > -42) {
          this.a(true, (byte[]) null);
        }
    }

    final void b(byte param0) {
        dl var2 = null;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        var2 = this.field_i.field_f[uf.field_c][vf.field_a];
        if (param0 <= 121) {
          mk.d((byte) 89);
        }
        if (0 != this.field_a) {
          if (var2 == null) {
            this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
          }
          var2 = this.field_i.field_f[uf.field_c][vf.field_a];
        }
        boolean decompiledFrameRemainder0 = true;
        boolean decompiledFrameCompleted0 = true;
        if (tg.field_l > 0 &&
          var2 != null) {
          if (null != var2.field_C &&
            var2.field_r < tg.field_l) {
            var2 = var2.field_C;
          }
          if (null != var2.field_C &&
            var2.field_r < tg.field_l) {
            var2 = var2.field_C;
          }
          if (null != var2.field_C &&
            var2.field_r < tg.field_l) {
            var2 = var2.field_C;
          }
          if (var2.field_C != null &&
            var2.field_r < tg.field_l) {
            var2 = var2.field_C;
          }
          while (true) {
            if (tg.field_l <= var2.field_r) {
              break;
            }
            var2.field_C = new dl(uf.field_c, vf.field_a, 1 + var2.field_r, this.field_i);
            var2.field_C.field_c = var2;
            var2 = var2.field_C;
            if (var3 != 0) {
              decompiledFrameCompleted0 = false;
              break;
            }
          }
        }
        if (decompiledFrameCompleted0) {
          decompiledFrameRemainder0 = (var2 != null);
        }
        if (decompiledFrameRemainder0) {
          if (var2.field_k != -1) {
            var2.field_k = 3 + var2.field_k / 4 * 4;
          }
          if (var2.field_g != -1) {
            var2.field_g = 3 + 4 * (var2.field_g / 4);
          }
        }

    }

    final void a(int param0, int param1) {
        this.c(-13859);
        this.field_c = this.field_c + param1;
        if (param0 != 23172) {
          this.a(true, (byte[]) null);
        }
        if (this.field_c < 0) {
          this.field_c = ph.field_n.length - 1;
        }
        if (!(this.field_c < ph.field_n.length)) {
          this.field_c = 0;
        }
        this.a((byte) -118);
        fg.field_c = "LEVEL CHANGED";
        j.field_R = 256;
    }

    final void c(int param0) {
        if (null == this.field_i) {
          return;
        }
        fg.field_c = "MAP SAVING";
        j.field_R = 256;
        String var2 = ph.field_n[this.field_c] + ".lev";
        byte[] var3 = this.field_i.a(true);
        of.field_k[wf.a(var2, true)] = var3;
        fg.field_c = "MAP SAVED";
        j.field_R = 256;
        if (param0 != -13859) {
          this.b(-93, 17);
        }
    }

    final static int a(int param0) {
        if (param0 != -1) {
          field_f = (String) null;
        }
        return -vi.field_o + ql.field_g;
    }

    private final void a(boolean param0, String param1, int param2, int param3, int param4) {
        og.field_f.a(param1, param4 + 3, param2 + 3, 8421504, -1);
        og.field_f.a(param1, param4 + 2, param2 + 2, 8421504, -1);
        if (param0) {
          return;
        }
        try {
          og.field_f.a(param1, 1 + param4, param2 + 1, 8421504, -1);
          og.field_f.a(param1, param4 + 1, param2, 0, -1);
          og.field_f.a(param1, param4 - 1, param2, 0, -1);
          og.field_f.a(param1, param4, -1 + param2, 0, -1);
          og.field_f.a(param1, param4, param2 + 1, 0, -1);
          og.field_f.a(param1, param4, param2, param3, -1);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "mk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, byte[] param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          fg.field_c = "MAP LOADING";
          j.field_R = 256;
          this.field_i = new dk(param1);
          if (param0) {
            this.b((byte) -127);
          }
          fg.field_c = "MAP LOADED";
          j.field_R = 256;
          if (this.field_i != null) {
            this.field_i.field_l = this;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        Exception exception = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        String var6 = null;
        Throwable decompiledCaughtException = null;
        if (null != this.field_i) {
          boolean decompiledSharedTail0 = !(param0 > 0);
          if (!decompiledSharedTail0) {
            var3 = param0 + this.field_i.field_b;
            var4 = this.field_i.field_e + param0;
            this.c(-13859);
            var5 = null;
            var6 = ph.field_n[this.field_c] + ".lev";
            try {
              var5_array = vl.a(75, new File(var6));
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              System.out.println(exception);
            }
            this.field_i = new dk(var3, var4);
            this.field_i.field_l = this;
            if (var5_array != null) {
              this.field_i.a(0, (byte) 104, 0, var5_array);
            }
            decompiledSharedTail0 = (Terraphoenix.field_V != 0);
          }
          if (decompiledSharedTail0) {
            this.field_i.field_b = this.field_i.field_b + param0;
            this.field_i.field_e = this.field_i.field_e + param0;
            if (this.field_i.field_b < 2) {
              this.field_i.field_b = 2;
            }
            if (this.field_i.field_e < 2) {
              this.field_i.field_e = 2;
            }
          }
        }
        if (param1 <= 83) {
          this.b(51, -121);
        }
    }

    final void c(byte param0) {
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        var7 = Terraphoenix.field_V;
        vc.field_f.b(ph.field_n[this.field_c], 24, 24, 0, -1);
        if (this.field_i != null) {
          vc.field_f.b("MAP: " + this.field_i.field_b + " x " + this.field_i.field_e, 24, 48, 16711935, -1);
          vc.field_f.b("Level:" + tg.field_l, 24, 72, 16711935, -1);
          this.field_i.d(-125);
          if (var7 != 0) {
            vc.field_f.b("MAP IS NULL", 24, 48, 16711680, -1);
          }
        } else {
          vc.field_f.b("MAP IS NULL", 24, 48, 16711680, -1);
        }
        if (this.field_a < 0) {
          this.field_a = 0;
        }
        if (3 < this.field_a) {
          this.field_a = 3;
        }
        if (0 == this.field_a) {
          var2 = 616;
          var3 = 36;
          this.a(false, "MODE: Add/Remove Squares", var3, 16777215, var2);
          var3 += 14;
          this.a(false, "lmb - add square", var3, 16777215, var2);
          var3 += 12;
          this.a(false, "rmb - remove square", var3, 16777215, var2);
          var3 += 20;
          this.a(false, "a/s - change mode", var3, 16777215, var2);
        }
        if (this.field_a == 1) {
          var2Lifetime1 = 616;
          var3Lifetime1 = 36;
          this.a(false, "MODE: Floors", var3Lifetime1, 16777215, var2Lifetime1);
          var3Lifetime1 += 14;
          this.a(false, "lmb - set floor", var3Lifetime1, 16777215, var2Lifetime1);
          var3Lifetime1 += 12;
          this.a(false, "rmb - remove floor", var3Lifetime1, 16777215, var2Lifetime1);
          var3Lifetime1 += 12;
          this.a(false, "z/x - change floor", var3Lifetime1, 16777215, var2Lifetime1);
          var3Lifetime1 += 20;
          this.a(false, "a/s - change mode", var3Lifetime1, 16777215, var2Lifetime1);
        }
        L6: {
          if (2 == this.field_a) {
            var2Lifetime2 = 616;
            var3Lifetime2 = 36;
            this.a(false, "MODE: Walls", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 14;
            this.a(false, "lmb - toggle left", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 12;
            this.a(false, "rmb - toggle right", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 12;
            this.a(false, "z/x - change wall", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 20;
            this.a(false, "a/s - change mode", var3Lifetime2, 16777215, var2Lifetime2);
            this.a(false, "MODE: Objects", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 14;
            this.a(false, "lmb - add object", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 12;
            this.a(false, "rmb - remove object", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 12;
            this.a(false, "z/x - change object", var3Lifetime2, 16777215, var2Lifetime2);
            var3Lifetime2 += 20;
            this.a(false, "a/s - change mode", var3Lifetime2, 16777215, var2Lifetime2);
            var4 = 40;
            var5 = 32;
            var6 = 0;
            while (80 > var6) {
              var3Lifetime2 = -192 + (var5 * (var6 / 16) + 480);
              var2Lifetime2 = var4 * (var6 % 16);
              kg.field_r[var6].a(var2Lifetime2, var3Lifetime2, var4, var5);
              stackIn_37_0 = this.field_n;
              stackIn_37_1 = var6;
              if (var7 != 0) {
                break L6;
              }
              if (stackIn_37_0 == stackIn_37_1) {
                l.e(var2Lifetime2, var3Lifetime2, var4, var5, 65280);
              }
              var6++;
            }
          }
          var2Lifetime2 = 616;
          var3Lifetime2 = 110;
          this.a(false, "9 / 0 - change level size", var3Lifetime2, 16711680, var2Lifetime2);
          var3Lifetime2 += 14;
          this.a(false, "[ / ] - switch level", var3Lifetime2, 16711680, var2Lifetime2);
          var3Lifetime2 += 14;
          this.a(false, "o / p - change view level", var3Lifetime2, 16777215, var2Lifetime2);
          var3Lifetime2 += 14;
          if (dh.field_j) {
            this.a(false, "q - view current level", var3Lifetime2, 65535, var2Lifetime2);
          }
          var3Lifetime2 += 14;
          if (!dh.field_j) {
            this.a(false, "q - view below", var3Lifetime2, 16776960, var2Lifetime2);
          }
          var3Lifetime2 += 14;
          if (ll.field_c) {
            this.a(false, "w - turn off walls", var3Lifetime2, 65535, var2Lifetime2);
          }
          var3Lifetime2 += 14;
          if (!ll.field_c) {
            this.a(false, "w - turn on walls", var3Lifetime2, 16776960, var2Lifetime2);
          }
          var3Lifetime2 += 14;
          if (jb.field_a) {
            this.a(false, "e - hide objects", var3Lifetime2, 65535, var2Lifetime2);
          }
          var3Lifetime2 += 14;
          if (!jb.field_a) {
            this.a(false, "e - show objects", var3Lifetime2, 16776960, var2Lifetime2);
          }
          var3Lifetime2 += 14;
          var3Lifetime2 += 14;
          this.a(false, "IMPORTANT", var3Lifetime2, 16711680, var2Lifetime2);
          var3Lifetime2 += 14;
          this.a(false, "YOU CANNOT SAVE LEVELS", var3Lifetime2, 16711680, var2Lifetime2);
          var3Lifetime2 += 14;
          this.a(false, "DO NOT BUILD LEVELS ON", var3Lifetime2, 16711680, var2Lifetime2);
          stackIn_37_0 = param0;
          stackIn_37_1 = -17;
        }
        if (stackIn_37_0 > stackIn_37_1) {
          return;
        }
        var3Lifetime2 += 14;
        this.a(false, "THIS VERSION THAT YOU", var3Lifetime2, 16711680, var2Lifetime2);
        var3Lifetime2 += 14;
        this.a(false, "WISH TO KEEP", var3Lifetime2, 16711680, var2Lifetime2);
        var3Lifetime2 += 14;
        if (null != fg.field_c) {
          vc.field_f.b(fg.field_c, 24, 456, j.field_R, -1);
        }
    }

    mk() {
        j.field_R = 256;
        this.field_l = 0;
        this.field_a = 0;
        this.field_n = 0;
        this.field_m = 0;
        this.field_b = 0;
        this.field_c = 0;
        fg.field_c = "Editor started";
    }

    static {
        field_h = "Try again";
        field_f = "Enemy Turn";
    }
}
