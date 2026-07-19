/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qh {
    static boolean field_g;
    static String field_h;
    static boolean field_d;
    private int[][] field_i;
    static String field_f;
    static pb[] field_a;
    static wk field_e;
    private int field_c;
    private int field_b;

    final int a(int param0, int param1) {
        int var3 = 64 % ((param1 - -51) / 53);
        if (null != this.field_i) {
            param0 = (int)((long)param0 * (long)this.field_c / (long)this.field_b);
        }
        return param0;
    }

    final static void a(boolean param0) {
        qh.b(-21923);
        if (!param0) {
            return;
        }
        rh.a(4, (byte) -72);
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (param0 >= 52) {
            break L0;
          } else {
            field_a = (pb[]) null;
            break L0;
          }
        }
        var1_ref = pk.field_e;
        synchronized (var1_ref) {
          L1: {
            if (di.field_a != q.field_c) {
              gi.field_f = sf.field_d[di.field_a];
              uc.field_b = ac.field_i[di.field_a];
              di.field_a = 127 & di.field_a + 1;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    final byte[] a(int param0, byte[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var15 = null;
        int[] var17 = null;
        int[] var19 = null;
        byte[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_16_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var12 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var3_int = -69 % ((17 - param0) / 59);
              if (this.field_i == null) {
                break L1;
              } else {
                var4 = (int)((long)param1.length * (long)this.field_c / (long)this.field_b) - -14;
                var17 = new int[var4];
                var15 = var17;
                var5 = var15;
                var6 = 0;
                var7 = 0;
                var8 = 0;
                L2: while (true) {
                  if (var8 >= param1.length) {
                    param1 = new byte[var4];
                    var13 = 0;
                    var8 = var13;
                    L3: while (true) {
                      if (var4 <= var13) {
                        break L1;
                      } else {
                        L4: {
                          var9 = 32768 + var17[var13] >> -1090445136;
                          if (-128 > var9) {
                            param1[var13] = (byte)-128;
                            break L4;
                          } else {
                            if (127 >= var9) {
                              param1[var13] = (byte)var9;
                              break L4;
                            } else {
                              param1[var13] = (byte)127;
                              break L4;
                            }
                          }
                        }
                        var13++;
                        continue L3;
                      }
                    }
                  } else {
                    var9 = param1[var8];
                    var19 = this.field_i[var7];
                    var11 = 0;
                    L5: while (true) {
                      if (var11 >= 14) {
                        var7 = var7 + this.field_c;
                        var11 = var7 / this.field_b;
                        var6 = var6 + var11;
                        var7 = var7 - var11 * this.field_b;
                        var8++;
                        continue L2;
                      } else {
                        var5[var11 + var6] = var5[var11 + var6] + var19[var11] * var9;
                        var11++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            stackOut_16_0 = (byte[]) (param1);
            stackIn_17_0 = stackOut_16_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("qh.A(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        return stackIn_17_0;
    }

    final int b(int param0, int param1) {
        int discarded$0 = 0;
        if (this.field_i != null) {
            param0 = (int)((long)this.field_c * (long)param0 / (long)this.field_b) + 6;
        }
        if (param1 != -10689) {
            discarded$0 = this.a(121, 34);
        }
        return param0;
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != -15520) {
            field_f = (String) null;
        }
        field_e = null;
        field_h = null;
        field_a = null;
    }

    final static void b(int param0) {
        na.field_d.e((byte) 109);
        if (param0 != -21923) {
            return;
        }
        if (qf.field_d == null) {
            qf.field_d = new ql(na.field_d, ii.field_F);
        }
        na.field_d.a((byte) 72, (rj) (qf.field_d));
    }

    final static void a(int param0, ha param1) {
        try {
            int discarded$1 = 0;
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            lb var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lb var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = stellarshard.field_B;
            try {
              L0: {
                var13 = (lb) ((Object) oc.field_c.b(-121));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L1: {
                    var3 = 0;
                    if (param0 >= 84) {
                      break L1;
                    } else {
                      qh.a(false);
                      break L1;
                    }
                  }
                  var4 = 0;
                  L2: while (true) {
                    if (var17.field_s <= var4) {
                      if (var3 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = param1.field_k;
                        param1.b(0, var17.field_l);
                        var5 = 0;
                        L3: while (true) {
                          if (var17.field_s <= var5) {
                            discarded$1 = param1.c(var4, (byte) -3);
                            var17.c(20);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (-1 != (var17.field_p[var5] ^ -1)) {
                                param1.a(false, var17.field_p[var5]);
                                break L4;
                              } else {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_k[var5];
                                      if (0 == var6_int) {
                                        var15 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                                        var8 = var15.getInt((Object) null);
                                        param1.a(false, 0);
                                        param1.b(0, var8);
                                        break L6;
                                      } else {
                                        if (-2 == (var6_int ^ -1)) {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_n[var5]);
                                          param1.a(false, 0);
                                          break L6;
                                        } else {
                                          if (2 != var6_int) {
                                            break L6;
                                          } else {
                                            var26 = (java.lang.reflect.Field) (var17.field_r[var5].field_b);
                                            var8 = var26.getModifiers();
                                            param1.a(false, 0);
                                            param1.b(0, var8);
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) (var17.field_q[var5].field_b);
                                        var25 = var17.field_m[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param1.a(false, 1);
                                                param1.a((byte) 120, ((Number) (var10)).longValue());
                                                break L7;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param1.a(false, 4);
                                                  break L7;
                                                } else {
                                                  param1.a(false, 2);
                                                  param1.b((String) (var10), -9799);
                                                  break L7;
                                                }
                                              }
                                            } else {
                                              param1.a(false, 0);
                                              break L7;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        if (4 == var6_int) {
                                          var27 = (java.lang.reflect.Method) (var17.field_q[var5].field_b);
                                          var8 = var27.getModifiers();
                                          param1.a(false, 0);
                                          param1.b(0, var8);
                                          break L7;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param1.a(false, -10);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param1.a(false, -11);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param1.a(false, -12);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param1.a(false, -13);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param1.a(false, -14);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.a(false, -15);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.a(false, -16);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param1.a(false, -17);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.a(false, -18);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.a(false, -19);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.a(false, -20);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.a(false, -21);
                                    break L20;
                                  }
                                }
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      L21: {
                        if (null == var13.field_r[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if ((var13.field_r[var4].field_f ^ -1) != -3) {
                              break L22;
                            } else {
                              var13.field_p[var4] = -5;
                              break L22;
                            }
                          }
                          if (var13.field_r[var4].field_f == 0) {
                            var3 = 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      if (null != var13.field_q[var4]) {
                        L23: {
                          if (var13.field_q[var4].field_f == 2) {
                            var13.field_p[var4] = -6;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        if (0 == var13.field_q[var4].field_f) {
                          var3 = 1;
                          var4++;
                          continue L2;
                        } else {
                          var4++;
                          continue L2;
                        }
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) (var2);
                stackOut_66_1 = new StringBuilder().append("qh.D(").append(param0).append(',');
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (param1 == null) {
                  stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
                  stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L24;
                } else {
                  stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
                  stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L24;
                }
              }
              throw ma.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qh(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = fe.a(-102, param0, param1);
          param0 = param0 / var3;
          param1 = param1 / var3;
          this.field_b = param0;
          this.field_i = new int[param0][14];
          this.field_c = param1;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = this.field_i[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(1.0 + (-7.0 + var6));
                if ((var8 ^ -1) <= -1) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if ((var9 ^ -1) >= -15) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var8 >= var9) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = (-var6 + (double)var8) * 3.141592653589793;
                      var14 = var10;
                      if (-0.0001 > var12) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46);
                  var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        field_f = "Waiting for music";
        field_h = "Ion cannon";
        field_g = false;
    }
}
