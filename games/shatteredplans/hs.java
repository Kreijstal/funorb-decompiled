/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

class hs implements fo {
    int field_e;
    int field_h;
    static nf field_j;
    static int[] field_i;
    ln[] field_f;
    int field_d;
    int field_c;
    private int field_k;
    int field_b;
    static qf field_l;
    static String field_g;
    int field_a;

    private final void a(l param0, int param1) {
        int var3_int = 0;
        ln[] var8 = null;
        ln var11 = null;
        ln[] var9 = null;
        int var10 = 0;
        ln var12 = null;
        ln var6 = null;
        int var5 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            og.a(-119, this.field_f, this.field_c, this.field_b);
            var3_int = nn.a(param0.field_e, 0);
            vf.a(this.field_c, var3_int, (int)(200.0 * rh.field_d / 2.0), true, param0.field_e, param0.field_j, this.field_f);
            var8 = param0.field_e;
            for (var5 = 0; var8.length > var5; var5++) {
                var11 = var8[var5];
                var11.e((byte) -126);
            }
            var9 = param0.field_e;
            var10 = param1;
            var5 = var10;
            while (var10 < var9.length) {
                var12 = var9[var10];
                var6 = var12;
                if (!(var12.field_D != null)) {
                    var6.field_D = new ln[]{};
                }
                var10++;
            }
            param0.a(param1 + 26253);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hs.AA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void c(l param0, int param1) {
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 >= 0) {
              var7 = param0.field_e;
              var3 = var7;
              var4 = 0;
              L1: while (true) {
                if (var7.length <= var4) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = var7[var4];
                  var5.a(param0.field_j, (byte) 82);
                  var4++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("hs.V(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0) {
        int var2 = 0;
        ln var3 = null;
        int var4 = 0;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -11) {
            break L0;
          } else {
            field_i = (int[]) null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (this.field_f.length <= var2) {
            return;
          } else {
            if (this.field_f[var2] != null) {
              L2: {
                var3 = this.field_f[var2];
                var4 = var2 / this.field_c;
                if (var4 % 2 != 0) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L2;
                }
              }
              L3: {
                var5 = stackIn_9_0;
                var6 = new ln[6];
                if (var4 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (var5 == 0) {
                      break L4;
                    } else {
                      if (-1 == (var2 % this.field_c ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var5 == 0) {
                      var7 = var2 + -this.field_c;
                      break L5;
                    } else {
                      var7 = var2 + -1 + -this.field_c;
                      break L5;
                    }
                  }
                  if (this.field_f[var7] != null) {
                    var6[0] = this.field_f[var7];
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (0 == var4) {
                  break L6;
                } else {
                  L7: {
                    if (var5 != 0) {
                      break L7;
                    } else {
                      if (0 == (var2 + 1) % this.field_c) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var5 == 0) {
                      var7 = -this.field_c + 1 + var2;
                      break L8;
                    } else {
                      var7 = -this.field_c + var2;
                      break L8;
                    }
                  }
                  if (this.field_f[var7] == null) {
                    break L6;
                  } else {
                    var6[1] = this.field_f[var7];
                    break L6;
                  }
                }
              }
              L9: {
                var7 = var2 - -1;
                if (0 == var7 % this.field_c) {
                  break L9;
                } else {
                  if (null == this.field_f[var7]) {
                    break L9;
                  } else {
                    var6[2] = this.field_f[var7];
                    break L9;
                  }
                }
              }
              L10: {
                if (-1 + this.field_b <= var4) {
                  break L10;
                } else {
                  L11: {
                    if (var5 != 0) {
                      break L11;
                    } else {
                      if ((var2 - -1) % this.field_c != 0) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (var5 == 0) {
                      var7 = var2 - -this.field_c - -1;
                      break L12;
                    } else {
                      var7 = this.field_c + var2;
                      break L12;
                    }
                  }
                  if (null != this.field_f[var7]) {
                    var6[3] = this.field_f[var7];
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L13: {
                if (var4 >= this.field_b - 1) {
                  break L13;
                } else {
                  L14: {
                    if (var5 == 0) {
                      break L14;
                    } else {
                      if (-1 == (var2 % this.field_c ^ -1)) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 0) {
                      var7 = var2 + this.field_c;
                      break L15;
                    } else {
                      var7 = this.field_c + var2 - 1;
                      break L15;
                    }
                  }
                  if (null != this.field_f[var7]) {
                    var6[4] = this.field_f[var7];
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L16: {
                var7 = var2 - 1;
                if (0 == var2 % this.field_c) {
                  break L16;
                } else {
                  if (this.field_f[var7] != null) {
                    var6[5] = this.field_f[var7];
                    break L16;
                  } else {
                    break L16;
                  }
                }
              }
              var3.field_r = new jd[6];
              var3.field_r[0] = new jd(var3, var6[0], (ln) null, var3.field_A, (int)(-(0.5 * (200.0 * rh.field_d)) + (double)var3.field_S), 0);
              var3.field_r[1] = new jd(var3, var6[1], (ln) null, 100 + var3.field_A, (int)(-(0.25 * (rh.field_d * 200.0)) + (double)var3.field_S), 0);
              var3.field_r[2] = new jd(var3, var6[2], (ln) null, 100 + var3.field_A, (int)(0.25 * (rh.field_d * 200.0) + (double)var3.field_S), 0);
              var3.field_r[3] = new jd(var3, var6[3], (ln) null, var3.field_A, (int)(rh.field_d * 200.0 * 0.5 + (double)var3.field_S), 0);
              var3.field_r[4] = new jd(var3, var6[4], (ln) null, -100 + var3.field_A, (int)((double)var3.field_S + 0.25 * (rh.field_d * 200.0)), 0);
              var3.field_r[5] = new jd(var3, var6[5], (ln) null, -100 + var3.field_A, (int)((double)var3.field_S - 200.0 * rh.field_d * 0.25), 0);
              var8 = 0;
              L17: while (true) {
                if (6 > var8) {
                  var3.field_r[var8].field_g = (int)(0.5 * (rh.field_d * 200.0));
                  var8++;
                  continue L17;
                } else {
                  var2++;
                  continue L1;
                }
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(sl param0, byte param1) {
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
            eq var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            eq var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var21 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            String stackIn_66_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                var13 = (eq) ((Object) kc.field_b.d(0));
                var17 = var13;
                if (var17 != null) {
                  L1: {
                    var3 = 0;
                    if (param1 < -127) {
                      break L1;
                    } else {
                      field_l = (qf) null;
                      break L1;
                    }
                  }
                  var4 = 0;
                  L2: while (true) {
                    if (var4 >= var17.field_l) {
                      if (var3 == 0) {
                        var4 = param0.field_j;
                        param0.e(11135, var17.field_j);
                        var5 = 0;
                        L3: while (true) {
                          if (var17.field_l <= var5) {
                            discarded$1 = param0.a(var4, -109);
                            var17.b((byte) -78);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            L4: {
                              if (-1 == (var17.field_p[var5] ^ -1)) {
                                try {
                                  L5: {
                                    L6: {
                                      var6_int = var17.field_m[var5];
                                      if (-1 == (var6_int ^ -1)) {
                                        var15 = (java.lang.reflect.Field) (var17.field_q[var5].field_e);
                                        var8 = var15.getInt((Object) null);
                                        param0.c(0, (byte) -106);
                                        param0.e(11135, var8);
                                        break L6;
                                      } else {
                                        if (-2 == (var6_int ^ -1)) {
                                          var16_ref = (java.lang.reflect.Field) (var17.field_q[var5].field_e);
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_r[var5]);
                                          param0.c(0, (byte) -102);
                                          break L6;
                                        } else {
                                          if (2 != var6_int) {
                                            break L6;
                                          } else {
                                            var26 = (java.lang.reflect.Field) (var17.field_q[var5].field_e);
                                            var8 = var26.getModifiers();
                                            param0.c(0, (byte) -97);
                                            param0.e(11135, var8);
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    L7: {
                                      if (var6_int != 3) {
                                        if (-5 != (var6_int ^ -1)) {
                                          break L7;
                                        } else {
                                          var28 = (java.lang.reflect.Method) (var17.field_n[var5].field_e);
                                          var8 = var28.getModifiers();
                                          param0.c(0, (byte) -114);
                                          param0.e(11135, var8);
                                          break L7;
                                        }
                                      } else {
                                        var27 = (java.lang.reflect.Method) (var17.field_n[var5].field_e);
                                        var25 = var17.field_h[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L8: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.c(0, (byte) -72);
                                              break L7;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param0.c(1, (byte) -99);
                                                param0.b(-16426, ((Number) (var10)).longValue());
                                                break L7;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param0.c(2, (byte) -86);
                                                  param0.a((String) (var10), (byte) 0);
                                                  break L7;
                                                } else {
                                                  param0.c(4, (byte) -73);
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L8;
                                          }
                                        }
                                      }
                                    }
                                    break L5;
                                  }
                                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                  decompiledCaughtException = decompiledCaughtParameter0;
                                  L9: {
                                    var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                    param0.c(-10, (byte) -57);
                                    break L9;
                                  }
                                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                  decompiledCaughtException = decompiledCaughtParameter1;
                                  L10: {
                                    var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                    param0.c(-11, (byte) -59);
                                    break L10;
                                  }
                                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                  decompiledCaughtException = decompiledCaughtParameter2;
                                  L11: {
                                    var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                    param0.c(-12, (byte) -120);
                                    break L11;
                                  }
                                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                  decompiledCaughtException = decompiledCaughtParameter3;
                                  L12: {
                                    var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                    param0.c(-13, (byte) -76);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L13: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.c(-14, (byte) -127);
                                    break L13;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L14: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.c(-15, (byte) -119);
                                    break L14;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L15: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.c(-16, (byte) -65);
                                    break L15;
                                  }
                                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                  decompiledCaughtException = decompiledCaughtParameter7;
                                  L16: {
                                    var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                    param0.c(-17, (byte) -68);
                                    break L16;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L17: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.c(-18, (byte) -69);
                                    break L17;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L18: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.c(-19, (byte) -70);
                                    break L18;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L19: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.c(-20, (byte) -109);
                                    break L19;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L20: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.c(-21, (byte) -74);
                                    break L20;
                                  }
                                }
                                break L4;
                              } else {
                                param0.c(var17.field_p[var5], (byte) -74);
                                break L4;
                              }
                            }
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    } else {
                      L21: {
                        if (null == var13.field_q[var4]) {
                          break L21;
                        } else {
                          L22: {
                            if ((var13.field_q[var4].field_d ^ -1) != -3) {
                              break L22;
                            } else {
                              var13.field_p[var4] = -5;
                              break L22;
                            }
                          }
                          if (-1 == (var13.field_q[var4].field_d ^ -1)) {
                            var3 = 1;
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                      }
                      L23: {
                        if (var13.field_n[var4] != null) {
                          L24: {
                            if (-3 == (var13.field_n[var4].field_d ^ -1)) {
                              var13.field_p[var4] = -6;
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          if (-1 == (var13.field_n[var4].field_d ^ -1)) {
                            var3 = 1;
                            break L23;
                          } else {
                            break L23;
                          }
                        } else {
                          break L23;
                        }
                      }
                      var4++;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L25: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_63_0 = (RuntimeException) (var2);
                stackOut_63_1 = new StringBuilder().append("hs.P(");
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (param0 == null) {
                  stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
                  stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
                  stackOut_65_2 = "null";
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  stackIn_66_2 = stackOut_65_2;
                  break L25;
                } else {
                  stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
                  stackOut_64_1 = (StringBuilder) ((Object) stackIn_64_1);
                  stackOut_64_2 = "{...}";
                  stackIn_66_0 = stackOut_64_0;
                  stackIn_66_1 = stackOut_64_1;
                  stackIn_66_2 = stackOut_64_2;
                  break L25;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_66_0), stackIn_66_2 + ',' + param1 + ')');
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

    public l a(byte param0) throws jn {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        l var8 = null;
        int[] var10 = null;
        int[] var12 = null;
        int[] var14 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = new l(pe.a((byte) 34, this.field_c), ls.a(this.field_b, 2), this.field_h, this.field_d);
        this.a(false, var8);
        this.a(var8, 0);
        var14 = this.a(var8.field_j, var8.field_e, var8.field_c, 4, (byte) -84, 4, 4, (int[]) null, this.field_a);
        var5 = this.a(var8.field_j, var8.field_e, var8.field_c, 2, (byte) -126, 16, 2, var14, this.field_e + this.field_a);
        var12 = new int[this.field_e];
        var10 = var12;
        var4 = var10;
        var6 = 0;
        L0: while (true) {
          if (var6 >= this.field_e) {
            this.a(3, var8, -126, var14);
            this.a(2, var8, 102, var12);
            var6 = 127 % ((param0 - -67) / 44);
            this.a((byte) 95, var14, var12, var8);
            this.a((byte) -108, var8);
            this.c(var8, 5);
            return var8;
          } else {
            var4[var6] = var5[this.field_a + var6];
            var6++;
            continue L0;
          }
        }
    }

    private final void a(byte param0, int[] param1, int[] param2, l param3) throws jn {
        try {
            if (param0 != 95) {
                Random var6 = (Random) null;
                this.a((ln) null, (byte) 67, (Random) null);
            }
            this.a(param1, param3, 4);
            this.a(param3, param2, 0);
            this.b(param3, param0 ^ 92);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hs.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, l param1, int param2, int[] param3) {
        int var5_int = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            for (var5_int = 0; param3.length > var5_int; var5_int++) {
                param1.field_e[param3[var5_int]].field_L = param0;
            }
            var5_int = -105 % ((param2 - -36) / 38);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hs.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        try {
            ae.a((java.awt.Component) ((Object) param0), 18014);
            sb.a((byte) 89, (java.awt.Component) ((Object) param0));
            if (!(aj.field_b == null)) {
                aj.field_b.a((java.awt.Component) ((Object) param0), 120);
            }
            int var2_int = 84 % ((param1 - -39) / 45);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hs.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(boolean param0, l param1) throws jn {
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ln[] var6 = null;
        int var7_int = 0;
        t var7 = null;
        ln var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        ln[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        Object stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = null;
              if (mh.field_h != null) {
                var4 = mh.field_h.length;
                var14 = new int[var4];
                var11 = var14;
                var10 = var11;
                var15 = var10;
                var12 = var15;
                var3 = var12;
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    var5 = 0;
                    L3: while (true) {
                      if (var4 - 1 <= var5) {
                        break L1;
                      } else {
                        var6_int = d.a((byte) -12, var5 + 1, var4 + -1, param1.field_j);
                        var7_int = var15[var6_int];
                        ((int[]) (var3))[var6_int] = var15[var5];
                        var15[var5] = var7_int;
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    var14[var5] = var5;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              var4 = this.field_b * this.field_c;
              var5 = 0;
              if (this.field_f == null) {
                this.field_f = new ln[this.field_b * this.field_c];
                break L4;
              } else {
                var13 = this.field_f;
                var7_int = 0;
                L5: while (true) {
                  if (var7_int >= var13.length) {
                    break L4;
                  } else {
                    L6: {
                      var8 = var13[var7_int];
                      if (var8 != null) {
                        if (var8 != li.field_b) {
                          var5++;
                          break L6;
                        } else {
                          var4--;
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var7_int++;
                    continue L5;
                  }
                }
              }
            }
            L7: {
              param1.field_e = new ln[this.field_d];
              if (-51 >= (this.field_k ^ -1)) {
                L8: while (true) {
                  if (var4 <= this.field_d) {
                    var6_int = 0;
                    var7_int = 0;
                    L9: while (true) {
                      if (this.field_f.length <= var7_int) {
                        break L7;
                      } else {
                        L10: {
                          if (null == this.field_f[var7_int]) {
                            this.field_f[var7_int] = this.a(var7_int, this.field_c, this.field_b, 123, var6_int);
                            var6_int++;
                            break L10;
                          } else {
                            break L10;
                          }
                        }
                        var7_int++;
                        continue L9;
                      }
                    }
                  } else {
                    var6_int = qf.a((byte) 55, this.field_f.length, param1.field_j);
                    if (null == this.field_f[var6_int]) {
                      var4--;
                      this.field_f[var6_int] = li.field_b;
                      continue L8;
                    } else {
                      continue L8;
                    }
                  }
                }
              } else {
                L11: while (true) {
                  if (var5 >= this.field_d) {
                    break L7;
                  } else {
                    var6_int = qf.a((byte) 110, this.field_f.length, param1.field_j);
                    if (null == this.field_f[var6_int]) {
                      this.field_f[var6_int] = this.a(var6_int, this.field_c, this.field_b, 107, var5);
                      var5++;
                      continue L11;
                    } else {
                      continue L11;
                    }
                  }
                }
              }
            }
            var6 = new ln[this.field_d];
            if (!param0) {
              var7_int = 0;
              L12: while (true) {
                if (var7_int >= this.field_f.length) {
                  param1.field_e = var6;
                  var7 = new t(param1.field_e);
                  var7.a(true, 1);
                  this.a(-11);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L13: {
                    if (this.field_f[var7_int] != null) {
                      if (this.field_f[var7_int] != li.field_b) {
                        this.field_f[var7_int].field_I = mh.field_h[((int[]) (var3))[this.field_f[var7_int].field_p]];
                        var6[this.field_f[var7_int].field_p] = this.field_f[var7_int];
                        break L13;
                      } else {
                        this.field_f[var7_int] = null;
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  var7_int++;
                  continue L12;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_46_0 = var3;
            stackOut_46_1 = new StringBuilder().append("hs.J(").append(param0).append(',');
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_48_0 = stackIn_48_0;
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L14;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L14;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_49_0), stackIn_49_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(l param0, int[] param1, int param2) {
        int dupTemp$6 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param2;
            L1: while (true) {
              if (param1.length <= var4_int) {
                break L0;
              } else {
                var5 = param0.field_e[param1[var4_int]];
                var6 = 0;
                L2: while (true) {
                  if (-5 >= (var6 ^ -1)) {
                    var6 = 0;
                    L3: while (true) {
                      if (2 <= var6) {
                        var4_int++;
                        continue L1;
                      } else {
                        dupTemp$6 = qf.a((byte) 124, 4, param0.field_j);
                        var5.field_G[dupTemp$6] = var5.field_G[dupTemp$6] + 1;
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var5.field_G[var6] = 1;
                    var6++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("hs.W(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
    }

    private final void a(ln param0, byte param1, Random param2) {
        int dupTemp$5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        java.awt.Canvas var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 0;
            L1: while (true) {
              if ((var4_int ^ -1) <= -5) {
                L2: {
                  var4_int = 0;
                  if (param1 >= 66) {
                    break L2;
                  } else {
                    var6 = (java.awt.Canvas) null;
                    hs.a((java.awt.Canvas) null, (byte) 94);
                    break L2;
                  }
                }
                L3: while (true) {
                  if (var4_int >= 2) {
                    break L0;
                  } else {
                    dupTemp$5 = qf.a((byte) 44, 4, param2);
                    param0.field_G[dupTemp$5] = param0.field_G[dupTemp$5] + 1;
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                param0.field_G[var4_int] = 2;
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("hs.S(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(int[] param0, l param1, int param2) throws jn {
        int var4_int = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            for (var4_int = 0; var4_int < param0.length; var4_int++) {
                var5 = param0[var4_int];
                var6 = param1.field_e[var5];
                this.a(var6, (byte) 84, param1.field_j);
            }
            this.a(1, 0, param0, param1, 2, (byte) 96, param2);
            this.a(4, 4, param0, param1, 4, (byte) 105, 12);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "hs.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int[] param2, l param3, int param4, byte param5, int param6) throws jn {
        int dupTemp$1 = 0;
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        int var12 = 0;
        ln var13_ref_ln = null;
        int var13 = 0;
        int var14_int = 0;
        ln var14 = null;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= param2.length) {
                var9 = 88 / ((37 - param5) / 55);
                break L0;
              } else {
                var19 = new int[4];
                var17 = var19;
                var9_ref_int__ = var17;
                var10 = 0;
                L2: while (true) {
                  if (var10 >= 4) {
                    var10 = 0;
                    L3: while (true) {
                      if (param4 <= var10) {
                        var10 = 0;
                        var11_int = 0;
                        L4: while (true) {
                          if ((var11_int ^ -1) <= -5) {
                            var20 = nf.a(param3.field_c[param2[var8_int]], 3718);
                            var18 = var20;
                            var11 = var18;
                            var12 = 1;
                            L5: while (true) {
                              if (var12 >= param6) {
                                var12 = param1;
                                L6: while (true) {
                                  if (param6 <= var12) {
                                    L7: {
                                      if (0 != param1) {
                                        stackOut_34_0 = param1;
                                        stackIn_35_0 = stackOut_34_0;
                                        break L7;
                                      } else {
                                        stackOut_33_0 = 1;
                                        stackIn_35_0 = stackOut_33_0;
                                        break L7;
                                      }
                                    }
                                    var12 = stackIn_35_0;
                                    L8: while (true) {
                                      if (0 >= var10) {
                                        var8_int++;
                                        continue L1;
                                      } else {
                                        L9: {
                                          var13 = var11[d.a((byte) -12, var12, -1 + param6, param3.field_j)];
                                          var14 = param3.field_e[var13];
                                          var15 = qf.a((byte) 107, 4, param3.field_j);
                                          if (-1 != (qf.a((byte) 51, 2, param3.field_j) ^ -1)) {
                                            L10: while (true) {
                                              if (0 != var14.field_G[var15]) {
                                                break L9;
                                              } else {
                                                var15 = qf.a((byte) 11, 4, param3.field_j);
                                                continue L10;
                                              }
                                            }
                                          } else {
                                            break L9;
                                          }
                                        }
                                        L11: while (true) {
                                          if (0 != var19[var15]) {
                                            var14.field_G[var15] = var14.field_G[var15] + 1;
                                            var10--;
                                            var9_ref_int__[var15] = var9_ref_int__[var15] - 1;
                                            continue L8;
                                          } else {
                                            var15 = qf.a((byte) 111, 4, param3.field_j);
                                            continue L11;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var13 = 0;
                                    L12: while (true) {
                                      if (4 <= var13) {
                                        L13: {
                                          if (0 == var10) {
                                            break L13;
                                          } else {
                                            L14: while (true) {
                                              var13 = qf.a((byte) 55, 4, param3.field_j);
                                              if (-1 == (var19[var13] ^ -1)) {
                                                continue L14;
                                              } else {
                                                param3.field_e[var20[var12]].field_G[var13] = param3.field_e[var20[var12]].field_G[var13] + 1;
                                                var9_ref_int__[var13] = var9_ref_int__[var13] - 1;
                                                var10--;
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        throw new jn("Insufficient resources to give production to each star. Close: " + param1 + ", Far: " + param6 + ", Minimum: " + param0 + ", Extra: " + param4 + ".");
                                      } else {
                                        if (-1 <= (param3.field_e[var20[var12]].field_G[var13] ^ -1)) {
                                          var13++;
                                          continue L12;
                                        } else {
                                          var12++;
                                          continue L6;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var13_ref_ln = param3.field_e[var20[var12]];
                                var14_int = 0;
                                L15: while (true) {
                                  if (var14_int >= 4) {
                                    var12++;
                                    continue L5;
                                  } else {
                                    L16: {
                                      var15 = var13_ref_ln.field_G[var14_int];
                                      if (var19[var14_int] >= var15) {
                                        break L16;
                                      } else {
                                        var15 = var19[var14_int];
                                        break L16;
                                      }
                                    }
                                    var9_ref_int__[var14_int] = var9_ref_int__[var14_int] - var15;
                                    var10 = var10 - var15;
                                    var14_int++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          } else {
                            var10 = var10 + var19[var11_int];
                            var11_int++;
                            continue L4;
                          }
                        }
                      } else {
                        dupTemp$1 = qf.a((byte) 61, 4, param3.field_j);
                        var9_ref_int__[dupTemp$1] = var9_ref_int__[dupTemp$1] + 1;
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var19[var10] = param0;
                    var10++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var8 = decompiledCaughtException;
            stackOut_47_0 = (RuntimeException) (var8);
            stackOut_47_1 = new StringBuilder().append("hs.R(").append(param0).append(',').append(param1).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param2 == null) {
              stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
              stackOut_49_1 = (StringBuilder) ((Object) stackIn_49_1);
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L17;
            } else {
              stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
              stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L17;
            }
          }
          L18: {
            stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param3 == null) {
              stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
              stackOut_52_1 = (StringBuilder) ((Object) stackIn_52_1);
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L18;
            } else {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L18;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_53_0), stackIn_53_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void b(l param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln[] var12 = null;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var12 = param0.field_e;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var12.length) {
                L2: {
                  if (param1 == 3) {
                    break L2;
                  } else {
                    hs.b(-112);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = var12[var4];
                var6 = 0;
                var7 = 0;
                L3: while (true) {
                  if (var7 >= 4) {
                    L4: {
                      if (var6 != 0) {
                        break L4;
                      } else {
                        L5: {
                          var7 = qf.a((byte) 63, 100, param0.field_j);
                          var8 = qf.a((byte) 78, 4, param0.field_j);
                          var9 = qf.a((byte) 66, 3, param0.field_j);
                          if (var9 != var8) {
                            break L5;
                          } else {
                            var9 = 3;
                            break L5;
                          }
                        }
                        L6: {
                          L7: {
                            var10 = qf.a((byte) 32, 2, param0.field_j);
                            if (var10 == var8) {
                              break L7;
                            } else {
                              if (var10 == var9) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L8: {
                            L9: {
                              if (var8 == 2) {
                                break L9;
                              } else {
                                if (-3 != (var9 ^ -1)) {
                                  stackOut_16_0 = 2;
                                  stackIn_17_0 = stackOut_16_0;
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            stackOut_15_0 = 3;
                            stackIn_17_0 = stackOut_15_0;
                            break L8;
                          }
                          var10 = stackIn_17_0;
                          break L6;
                        }
                        if (var7 >= 5) {
                          if (var7 < 15) {
                            if ((var7 ^ -1) <= -10) {
                              if (-13 >= (var7 ^ -1)) {
                                var5.field_G[var8] = 4;
                                break L4;
                              } else {
                                var5.field_G[var8] = 3;
                                var5.field_G[var9] = 1;
                                break L4;
                              }
                            } else {
                              var5.field_G[var8] = 2;
                              var5.field_G[var9] = 1;
                              var5.field_G[var10] = 1;
                              break L4;
                            }
                          } else {
                            if (-31 >= (var7 ^ -1)) {
                              if ((var7 ^ -1) <= -51) {
                                var5.field_G[var8] = 1;
                                break L4;
                              } else {
                                if (-46 >= (var7 ^ -1)) {
                                  var5.field_G[var8] = 2;
                                  break L4;
                                } else {
                                  var5.field_G[var8] = 1;
                                  var5.field_G[var9] = 1;
                                  break L4;
                                }
                              }
                            } else {
                              if (25 <= var7) {
                                var5.field_G[var8] = 3;
                                break L4;
                              } else {
                                var5.field_G[var8] = 2;
                                var5.field_G[var9] = 1;
                                break L4;
                              }
                            }
                          }
                        } else {
                          if (2 > var7) {
                            var5.field_G[var8] = 3;
                            var5.field_G[var9] = 1;
                            var5.field_G[var10] = 1;
                            break L4;
                          } else {
                            if (3 <= var7) {
                              var5.field_G[var8] = 5;
                              break L4;
                            } else {
                              var5.field_G[var8] = 4;
                              var5.field_G[var9] = 1;
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    var4++;
                    continue L1;
                  } else {
                    var6 = var6 + var5.field_G[var7];
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) (var3);
            stackOut_43_1 = new StringBuilder().append("hs.Q(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
              stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L10;
            } else {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_46_0), stackIn_46_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, l param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = param1.field_e;
              if (param0 <= -70) {
                break L1;
              } else {
                this.field_b = -95;
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if (var4 >= var10.length) {
                break L0;
              } else {
                L3: {
                  var5 = var10[var4];
                  if (-4 == (var5.field_L ^ -1)) {
                    var5.field_x = 20;
                    break L3;
                  } else {
                    var6 = 0;
                    var7 = 0;
                    L4: while (true) {
                      if (-5 >= (var7 ^ -1)) {
                        var7 = var6 - 1;
                        var8 = -1 + 2 * var6;
                        var5.field_x = d.a((byte) -12, var7, var8, param1.field_j);
                        break L3;
                      } else {
                        var6 = var6 + var5.field_G[var7];
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("hs.EA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final ln a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = param0 / param1;
        int var8 = -123 / ((52 - param3) / 52);
        int var7 = -1 == (var6 % 2 ^ -1) ? 1 : 0;
        int var9 = var7 != 0 ? 100 : 200;
        var9 = 200 * (param0 - var6 * param1) + var9;
        int var10 = (int)(0.5 * (200.0 * rh.field_d));
        var10 = (int)((double)var6 * (0.75 * (rh.field_d * 200.0))) + var10;
        int var11 = 0;
        return new ln(param4, var9, var10, var11);
    }

    int[] a(Random param0, ln[] param1, int[][] param2, int param3, byte param4, int param5, int param6, int[] param7, int param8) throws jn {
        int incrementValue$1 = 0;
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12_int = 0;
        int[] var12 = null;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ln var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        l var25 = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int stackIn_18_0 = 0;
        int[] stackIn_67_0 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int[] stackOut_66_0 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10_int = param1.length;
            var11 = 0;
            var12_int = 0;
            L1: while (true) {
              if (var12_int >= var10_int) {
                var30 = new int[var11];
                var28 = var30;
                var12 = var28;
                var11 = 0;
                var26 = 0;
                var13_int = var26;
                L2: while (true) {
                  if (var26 >= var10_int) {
                    if (var11 >= param8) {
                      L3: {
                        var29 = new int[param8];
                        var27 = var29;
                        var13 = var27;
                        if (param7 != null) {
                          stackOut_17_0 = param7.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L3;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_18_0 = stackOut_16_0;
                          break L3;
                        }
                      }
                      var14 = stackIn_18_0;
                      var15 = 0;
                      L4: while (true) {
                        if (var15 >= var14) {
                          var15 = var14;
                          L5: while (true) {
                            if (var15 >= param8) {
                              L6: {
                                if (param4 < -3) {
                                  break L6;
                                } else {
                                  var25 = (l) null;
                                  this.a((l) null, -72);
                                  break L6;
                                }
                              }
                              var15 = 0;
                              L7: while (true) {
                                if (var15 >= var10_int) {
                                  var15 = param2[var29[0]][var29[1]];
                                  var16 = 0;
                                  L8: while (true) {
                                    if (var16 >= param8) {
                                      if (var15 >= param3) {
                                        stackOut_66_0 = (int[]) (var13);
                                        stackIn_67_0 = stackOut_66_0;
                                        break L0;
                                      } else {
                                        throw new jn("Start locations cannot be placed far enough apart!");
                                      }
                                    } else {
                                      var17 = var16 - -1;
                                      L9: while (true) {
                                        if (var17 >= param8) {
                                          var16++;
                                          continue L8;
                                        } else {
                                          L10: {
                                            if (param2[var29[var16]][var29[var17]] < var15) {
                                              var15 = param2[var29[var16]][var29[var17]];
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                          var17++;
                                          continue L9;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var16 = var14;
                                  L11: while (true) {
                                    if (param8 <= var16) {
                                      var15++;
                                      continue L7;
                                    } else {
                                      var17 = 0;
                                      var18 = -1;
                                      var20 = 0;
                                      L12: while (true) {
                                        if (var20 >= var11) {
                                          var29[var16] = var18;
                                          var16++;
                                          continue L11;
                                        } else {
                                          var21 = param1[var30[var20]];
                                          var19 = 2147483647;
                                          var22 = 0;
                                          L13: while (true) {
                                            if (var22 >= param8) {
                                              L14: {
                                                if (var19 > var17) {
                                                  var17 = var19;
                                                  var18 = var21.field_p;
                                                  break L14;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                              var20++;
                                              continue L12;
                                            } else {
                                              var23 = param2[var21.field_p][var29[var22]];
                                              if (var22 != var16) {
                                                if (-1 != var23) {
                                                  if (var23 < var19) {
                                                    var19 = var23;
                                                    var22++;
                                                    continue L13;
                                                  } else {
                                                    var22++;
                                                    continue L13;
                                                  }
                                                } else {
                                                  var22++;
                                                  continue L13;
                                                }
                                              } else {
                                                var22++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var16 = -1;
                              L15: while (true) {
                                if (var16 != -1) {
                                  var29[var15] = var16;
                                  var15++;
                                  continue L5;
                                } else {
                                  var16 = var12[qf.a((byte) 63, var11, param0)];
                                  var17 = 0;
                                  L16: while (true) {
                                    if (var15 <= var17) {
                                      continue L15;
                                    } else {
                                      if (var29[var17] == var16) {
                                        var16 = -1;
                                        continue L15;
                                      } else {
                                        var17++;
                                        continue L16;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var13[var15] = param7[var15];
                          var15++;
                          continue L4;
                        }
                      }
                    } else {
                      throw new jn("Not enough highly-connected systems!");
                    }
                  } else {
                    L17: {
                      var14 = param1[var26].field_D.length;
                      if (param6 > var14) {
                        break L17;
                      } else {
                        if (param5 < var14) {
                          break L17;
                        } else {
                          incrementValue$1 = var11;
                          var11++;
                          var12[incrementValue$1] = param1[var26].field_p;
                          break L17;
                        }
                      }
                    }
                    var26++;
                    continue L2;
                  }
                }
              } else {
                L18: {
                  var13_int = param1[var12_int].field_D.length;
                  if (param6 > var13_int) {
                    break L18;
                  } else {
                    if (var13_int > param5) {
                      break L18;
                    } else {
                      var11++;
                      break L18;
                    }
                  }
                }
                var12_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var10 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) (var10);
            stackOut_68_1 = new StringBuilder().append("hs.K(");
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param0 == null) {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L19;
            } else {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L19;
            }
          }
          L20: {
            stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param1 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L20;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L20;
            }
          }
          L21: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param2 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L21;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L21;
            }
          }
          L22: {
            stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
            stackOut_77_1 = ((StringBuilder) (Object) stackIn_77_1).append(stackIn_77_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param7 == null) {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L22;
            } else {
              stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackOut_78_1 = (StringBuilder) ((Object) stackIn_78_1);
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L22;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_80_0), stackIn_80_2 + ',' + param8 + ')');
        }
        return stackIn_67_0;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            sl var2 = (sl) null;
            hs.a((sl) null, (byte) 120);
        }
        field_i = null;
        field_j = null;
        field_g = null;
        field_l = null;
    }

    hs(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = param1;
        this.field_d = param3;
        this.field_h = param2;
        this.field_a = param4;
        this.field_c = param0;
        this.field_e = -1 + this.field_a;
        if (this.field_c * this.field_b < this.field_d) {
            throw new RuntimeException("Requested starcount (" + this.field_d + ") is greater than map size (" + this.field_c * this.field_b + " hexes).");
        }
        this.field_k = this.field_b * (this.field_c * 100) / this.field_d;
    }

    static {
        field_g = "<%PROJECT_METAL> - (<%Resource0>) A <%project_metal> fortifies a system. The fleet strength of the <%glossary>system</col>'s garrison is treated as <%highlight>double when defending</col>. This project may be used on any system you control.";
    }
}
