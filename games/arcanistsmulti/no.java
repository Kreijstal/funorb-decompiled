/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends qk {
    static String field_wb;
    static String[] field_ub;
    static int[] field_tb;
    static String[] field_vb;

    final static void a(java.awt.Component param0, int param1) {
        try {
            param0.addMouseListener(ob.field_hb);
            param0.addMouseMotionListener(ob.field_hb);
            if (param1 != 0) {
                no.b(-101, (byte) -112, -11);
            }
            param0.addFocusListener(ob.field_hb);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "no.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void l(byte param0) {
        field_ub = null;
        if (param0 != -11) {
            no.b(-63, (byte) 100, -16);
        }
        field_wb = null;
        field_vb = null;
        field_tb = null;
    }

    final static aj a(int param0, int param1) {
        aj[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        aj[] var5 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var5 = so.c(96);
        var2 = var5;
        var3 = param1;
        L0: while (true) {
          if (var3 < var5.length) {
            if (var5[var3].field_c != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            return null;
          }
        }
    }

    no(h param0, qm param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        cg var1_ref = null;
        na var1_ref2 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1_ref = (cg) ((Object) gm.field_j.b(param0 + 12624));
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (na) ((Object) vh.field_a.b(param0 + 12624));
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (cg) ((Object) ph.field_a.b(param0 ^ -12624));
                    L3: while (true) {
                      if (var1_ref == null) {
                        L4: {
                          if (param0 == -1) {
                            break L4;
                          } else {
                            no.l((byte) 65);
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        L5: {
                          if ((var1_ref.field_Eb ^ -1) >= -1) {
                            break L5;
                          } else {
                            var1_ref.field_Eb = var1_ref.field_Eb - 1;
                            if (0 == var1_ref.field_Eb) {
                              var1_ref.field_Sb = 0;
                              if (var1_ref.e(183874081)) {
                                var1_ref.a(true);
                                break L5;
                              } else {
                                break L5;
                              }
                            } else {
                              var1_ref = (cg) ((Object) ph.field_a.a(0));
                              continue L3;
                            }
                          }
                        }
                        var1_ref = (cg) ((Object) ph.field_a.a(0));
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (-1 <= (var1_ref2.field_bc ^ -1)) {
                        break L6;
                      } else {
                        var1_ref2.field_bc = var1_ref2.field_bc - 1;
                        if (var1_ref2.field_bc == 0) {
                          var1_ref2.field_ac = 0;
                          if (!var1_ref2.e(-100)) {
                            break L6;
                          } else {
                            var1_ref2.a(true);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                    }
                    var1_ref2 = (na) ((Object) vh.field_a.a(0));
                    continue L2;
                  }
                }
              } else {
                L7: {
                  if ((var1_ref.field_Eb ^ -1) < -1) {
                    var1_ref.field_Eb = var1_ref.field_Eb - 1;
                    if (-1 == (var1_ref.field_Eb ^ -1)) {
                      var1_ref.field_Sb = 0;
                      if (var1_ref.e(183874081)) {
                        var1_ref.a(true);
                        break L7;
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                var1_ref = (cg) ((Object) gm.field_j.a(0));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "no.G(" + param0 + ')');
        }
    }

    final static void b(int param0, byte param1, int param2) {
        o.field_r = param2;
        tn.field_Eb = param2;
        co.field_c = param0;
        wh.field_c = param0;
        if (param1 != -61) {
            field_ub = (String[]) null;
        }
        jm.field_j = true;
    }

    final void a(byte param0, qm param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "no.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_ub = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_tb = new int[]{287, 359, 424, 482, 544};
        field_vb = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        field_wb = "Mute this player for 48 hours";
    }
}
