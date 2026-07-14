/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hd extends un {
    private qp field_z;
    private String field_v;
    static ao field_r;
    private boolean field_y;
    static ao field_w;
    static String field_t;
    static cj field_x;
    static fe field_s;
    static int field_q;
    static int field_u;

    hd(pm param0, pm param1) {
        super(param0);
        ((hd) this).field_v = "";
        ((hd) this).field_y = false;
        ((hd) this).field_z = new qp(param0, param1);
    }

    final re a(boolean param0, String param1) {
        uc var3 = null;
        if (((hd) this).field_z.a(param0, param1) == jq.field_b) {
            return jq.field_b;
        }
        if (!param1.equals((Object) (Object) ((hd) this).field_v)) {
            var3 = ga.a(param1, false);
            if (!(var3.d(-99))) {
                return ua.field_I;
            }
            ((hd) this).field_v = param1;
            ((hd) this).field_y = var3.b(18307);
        }
        return ((hd) this).field_y ? db.field_b : jq.field_b;
    }

    final String a(String param0, int param1) {
        if (!(((hd) this).field_z.a(false, param0) != jq.field_b)) {
            return ((hd) this).field_z.a(param0, -1276425040);
        }
        if (param1 != -1276425040) {
            return null;
        }
        if (((hd) this).a(false, param0) == jq.field_b) {
            return eg.field_z;
        }
        return gi.field_h;
    }

    final static boolean a(int param0, char param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 == -24315) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (param1 < 65) {
                break L3;
              } else {
                if (param1 <= 90) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (param1 < 97) {
                break L4;
              } else {
                if (param1 > 122) {
                  break L4;
                } else {
                  break L2;
                }
              }
            }
            stackOut_9_0 = 0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          stackOut_8_0 = 1;
          stackIn_10_0 = stackOut_8_0;
          break L1;
        }
        return stackIn_10_0 != 0;
    }

    final static void a(java.math.BigInteger param0, byte param1, java.math.BigInteger param2, k param3, k param4) {
        qi.a(0, true, param0, param3.field_j, param2, param3.field_m, param4);
        int var5 = 19 % ((-76 - param1) / 44);
    }

    public static void h(int param0) {
        field_w = null;
        field_r = null;
        field_t = null;
        if (param0 != 11702) {
            Object var2 = null;
            String discarded$0 = hd.a(-23, (String) null, 34);
        }
        field_x = null;
        field_s = null;
    }

    final static void a(ga param0, int param1) {
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
            lp var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lp var17 = null;
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
            var12 = ZombieDawnMulti.field_E ? 1 : 0;
            var13 = (lp) (Object) we.field_k.c(76);
            var17 = var13;
            if (var17 != null) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var4 >= var17.field_n) {
                  if (var3 == 0) {
                    var4 = param0.field_j;
                    param0.b(param1 ^ 34, var17.field_r);
                    var5 = param1;
                    L1: while (true) {
                      if (var5 >= var17.field_n) {
                        var5++;
                      } else {
                        L2: {
                          if (var17.field_g[var5] != 0) {
                            param0.a(-99, var17.field_g[var5]);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var6_int = var17.field_i[var5];
                                if (0 != var6_int) {
                                  if ((var6_int ^ -1) != -2) {
                                    if (-3 != (var6_int ^ -1)) {
                                      break L3;
                                    } else {
                                      var15 = (java.lang.reflect.Field) var17.field_m[var5].field_d;
                                      var8 = var15.getModifiers();
                                      param0.a(118, 0);
                                      param0.b(-126, var8);
                                      break L3;
                                    }
                                  } else {
                                    var16_ref = (java.lang.reflect.Field) var17.field_m[var5].field_d;
                                    var19 = var16_ref;
                                    var19.setInt((Object) null, var17.field_q[var5]);
                                    param0.a(-32, 0);
                                    break L3;
                                  }
                                } else {
                                  var26 = (java.lang.reflect.Field) var17.field_m[var5].field_d;
                                  var8 = var26.getInt((Object) null);
                                  param0.a(-95, 0);
                                  param0.b(-123, var8);
                                  break L3;
                                }
                              }
                              L4: {
                                if (var6_int != 3) {
                                  if ((var6_int ^ -1) != -5) {
                                    break L4;
                                  } else {
                                    var28 = (java.lang.reflect.Method) var17.field_l[var5].field_d;
                                    var8 = var28.getModifiers();
                                    param0.a(125, 0);
                                    param0.b(-102, var8);
                                    break L4;
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Method) var17.field_l[var5].field_d;
                                  var25 = var17.field_o[var5];
                                  var9 = new Object[var25.length];
                                  var10_int = 0;
                                  L5: while (true) {
                                    if (var10_int >= var25.length) {
                                      var10 = var27.invoke((Object) null, var9);
                                      if (var10 != null) {
                                        if (var10 instanceof Number) {
                                          param0.a(116, 1);
                                          param0.a(((Number) var10).longValue(), true);
                                          break L4;
                                        } else {
                                          if (!(var10 instanceof String)) {
                                            param0.a(-45, 4);
                                            break L4;
                                          } else {
                                            param0.a(113, 2);
                                            param0.a((String) var10, (byte) 105);
                                            break L4;
                                          }
                                        }
                                      } else {
                                        param0.a(param1 + 123, 0);
                                        break L4;
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param0.a(-109, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param0.a(param1 + 127, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param0.a(-38, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param0.a(param1 ^ 115, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param0.a(124, -20);
                            }
                            break L2;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param0.a(-97, -21);
                        continue L1;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  L6: {
                    if (null == var13.field_m[var4]) {
                      break L6;
                    } else {
                      L7: {
                        if (2 != var13.field_m[var4].field_f) {
                          break L7;
                        } else {
                          var13.field_g[var4] = -5;
                          break L7;
                        }
                      }
                      if (var13.field_m[var4].field_f == 0) {
                        var3 = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (null != var13.field_l[var4]) {
                    L8: {
                      if (2 != var13.field_l[var4].field_f) {
                        break L8;
                      } else {
                        var13.field_g[var4] = -6;
                        break L8;
                      }
                    }
                    if (var13.field_l[var4].field_f == 0) {
                      var3 = 1;
                      var4++;
                      continue L0;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
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

    final static void a(boolean param0, int param1) {
        if (!(gi.field_i == null)) {
            gi.field_i.c(param0, -1);
        }
        if (param1 != -19) {
            Object var3 = null;
            hd.a((java.math.BigInteger) null, (byte) -46, (java.math.BigInteger) null, (k) null, (k) null);
        }
    }

    final static String a(int param0, String param1, int param2) {
        if (!(param0 != 3)) {
            return ga.field_q;
        }
        if (!((param0 ^ -1) != -7)) {
            return gm.field_ob;
        }
        if (!(param0 != 7)) {
            return kb.field_w;
        }
        if (param0 == param2) {
            return fd.field_I;
        }
        if (-10 == param0) {
            return la.field_b;
        }
        if ((param0 ^ -1) == -11) {
            return qi.field_b;
        }
        if (11 == param0) {
            return ek.field_I;
        }
        if (param0 != 14) {
            return null;
        }
        return vl.a(gl.field_K, new String[1], 2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ao(0, 2, 2, 1);
        field_w = new ao(13, 0, 1, 0);
        field_t = "Phantom";
        field_u = 75;
    }
}
