/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nc extends hf {
    static nh field_M;
    static boolean[][] field_J;
    static ac field_O;
    private static String field_N;
    static int[] field_L;
    static he[] field_I;
    static nh field_K;

    private nc(String param0, cg param1, fd param2) {
        super(param0, param1, param2);
        ((nc) this).field_l = ja.field_Q.field_h;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ((nc) this).field_A = !((nc) this).field_A ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private nc(String param0, fd param1) {
        this(param0, ja.field_Q.field_b, param1);
        ((nc) this).field_l = ja.field_Q.field_h;
    }

    nc(String param0, fd param1, boolean param2) {
        this(param0, param1);
        ((nc) this).field_A = param2 ? true : false;
    }

    final static void a(byte param0, lh param1) {
        try {
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            InvalidClassException var7_ref = null;
            StreamCorruptedException var7_ref2 = null;
            OptionalDataException var7_ref3 = null;
            IllegalAccessException var7_ref4 = null;
            IllegalArgumentException var7_ref5 = null;
            java.lang.reflect.InvocationTargetException var7_ref6 = null;
            SecurityException var7_ref7 = null;
            IOException var7_ref8 = null;
            NullPointerException var7_ref9 = null;
            Exception var7_ref10 = null;
            Throwable var7_ref11 = null;
            int var7_int = 0;
            int var9 = 0;
            Object[] var10 = null;
            int var11_int = 0;
            Object var11 = null;
            ObjectInputStream var12 = null;
            int var13 = 0;
            lc var14 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            lc var17 = null;
            java.lang.reflect.Field var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            Throwable decompiledCaughtException = null;
            var16 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var23 = null;
            var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var14 = (lc) (Object) g.field_t.h(-11151);
            var17 = var14;
            if (var17 != null) {
              var4 = 108 / ((11 - param0) / 33);
              var3 = 0;
              var5 = 0;
              L0: while (true) {
                if (var17.field_r <= var5) {
                  if (var3 != 0) {
                    return;
                  } else {
                    var5 = param1.field_j;
                    param1.a(var17.field_l, (byte) 121);
                    var6 = 0;
                    L1: while (true) {
                      if (var17.field_r <= var6) {
                        var6++;
                      } else {
                        L2: {
                          if (-1 != (var17.field_p[var6] ^ -1)) {
                            param1.c(var17.field_p[var6], (byte) -125);
                            break L2;
                          } else {
                            try {
                              L3: {
                                var7_int = var17.field_j[var6];
                                if (var7_int == 0) {
                                  var28 = (java.lang.reflect.Field) var17.field_n[var6].field_g;
                                  var9 = var28.getInt((Object) null);
                                  param1.c(0, (byte) -122);
                                  param1.a(var9, (byte) 115);
                                  break L3;
                                } else {
                                  if (var7_int != 1) {
                                    if ((var7_int ^ -1) != -3) {
                                      break L3;
                                    } else {
                                      var27 = (java.lang.reflect.Field) var17.field_n[var6].field_g;
                                      var9 = var27.getModifiers();
                                      param1.c(0, (byte) -87);
                                      param1.a(var9, (byte) 115);
                                      break L3;
                                    }
                                  } else {
                                    var16_ref = (java.lang.reflect.Field) var17.field_n[var6].field_g;
                                    var18 = var16_ref;
                                    var18.setInt((Object) null, var17.field_w[var6]);
                                    param1.c(0, (byte) -118);
                                    break L3;
                                  }
                                }
                              }
                              L4: {
                                if (var7_int != 3) {
                                  if (var7_int != 4) {
                                    break L4;
                                  } else {
                                    var30 = (java.lang.reflect.Method) var17.field_o[var6].field_g;
                                    var9 = var30.getModifiers();
                                    param1.c(0, (byte) -122);
                                    param1.a(var9, (byte) -23);
                                    break L4;
                                  }
                                } else {
                                  var29 = (java.lang.reflect.Method) var17.field_o[var6].field_g;
                                  var26 = var17.field_t[var6];
                                  var10 = new Object[var26.length];
                                  var11_int = 0;
                                  L5: while (true) {
                                    if (var26.length <= var11_int) {
                                      var11 = var29.invoke((Object) null, var10);
                                      if (var11 != null) {
                                        if (var11 instanceof Number) {
                                          param1.c(1, (byte) -116);
                                          param1.a(((Number) var11).longValue(), (byte) 122);
                                          break L4;
                                        } else {
                                          if (!(var11 instanceof String)) {
                                            param1.c(4, (byte) -114);
                                            break L4;
                                          } else {
                                            param1.c(2, (byte) -121);
                                            param1.a((String) var11, -1);
                                            break L4;
                                          }
                                        }
                                      } else {
                                        param1.c(0, (byte) -110);
                                        break L4;
                                      }
                                    } else {
                                      var12 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var11_int]));
                                      var10[var11_int] = var12.readObject();
                                      var11_int++;
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param1.c(-14, (byte) -109);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param1.c(-17, (byte) -109);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref8 = (IOException) (Object) decompiledCaughtException;
                              param1.c(-18, (byte) -82);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param1.c(-19, (byte) -84);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var7_ref10 = (Exception) (Object) decompiledCaughtException;
                              param1.c(-20, (byte) -107);
                            }
                            break L2;
                          }
                        }
                        var7_ref11 = decompiledCaughtException;
                        param1.c(-21, (byte) -98);
                        continue L1;
                      }
                    }
                  }
                } else {
                  L6: {
                    if (var14.field_n[var5] == null) {
                      break L6;
                    } else {
                      L7: {
                        if (var14.field_n[var5].field_b != 2) {
                          break L7;
                        } else {
                          var14.field_p[var5] = -5;
                          break L7;
                        }
                      }
                      if (var14.field_n[var5].field_b == 0) {
                        var3 = 1;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  if (null != var14.field_o[var5]) {
                    L8: {
                      if (var14.field_o[var5].field_b == -3) {
                        var14.field_p[var5] = -6;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (-1 == var14.field_o[var5].field_b) {
                      var3 = 1;
                      var5++;
                      continue L0;
                    } else {
                      var5++;
                      continue L0;
                    }
                  } else {
                    var5++;
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

    final static vi a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = param0.length();
          if (param1 == -33) {
            break L0;
          } else {
            field_L = null;
            break L0;
          }
        }
        if (-1 != var2) {
          if (-64 >= var2) {
            var3 = 0;
            L1: while (true) {
              if (var3 < var2) {
                var4 = param0.charAt(var3);
                if (45 == var4) {
                  L2: {
                    if (0 == var3) {
                      break L2;
                    } else {
                      if (-1 + var2 == var3) {
                        break L2;
                      } else {
                        var3++;
                        continue L1;
                      }
                    }
                  }
                  return dh.field_H;
                } else {
                  if (-1 == field_N.indexOf(var4)) {
                    return dh.field_H;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              } else {
                return null;
              }
            }
          } else {
            return ej.field_f;
          }
        } else {
          return qj.field_e;
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        oi.field_c = true;
        if (param2 <= 71) {
            return;
        }
        hl.field_b = param1;
        ol.field_a = new ma(ng.field_c, wi.field_e, param0, sg.field_a, hl.field_b);
        ng.field_c.a((byte) -110, (vg) (Object) ol.field_a);
    }

    public static void a(byte param0) {
        field_J = null;
        field_N = null;
        field_K = null;
        if (param0 < 31) {
            return;
        }
        field_L = null;
        field_I = null;
        field_M = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_L = new int[]{68, 39, 33, 23, 28, 0, 0, 0, 0, 0, 0, 127, 0, 69, 62, 60, 65, 128, 130, 25, 25, 25, 65, 36, 52, 59, 25, 58, 25, 58, 25, 0, 0, 0, 0, 68, 0, 0, 39, 33, 16, 0, 0, 0, 0, 0, 0, 42, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 25, 25, 25, 65, 36, 52, 59, 25, 58, 25, 58, 25};
        field_J = new boolean[][]{new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4], new boolean[4]};
    }
}
