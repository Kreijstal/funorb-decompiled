/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rh extends rf {
    int field_l;
    int field_k;
    static String field_g;
    static char[] field_j;
    static qe field_h;
    static hl[] field_f;
    static int field_i;

    public static void a(boolean param0) {
        field_j = null;
        if (param0) {
            return;
        }
        field_f = null;
        field_g = null;
        field_h = null;
    }

    private rh() throws Throwable {
        throw new Error();
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            var7 = 91 % ((param6 - 41) / 38);
            if (param1 < param3) {
              break L1;
            } else {
              if (param2 + param3 <= param1) {
                break L1;
              } else {
                if (param4 > param5) {
                  break L1;
                } else {
                  if (param0 + param4 <= param5) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = StarCannon.field_A;
          if (ki.field_l <= param3) {
            break L0;
          } else {
            param1 = param1 - (ki.field_l + -param3);
            param3 = ki.field_l;
            break L0;
          }
        }
        L1: {
          if (param0 < ki.field_e) {
            param2 = param2 - (-param0 + ki.field_e);
            param0 = ki.field_e;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param3 + param1 > ki.field_g) {
            param1 = -param3 + ki.field_g;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param0 + param2 <= ki.field_i) {
            break L3;
          } else {
            param2 = -param0 + ki.field_i;
            break L3;
          }
        }
        L4: {
          if (param5) {
            break L4;
          } else {
            field_f = null;
            break L4;
          }
        }
        L5: {
          if (0 >= param1) {
            break L5;
          } else {
            if ((param2 ^ -1) < -1) {
              var6 = param3 + param0 * ki.field_j;
              var7 = ki.field_j - param1;
              param0 = -param2;
              L6: while (true) {
                if ((param0 ^ -1) <= -1) {
                  return;
                } else {
                  param3 = -param1;
                  L7: while (true) {
                    if (param3 >= 0) {
                      var6 = var6 + var7;
                      param0++;
                      continue L6;
                    } else {
                      var8 = ki.field_a[var6];
                      if ((var8 & 65280) >> 1016193576 > param4) {
                        if ((16711680 & var8) >> -1893600464 <= (var8 & 65280) >> 1289987240) {
                          L8: {
                            var9 = ((16711680 & var8) >> 1993606895) - 60;
                            if (255 >= var9) {
                              break L8;
                            } else {
                              var9 = 255;
                              break L8;
                            }
                          }
                          var10 = var8 & 65280;
                          var10 = 65280 & (var10 >> -596805663) + -(var10 >> -1301038811);
                          var11 = (var8 & 255) >> -75114941;
                          ki.field_a[var6] = cl.a(var11, cl.a(var10, var9 << 1858608080));
                          var6++;
                          param3++;
                          continue L7;
                        } else {
                          var6++;
                          param3++;
                          continue L7;
                        }
                      } else {
                        var6++;
                        param3++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              break L5;
            }
          }
        }
    }

    final static hb a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        hb var8 = new hb(param7, param0, param2, param4, param3, param1);
        hi.field_f.b(101, (rf) (Object) var8);
        if (param5 != -1893600464) {
            rh.a(false);
        }
        hb.a(-16, param6, var8);
        return var8;
    }

    final static void a(ia param0, byte param1) {
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
            va var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            va var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var21 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var19 = null;
                        var16 = null;
                        var21 = null;
                        var23 = null;
                        var12 = StarCannon.field_A;
                        var13 = (va) (Object) ee.field_a.c(-3905);
                        var17 = var13;
                        if (var17 == null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if (var17.field_n <= var4) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == var13.field_p[var4]) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (2 != var13.field_p[var4].field_b) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var13.field_g[var4] = -5;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (var13.field_p[var4].field_b != 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var3 = 1;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != var13.field_i[var4]) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 12: {
                        if ((var13.field_i[var4].field_b ^ -1) != -3) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var13.field_g[var4] = -6;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var13.field_i[var4].field_b == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var4++;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 16: {
                        var3 = 1;
                        var4++;
                        statePc = 4;
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
                        var4 = param0.field_g;
                        param0.c((byte) -127, var17.field_k);
                        var5 = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (var17.field_n <= var5) {
                            statePc = 58;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (var17.field_g[var5] == 0) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        param0.a(var17.field_g[var5], -92);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            var6_int = var17.field_r[var5];
                            if (var6_int != 0) {
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
                            var27 = (java.lang.reflect.Field) var17.field_p[var5].field_f;
                            var8 = var27.getInt((Object) null);
                            param0.a(0, -122);
                            param0.c((byte) -118, var8);
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
                            if (var6_int == 1) {
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
                            if ((var6_int ^ -1) == -3) {
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
                            var28 = (java.lang.reflect.Field) var17.field_p[var5].field_f;
                            var8 = var28.getModifiers();
                            param0.a(0, -112);
                            param0.c((byte) -86, var8);
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
                            var16_ref = (java.lang.reflect.Field) var17.field_p[var5].field_f;
                            var20 = var16_ref;
                            var20.setInt((Object) null, var17.field_q[var5]);
                            param0.a(0, -61);
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
                            if (var6_int == 3) {
                                statePc = 34;
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
                            if (var6_int != 4) {
                                statePc = 57;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 45 : (stateCaught_32 instanceof InvalidClassException ? 46 : (stateCaught_32 instanceof StreamCorruptedException ? 47 : (stateCaught_32 instanceof OptionalDataException ? 48 : (stateCaught_32 instanceof IllegalAccessException ? 49 : (stateCaught_32 instanceof IllegalArgumentException ? 50 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_32 instanceof SecurityException ? 52 : (stateCaught_32 instanceof IOException ? 53 : (stateCaught_32 instanceof NullPointerException ? 54 : (stateCaught_32 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var29 = (java.lang.reflect.Method) var17.field_i[var5].field_f;
                            var8 = var29.getModifiers();
                            param0.a(0, -64);
                            param0.c((byte) -79, var8);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 45 : (stateCaught_33 instanceof InvalidClassException ? 46 : (stateCaught_33 instanceof StreamCorruptedException ? 47 : (stateCaught_33 instanceof OptionalDataException ? 48 : (stateCaught_33 instanceof IllegalAccessException ? 49 : (stateCaught_33 instanceof IllegalArgumentException ? 50 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_33 instanceof SecurityException ? 52 : (stateCaught_33 instanceof IOException ? 53 : (stateCaught_33 instanceof NullPointerException ? 54 : (stateCaught_33 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var30 = (java.lang.reflect.Method) var17.field_i[var5].field_f;
                            var26 = var17.field_l[var5];
                            var9 = new Object[var26.length];
                            var10_int = 0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 45 : (stateCaught_34 instanceof InvalidClassException ? 46 : (stateCaught_34 instanceof StreamCorruptedException ? 47 : (stateCaught_34 instanceof OptionalDataException ? 48 : (stateCaught_34 instanceof IllegalAccessException ? 49 : (stateCaught_34 instanceof IllegalArgumentException ? 50 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_34 instanceof SecurityException ? 52 : (stateCaught_34 instanceof IOException ? 53 : (stateCaught_34 instanceof NullPointerException ? 54 : (stateCaught_34 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var26.length <= var10_int) {
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
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 45 : (stateCaught_36 instanceof InvalidClassException ? 46 : (stateCaught_36 instanceof StreamCorruptedException ? 47 : (stateCaught_36 instanceof OptionalDataException ? 48 : (stateCaught_36 instanceof IllegalAccessException ? 49 : (stateCaught_36 instanceof IllegalArgumentException ? 50 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_36 instanceof SecurityException ? 52 : (stateCaught_36 instanceof IOException ? 53 : (stateCaught_36 instanceof NullPointerException ? 54 : (stateCaught_36 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var10 = var30.invoke((Object) null, var9);
                            if (var10 != null) {
                                statePc = 39;
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
                            param0.a(0, -74);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 45 : (stateCaught_38 instanceof InvalidClassException ? 46 : (stateCaught_38 instanceof StreamCorruptedException ? 47 : (stateCaught_38 instanceof OptionalDataException ? 48 : (stateCaught_38 instanceof IllegalAccessException ? 49 : (stateCaught_38 instanceof IllegalArgumentException ? 50 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_38 instanceof SecurityException ? 52 : (stateCaught_38 instanceof IOException ? 53 : (stateCaught_38 instanceof NullPointerException ? 54 : (stateCaught_38 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 45 : (stateCaught_39 instanceof InvalidClassException ? 46 : (stateCaught_39 instanceof StreamCorruptedException ? 47 : (stateCaught_39 instanceof OptionalDataException ? 48 : (stateCaught_39 instanceof IllegalAccessException ? 49 : (stateCaught_39 instanceof IllegalArgumentException ? 50 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_39 instanceof SecurityException ? 52 : (stateCaught_39 instanceof IOException ? 53 : (stateCaught_39 instanceof NullPointerException ? 54 : (stateCaught_39 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 45 : (stateCaught_40 instanceof InvalidClassException ? 46 : (stateCaught_40 instanceof StreamCorruptedException ? 47 : (stateCaught_40 instanceof OptionalDataException ? 48 : (stateCaught_40 instanceof IllegalAccessException ? 49 : (stateCaught_40 instanceof IllegalArgumentException ? 50 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_40 instanceof SecurityException ? 52 : (stateCaught_40 instanceof IOException ? 53 : (stateCaught_40 instanceof NullPointerException ? 54 : (stateCaught_40 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.a(2, -53);
                            param0.b(false, (String) var10);
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
                            param0.a(4, -51);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 45 : (stateCaught_42 instanceof InvalidClassException ? 46 : (stateCaught_42 instanceof StreamCorruptedException ? 47 : (stateCaught_42 instanceof OptionalDataException ? 48 : (stateCaught_42 instanceof IllegalAccessException ? 49 : (stateCaught_42 instanceof IllegalArgumentException ? 50 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_42 instanceof SecurityException ? 52 : (stateCaught_42 instanceof IOException ? 53 : (stateCaught_42 instanceof NullPointerException ? 54 : (stateCaught_42 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param0.a(1, -79);
                            param0.a(true, ((Number) var10).longValue());
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
                        param0.a(-10, -108);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 46: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.a(-11, -108);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 47: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.a(-12, -73);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.a(-13, -91);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.a(-14, -58);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.a(-15, -74);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.a(-16, -70);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.a(-17, -94);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.a(-18, -76);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.a(-19, -115);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.a(-20, -66);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref11 = caughtException;
                        param0.a(-21, -81);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        var5++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 58: {
                        int discarded$1 = param0.b((byte) -89, var4);
                        var17.b(4);
                        var5 = -107 % ((param1 - -16) / 37);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Unable to connect to the data server. Please check any firewall you are using.";
        field_f = new hl[8];
        field_j = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
