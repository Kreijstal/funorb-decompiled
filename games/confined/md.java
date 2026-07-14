/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md {
    static String field_b;
    static int field_a;

    final static void d(int param0) {
        if (param0 >= -86) {
            field_a = 92;
        }
        ef.field_tb = 0;
        rm.field_f = new eg(0);
        hc.field_u = mn.field_c;
        bg.field_f = -1;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        qn var4 = null;
        long var4_long = 0L;
        int var5 = 0;
        bj var6_ref_bj = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String[][] var8 = null;
        String[][] var9 = null;
        long[][] var10 = null;
        int[][] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        long var22 = 0L;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        hb var28 = null;
        L0: {
          var26 = Confined.field_J ? 1 : 0;
          if (param0 == -10964) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var28 = e.field_c;
          var2 = var28.c(32);
          if (var2 == 0) {
            var3 = var28.a((byte) 25);
            var4 = (qn) (Object) na.field_T.a(86);
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  if (var3 != var4.field_w) {
                    var4 = (qn) (Object) na.field_T.d(2123);
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var4 != null) {
                L4: {
                  var5 = var28.c(32);
                  if (var5 == 0) {
                    break L4;
                  } else {
                    var6 = var4.field_o;
                    in.field_e[0].field_a = false;
                    in.field_e[0].field_g = qc.field_m;
                    var7 = var4.field_s;
                    in.field_e[0].field_b = null;
                    var8_int = 1;
                    L5: while (true) {
                      if (var8_int >= var5) {
                        var4.field_u = new String[3][var6];
                        var8 = new String[3][var6];
                        var9 = new String[3][var6];
                        var4.field_p = new long[3][var6];
                        var10 = new long[3][var6];
                        var4.field_q = new int[3][var6 * var7];
                        var11 = new int[3][var6 * var7];
                        var12 = 0;
                        var13 = 0;
                        var14 = 0;
                        var15 = 0;
                        var16 = 0;
                        var17 = 0;
                        var18 = var28.c(32);
                        if (var18 > 0) {
                          var19 = 0;
                          L6: while (true) {
                            if (var18 <= var19) {
                              break L4;
                            } else {
                              L7: {
                                var20 = var28.c(32);
                                var21 = in.field_e[var20].field_g;
                                var22 = var28.h((byte) -68);
                                var24 = var28.field_n;
                                if (var19 >= var6) {
                                  break L7;
                                } else {
                                  var8[0][var12] = var21;
                                  var9[0][var12] = in.field_e[var20].field_b;
                                  var10[0][var12] = var22;
                                  var25 = 0;
                                  L8: while (true) {
                                    if (var7 <= var25) {
                                      var12++;
                                      break L7;
                                    } else {
                                      var15++;
                                      var11[0][var15] = var28.f((byte) 52);
                                      var25++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var21 == null) {
                                  break L9;
                                } else {
                                  if (!im.a(var21, 61)) {
                                    break L9;
                                  } else {
                                    var8[1][var13] = qc.field_m;
                                    var9[1][var13] = null;
                                    var10[1][var13] = var22;
                                    var28.field_n = var24;
                                    var13++;
                                    var25 = 0;
                                    L10: while (true) {
                                      if (var7 <= var25) {
                                        break L9;
                                      } else {
                                        var16++;
                                        var11[1][var16] = var28.f((byte) 37);
                                        var25++;
                                        continue L10;
                                      }
                                    }
                                  }
                                }
                              }
                              if (var14 < var6) {
                                if (!in.field_e[var20].field_a) {
                                  in.field_e[var20].field_a = true;
                                  var8[2][var14] = var21;
                                  var9[2][var14] = in.field_e[var20].field_b;
                                  var10[2][var14] = var22;
                                  var14++;
                                  var28.field_n = var24;
                                  var25 = 0;
                                  L11: while (true) {
                                    if (var7 > var25) {
                                      var17++;
                                      var11[2][var17] = var28.f((byte) 100);
                                      var25++;
                                      continue L11;
                                    } else {
                                      var19++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  var19++;
                                  continue L6;
                                }
                              } else {
                                var19++;
                                continue L6;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        in.field_e[var8_int].field_g = var28.d(true);
                        in.field_e[var8_int].field_a = false;
                        if (-2 != (var28.c(param0 + 10996) ^ -1)) {
                          in.field_e[var8_int].field_b = null;
                          var8_int++;
                          continue L5;
                        } else {
                          in.field_e[var8_int].field_b = var28.d(true);
                          var8_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
                var4.field_t = true;
                var4.a(true);
                break L1;
              } else {
                dc.d(117);
                return;
              }
            }
          } else {
            if (1 != var2) {
              mb.a("HS1: " + ui.a(param0 ^ -10970), true, (Throwable) null);
              dc.d(102);
              break L1;
            } else {
              var3 = var28.a((byte) 25);
              var4_long = var28.h((byte) -68);
              var6_ref_bj = (bj) (Object) lf.field_k.a(82);
              L12: while (true) {
                L13: {
                  if (var6_ref_bj == null) {
                    break L13;
                  } else {
                    if (var6_ref_bj.field_p == var3) {
                      break L13;
                    } else {
                      var6_ref_bj = (bj) (Object) lf.field_k.d(2123);
                      continue L12;
                    }
                  }
                }
                if (var6_ref_bj == null) {
                  dc.d(108);
                  return;
                } else {
                  var6_ref_bj.field_v = var4_long;
                  var6_ref_bj.a(true);
                  break L1;
                }
              }
            }
          }
        }
    }

    final static void a(hb param0, byte param1) {
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
            dg var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            dg var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var16_ref = null;
                        var22 = null;
                        var23 = null;
                        var12 = Confined.field_J ? 1 : 0;
                        var13 = (dg) (Object) af.field_cb.a(26);
                        var17 = var13;
                        if (var17 != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (var4 >= var17.field_r) {
                            statePc = 17;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (null == var13.field_m[var4]) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if ((var13.field_m[var4].field_g ^ -1) != -3) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        var13.field_u[var4] = -5;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (var13.field_m[var4].field_g == 0) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var3 = 1;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != var13.field_q[var4]) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 12: {
                        if ((var13.field_q[var4].field_g ^ -1) != -3) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var13.field_u[var4] = -6;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var13.field_q[var4].field_g == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 16: {
                        var3 = 1;
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 17: {
                        if (var3 != 0) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        var4 = param0.field_n;
                        param0.d(-116, var17.field_t);
                        var5 = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var5 >= var17.field_r) {
                            statePc = 58;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (0 == var17.field_u[var5]) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        param0.f(99, var17.field_u[var5]);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            var6_int = var17.field_o[var5];
                            if (-1 != (var6_int ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ClassNotFoundException ? 45 : (stateCaught_24 instanceof InvalidClassException ? 46 : (stateCaught_24 instanceof StreamCorruptedException ? 47 : (stateCaught_24 instanceof OptionalDataException ? 48 : (stateCaught_24 instanceof IllegalAccessException ? 49 : (stateCaught_24 instanceof IllegalArgumentException ? 50 : (stateCaught_24 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_24 instanceof SecurityException ? 52 : (stateCaught_24 instanceof IOException ? 53 : (stateCaught_24 instanceof NullPointerException ? 54 : (stateCaught_24 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var27 = (java.lang.reflect.Field) var17.field_m[var5].field_f;
                            var8 = var27.getInt((Object) null);
                            param0.f(120, 0);
                            param0.d(-110, var8);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 45 : (stateCaught_25 instanceof InvalidClassException ? 46 : (stateCaught_25 instanceof StreamCorruptedException ? 47 : (stateCaught_25 instanceof OptionalDataException ? 48 : (stateCaught_25 instanceof IllegalAccessException ? 49 : (stateCaught_25 instanceof IllegalArgumentException ? 50 : (stateCaught_25 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_25 instanceof SecurityException ? 52 : (stateCaught_25 instanceof IOException ? 53 : (stateCaught_25 instanceof NullPointerException ? 54 : (stateCaught_25 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var6_int == -2) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 45 : (stateCaught_26 instanceof InvalidClassException ? 46 : (stateCaught_26 instanceof StreamCorruptedException ? 47 : (stateCaught_26 instanceof OptionalDataException ? 48 : (stateCaught_26 instanceof IllegalAccessException ? 49 : (stateCaught_26 instanceof IllegalArgumentException ? 50 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_26 instanceof SecurityException ? 52 : (stateCaught_26 instanceof IOException ? 53 : (stateCaught_26 instanceof NullPointerException ? 54 : (stateCaught_26 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-3 == var6_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 45 : (stateCaught_27 instanceof InvalidClassException ? 46 : (stateCaught_27 instanceof StreamCorruptedException ? 47 : (stateCaught_27 instanceof OptionalDataException ? 48 : (stateCaught_27 instanceof IllegalAccessException ? 49 : (stateCaught_27 instanceof IllegalArgumentException ? 50 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_27 instanceof SecurityException ? 52 : (stateCaught_27 instanceof IOException ? 53 : (stateCaught_27 instanceof NullPointerException ? 54 : (stateCaught_27 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 45 : (stateCaught_28 instanceof InvalidClassException ? 46 : (stateCaught_28 instanceof StreamCorruptedException ? 47 : (stateCaught_28 instanceof OptionalDataException ? 48 : (stateCaught_28 instanceof IllegalAccessException ? 49 : (stateCaught_28 instanceof IllegalArgumentException ? 50 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_28 instanceof SecurityException ? 52 : (stateCaught_28 instanceof IOException ? 53 : (stateCaught_28 instanceof NullPointerException ? 54 : (stateCaught_28 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var28 = (java.lang.reflect.Field) var17.field_m[var5].field_f;
                            var8 = var28.getModifiers();
                            param0.f(117, 0);
                            param0.d(-121, var8);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 45 : (stateCaught_29 instanceof InvalidClassException ? 46 : (stateCaught_29 instanceof StreamCorruptedException ? 47 : (stateCaught_29 instanceof OptionalDataException ? 48 : (stateCaught_29 instanceof IllegalAccessException ? 49 : (stateCaught_29 instanceof IllegalArgumentException ? 50 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_29 instanceof SecurityException ? 52 : (stateCaught_29 instanceof IOException ? 53 : (stateCaught_29 instanceof NullPointerException ? 54 : (stateCaught_29 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_m[var5].field_f;
                            var20 = var16_ref;
                            var20.setInt((Object) null, var17.field_v[var5]);
                            param0.f(94, 0);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 45 : (stateCaught_30 instanceof InvalidClassException ? 46 : (stateCaught_30 instanceof StreamCorruptedException ? 47 : (stateCaught_30 instanceof OptionalDataException ? 48 : (stateCaught_30 instanceof IllegalAccessException ? 49 : (stateCaught_30 instanceof IllegalArgumentException ? 50 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_30 instanceof SecurityException ? 52 : (stateCaught_30 instanceof IOException ? 53 : (stateCaught_30 instanceof NullPointerException ? 54 : (stateCaught_30 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var6_int != 3) {
                                statePc = 42;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 45 : (stateCaught_31 instanceof InvalidClassException ? 46 : (stateCaught_31 instanceof StreamCorruptedException ? 47 : (stateCaught_31 instanceof OptionalDataException ? 48 : (stateCaught_31 instanceof IllegalAccessException ? 49 : (stateCaught_31 instanceof IllegalArgumentException ? 50 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_31 instanceof SecurityException ? 52 : (stateCaught_31 instanceof IOException ? 53 : (stateCaught_31 instanceof NullPointerException ? 54 : (stateCaught_31 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var29 = (java.lang.reflect.Method) var17.field_q[var5].field_f;
                            var26 = var17.field_s[var5];
                            var9 = new Object[var26.length];
                            var10_int = 0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 45 : (stateCaught_32 instanceof InvalidClassException ? 46 : (stateCaught_32 instanceof StreamCorruptedException ? 47 : (stateCaught_32 instanceof OptionalDataException ? 48 : (stateCaught_32 instanceof IllegalAccessException ? 49 : (stateCaught_32 instanceof IllegalArgumentException ? 50 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_32 instanceof SecurityException ? 52 : (stateCaught_32 instanceof IOException ? 53 : (stateCaught_32 instanceof NullPointerException ? 54 : (stateCaught_32 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var26.length <= var10_int) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 45 : (stateCaught_33 instanceof InvalidClassException ? 46 : (stateCaught_33 instanceof StreamCorruptedException ? 47 : (stateCaught_33 instanceof OptionalDataException ? 48 : (stateCaught_33 instanceof IllegalAccessException ? 49 : (stateCaught_33 instanceof IllegalArgumentException ? 50 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_33 instanceof SecurityException ? 52 : (stateCaught_33 instanceof IOException ? 53 : (stateCaught_33 instanceof NullPointerException ? 54 : (stateCaught_33 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 45 : (stateCaught_34 instanceof InvalidClassException ? 46 : (stateCaught_34 instanceof StreamCorruptedException ? 47 : (stateCaught_34 instanceof OptionalDataException ? 48 : (stateCaught_34 instanceof IllegalAccessException ? 49 : (stateCaught_34 instanceof IllegalArgumentException ? 50 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_34 instanceof SecurityException ? 52 : (stateCaught_34 instanceof IOException ? 53 : (stateCaught_34 instanceof NullPointerException ? 54 : (stateCaught_34 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var10 = var29.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 45 : (stateCaught_35 instanceof InvalidClassException ? 46 : (stateCaught_35 instanceof StreamCorruptedException ? 47 : (stateCaught_35 instanceof OptionalDataException ? 48 : (stateCaught_35 instanceof IllegalAccessException ? 49 : (stateCaught_35 instanceof IllegalArgumentException ? 50 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_35 instanceof SecurityException ? 52 : (stateCaught_35 instanceof IOException ? 53 : (stateCaught_35 instanceof NullPointerException ? 54 : (stateCaught_35 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            param0.f(96, 0);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 45 : (stateCaught_36 instanceof InvalidClassException ? 46 : (stateCaught_36 instanceof StreamCorruptedException ? 47 : (stateCaught_36 instanceof OptionalDataException ? 48 : (stateCaught_36 instanceof IllegalAccessException ? 49 : (stateCaught_36 instanceof IllegalArgumentException ? 50 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_36 instanceof SecurityException ? 52 : (stateCaught_36 instanceof IOException ? 53 : (stateCaught_36 instanceof NullPointerException ? 54 : (stateCaught_36 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 41;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 45 : (stateCaught_37 instanceof InvalidClassException ? 46 : (stateCaught_37 instanceof StreamCorruptedException ? 47 : (stateCaught_37 instanceof OptionalDataException ? 48 : (stateCaught_37 instanceof IllegalAccessException ? 49 : (stateCaught_37 instanceof IllegalArgumentException ? 50 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_37 instanceof SecurityException ? 52 : (stateCaught_37 instanceof IOException ? 53 : (stateCaught_37 instanceof NullPointerException ? 54 : (stateCaught_37 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var10 instanceof String) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 45 : (stateCaught_38 instanceof InvalidClassException ? 46 : (stateCaught_38 instanceof StreamCorruptedException ? 47 : (stateCaught_38 instanceof OptionalDataException ? 48 : (stateCaught_38 instanceof IllegalAccessException ? 49 : (stateCaught_38 instanceof IllegalArgumentException ? 50 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_38 instanceof SecurityException ? 52 : (stateCaught_38 instanceof IOException ? 53 : (stateCaught_38 instanceof NullPointerException ? 54 : (stateCaught_38 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            param0.f(94, 4);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 45 : (stateCaught_39 instanceof InvalidClassException ? 46 : (stateCaught_39 instanceof StreamCorruptedException ? 47 : (stateCaught_39 instanceof OptionalDataException ? 48 : (stateCaught_39 instanceof IllegalAccessException ? 49 : (stateCaught_39 instanceof IllegalArgumentException ? 50 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_39 instanceof SecurityException ? 52 : (stateCaught_39 instanceof IOException ? 53 : (stateCaught_39 instanceof NullPointerException ? 54 : (stateCaught_39 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            param0.f(102, 2);
                            param0.a((String) var10, -67);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 45 : (stateCaught_40 instanceof InvalidClassException ? 46 : (stateCaught_40 instanceof StreamCorruptedException ? 47 : (stateCaught_40 instanceof OptionalDataException ? 48 : (stateCaught_40 instanceof IllegalAccessException ? 49 : (stateCaught_40 instanceof IllegalArgumentException ? 50 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_40 instanceof SecurityException ? 52 : (stateCaught_40 instanceof IOException ? 53 : (stateCaught_40 instanceof NullPointerException ? 54 : (stateCaught_40 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.f(104, 1);
                            param0.a(((Number) var10).longValue(), (byte) 110);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 45 : (stateCaught_41 instanceof InvalidClassException ? 46 : (stateCaught_41 instanceof StreamCorruptedException ? 47 : (stateCaught_41 instanceof OptionalDataException ? 48 : (stateCaught_41 instanceof IllegalAccessException ? 49 : (stateCaught_41 instanceof IllegalArgumentException ? 50 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_41 instanceof SecurityException ? 52 : (stateCaught_41 instanceof IOException ? 53 : (stateCaught_41 instanceof NullPointerException ? 54 : (stateCaught_41 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (4 != var6_int) {
                                statePc = 57;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 45 : (stateCaught_42 instanceof InvalidClassException ? 46 : (stateCaught_42 instanceof StreamCorruptedException ? 47 : (stateCaught_42 instanceof OptionalDataException ? 48 : (stateCaught_42 instanceof IllegalAccessException ? 49 : (stateCaught_42 instanceof IllegalArgumentException ? 50 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_42 instanceof SecurityException ? 52 : (stateCaught_42 instanceof IOException ? 53 : (stateCaught_42 instanceof NullPointerException ? 54 : (stateCaught_42 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var30 = (java.lang.reflect.Method) var17.field_q[var5].field_f;
                            var8 = var30.getModifiers();
                            param0.f(90, 0);
                            param0.d(-126, var8);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 45 : (stateCaught_43 instanceof InvalidClassException ? 46 : (stateCaught_43 instanceof StreamCorruptedException ? 47 : (stateCaught_43 instanceof OptionalDataException ? 48 : (stateCaught_43 instanceof IllegalAccessException ? 49 : (stateCaught_43 instanceof IllegalArgumentException ? 50 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_43 instanceof SecurityException ? 52 : (stateCaught_43 instanceof IOException ? 53 : (stateCaught_43 instanceof NullPointerException ? 54 : (stateCaught_43 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.f(95, -10);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 46: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.f(100, -11);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 47: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.f(103, -12);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.f(88, -13);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.f(100, -14);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.f(103, -15);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.f(114, -16);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.f(93, -17);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.f(115, -18);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.f(106, -19);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.f(125, -20);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref11 = caughtException;
                        param0.f(97, -21);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        var5++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 58: {
                        if (param1 > 125) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        md.b((byte) 97);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$1 = param0.e(26199, var4);
                        var17.a(true);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        int var1 = 84 % ((param0 - 33) / 48);
        field_b = null;
    }

    final static bn c(int param0) {
        if (param0 < 6) {
            md.b((byte) 101);
        }
        String var1 = mc.a(16);
        if (var1 != null) {
            if (var1.indexOf('@') >= 0) {
                var1 = "";
            }
        }
        return new bn(mc.a(16), hf.l(50));
    }

    final static void a(byte param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        hb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        sf var12 = null;
        hb var13 = null;
        gd var14 = null;
        int[] var15 = null;
        Object var16 = null;
        gd var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var16 = null;
          var8 = Confined.field_J ? 1 : 0;
          if (param0 > 85) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var13 = e.field_c;
          var2 = var13.c(32);
          if (-1 == (var2 ^ -1)) {
            var11 = ek.c(16317);
            var19 = var11;
            var18 = var19;
            var17 = var18;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((kg) (Object) var5).c(32);
            var7 = 0;
            L2: while (true) {
              if (var6 <= var7) {
                var16_ref = (gd) (Object) ra.field_d.a(-120);
                if (var16_ref == null) {
                  dc.d(105);
                  return;
                } else {
                  var16_ref.field_p = var3;
                  var16_ref.field_s = var19[0];
                  var16_ref.field_o = true;
                  var16_ref.a(true);
                  break L1;
                }
              } else {
                var10[var7] = ((kg) (Object) var5).f((byte) 61);
                var7++;
                continue L2;
              }
            }
          } else {
            if (1 == var2) {
              var12 = (sf) (Object) sm.field_y.a(-125);
              if (var12 == null) {
                dc.d(118);
                return;
              } else {
                var12.a(true);
                break L1;
              }
            } else {
              if (var2 != 2) {
                mb.a("A1: " + ui.a(10), true, (Throwable) null);
                dc.d(122);
                break L1;
              } else {
                var14 = (gd) (Object) ra.field_d.a(121);
                if (var14 != null) {
                  var14.field_p = ek.c(16317);
                  var14.field_o = true;
                  var14.field_s = var14.field_p[0];
                  var14.a(true);
                  break L1;
                } else {
                  dc.d(126);
                  return;
                }
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 < -73) {
            break L0;
          } else {
            md.d(-115);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!qc.field_n) {
              break L2;
            } else {
              if (qn.field_v.field_B.field_z) {
                break L2;
              } else {
                if (qn.field_v.field_K != null) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "1 homing missile";
        field_a = 500;
    }
}
