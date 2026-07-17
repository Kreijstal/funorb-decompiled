/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bn {
    private int field_m;
    private byte[] field_d;
    private long field_i;
    private ee field_j;
    static String field_n;
    private long field_f;
    static int field_p;
    static bd field_o;
    private int field_a;
    private long field_g;
    private long field_k;
    static bd field_l;
    private byte[] field_e;
    private long field_h;
    static int[] field_b;
    private long field_c;

    final long d(int param0) {
        int var2 = 76 % ((param0 - 55) / 48);
        return ((bn) this).field_f;
    }

    final static String b(int param0) {
        int var1 = -1;
        String var2 = "";
        if (null != ib.field_e) {
            var2 = ib.field_e.k(80);
        }
        if (!(var2.length() != 0)) {
            var2 = aj.b(-30519);
        }
        if (0 == var2.length()) {
            var2 = vg.field_g;
        }
        return var2;
    }

    final void a(int param0, int param1, byte[] param2, byte param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_51_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((bn) this).field_f < ((bn) this).field_h - -(long)param0) {
                ((bn) this).field_f = (long)param0 + ((bn) this).field_h;
                break L1;
              } else {
                break L1;
              }
            }
            if (param3 >= 32) {
              L2: {
                if (((bn) this).field_i == -1L) {
                  break L2;
                } else {
                  L3: {
                    if (((bn) this).field_h < ((bn) this).field_i) {
                      break L3;
                    } else {
                      if (~(((bn) this).field_i - -(long)((bn) this).field_m) > ~((bn) this).field_h) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  this.e(-1);
                  break L2;
                }
              }
              L4: {
                if (((bn) this).field_i == -1L) {
                  break L4;
                } else {
                  if (~((long)param0 + ((bn) this).field_h) >= ~(((bn) this).field_i + (long)((bn) this).field_e.length)) {
                    break L4;
                  } else {
                    var5_int = (int)(-((bn) this).field_h + (((bn) this).field_i + (long)((bn) this).field_e.length));
                    kf.a(param2, param1, ((bn) this).field_e, (int)(((bn) this).field_h - ((bn) this).field_i), var5_int);
                    param1 = param1 + var5_int;
                    ((bn) this).field_h = ((bn) this).field_h + (long)var5_int;
                    param0 = param0 - var5_int;
                    ((bn) this).field_m = ((bn) this).field_e.length;
                    this.e(-1);
                    break L4;
                  }
                }
              }
              if (param0 <= ((bn) this).field_e.length) {
                if (param0 <= 0) {
                  break L0;
                } else {
                  L5: {
                    if (((bn) this).field_i != -1L) {
                      break L5;
                    } else {
                      ((bn) this).field_i = ((bn) this).field_h;
                      break L5;
                    }
                  }
                  L6: {
                    kf.a(param2, param1, ((bn) this).field_e, (int)(((bn) this).field_h + -((bn) this).field_i), param0);
                    ((bn) this).field_h = ((bn) this).field_h + (long)param0;
                    if (~(long)((bn) this).field_m > ~(((bn) this).field_h - ((bn) this).field_i)) {
                      ((bn) this).field_m = (int)(((bn) this).field_h - ((bn) this).field_i);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  if (((bn) this).field_k == ((bn) this).field_h) {
                    break L7;
                  } else {
                    ((bn) this).field_j.a(-18127, ((bn) this).field_h);
                    ((bn) this).field_k = ((bn) this).field_h;
                    break L7;
                  }
                }
                L8: {
                  ((bn) this).field_j.a(0, param2, param1, param0);
                  ((bn) this).field_k = ((bn) this).field_k + (long)param0;
                  if (~((bn) this).field_g > ~((bn) this).field_k) {
                    ((bn) this).field_g = ((bn) this).field_k;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  L10: {
                    var5_long = -1L;
                    if (((bn) this).field_c > ((bn) this).field_h) {
                      break L10;
                    } else {
                      if (((bn) this).field_c - -(long)((bn) this).field_a <= ((bn) this).field_h) {
                        break L10;
                      } else {
                        var5_long = ((bn) this).field_h;
                        break L9;
                      }
                    }
                  }
                  if (~((bn) this).field_h < ~((bn) this).field_c) {
                    break L9;
                  } else {
                    if (~((bn) this).field_c <= ~((long)param0 + ((bn) this).field_h)) {
                      break L9;
                    } else {
                      var5_long = ((bn) this).field_c;
                      break L9;
                    }
                  }
                }
                L11: {
                  L12: {
                    var7 = -1L;
                    if (~((bn) this).field_c <= ~((long)param0 + ((bn) this).field_h)) {
                      break L12;
                    } else {
                      if (~((long)((bn) this).field_a + ((bn) this).field_c) > ~(((bn) this).field_h - -(long)param0)) {
                        break L12;
                      } else {
                        var7 = (long)param0 + ((bn) this).field_h;
                        break L11;
                      }
                    }
                  }
                  if (~((bn) this).field_h <= ~(((bn) this).field_c - -(long)((bn) this).field_a)) {
                    break L11;
                  } else {
                    if (~(((bn) this).field_h - -(long)param0) > ~((long)((bn) this).field_a + ((bn) this).field_c)) {
                      break L11;
                    } else {
                      var7 = (long)((bn) this).field_a + ((bn) this).field_c;
                      break L11;
                    }
                  }
                }
                L13: {
                  if (-1L >= var5_long) {
                    break L13;
                  } else {
                    if (var7 > var5_long) {
                      var9 = (int)(-var5_long + var7);
                      kf.a(param2, (int)(-((bn) this).field_h + ((long)param1 + var5_long)), ((bn) this).field_d, (int)(var5_long + -((bn) this).field_c), var9);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                ((bn) this).field_h = ((bn) this).field_h + (long)param0;
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((bn) this).field_k = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_48_0 = (RuntimeException) var5_ref;
            stackOut_48_1 = new StringBuilder().append("bn.F(").append(param0).append(44).append(param1).append(44);
            stackIn_50_0 = stackOut_48_0;
            stackIn_50_1 = stackOut_48_1;
            stackIn_49_0 = stackOut_48_0;
            stackIn_49_1 = stackOut_48_1;
            if (param2 == null) {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "null";
              stackIn_51_0 = stackOut_50_0;
              stackIn_51_1 = stackOut_50_1;
              stackIn_51_2 = stackOut_50_2;
              break L14;
            } else {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "{...}";
              stackIn_51_0 = stackOut_49_0;
              stackIn_51_1 = stackOut_49_1;
              stackIn_51_2 = stackOut_49_2;
              break L14;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_51_0, stackIn_51_2 + 44 + param3 + 41);
        }
    }

    final void f(int param0) throws IOException {
        this.e(-1);
        ((bn) this).field_j.c(-1);
        if (param0 != 0) {
            bn.a(true);
        }
    }

    private final void e(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = HostileSpawn.field_I ? 1 : 0;
          if (((bn) this).field_i != -1L) {
            L1: {
              if (~((bn) this).field_i != ~((bn) this).field_k) {
                ((bn) this).field_j.a(-18127, ((bn) this).field_i);
                ((bn) this).field_k = ((bn) this).field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((bn) this).field_j.a(0, ((bn) this).field_e, 0, ((bn) this).field_m);
              ((bn) this).field_k = ((bn) this).field_k + (long)((bn) this).field_m;
              if (((bn) this).field_g >= ((bn) this).field_k) {
                break L2;
              } else {
                ((bn) this).field_g = ((bn) this).field_k;
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                var4 = -1L;
                if (~((bn) this).field_c < ~((bn) this).field_i) {
                  break L4;
                } else {
                  if (((bn) this).field_i < ((bn) this).field_c + (long)((bn) this).field_a) {
                    var2 = ((bn) this).field_i;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((bn) this).field_c < ((bn) this).field_i) {
                break L3;
              } else {
                if ((long)((bn) this).field_m + ((bn) this).field_i > ((bn) this).field_c) {
                  var2 = ((bn) this).field_c;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                if (~((bn) this).field_c <= ~(((bn) this).field_i + (long)((bn) this).field_m)) {
                  break L6;
                } else {
                  if (~(((bn) this).field_c + (long)((bn) this).field_a) > ~(((bn) this).field_i - -(long)((bn) this).field_m)) {
                    break L6;
                  } else {
                    var4 = (long)((bn) this).field_m + ((bn) this).field_i;
                    break L5;
                  }
                }
              }
              if (((bn) this).field_i >= (long)((bn) this).field_a + ((bn) this).field_c) {
                break L5;
              } else {
                if (((bn) this).field_i - -(long)((bn) this).field_m >= ((bn) this).field_c + (long)((bn) this).field_a) {
                  var4 = (long)((bn) this).field_a + ((bn) this).field_c;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (~var2 <= ~var4) {
                  break L7;
                } else {
                  var6 = (int)(-var2 + var4);
                  kf.a(((bn) this).field_e, (int)(-((bn) this).field_i + var2), ((bn) this).field_d, (int)(-((bn) this).field_c + var2), var6);
                  break L7;
                }
              }
            }
            ((bn) this).field_m = 0;
            ((bn) this).field_i = -1L;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final void a(byte[] param0, byte param1) throws IOException {
        if (param1 >= -65) {
            return;
        }
        try {
            ((bn) this).a(param0, (byte) -75, 0, param0.length);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "bn.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        ((bn) this).field_a = 0;
        if (((bn) this).field_h != ((bn) this).field_k) {
            ((bn) this).field_j.a(-18127, ((bn) this).field_h);
            ((bn) this).field_k = ((bn) this).field_h;
        }
        ((bn) this).field_c = ((bn) this).field_h;
        while (((bn) this).field_a < ((bn) this).field_d.length) {
            var2 = ((bn) this).field_d.length + -((bn) this).field_a;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            var3 = ((bn) this).field_j.a(((bn) this).field_d, false, var2, ((bn) this).field_a);
            if (var3 == -1) {
                break;
            }
            ((bn) this).field_a = ((bn) this).field_a + var3;
            ((bn) this).field_k = ((bn) this).field_k + (long)var3;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_b = null;
        field_l = null;
        field_n = null;
        field_o = null;
    }

    final static void a(boolean param0, int param1, p param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double var19 = 0.0;
        double var21 = 0.0;
        double var23 = 0.0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var29 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_n = null;
                break L1;
              }
            }
            var12 = uj.field_p.field_e + 32;
            var13 = uj.field_p.field_g + 12;
            var14 = -var12 + am.field_e;
            var15 = jg.field_l + -var13;
            var4_int = var14 << 2;
            var7 = param1 << 2;
            var10 = 1;
            var6 = param3 << 2;
            var5 = var15 << 2;
            var8 = 8;
            var11 = 1;
            var9 = 16;
            var16 = (32 + -param2.field_e) * 200 / 32;
            var17 = (int)((double)var8 / 1.0);
            var18 = (int)((double)var9 / 1.2);
            var19 = 62.83185307179586 + param2.field_c;
            var21 = 12.0;
            var23 = 3.141592653589793 * var19 / 128.0;
            var25 = (int)(Math.sin(var23) * -var21);
            var26 = (int)(-var21 * Math.cos(var23));
            var27 = 0;
            L2: while (true) {
              if (var27 >= 255) {
                km.a((byte) var10, var26 + var7, var5 + var26, ni.field_c, var9, var25 + var6, (byte) var11, 85, var4_int - -var25, var16, var8);
                bh.a((byte) var10, cn.field_e, (byte) var11, var17, var4_int - -var25, var5 - -var26, var7 - -var26, var18, var16, var6 - -var25, 9233);
                km.a((byte) var10, -var26 + var7, var5 + -var26, ni.field_c, var9, var6 - var25, (byte) var11, 117, -var25 + var4_int, var16, var8);
                bh.a((byte) var10, cn.field_e, (byte) var11, var17, var4_int + -var25, -var26 + var5, -var26 + var7, var18, var16, -var25 + var6, 9233);
                break L0;
              } else {
                L3: {
                  var28 = 3 * (var27 + -128);
                  if (var28 > 255) {
                    var28 = 255;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var28 < 0) {
                    var28 = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                cn.field_e[var27] = 256 * var27 - -var28;
                var27++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("bn.I(").append(param0).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
    }

    final static java.applet.Applet c(int param0) {
        if (param0 != -1) {
            field_n = null;
        }
        if (p.field_a != null) {
            return p.field_a;
        }
        return (java.applet.Applet) (Object) te.field_E;
    }

    final static void a(int param0, oj param1) {
        try {
            if (param0 != 3) {
                Object var3 = null;
                bn.a(false, -123, (p) null, 64);
            }
            ue.a(param1.field_M, false);
            param1.field_M = 0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "bn.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(long param0, byte param1) throws IOException {
        if (!(param0 >= 0L)) {
            throw new IOException();
        }
        if (param1 < 83) {
            Object var5 = null;
            bn.a(false, 118, (p) null, 42);
        }
        ((bn) this).field_h = param0;
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        var14 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param3 + param2 > param0.length) {
              throw new ArrayIndexOutOfBoundsException(-param0.length + param3 + param2);
            } else {
              L1: {
                if (((bn) this).field_i == -1L) {
                  break L1;
                } else {
                  if (((bn) this).field_h < ((bn) this).field_i) {
                    break L1;
                  } else {
                    if ((long)param3 + ((bn) this).field_h > ((bn) this).field_i + (long)((bn) this).field_m) {
                      break L1;
                    } else {
                      kf.a(((bn) this).field_e, (int)(-((bn) this).field_i + ((bn) this).field_h), param0, param2, param3);
                      ((bn) this).field_h = ((bn) this).field_h + (long)param3;
                      return;
                    }
                  }
                }
              }
              L2: {
                var5_long = ((bn) this).field_h;
                var7 = param2;
                var8 = param3;
                if (~((bn) this).field_c < ~((bn) this).field_h) {
                  break L2;
                } else {
                  if (~(((bn) this).field_c + (long)((bn) this).field_a) >= ~((bn) this).field_h) {
                    break L2;
                  } else {
                    L3: {
                      var9_int = (int)(-((bn) this).field_h + ((bn) this).field_c + (long)((bn) this).field_a);
                      if (param3 >= var9_int) {
                        break L3;
                      } else {
                        var9_int = param3;
                        break L3;
                      }
                    }
                    kf.a(((bn) this).field_d, (int)(((bn) this).field_h - ((bn) this).field_c), param0, param2, var9_int);
                    param2 = param2 + var9_int;
                    ((bn) this).field_h = ((bn) this).field_h + (long)var9_int;
                    param3 = param3 - var9_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (param3 <= ((bn) this).field_d.length) {
                  if (param3 <= 0) {
                    break L4;
                  } else {
                    L5: {
                      this.a(13740);
                      var9_int = param3;
                      if (((bn) this).field_a >= var9_int) {
                        break L5;
                      } else {
                        var9_int = ((bn) this).field_a;
                        break L5;
                      }
                    }
                    kf.a(((bn) this).field_d, 0, param0, param2, var9_int);
                    param3 = param3 - var9_int;
                    ((bn) this).field_h = ((bn) this).field_h + (long)var9_int;
                    param2 = param2 + var9_int;
                    break L4;
                  }
                } else {
                  ((bn) this).field_j.a(-18127, ((bn) this).field_h);
                  ((bn) this).field_k = ((bn) this).field_h;
                  L6: while (true) {
                    if (param3 <= 0) {
                      break L4;
                    } else {
                      var9_int = ((bn) this).field_j.a(param0, false, param3, param2);
                      if (var9_int == -1) {
                        break L4;
                      } else {
                        ((bn) this).field_k = ((bn) this).field_k + (long)var9_int;
                        ((bn) this).field_h = ((bn) this).field_h + (long)var9_int;
                        param2 = param2 + var9_int;
                        param3 = param3 - var9_int;
                        continue L6;
                      }
                    }
                  }
                }
              }
              L7: {
                if (-1L == ((bn) this).field_i) {
                  break L7;
                } else {
                  L8: {
                    if (((bn) this).field_h >= ((bn) this).field_i) {
                      break L8;
                    } else {
                      if (param3 > 0) {
                        L9: {
                          var9_int = (int)(-((bn) this).field_h + ((bn) this).field_i) + param2;
                          if (var9_int > param2 - -param3) {
                            var9_int = param3 + param2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (param2 >= var9_int) {
                            break L8;
                          } else {
                            int incrementValue$1 = param2;
                            param2++;
                            param0[incrementValue$1] = (byte) 0;
                            param3--;
                            ((bn) this).field_h = ((bn) this).field_h + 1L;
                            continue L10;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    L12: {
                      var9 = -1L;
                      if (((bn) this).field_i < var5_long) {
                        break L12;
                      } else {
                        if (((bn) this).field_i < var5_long + (long)var8) {
                          var9 = ((bn) this).field_i;
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (~((bn) this).field_i < ~var5_long) {
                      break L11;
                    } else {
                      if (~var5_long > ~(((bn) this).field_i - -(long)((bn) this).field_m)) {
                        var9 = var5_long;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      var11 = -1L;
                      if (var5_long >= (long)((bn) this).field_m + ((bn) this).field_i) {
                        break L14;
                      } else {
                        if (~(((bn) this).field_i + (long)((bn) this).field_m) >= ~(var5_long - -(long)var8)) {
                          var11 = (long)((bn) this).field_m + ((bn) this).field_i;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (~((bn) this).field_i <= ~((long)var8 + var5_long)) {
                      break L13;
                    } else {
                      if (((bn) this).field_i + (long)((bn) this).field_m >= var5_long - -(long)var8) {
                        var11 = var5_long + (long)var8;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (var9 <= -1L) {
                    break L7;
                  } else {
                    if (var11 > var9) {
                      var13 = (int)(var11 + -var9);
                      kf.a(((bn) this).field_e, (int)(var9 + -((bn) this).field_i), param0, var7 - -(int)(-var5_long + var9), var13);
                      if (~((bn) this).field_h <= ~var11) {
                        break L7;
                      } else {
                        param3 = (int)((long)param3 - (-((bn) this).field_h + var11));
                        ((bn) this).field_h = var11;
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L15: {
                if (param1 < -17) {
                  break L15;
                } else {
                  bn.a(false);
                  break L15;
                }
              }
              if (param3 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((bn) this).field_k = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_61_0 = (RuntimeException) var5_ref;
            stackOut_61_1 = new StringBuilder().append("bn.K(");
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param0 == null) {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L16;
            } else {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L16;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_64_0, stackIn_64_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    bn(ee param0, int param1, int param2) throws IOException {
        ((bn) this).field_m = 0;
        ((bn) this).field_i = -1L;
        ((bn) this).field_c = -1L;
        try {
            ((bn) this).field_j = param0;
            long dupTemp$0 = param0.a(-1);
            ((bn) this).field_g = dupTemp$0;
            ((bn) this).field_f = dupTemp$0;
            ((bn) this).field_e = new byte[param2];
            ((bn) this).field_d = new byte[param1];
            ((bn) this).field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "bn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "This rocket launcher will help me get past blast doors and turrets.";
    }
}
