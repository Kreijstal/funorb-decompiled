/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im {
    static cm field_h;
    static hm field_a;
    static String field_e;
    static String field_d;
    static String field_c;
    static String field_g;
    static String field_i;
    static gh field_f;
    static boolean field_b;

    final static wk a(cm param0, int param1, int param2, int param3) {
        if (!wa.a((byte) 30, param1, param2, param0)) {
            return null;
        }
        if (param3 != 1048576) {
            im.b((byte) 103);
            return ij.j(-100);
        }
        return ij.j(-100);
    }

    final static void a(boolean param0) {
        int var2 = 0;
        Object var3 = null;
        cc var4 = null;
        L0: {
          var2 = SteelSentinels.field_G;
          ad.field_f = false;
          nf.field_b = null;
          ni.field_a = null;
          if (q.field_m != null) {
            q.field_m.g(6);
            q.field_m = null;
            break L0;
          } else {
            break L0;
          }
        }
        t.field_c = null;
        if (ci.field_e == null) {
          fm.field_a = null;
          if (null == o.field_d) {
            L1: {
              me.field_b = null;
              if (null == t.field_c) {
                break L1;
              } else {
                var4 = (cc) (Object) t.field_c.a(90);
                L2: while (true) {
                  if (var4 == null) {
                    t.field_c = null;
                    break L1;
                  } else {
                    var4.e(480);
                    var4 = (cc) (Object) t.field_c.a((byte) -66);
                    continue L2;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              var3 = null;
              wk discarded$4 = im.a((cm) null, 29, -92, 49);
              return;
            }
          } else {
            L3: {
              o.field_d.g(6);
              o.field_d = null;
              me.field_b = null;
              if (null == t.field_c) {
                break L3;
              } else {
                var4 = (cc) (Object) t.field_c.a(90);
                L4: while (true) {
                  if (var4 == null) {
                    t.field_c = null;
                    break L3;
                  } else {
                    var4.e(480);
                    var4 = (cc) (Object) t.field_c.a((byte) -66);
                    continue L4;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              var3 = null;
              wk discarded$5 = im.a((cm) null, 29, -92, 49);
              return;
            }
          }
        } else {
          ci.field_e.g(6);
          ci.field_e = null;
          fm.field_a = null;
          if (null != o.field_d) {
            L5: {
              o.field_d.g(6);
              o.field_d = null;
              me.field_b = null;
              if (null == t.field_c) {
                break L5;
              } else {
                var4 = (cc) (Object) t.field_c.a(90);
                L6: while (true) {
                  if (var4 == null) {
                    t.field_c = null;
                    break L5;
                  } else {
                    var4.e(480);
                    var4 = (cc) (Object) t.field_c.a((byte) -66);
                    continue L6;
                  }
                }
              }
            }
            if (!param0) {
              var3 = null;
              wk discarded$6 = im.a((cm) null, 29, -92, 49);
              return;
            } else {
              return;
            }
          } else {
            L7: {
              me.field_b = null;
              if (null == t.field_c) {
                break L7;
              } else {
                var4 = (cc) (Object) t.field_c.a(90);
                L8: while (true) {
                  if (var4 == null) {
                    t.field_c = null;
                    break L7;
                  } else {
                    var4.e(480);
                    var4 = (cc) (Object) t.field_c.a((byte) -66);
                    continue L8;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              var3 = null;
              wk discarded$7 = im.a((cm) null, 29, -92, 49);
              return;
            }
          }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (Character.isISOControl(param0)) {
            return false;
        }
        if (param1) {
            boolean discarded$8 = im.a('M', true);
            if (!(!dn.a(param0, -91))) {
                return true;
            }
            if (param0 == 45) {
                return true;
            }
            if (param0 == 160) {
                return true;
            }
            if (32 != param0) {
                // if_icmpeq L67
            } else {
                return true;
            }
            return false;
        }
        if (!(!dn.a(param0, -91))) {
            return true;
        }
        if (param0 != 45) {
            // if_icmpeq L114
            // if_icmpeq L114
            // if_icmpeq L114
        } else {
            return true;
        }
        return false;
    }

    final static void a(wk[] param0, int param1, int param2, int param3, wk[] param4, int param5, int param6, int param7, int param8, int param9, mi param10, int param11, wk[] param12, int param13, int param14) {
        int var15 = param10.field_F + param10.field_U;
        int var16 = param10.field_U;
        va.a(param14, param6, param10, param5, var16, param13, param12, param0, param9, param11, var15, -1, var15, param8, param1, var16, param4, param2, param10, param7);
        if (param3 != -13782) {
            field_b = false;
        }
    }

    final static void b(byte param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (param0 == 98) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_b = false;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var1 == null) {
                                statePc = 8;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                            ed.field_a = (int)(var3.longValue() / 1048576L) - -1;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var2 = caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var1_ref = (Exception) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
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

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        if (param0 != -88) {
            return;
        }
        field_a = null;
        field_g = null;
        field_i = null;
        field_h = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Class: <col=ffffff><%0></col>";
        field_e = "Head slot";
        field_i = "No options available";
        field_d = "No highscores";
        field_a = new hm();
    }
}
