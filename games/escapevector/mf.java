/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class mf {
    private ob field_i;
    private boolean field_c;
    static ed field_a;
    private int field_h;
    private Object[][] field_e;
    private f field_g;
    private Object[] field_j;
    static tk field_d;
    static int[] field_l;
    static String field_b;
    static String[] field_f;
    static hf field_k;
    static ed field_m;

    final static int b(int param0, int param1, int param2) {
        if (param2 != -2) {
            return 21;
        }
        return ni.a(param0, param1, false, ka.field_b);
    }

    final int b(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (!((mf) this).b(0)) {
          return -1;
        } else {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              int discarded$2 = mf.b(((int[]) ((mf) this).field_j[2])[27], ((int[]) ((mf) this).field_j[15])[0], ((int[]) ((mf) this).field_j[6])[30]);
              break L0;
            }
          }
          param1 = param1.toLowerCase();
          var4 = (CharSequence) (Object) param1;
          var3 = ((mf) this).field_g.field_p.a(mh.a(param0 + 1, var4), 1);
          if (!this.a(var3, (byte) -124)) {
            return -1;
          } else {
            return var3;
          }
        }
    }

    final synchronized boolean a(boolean param0, int param1, int param2) {
        L0: {
          if (param0) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        if (!this.a(param2, 11315, param1)) {
          return false;
        } else {
          L1: {
            if (null == ((mf) this).field_e[param1]) {
              break L1;
            } else {
              if (null != ((mf) this).field_e[param1][param2]) {
                return true;
              } else {
                break L1;
              }
            }
          }
          if (null != ((mf) this).field_j[param1]) {
            return true;
          } else {
            this.c(param1, 14);
            if (null == ((mf) this).field_j[param1]) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, CharSequence param2) {
        int var5 = EscapeVector.field_A;
        String var3 = cf.a(param1, 81, param2);
        if (var3 != null) {
            return var3;
        }
        int var4 = 0;
        if (!param0) {
            return null;
        }
        do {
            if (var4 >= param2.length()) {
                return null;
            }
            if (!(fn.a(param2.charAt(var4), (byte) -124))) {
                return s.field_B;
            }
            var4++;
        } while (var5 == 0);
        return null;
    }

    final boolean a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (!((mf) this).b(0)) {
          return false;
        } else {
          param1 = param1.toLowerCase();
          var4 = (CharSequence) (Object) param1;
          var3 = ((mf) this).field_g.field_p.a(mh.a(param0, var4), 1);
          return ((mf) this).d(118, var3);
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        if (!(((mf) this).b(0))) {
            return false;
        }
        param1 = param1.toLowerCase();
        param0 = param0.toLowerCase();
        CharSequence var7 = (CharSequence) (Object) param1;
        int var4 = ((mf) this).field_g.field_p.a(mh.a(0, var7), 1);
        if (!(this.a(var4, (byte) 48))) {
            return false;
        }
        int var6 = 10 / ((-13 - param2) / 52);
        CharSequence var8 = (CharSequence) (Object) param0;
        int var5 = ((mf) this).field_g.field_s[var4].a(mh.a(0, var8), 1);
        return ((mf) this).a(true, var4, var5);
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (((mf) this).b(0)) {
          L0: {
            param2 = param2.toLowerCase();
            param1 = param1.toLowerCase();
            if (param0 == -4) {
              break L0;
            } else {
              boolean discarded$2 = ((mf) this).a(((byte[]) ((mf) this).field_j[3])[3]);
              break L0;
            }
          }
          var6 = (CharSequence) (Object) param2;
          var4 = ((mf) this).field_g.field_p.a(mh.a(param0 + 4, var6), 1);
          if (!this.a(var4, (byte) -113)) {
            return null;
          } else {
            var7 = (CharSequence) (Object) param1;
            var5 = ((mf) this).field_g.field_s[var4].a(mh.a(0, var7), 1);
            return ((mf) this).a(var4, (byte) -97, var5);
          }
        } else {
          return null;
        }
    }

    final byte[] a(byte param0, String param1, String param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CharSequence var8 = null;
        CharSequence var9 = null;
        if (((mf) this).b(0)) {
          param1 = param1.toLowerCase();
          param2 = param2.toLowerCase();
          var8 = (CharSequence) (Object) param1;
          var5 = ((mf) this).field_g.field_p.a(mh.a(0, var8), 1);
          if (!this.a(var5, (byte) 91)) {
            return null;
          } else {
            var6 = -115 / ((1 - param0) / 58);
            var9 = (CharSequence) (Object) param2;
            var7 = ((mf) this).field_g.field_s[var5].a(mh.a(0, var9), 1);
            return this.a((byte) 75, param3, var7, var5);
          }
        } else {
          return null;
        }
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        var5 = EscapeVector.field_A;
        if (!((mf) this).b(0)) {
          return 0;
        } else {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= ((mf) this).field_j.length) {
                  break L2;
                } else {
                  stackOut_5_0 = ((mf) this).field_g.field_i[var4];
                  stackIn_10_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_6_0 <= 0) {
                        break L3;
                      } else {
                        var3 = var3 + ((mf) this).b(3210, var4);
                        var2 += 100;
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_9_0 = -1;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            }
            if (stackIn_10_0 != (var2 ^ -1)) {
              if (param0 >= -27) {
                return 107;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              return 100;
            }
          }
        }
    }

    final static void a(int param0, c param1) {
        try {
            mn var2 = null;
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
            java.lang.reflect.Field var7 = null;
            int var8_int = 0;
            byte[][] var8 = null;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            mn var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Method var17 = null;
            int stackIn_28_0 = 0;
            int stackIn_70_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_27_0 = 0;
            int stackOut_69_0 = 0;
            var16 = null;
            var12 = EscapeVector.field_A;
            var13 = (mn) (Object) je.field_a.a(false);
            var2 = var13;
            if (var2 == null) {
              return;
            } else {
              L0: {
                var3 = 0;
                if (param0 == -20157) {
                  break L0;
                } else {
                  field_f = null;
                  break L0;
                }
              }
              var4 = 0;
              L1: while (true) {
                L2: {
                  if ((var2.field_i ^ -1) >= (var4 ^ -1)) {
                    break L2;
                  } else {
                    if (var12 != 0) {
                      return;
                    } else {
                      L3: {
                        if (null != var13.field_r[var4]) {
                          L4: {
                            if ((var13.field_r[var4].field_f ^ -1) != -3) {
                              break L4;
                            } else {
                              var13.field_o[var4] = -5;
                              break L4;
                            }
                          }
                          if (-1 != (var13.field_r[var4].field_f ^ -1)) {
                            break L3;
                          } else {
                            var3 = 1;
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (null != var13.field_p[var4]) {
                          L6: {
                            if (2 == var13.field_p[var4].field_f) {
                              var13.field_o[var4] = -6;
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          if ((var13.field_p[var4].field_f ^ -1) != -1) {
                            break L5;
                          } else {
                            var3 = 1;
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      var4++;
                      if (var12 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                if (var3 != 0) {
                  return;
                } else {
                  var4 = param1.field_m;
                  param1.a((byte) 125, var2.field_g);
                  var5 = 0;
                  L7: while (true) {
                    L8: {
                      L9: {
                        if ((var5 ^ -1) <= (var2.field_i ^ -1)) {
                          break L9;
                        } else {
                          stackOut_27_0 = 0;
                          stackIn_70_0 = stackOut_27_0;
                          stackIn_28_0 = stackOut_27_0;
                          if (var12 != 0) {
                            break L8;
                          } else {
                            L10: {
                              L11: {
                                if (stackIn_28_0 != var13.field_o[var5]) {
                                  param1.f(var13.field_o[var5], -123);
                                  if (var12 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                } else {
                                  break L11;
                                }
                              }
                              try {
                                L12: {
                                  L13: {
                                    L14: {
                                      var6_int = var13.field_m[var5];
                                      if ((var6_int ^ -1) != -1) {
                                        break L14;
                                      } else {
                                        var7 = (java.lang.reflect.Field) var13.field_r[var5].field_b;
                                        var8_int = var7.getInt((Object) null);
                                        param1.f(0, -123);
                                        param1.a((byte) 123, var8_int);
                                        if (var12 == 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    L15: {
                                      if (-2 != (var6_int ^ -1)) {
                                        break L15;
                                      } else {
                                        var14 = (java.lang.reflect.Field) var13.field_r[var5].field_b;
                                        var7 = var14;
                                        var14.setInt((Object) null, var13.field_j[var5]);
                                        param1.f(0, -123);
                                        if (var12 == 0) {
                                          break L13;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    if (-3 != (var6_int ^ -1)) {
                                      break L13;
                                    } else {
                                      var15 = (java.lang.reflect.Field) var13.field_r[var5].field_b;
                                      var8_int = var15.getModifiers();
                                      param1.f(0, -123);
                                      param1.a((byte) 125, var8_int);
                                      break L13;
                                    }
                                  }
                                  L16: {
                                    L17: {
                                      L18: {
                                        if (-4 == (var6_int ^ -1)) {
                                          break L18;
                                        } else {
                                          if ((var6_int ^ -1) != -5) {
                                            break L17;
                                          } else {
                                            var17 = (java.lang.reflect.Method) var13.field_p[var5].field_b;
                                            var8_int = var17.getModifiers();
                                            param1.f(0, param0 ^ 20166);
                                            param1.a((byte) 124, var8_int);
                                            if (var12 == 0) {
                                              break L17;
                                            } else {
                                              break L18;
                                            }
                                          }
                                        }
                                      }
                                      var17 = (java.lang.reflect.Method) var13.field_p[var5].field_b;
                                      var8 = var13.field_l[var5];
                                      var9 = new Object[var8.length];
                                      var10_int = 0;
                                      L19: while (true) {
                                        L20: {
                                          if ((var10_int ^ -1) <= (var8.length ^ -1)) {
                                            break L20;
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var8[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            if (var12 != 0) {
                                              break L17;
                                            } else {
                                              if (var12 == 0) {
                                                continue L19;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                        }
                                        L21: {
                                          var10 = var17.invoke((Object) null, var9);
                                          if (var10 != null) {
                                            break L21;
                                          } else {
                                            param1.f(0, -123);
                                            if (var12 == 0) {
                                              break L17;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                        L22: {
                                          if (!(var10 instanceof Number)) {
                                            break L22;
                                          } else {
                                            param1.f(1, param0 + 20034);
                                            param1.a(((Number) var10).longValue(), (byte) -23);
                                            if (var12 == 0) {
                                              break L17;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        L23: {
                                          if (var10 instanceof String) {
                                            break L23;
                                          } else {
                                            param1.f(4, -123);
                                            if (var12 == 0) {
                                              break L17;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        param1.f(2, -123);
                                        param1.a((String) var10, 77);
                                        break L16;
                                      }
                                    }
                                    break L16;
                                  }
                                  break L12;
                                }
                              } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                decompiledCaughtException = decompiledCaughtParameter5;
                                L29: {
                                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                  param1.f(-15, -123);
                                  break L29;
                                }
                              } catch (java.io.IOException decompiledCaughtParameter8) {
                                decompiledCaughtException = decompiledCaughtParameter8;
                                L32: {
                                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                  param1.f(-18, -123);
                                  break L32;
                                }
                              } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                decompiledCaughtException = decompiledCaughtParameter9;
                                L33: {
                                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                  param1.f(-19, -123);
                                  break L33;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter10) {
                                decompiledCaughtException = decompiledCaughtParameter10;
                                L34: {
                                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                  param1.f(-20, -123);
                                  break L34;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                decompiledCaughtException = decompiledCaughtParameter11;
                                L35: {
                                  var6_ref11 = decompiledCaughtException;
                                  param1.f(-21, param0 ^ 20166);
                                  break L35;
                                }
                              }
                              break L10;
                            }
                            var5++;
                            if (var12 == 0) {
                              continue L7;
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                      stackOut_69_0 = param1.c(var4, param0 ^ 20130);
                      stackIn_70_0 = stackOut_69_0;
                      break L8;
                    }
                    var2.c((byte) -38);
                    return;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_m = null;
        field_d = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 <= 119) {
            mf.a(84, (c) null);
        }
        field_l = null;
        field_k = null;
    }

    final static void a(int param0, int param1, int param2, ed param3, int param4) {
        Random var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        var16 = EscapeVector.field_A;
        if (param4 > -87) {
          return;
        } else {
          var5 = new Random();
          param1 = param1 + param3.field_q;
          param0 = param0 + param3.field_v;
          var6 = 0;
          L0: while (true) {
            L1: {
              if (var6 >= param3.field_x) {
                break L1;
              } else {
                var7 = var5.nextGaussian();
                if (var16 != 0) {
                  break L1;
                } else {
                  L2: {
                    if (var7 > -64.0) {
                      break L2;
                    } else {
                      var7 = -64.0;
                      break L2;
                    }
                  }
                  L3: {
                    if (var7 < 64.0) {
                      break L3;
                    } else {
                      var7 = 64.0;
                      break L3;
                    }
                  }
                  L4: {
                    var9 = (int)((double)param2 * var7) + param1;
                    var10 = param3.field_s * var6;
                    var11 = (var6 + param0) * 640 - -var9;
                    if (0 <= var9) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L4;
                    } else {
                      stackOut_9_0 = -var9;
                      stackIn_11_0 = stackOut_9_0;
                      break L4;
                    }
                  }
                  L5: {
                    var12 = stackIn_11_0;
                    if (640 < param3.field_s + var9) {
                      stackOut_13_0 = 640 - var9;
                      stackIn_14_0 = stackOut_13_0;
                      break L5;
                    } else {
                      stackOut_12_0 = param3.field_s;
                      stackIn_14_0 = stackOut_12_0;
                      break L5;
                    }
                  }
                  var13 = stackIn_14_0;
                  var14 = var12;
                  L6: while (true) {
                    if (var14 >= var13) {
                      var6++;
                      if (var16 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    } else {
                      L7: {
                        var15 = param3.field_B[var14 + var10];
                        if (var15 != 0) {
                          em.field_i[var14 + var11] = var15;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var14++;
                      continue L6;
                    }
                  }
                }
              }
            }
            return;
          }
        }
    }

    private final synchronized void c(int param0, int param1) {
        L0: {
          L1: {
            if (!((mf) this).field_c) {
              break L1;
            } else {
              ((mf) this).field_j[param0] = (Object) (Object) ((mf) this).field_i.a((byte) -73, param0);
              if (EscapeVector.field_A == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((mf) this).field_j[param0] = bk.a(false, ((mf) this).field_i.a((byte) -47, param0), 9);
          break L0;
        }
        L2: {
          if (param1 == 14) {
            break L2;
          } else {
            ((mf) this).field_g = null;
            break L2;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        if (-10 < (param0 ^ -1)) {
          return false;
        } else {
          L0: {
            if (param1 == -64) {
              break L0;
            } else {
              field_m = null;
              break L0;
            }
          }
          if (14 <= param0) {
            return false;
          } else {
            return true;
          }
        }
    }

    final int a(String param0, int param1) {
        if (!(((mf) this).b(param1))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((mf) this).field_g.field_p.a(mh.a(param1 + 0, var4), 1);
        return ((mf) this).b(param1 ^ 3210, var3);
    }

    final int a(int param0, String param1, boolean param2) {
        int var4 = 0;
        CharSequence var5 = null;
        L0: {
          if (param2) {
            break L0;
          } else {
            ((long[]) ((Object[]) ((mf) this).field_j[15])[4])[3] = ((long[]) ((mf) this).field_j[12])[2];
            break L0;
          }
        }
        if (!this.a(param0, (byte) -121)) {
          return -1;
        } else {
          param1 = param1.toLowerCase();
          var5 = (CharSequence) (Object) param1;
          var4 = ((mf) this).field_g.field_s[param0].a(mh.a(0, var5), 1);
          if (!this.a(var4, 11315, param0)) {
            return -1;
          } else {
            return var4;
          }
        }
    }

    private final synchronized byte[] a(byte param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.a(param2, 11315, param3)) {
          L0: {
            L1: {
              var5 = null;
              if (null == ((mf) this).field_e[param3]) {
                break L1;
              } else {
                if (((mf) this).field_e[param3][param2] == null) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if (!this.a(param1, -7951, param2, param3)) {
              this.c(param3, 14);
              if (this.a(param1, -7951, param2, param3)) {
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (null == ((mf) this).field_e[param3]) {
            throw new RuntimeException("");
          } else {
            if (((mf) this).field_e[param3][param2] != null) {
              var7 = fk.a(((mf) this).field_e[param3][param2], (byte) -126, false);
              var5_array = var7;
              if (var7 == null) {
                throw new RuntimeException("");
              } else {
                L2: {
                  if (var5_array == null) {
                    break L2;
                  } else {
                    L3: {
                      if (1 != ((mf) this).field_h) {
                        break L3;
                      } else {
                        ((mf) this).field_e[param3][param2] = null;
                        if ((((mf) this).field_g.field_e[param3] ^ -1) != -2) {
                          break L2;
                        } else {
                          ((mf) this).field_e[param3] = null;
                          if (EscapeVector.field_A == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    if (2 == ((mf) this).field_h) {
                      ((mf) this).field_e[param3] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L4: {
                  if (param0 == 75) {
                    break L4;
                  } else {
                    int discarded$2 = ((mf) this).a(-120);
                    break L4;
                  }
                }
                return var5_array;
              }
            } else {
              L5: {
                if (var5 == null) {
                  break L5;
                } else {
                  L6: {
                    if (1 != ((mf) this).field_h) {
                      break L6;
                    } else {
                      ((mf) this).field_e[param3][param2] = null;
                      if ((((mf) this).field_g.field_e[param3] ^ -1) != -2) {
                        break L5;
                      } else {
                        ((mf) this).field_e[param3] = null;
                        if (EscapeVector.field_A == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (2 == ((mf) this).field_h) {
                    ((mf) this).field_e[param3] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L7: {
                if (param0 == 75) {
                  break L7;
                } else {
                  int discarded$3 = ((mf) this).a(-120);
                  break L7;
                }
              }
              return (byte[]) var5;
            }
          }
        } else {
          return null;
        }
    }

    private final synchronized boolean a(int param0, byte param1) {
        int var3 = 0;
        var3 = -14 % ((-55 - param1) / 56);
        if (!((mf) this).b(0)) {
          return false;
        } else {
          L0: {
            if ((param0 ^ -1) > -1) {
              break L0;
            } else {
              if (param0 >= ((mf) this).field_g.field_e.length) {
                break L0;
              } else {
                if (0 == ((mf) this).field_g.field_e[param0]) {
                  break L0;
                } else {
                  return true;
                }
              }
            }
          }
          if (uj.field_d) {
            throw new IllegalArgumentException(Integer.toString(param0));
          } else {
            return false;
          }
        }
    }

    final synchronized boolean d(int param0, int param1) {
        if (!this.a(param1, (byte) 33)) {
          return false;
        } else {
          L0: {
            if (param0 >= 81) {
              break L0;
            } else {
              ((byte[]) ((mf) this).field_j[11])[30] = (byte) 8;
              break L0;
            }
          }
          if (((mf) this).field_j[param1] == null) {
            this.c(param1, 14);
            if (null != ((mf) this).field_j[param1]) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (((mf) this).b(param1 ^ param1)) {
          L0: {
            if ((param2 ^ -1) > -1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param2 >= ((mf) this).field_g.field_e.length) {
                  break L0;
                } else {
                  if (param0 >= ((mf) this).field_g.field_e[param2]) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (uj.field_d) {
            throw new IllegalArgumentException(param2 + " " + param0);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(String param0, byte param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (((mf) this).b(0)) {
          param0 = param0.toLowerCase();
          if (param1 < -102) {
            var4 = (CharSequence) (Object) param0;
            var3 = ((mf) this).field_g.field_p.a(mh.a(0, var4), 1);
            if (var3 < 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        var5 = EscapeVector.field_A;
        if (!((mf) this).b(0)) {
          return false;
        } else {
          L0: {
            if (param0 == -119) {
              break L0;
            } else {
              byte[] discarded$2 = ((mf) this).a((byte) -91, (String) null, (String) ((mf) this).field_j[0], (int[]) null);
              break L0;
            }
          }
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 < ((mf) this).field_g.field_d.length) {
              stackOut_8_0 = ((mf) this).field_g.field_d[var3];
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (var5 == 0) {
                var4 = stackIn_10_0;
                if (((mf) this).field_j[var4] == null) {
                  L2: {
                    this.c(var4, 14);
                    if (null != ((mf) this).field_j[var4]) {
                      break L2;
                    } else {
                      var2 = 0;
                      break L2;
                    }
                  }
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                return stackIn_9_0 != 0;
              }
            } else {
              return var2 != 0;
            }
          }
        }
    }

    final synchronized int b(int param0, int param1) {
        L0: {
          if (param0 == 3210) {
            break L0;
          } else {
            mf.c(69);
            break L0;
          }
        }
        if (this.a(param1, (byte) 48)) {
          if (((mf) this).field_j[param1] != null) {
            return 100;
          } else {
            return ((mf) this).field_i.a(0, param1);
          }
        } else {
          return 0;
        }
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        n var10 = null;
        byte[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        n var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_19_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_92_0 = 0;
        int[] stackOut_8_0 = null;
        int[] stackOut_18_0 = null;
        int stackOut_50_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_85_0 = 0;
        var22 = EscapeVector.field_A;
        if (this.a(param3, (byte) 109)) {
          if (null != ((mf) this).field_j[param3]) {
            L0: {
              var5 = ((mf) this).field_g.field_i[param3];
              var6 = ((mf) this).field_g.field_a[param3];
              if (((mf) this).field_e[param3] == null) {
                ((mf) this).field_e[param3] = new Object[((mf) this).field_g.field_e[param3]];
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                var7 = ((mf) this).field_e[param3];
                var8 = 1;
                var9_int = 0;
                if (var9_int >= var5) {
                  break L2;
                } else {
                  stackOut_8_0 = (int[]) var6;
                  stackIn_19_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var22 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_9_0 == null) {
                          break L4;
                        } else {
                          var10_int = var6[var9_int];
                          if (var22 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10_int = var9_int;
                      break L3;
                    }
                    L5: {
                      if (var7[var10_int] != null) {
                        break L5;
                      } else {
                        var8 = 0;
                        if (var22 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var9_int++;
                    break L2;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                stackOut_18_0 = (int[]) param0;
                stackIn_19_0 = stackOut_18_0;
                break L1;
              }
            }
            L6: {
              L7: {
                if (stackIn_19_0 == null) {
                  break L7;
                } else {
                  L8: {
                    if (0 != param0[0]) {
                      break L8;
                    } else {
                      if (-1 != param0[1]) {
                        break L8;
                      } else {
                        if (-1 != param0[2]) {
                          break L8;
                        } else {
                          if (param0[3] == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  var9 = fk.a(((mf) this).field_j[param3], (byte) -116, true);
                  var10 = new n(var9);
                  var10.a(5, param0, var10.field_g.length, 6528);
                  break L6;
                }
              }
              var9 = fk.a(((mf) this).field_j[param3], (byte) -117, false);
              break L6;
            }
            L9: {
              if (param1 == -7951) {
                break L9;
              } else {
                int discarded$1 = ((mf) this).a((String) ((mf) this).field_j[3], ((int[]) ((mf) this).field_j[2])[1]);
                break L9;
              }
            }
            L10: {
              var23 = s.a((byte) -26, var9);
              var10_array = var23;
              if (!((mf) this).field_c) {
                break L10;
              } else {
                ((mf) this).field_j[param3] = null;
                break L10;
              }
            }
            if (var5 > 1) {
              L11: {
                if (((mf) this).field_h != 2) {
                  break L11;
                } else {
                  var11 = var23.length;
                  var11--;
                  var12 = 255 & var23[var11];
                  var11 = var11 - 4 * var5 * var12;
                  var13 = new n(var10_array);
                  var14_int = 0;
                  var15_int = 0;
                  var13.field_m = var11;
                  var16 = 0;
                  L12: while (true) {
                    L13: {
                      if (var16 >= var12) {
                        stackOut_50_0 = 0;
                        stackIn_51_0 = stackOut_50_0;
                        break L13;
                      } else {
                        var17 = 0;
                        stackOut_40_0 = 0;
                        stackIn_51_0 = stackOut_40_0;
                        stackIn_41_0 = stackOut_40_0;
                        if (var22 != 0) {
                          break L13;
                        } else {
                          var18 = stackIn_41_0;
                          L14: while (true) {
                            if (var5 <= var18) {
                              var16++;
                              continue L12;
                            } else {
                              L15: {
                                L16: {
                                  var17 = var17 + var13.g(-5053);
                                  if (var6 != null) {
                                    break L16;
                                  } else {
                                    var19 = var18;
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var19 = var6[var18];
                                break L15;
                              }
                              L17: {
                                if (var19 != param2) {
                                  break L17;
                                } else {
                                  var14_int = var14_int + var17;
                                  var15_int = var19;
                                  break L17;
                                }
                              }
                              var18++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                    if (stackIn_51_0 != var14_int) {
                      var16_ref_byte__ = new byte[var14_int];
                      var13.field_m = var11;
                      var14_int = 0;
                      var17 = 0;
                      var18 = 0;
                      L18: while (true) {
                        if (var12 <= var18) {
                          var7[var15_int] = (Object) (Object) var16_ref_byte__;
                          if (var22 != 0) {
                            break L11;
                          } else {
                            return true;
                          }
                        } else {
                          var19 = 0;
                          stackOut_55_0 = 0;
                          stackIn_57_0 = stackOut_55_0;
                          stackIn_56_0 = stackOut_55_0;
                          if (var22 == 0) {
                            var20 = stackIn_57_0;
                            L19: while (true) {
                              if (var5 <= var20) {
                                var18++;
                                continue L18;
                              } else {
                                L20: {
                                  L21: {
                                    var19 = var19 + var13.g(-5053);
                                    if (var6 != null) {
                                      break L21;
                                    } else {
                                      var21 = var20;
                                      if (var22 == 0) {
                                        break L20;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                  var21 = var6[var20];
                                  break L20;
                                }
                                L22: {
                                  if (param2 != var21) {
                                    break L22;
                                  } else {
                                    qg.a(var10_array, var17, var16_ref_byte__, var14_int, var19);
                                    var14_int = var14_int + var19;
                                    break L22;
                                  }
                                }
                                var17 = var17 + var19;
                                var20++;
                                continue L19;
                              }
                            }
                          } else {
                            return stackIn_56_0 != 0;
                          }
                        }
                      }
                    } else {
                      return true;
                    }
                  }
                }
              }
              var11 = var23.length;
              var11--;
              var12 = 255 & var23[var11];
              var11 = var11 - var12 * var5 * 4;
              var13 = new n(var10_array);
              var13.field_m = var11;
              var14 = new int[var5];
              var15_int = 0;
              L23: while (true) {
                L24: {
                  if (var15_int >= var12) {
                    stackOut_76_0 = var5;
                    stackIn_77_0 = stackOut_76_0;
                    break L24;
                  } else {
                    var16 = 0;
                    stackOut_70_0 = 0;
                    stackIn_77_0 = stackOut_70_0;
                    stackIn_71_0 = stackOut_70_0;
                    if (var22 != 0) {
                      break L24;
                    } else {
                      var17 = stackIn_71_0;
                      L25: while (true) {
                        if (var17 >= var5) {
                          var15_int++;
                          continue L23;
                        } else {
                          var16 = var16 + var13.g(-5053);
                          var14[var17] = var14[var17] + var16;
                          var17++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                var15 = new byte[stackIn_77_0][];
                var16 = 0;
                L26: while (true) {
                  L27: {
                    if (var5 <= var16) {
                      var13.field_m = var11;
                      var16 = 0;
                      break L27;
                    } else {
                      var15[var16] = new byte[var14[var16]];
                      var14[var16] = 0;
                      var16++;
                      if (var22 != 0) {
                        break L27;
                      } else {
                        continue L26;
                      }
                    }
                  }
                  var17 = 0;
                  L28: while (true) {
                    L29: {
                      if (var17 >= var12) {
                        stackOut_91_0 = 0;
                        stackIn_92_0 = stackOut_91_0;
                        break L29;
                      } else {
                        var18 = 0;
                        stackOut_85_0 = 0;
                        stackIn_92_0 = stackOut_85_0;
                        stackIn_86_0 = stackOut_85_0;
                        if (var22 != 0) {
                          break L29;
                        } else {
                          var19 = stackIn_86_0;
                          L30: while (true) {
                            if (var5 <= var19) {
                              var17++;
                              continue L28;
                            } else {
                              var18 = var18 + var13.g(-5053);
                              qg.a(var23, var16, var15[var19], var14[var19], var18);
                              var16 = var16 + var18;
                              var14[var19] = var14[var19] + var18;
                              var19++;
                              continue L30;
                            }
                          }
                        }
                      }
                    }
                    var17 = stackIn_92_0;
                    L31: while (true) {
                      if (var5 <= var17) {
                        if (var22 != 0) {
                          L32: {
                            if (var6 != null) {
                              break L32;
                            } else {
                              var11 = 0;
                              break L32;
                            }
                          }
                          L33: {
                            var11 = var6[0];
                            if (((mf) this).field_h != 0) {
                              break L33;
                            } else {
                              var7[var11] = bk.a(false, var23, 9);
                              break L33;
                            }
                          }
                          var7[var11] = (Object) (Object) var23;
                          return true;
                        } else {
                          return true;
                        }
                      } else {
                        if (var22 == 0) {
                          L34: {
                            L35: {
                              if (var6 != null) {
                                break L35;
                              } else {
                                var18 = var17;
                                if (var22 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var18 = var6[var17];
                            break L34;
                          }
                          L36: {
                            L37: {
                              if (((mf) this).field_h == 0) {
                                break L37;
                              } else {
                                var7[var18] = (Object) (Object) var15[var17];
                                if (var22 == 0) {
                                  break L36;
                                } else {
                                  break L37;
                                }
                              }
                            }
                            var7[var18] = bk.a(false, var15[var17], n.a(param1, -7944));
                            break L36;
                          }
                          var17++;
                          continue L31;
                        } else {
                          return true;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              L38: {
                if (var6 != null) {
                  break L38;
                } else {
                  var11 = 0;
                  break L38;
                }
              }
              L39: {
                var11 = var6[0];
                if (((mf) this).field_h != 0) {
                  break L39;
                } else {
                  var7[var11] = bk.a(false, var23, 9);
                  break L39;
                }
              }
              var7[var11] = (Object) (Object) var23;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final byte[] a(int param0, byte param1, int param2) {
        if (param1 != -97) {
            return null;
        }
        return this.a((byte) 75, (int[]) null, param2, param0);
    }

    mf(ob param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((mf) this).field_g = null;
          if (0 > param2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((mf) this).field_c = stackIn_6_1 != 0;
              ((mf) this).field_h = param2;
              ((mf) this).field_i = param0;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    final synchronized boolean b(int param0) {
        if (param0 != 0) {
            return true;
        }
        if (null != ((mf) this).field_g) {
            return true;
        }
        ((mf) this).field_g = ((mf) this).field_i.a(29192);
        if (!(null != ((mf) this).field_g)) {
            return false;
        }
        ((mf) this).field_j = new Object[((mf) this).field_g.field_k];
        ((mf) this).field_e = new Object[((mf) this).field_g.field_k][];
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ed(7, 7);
        field_d = new tk();
        field_f = new String[]{"Retrieval - Hard: complete the asteroid<nbsp>levels", "Retrieval - Hard: complete the baked moon<nbsp>levels", "Retrieval - Hard: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Hard", "Retrieval - Hard:<br>get 25,000<nbsp>points", "Retrieval - Hard:<br>get 100,000<nbsp>points", "Retrieval: complete a level with more than 2500<nbsp>fuel", "Retrieval - Hard: destroy an alien laser gate and complete the<nbsp>level", "Blow yourself up at speed in the mothership's auto-shield<nbsp>area", "Retrieval - Hard: complete all levels in under 30<nbsp>minutes", "Retrieval - Hard: complete all levels in under 20<nbsp>minutes", "Retrieval - Hard: collect all power-ups in one<nbsp>session", "Retrieval - Hard: destroy all possible alien infrastructure in one<nbsp>session", "Retrieval - Hard: complete 'Force Matrix Defence', without using the<nbsp>power-up", "Retrieval - Hard: complete 'Seeker Caves', without using your shield or<nbsp>shooting", "Retrieval - Hard: complete 'High-Security Stronghold', destroying no more than four green<nbsp>pods", "Retrieval - Hard: complete 'Seeker Prison Cell', without using your<nbsp>shield", "Land on one of the attractors in 'Force Matrix<nbsp>Defence' in Retrieval", "Retrieval - Normal: complete the asteroid<nbsp>levels", "Retrieval - Normal: complete the baked moon<nbsp>levels", "Retrieval - Normal: complete the icy moon<nbsp>levels", "Complete <nbsp>Retrieval - Normal", "Complete the asteroids stage in Retribution", "Complete the sun-baked moon stage in Retribution", "Complete the icy moon stage on Retribution", "Complete the Retribution level set", "Score 350,000 points in Retribution", "Score 800,000 points in Retribution", "Destroy all alien infrastructure in Retribution", "Complete the Simulator level set", "Complete 'Pinball' on Simulator", "Complete 'Anti-gravity' on Simulator"};
        field_k = new hf();
    }
}
