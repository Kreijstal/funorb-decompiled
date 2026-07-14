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
        int var3 = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        ln[] var9 = null;
        int var10 = 0;
        ln var11 = null;
        ln var12 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        og.a(-119, ((hs) this).field_f, ((hs) this).field_c, ((hs) this).field_b);
        var3 = nn.a(param0.field_e, 0);
        vf.a(((hs) this).field_c, var3, (int)(200.0 * rh.field_d / 2.0), true, param0.field_e, param0.field_j, ((hs) this).field_f);
        var8 = param0.field_e;
        var5 = 0;
        L0: while (true) {
          if (var8.length <= var5) {
            var9 = param0.field_e;
            var10 = param1;
            var5 = var10;
            L1: while (true) {
              if (var10 >= var9.length) {
                param0.a(param1 + 26253);
                return;
              } else {
                var12 = var9[var10];
                var6 = var12;
                if (var12.field_D == null) {
                  var6.field_D = new ln[]{};
                  var10++;
                  continue L1;
                } else {
                  var10++;
                  continue L1;
                }
              }
            }
          } else {
            var11 = var8[var5];
            var11.e((byte) -126);
            var5++;
            continue L0;
          }
        }
    }

    private final void c(l param0, int param1) {
        int var4 = 0;
        ln var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 < 0) {
            return;
        }
        ln[] var7 = param0.field_e;
        ln[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            var5.a(param0.field_j, (byte) 82);
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
            field_i = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (((hs) this).field_f.length <= var2) {
            return;
          } else {
            if (((hs) this).field_f[var2] != null) {
              L2: {
                var3 = ((hs) this).field_f[var2];
                var4 = var2 / ((hs) this).field_c;
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
                      if (-1 == (var2 % ((hs) this).field_c ^ -1)) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var5 == 0) {
                      var7 = var2 + -((hs) this).field_c;
                      break L5;
                    } else {
                      var7 = var2 + -1 + -((hs) this).field_c;
                      break L5;
                    }
                  }
                  if (((hs) this).field_f[var7] != null) {
                    var6[0] = ((hs) this).field_f[var7];
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
                      if (0 == (var2 + 1) % ((hs) this).field_c) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (var5 == 0) {
                      var7 = -((hs) this).field_c + 1 + var2;
                      break L8;
                    } else {
                      var7 = -((hs) this).field_c + var2;
                      break L8;
                    }
                  }
                  if (((hs) this).field_f[var7] == null) {
                    break L6;
                  } else {
                    var6[1] = ((hs) this).field_f[var7];
                    break L6;
                  }
                }
              }
              L9: {
                var7 = var2 - -1;
                if (0 == var7 % ((hs) this).field_c) {
                  break L9;
                } else {
                  if (null == ((hs) this).field_f[var7]) {
                    break L9;
                  } else {
                    var6[2] = ((hs) this).field_f[var7];
                    break L9;
                  }
                }
              }
              L10: {
                if (-1 + ((hs) this).field_b <= var4) {
                  break L10;
                } else {
                  L11: {
                    if (var5 != 0) {
                      break L11;
                    } else {
                      if ((var2 - -1) % ((hs) this).field_c != 0) {
                        break L11;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L12: {
                    if (var5 == 0) {
                      var7 = var2 - -((hs) this).field_c - -1;
                      break L12;
                    } else {
                      var7 = ((hs) this).field_c + var2;
                      break L12;
                    }
                  }
                  if (null != ((hs) this).field_f[var7]) {
                    var6[3] = ((hs) this).field_f[var7];
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
              L13: {
                if (var4 >= ((hs) this).field_b - 1) {
                  break L13;
                } else {
                  L14: {
                    if (var5 == 0) {
                      break L14;
                    } else {
                      if (-1 == (var2 % ((hs) this).field_c ^ -1)) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (var5 == 0) {
                      var7 = var2 + ((hs) this).field_c;
                      break L15;
                    } else {
                      var7 = ((hs) this).field_c + var2 - 1;
                      break L15;
                    }
                  }
                  if (null != ((hs) this).field_f[var7]) {
                    var6[4] = ((hs) this).field_f[var7];
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              L16: {
                var7 = var2 - 1;
                if (0 == var2 % ((hs) this).field_c) {
                  break L16;
                } else {
                  if (((hs) this).field_f[var7] != null) {
                    var6[5] = ((hs) this).field_f[var7];
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
            Throwable decompiledCaughtException = null;
            var18 = null;
            var16 = null;
            var21 = null;
            var22 = null;
            var12 = ShatteredPlansClient.field_F ? 1 : 0;
            var13 = (eq) (Object) kc.field_b.d(0);
            var17 = var13;
            if (var17 != null) {
              L0: {
                var3 = 0;
                if (param1 < -127) {
                  break L0;
                } else {
                  field_l = null;
                  break L0;
                }
              }
              var4 = 0;
              L1: while (true) {
                if (var4 >= var17.field_l) {
                  if (var3 == 0) {
                    var4 = param0.field_j;
                    param0.e(11135, var17.field_j);
                    var5 = 0;
                    L2: while (true) {
                      if (var17.field_l <= var5) {
                        var5++;
                      } else {
                        L3: {
                          if (-1 == (var17.field_p[var5] ^ -1)) {
                            try {
                              L4: {
                                var6_int = var17.field_m[var5];
                                if (-1 == var6_int) {
                                  var15 = (java.lang.reflect.Field) var17.field_q[var5].field_e;
                                  var8 = var15.getInt((Object) null);
                                  param0.c(0, (byte) -106);
                                  param0.e(11135, var8);
                                  break L4;
                                } else {
                                  if (-2 == var6_int) {
                                    var16_ref = (java.lang.reflect.Field) var17.field_q[var5].field_e;
                                    var19 = var16_ref;
                                    var19.setInt((Object) null, var17.field_r[var5]);
                                    param0.c(0, (byte) -102);
                                    break L4;
                                  } else {
                                    if (2 != var6_int) {
                                      break L4;
                                    } else {
                                      var26 = (java.lang.reflect.Field) var17.field_q[var5].field_e;
                                      var8 = var26.getModifiers();
                                      param0.c(0, (byte) -97);
                                      param0.e(11135, var8);
                                      break L4;
                                    }
                                  }
                                }
                              }
                              L5: {
                                if (var6_int != 3) {
                                  if (-5 != (var6_int ^ -1)) {
                                    break L5;
                                  } else {
                                    var28 = (java.lang.reflect.Method) var17.field_n[var5].field_e;
                                    var8 = var28.getModifiers();
                                    param0.c(0, (byte) -114);
                                    param0.e(11135, var8);
                                    break L5;
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Method) var17.field_n[var5].field_e;
                                  var25 = var17.field_h[var5];
                                  var9 = new Object[var25.length];
                                  var10_int = 0;
                                  L6: while (true) {
                                    if (var25.length <= var10_int) {
                                      var10 = var27.invoke((Object) null, var9);
                                      if (var10 == null) {
                                        param0.c(0, (byte) -72);
                                        break L5;
                                      } else {
                                        if (var10 instanceof Number) {
                                          param0.c(1, (byte) -99);
                                          param0.b(-16426, ((Number) var10).longValue());
                                          break L5;
                                        } else {
                                          if (var10 instanceof String) {
                                            param0.c(2, (byte) -86);
                                            param0.a((String) var10, (byte) 0);
                                            break L5;
                                          } else {
                                            param0.c(4, (byte) -73);
                                            break L5;
                                          }
                                        }
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param0.c(-14, (byte) -127);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param0.c(-17, (byte) -68);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param0.c(-18, (byte) -69);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param0.c(-19, (byte) -70);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param0.c(-20, (byte) -109);
                            }
                            break L3;
                          } else {
                            param0.c(var17.field_p[var5], (byte) -74);
                            break L3;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param0.c(-21, (byte) -74);
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L7: {
                    if (null == var13.field_q[var4]) {
                      break L7;
                    } else {
                      L8: {
                        if (var13.field_q[var4].field_d != -3) {
                          break L8;
                        } else {
                          var13.field_p[var4] = -5;
                          break L8;
                        }
                      }
                      if (-1 == var13.field_q[var4].field_d) {
                        var3 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var13.field_n[var4] != null) {
                    L9: {
                      if (-3 == var13.field_n[var4].field_d) {
                        var13.field_p[var4] = -6;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (-1 == var13.field_n[var4].field_d) {
                      var3 = 1;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
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
        int[] var15 = null;
        int[] var16 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = new l(pe.a((byte) 34, ((hs) this).field_c), ls.a(((hs) this).field_b, 2), ((hs) this).field_h, ((hs) this).field_d);
        ((hs) this).a(false, var8);
        this.a(var8, 0);
        var15 = ((hs) this).a(var8.field_j, var8.field_e, var8.field_c, 4, (byte) -84, 4, 4, (int[]) null, ((hs) this).field_a);
        var5 = ((hs) this).a(var8.field_j, var8.field_e, var8.field_c, 2, (byte) -126, 16, 2, var15, ((hs) this).field_e + ((hs) this).field_a);
        var16 = new int[((hs) this).field_e];
        var14 = var16;
        var12 = var14;
        var10 = var12;
        var4 = var10;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((hs) this).field_e) {
            this.a(3, var8, -126, var15);
            this.a(2, var8, 102, var16);
            var6 = 127 % ((param0 - -67) / 44);
            this.a((byte) 95, var15, var16, var8);
            this.a((byte) -108, var8);
            this.c(var8, 5);
            return var8;
          } else {
            var4[var6] = var5[((hs) this).field_a + var6];
            var6++;
            continue L0;
          }
        }
    }

    private final void a(byte param0, int[] param1, int[] param2, l param3) throws jn {
        if (param0 != 95) {
            Object var6 = null;
            this.a((ln) null, (byte) 67, (Random) null);
        }
        this.a(param1, param3, 4);
        this.a(param3, param2, 0);
        this.b(param3, param0 ^ 92);
    }

    private final void a(int param0, l param1, int param2, int[] param3) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var5 = 0; param3.length > var5; var5++) {
            param1.field_e[param3[var5]].field_L = param0;
        }
        var5 = -105 % ((param2 - -36) / 38);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        ae.a((java.awt.Component) (Object) param0, 18014);
        sb.a((byte) 89, (java.awt.Component) (Object) param0);
        if (!(aj.field_b == null)) {
            aj.field_b.a((java.awt.Component) (Object) param0, 120);
        }
        int var2 = 84 % ((param1 - -39) / 45);
    }

    void a(boolean param0, l param1) throws jn {
        Object var3 = null;
        int[] var3_array = null;
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
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          var3 = null;
          if (mh.field_h != null) {
            var4 = mh.field_h.length;
            var18 = new int[var4];
            var16 = var18;
            var14 = var16;
            var11 = var14;
            var10 = var11;
            var19 = var10;
            var17 = var19;
            var15 = var17;
            var12 = var15;
            var3_array = var12;
            var5 = 0;
            L1: while (true) {
              if (var4 <= var5) {
                var5 = 0;
                L2: while (true) {
                  if (var4 - 1 <= var5) {
                    break L0;
                  } else {
                    var6_int = d.a((byte) -12, var5 + 1, var4 + -1, param1.field_j);
                    var7_int = var19[var6_int];
                    var3_array[var6_int] = var19[var5];
                    var19[var5] = var7_int;
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var18[var5] = var5;
                var5++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          var4 = ((hs) this).field_b * ((hs) this).field_c;
          var5 = 0;
          if (((hs) this).field_f == null) {
            ((hs) this).field_f = new ln[((hs) this).field_b * ((hs) this).field_c];
            break L3;
          } else {
            var13 = ((hs) this).field_f;
            var7_int = 0;
            L4: while (true) {
              if (var7_int >= var13.length) {
                break L3;
              } else {
                var8 = var13[var7_int];
                if (var8 != null) {
                  if (var8 != li.field_b) {
                    var5++;
                    var7_int++;
                    continue L4;
                  } else {
                    var4--;
                    var7_int++;
                    continue L4;
                  }
                } else {
                  var7_int++;
                  continue L4;
                }
              }
            }
          }
        }
        L5: {
          param1.field_e = new ln[((hs) this).field_d];
          if (-51 >= (((hs) this).field_k ^ -1)) {
            L6: while (true) {
              if (var4 <= ((hs) this).field_d) {
                var6_int = 0;
                var7_int = 0;
                L7: while (true) {
                  if (((hs) this).field_f.length <= var7_int) {
                    break L5;
                  } else {
                    if (null == ((hs) this).field_f[var7_int]) {
                      ((hs) this).field_f[var7_int] = ((hs) this).a(var7_int, ((hs) this).field_c, ((hs) this).field_b, 123, var6_int);
                      var6_int++;
                      var7_int++;
                      continue L7;
                    } else {
                      var7_int++;
                      continue L7;
                    }
                  }
                }
              } else {
                var6_int = qf.a((byte) 55, ((hs) this).field_f.length, param1.field_j);
                if (null == ((hs) this).field_f[var6_int]) {
                  var4--;
                  ((hs) this).field_f[var6_int] = li.field_b;
                  continue L6;
                } else {
                  continue L6;
                }
              }
            }
          } else {
            L8: while (true) {
              if (var5 >= ((hs) this).field_d) {
                break L5;
              } else {
                var6_int = qf.a((byte) 110, ((hs) this).field_f.length, param1.field_j);
                if (null == ((hs) this).field_f[var6_int]) {
                  ((hs) this).field_f[var6_int] = ((hs) this).a(var6_int, ((hs) this).field_c, ((hs) this).field_b, 107, var5);
                  var5++;
                  continue L8;
                } else {
                  continue L8;
                }
              }
            }
          }
        }
        var6 = new ln[((hs) this).field_d];
        if (!param0) {
          var7_int = 0;
          L9: while (true) {
            if (var7_int >= ((hs) this).field_f.length) {
              param1.field_e = var6;
              var7 = new t(param1.field_e);
              var7.a(true, 1);
              ((hs) this).a(-11);
              return;
            } else {
              if (((hs) this).field_f[var7_int] != null) {
                if (((hs) this).field_f[var7_int] != li.field_b) {
                  ((hs) this).field_f[var7_int].field_I = mh.field_h[var3_array[((hs) this).field_f[var7_int].field_p]];
                  var6[((hs) this).field_f[var7_int].field_p] = ((hs) this).field_f[var7_int];
                  var7_int++;
                  continue L9;
                } else {
                  ((hs) this).field_f[var7_int] = null;
                  var7_int++;
                  continue L9;
                }
              } else {
                var7_int++;
                continue L9;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void a(l param0, int[] param1, int param2) {
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var4 = param2; param1.length > var4; var4++) {
            var5 = param0.field_e[param1[var4]];
            for (var6 = 0; -5 < (var6 ^ -1); var6++) {
                var5.field_G[var6] = 1;
            }
            for (var6 = 0; 2 > var6; var6++) {
                var5.field_G[qf.a((byte) 124, 4, param0.field_j)] = var5.field_G[qf.a((byte) 124, 4, param0.field_j)] + 1;
            }
        }
    }

    private final void a(ln param0, byte param1, Random param2) {
        int var4 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var4 = 0; (var4 ^ -1) > -5; var4++) {
            param0.field_G[var4] = 2;
        }
        var4 = 0;
        if (param1 < 66) {
            Object var6 = null;
            hs.a((java.awt.Canvas) null, (byte) 94);
        }
        while (var4 < 2) {
            param0.field_G[qf.a((byte) 44, 4, param2)] = param0.field_G[qf.a((byte) 44, 4, param2)] + 1;
            var4++;
        }
    }

    private final void a(int[] param0, l param1, int param2) throws jn {
        int var4 = 0;
        int var5 = 0;
        ln var6 = null;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var4 = 0; var4 < param0.length; var4++) {
            var5 = param0[var4];
            var6 = param1.field_e[var5];
            this.a(var6, (byte) 84, param1.field_j);
        }
        this.a(1, 0, param0, param1, 2, (byte) 96, param2);
        this.a(4, 4, param0, param1, 4, (byte) 105, 12);
    }

    private final void a(int param0, int param1, int[] param2, l param3, int param4, byte param5, int param6) throws jn {
        int var8 = 0;
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
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= param2.length) {
            var9 = 88 / ((37 - param5) / 55);
            return;
          } else {
            var23 = new int[4];
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var9_ref_int__ = var17;
            var10 = 0;
            L1: while (true) {
              if (var10 >= 4) {
                var10 = 0;
                L2: while (true) {
                  if (param4 <= var10) {
                    var10 = 0;
                    var11_int = 0;
                    L3: while (true) {
                      if ((var11_int ^ -1) <= -5) {
                        var24 = nf.a(param3.field_c[param2[var8]], 3718);
                        var22 = var24;
                        var20 = var22;
                        var18 = var20;
                        var11 = var18;
                        var12 = 1;
                        L4: while (true) {
                          if (var12 >= param6) {
                            var12 = param1;
                            L5: while (true) {
                              if (param6 <= var12) {
                                L6: {
                                  if (0 != param1) {
                                    stackOut_33_0 = param1;
                                    stackIn_34_0 = stackOut_33_0;
                                    break L6;
                                  } else {
                                    stackOut_32_0 = 1;
                                    stackIn_34_0 = stackOut_32_0;
                                    break L6;
                                  }
                                }
                                var12 = stackIn_34_0;
                                L7: while (true) {
                                  if (0 >= var10) {
                                    var8++;
                                    continue L0;
                                  } else {
                                    L8: {
                                      var13 = var11[d.a((byte) -12, var12, -1 + param6, param3.field_j)];
                                      var14 = param3.field_e[var13];
                                      var15 = qf.a((byte) 107, 4, param3.field_j);
                                      if (-1 != (qf.a((byte) 51, 2, param3.field_j) ^ -1)) {
                                        L9: while (true) {
                                          if (0 != var14.field_G[var15]) {
                                            break L8;
                                          } else {
                                            var15 = qf.a((byte) 11, 4, param3.field_j);
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                    L10: while (true) {
                                      if (0 != var23[var15]) {
                                        var14.field_G[var15] = var14.field_G[var15] + 1;
                                        var10--;
                                        var9_ref_int__[var15] = var9_ref_int__[var15] - 1;
                                        continue L7;
                                      } else {
                                        var15 = qf.a((byte) 111, 4, param3.field_j);
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var13 = 0;
                                L11: while (true) {
                                  if (4 <= var13) {
                                    L12: {
                                      if (0 == var10) {
                                        break L12;
                                      } else {
                                        L13: while (true) {
                                          var13 = qf.a((byte) 55, 4, param3.field_j);
                                          if (-1 == var23[var13]) {
                                            continue L13;
                                          } else {
                                            param3.field_e[var24[var12]].field_G[var13] = param3.field_e[var24[var12]].field_G[var13] + 1;
                                            var9_ref_int__[var13] = var9_ref_int__[var13] - 1;
                                            var10--;
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    throw new jn("Insufficient resources to give production to each star. Close: " + param1 + ", Far: " + param6 + ", Minimum: " + param0 + ", Extra: " + param4 + ".");
                                  } else {
                                    if (-1 <= param3.field_e[var24[var12]].field_G[var13]) {
                                      var13++;
                                      continue L11;
                                    } else {
                                      var12++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var13_ref_ln = param3.field_e[var24[var12]];
                            var14_int = 0;
                            L14: while (true) {
                              if (var14_int >= 4) {
                                var12++;
                                continue L4;
                              } else {
                                L15: {
                                  var15 = var13_ref_ln.field_G[var14_int];
                                  if (var23[var14_int] >= var15) {
                                    break L15;
                                  } else {
                                    var15 = var23[var14_int];
                                    break L15;
                                  }
                                }
                                var9_ref_int__[var14_int] = var9_ref_int__[var14_int] - var15;
                                var10 = var10 - var15;
                                var14_int++;
                                continue L14;
                              }
                            }
                          }
                        }
                      } else {
                        var10 = var10 + var23[var11_int];
                        var11_int++;
                        continue L3;
                      }
                    }
                  } else {
                    var9_ref_int__[qf.a((byte) 61, 4, param3.field_j)] = var9_ref_int__[qf.a((byte) 61, 4, param3.field_j)] + 1;
                    var10++;
                    continue L2;
                  }
                }
              } else {
                var23[var10] = param0;
                var10++;
                continue L1;
              }
            }
          }
        }
    }

    private final void b(l param0, int param1) {
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
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        var12 = param0.field_e;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var12.length) {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                hs.b(-112);
                break L1;
              }
            }
            return;
          } else {
            var5 = var12[var4];
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (var7 >= 4) {
                if (var6 == 0) {
                  L3: {
                    var7 = qf.a((byte) 63, 100, param0.field_j);
                    var8 = qf.a((byte) 78, 4, param0.field_j);
                    var9 = qf.a((byte) 66, 3, param0.field_j);
                    if (var9 != var8) {
                      break L3;
                    } else {
                      var9 = 3;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      var10 = qf.a((byte) 32, 2, param0.field_j);
                      if (var10 == var8) {
                        break L5;
                      } else {
                        if (var10 == var9) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var8 == 2) {
                          break L7;
                        } else {
                          if (-3 != (var9 ^ -1)) {
                            stackOut_16_0 = 2;
                            stackIn_17_0 = stackOut_16_0;
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      stackOut_15_0 = 3;
                      stackIn_17_0 = stackOut_15_0;
                      break L6;
                    }
                    var10 = stackIn_17_0;
                    break L4;
                  }
                  if (var7 >= 5) {
                    if (var7 < 15) {
                      if ((var7 ^ -1) <= -10) {
                        if (-13 >= (var7 ^ -1)) {
                          var5.field_G[var8] = 4;
                          var4++;
                          continue L0;
                        } else {
                          var5.field_G[var8] = 3;
                          var5.field_G[var9] = 1;
                          var4++;
                          continue L0;
                        }
                      } else {
                        var5.field_G[var8] = 2;
                        var5.field_G[var9] = 1;
                        var5.field_G[var10] = 1;
                        var4++;
                        continue L0;
                      }
                    } else {
                      if (-31 >= (var7 ^ -1)) {
                        if (var7 <= -51) {
                          var5.field_G[var8] = 1;
                          var4++;
                          continue L0;
                        } else {
                          if (-46 <= var7) {
                            var5.field_G[var8] = 2;
                            var4++;
                            continue L0;
                          } else {
                            var5.field_G[var8] = 1;
                            var5.field_G[var9] = 1;
                            var4++;
                            continue L0;
                          }
                        }
                      } else {
                        if (25 <= var7) {
                          var5.field_G[var8] = 3;
                          var4++;
                          continue L0;
                        } else {
                          var5.field_G[var8] = 2;
                          var5.field_G[var9] = 1;
                          var4++;
                          continue L0;
                        }
                      }
                    }
                  } else {
                    if (2 > var7) {
                      var5.field_G[var8] = 3;
                      var5.field_G[var9] = 1;
                      var5.field_G[var10] = 1;
                      var4++;
                      continue L0;
                    } else {
                      if (3 <= var7) {
                        var5.field_G[var8] = 5;
                        var4++;
                        continue L0;
                      } else {
                        var5.field_G[var8] = 4;
                        var5.field_G[var9] = 1;
                        var4++;
                        continue L0;
                      }
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var6 = var6 + var5.field_G[var7];
                var7++;
                continue L2;
              }
            }
          }
        }
    }

    private final void a(byte param0, l param1) {
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ln[] var10 = null;
        L0: {
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          var10 = param1.field_e;
          if (param0 <= -70) {
            break L0;
          } else {
            ((hs) this).field_b = -95;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var10.length) {
            return;
          } else {
            var5 = var10[var4];
            if (-4 == var5.field_L) {
              var5.field_x = 20;
              var4++;
              continue L1;
            } else {
              var6 = 0;
              var7 = 0;
              L2: while (true) {
                if (-5 <= var7) {
                  var7 = var6 - 1;
                  var8 = -1 + 2 * var6;
                  var5.field_x = d.a((byte) -12, var7, var8, param1.field_j);
                  var4++;
                  continue L1;
                } else {
                  var6 = var6 + var5.field_G[var7];
                  var7++;
                  continue L2;
                }
              }
            }
          }
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
        int var10 = 0;
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
        Object var25 = null;
        int var26 = 0;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int stackIn_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        var24 = ShatteredPlansClient.field_F ? 1 : 0;
        var10 = param1.length;
        var11 = 0;
        var12_int = 0;
        L0: while (true) {
          if (var12_int >= var10) {
            var34 = new int[var11];
            var32 = var34;
            var30 = var32;
            var28 = var30;
            var12 = var28;
            var11 = 0;
            var26 = 0;
            var13_int = var26;
            L1: while (true) {
              if (var26 >= var10) {
                if (var11 >= param8) {
                  L2: {
                    var33 = new int[param8];
                    var31 = var33;
                    var29 = var31;
                    var27 = var29;
                    var13 = var27;
                    if (param7 != null) {
                      stackOut_20_0 = param7.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L2;
                    } else {
                      stackOut_19_0 = 0;
                      stackIn_21_0 = stackOut_19_0;
                      break L2;
                    }
                  }
                  var14 = stackIn_21_0;
                  var15 = 0;
                  L3: while (true) {
                    if (var15 >= var14) {
                      var15 = var14;
                      L4: while (true) {
                        if (var15 >= param8) {
                          L5: {
                            if (param4 < -3) {
                              break L5;
                            } else {
                              var25 = null;
                              this.a((l) null, -72);
                              break L5;
                            }
                          }
                          var15 = 0;
                          L6: while (true) {
                            if (var15 >= var10) {
                              var15 = param2[var33[0]][var33[1]];
                              var16 = 0;
                              L7: while (true) {
                                if (var16 >= param8) {
                                  if (var15 >= param3) {
                                    return var13;
                                  } else {
                                    throw new jn("Start locations cannot be placed far enough apart!");
                                  }
                                } else {
                                  var17 = var16 - -1;
                                  L8: while (true) {
                                    if (var17 >= param8) {
                                      var16++;
                                      continue L7;
                                    } else {
                                      if (param2[var33[var16]][var33[var17]] < var15) {
                                        var15 = param2[var33[var16]][var33[var17]];
                                        var17++;
                                        continue L8;
                                      } else {
                                        var17++;
                                        continue L8;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var16 = var14;
                              L9: while (true) {
                                if (param8 <= var16) {
                                  var15++;
                                  continue L6;
                                } else {
                                  var17 = 0;
                                  var18 = -1;
                                  var20 = 0;
                                  L10: while (true) {
                                    if (var20 >= var11) {
                                      var33[var16] = var18;
                                      var16++;
                                      continue L9;
                                    } else {
                                      var21 = param1[var34[var20]];
                                      var19 = 2147483647;
                                      var22 = 0;
                                      L11: while (true) {
                                        if (var22 >= param8) {
                                          if (var19 > var17) {
                                            var17 = var19;
                                            var18 = var21.field_p;
                                            var20++;
                                            continue L10;
                                          } else {
                                            var20++;
                                            continue L10;
                                          }
                                        } else {
                                          var23 = param2[var21.field_p][var33[var22]];
                                          if (var22 != var16) {
                                            if (-1 != var23) {
                                              if (var23 < var19) {
                                                var19 = var23;
                                                var22++;
                                                continue L11;
                                              } else {
                                                var22++;
                                                continue L11;
                                              }
                                            } else {
                                              var22++;
                                              continue L11;
                                            }
                                          } else {
                                            var22++;
                                            continue L11;
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
                          L12: while (true) {
                            if (var16 != -1) {
                              var33[var15] = var16;
                              var15++;
                              continue L4;
                            } else {
                              var16 = var12[qf.a((byte) 63, var11, param0)];
                              var17 = 0;
                              L13: while (true) {
                                if (var15 <= var17) {
                                  continue L12;
                                } else {
                                  if (var33[var17] == var16) {
                                    var16 = -1;
                                    continue L12;
                                  } else {
                                    var17++;
                                    continue L13;
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
                      continue L3;
                    }
                  }
                } else {
                  throw new jn("Not enough highly-connected systems!");
                }
              } else {
                var14 = param1[var26].field_D.length;
                if (param6 <= var14) {
                  if (param5 >= var14) {
                    var11++;
                    var12[var11] = param1[var26].field_p;
                    var26++;
                    continue L1;
                  } else {
                    var26++;
                    continue L1;
                  }
                } else {
                  var26++;
                  continue L1;
                }
              }
            }
          } else {
            var13_int = param1[var12_int].field_D.length;
            if (param6 <= var13_int) {
              if (var13_int <= param5) {
                var11++;
                var12_int++;
                continue L0;
              } else {
                var12_int++;
                continue L0;
              }
            } else {
              var12_int++;
              continue L0;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            hs.a((sl) null, (byte) 120);
        }
        field_i = null;
        field_j = null;
        field_g = null;
        field_l = null;
    }

    hs(int param0, int param1, int param2, int param3, int param4) {
        ((hs) this).field_b = param1;
        ((hs) this).field_d = param3;
        ((hs) this).field_h = param2;
        ((hs) this).field_a = param4;
        ((hs) this).field_c = param0;
        ((hs) this).field_e = -1 + ((hs) this).field_a;
        if (((hs) this).field_c * ((hs) this).field_b < ((hs) this).field_d) {
            throw new RuntimeException("Requested starcount (" + ((hs) this).field_d + ") is greater than map size (" + ((hs) this).field_c * ((hs) this).field_b + " hexes).");
        }
        ((hs) this).field_k = ((hs) this).field_b * (((hs) this).field_c * 100) / ((hs) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "<%PROJECT_METAL> - (<%Resource0>) A <%project_metal> fortifies a system. The fleet strength of the <%glossary>system</col>'s garrison is treated as <%highlight>double when defending</col>. This project may be used on any system you control.";
    }
}
