/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    static km[] field_c;
    static String field_d;
    private l field_g;
    static boolean field_b;
    private l field_e;
    static int field_a;
    static dd[] field_f;

    final int c(int param0) {
        int var2 = 0;
        l var3 = null;
        int var4 = 0;
        var4 = Chess.field_G;
        var2 = 0;
        var3 = ((ad) this).field_g.field_p;
        if (param0 == -19099) {
          L0: while (true) {
            if (var3 == ((ad) this).field_g) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_p;
              continue L0;
            }
          }
        } else {
          field_f = null;
          L1: while (true) {
            if (var3 == ((ad) this).field_g) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_p;
              continue L1;
            }
          }
        }
    }

    final l a(byte param0) {
        l var2 = null;
        Object var3 = null;
        var2 = ((ad) this).field_g.field_p;
        if (param0 == -75) {
          if (((ad) this).field_g == var2) {
            return null;
          } else {
            var2.d(-1);
            return var2;
          }
        } else {
          var3 = null;
          String discarded$4 = ad.a(74, (byte[]) null);
          if (((ad) this).field_g == var2) {
            return null;
          } else {
            var2.d(-1);
            return var2;
          }
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -29410) {
                break L1;
              } else {
                field_a = 13;
                break L1;
              }
            }
            stackOut_2_0 = gh.a(param1, 0, param0 + 29249, param1.length);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ad.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a() {
        field_f = null;
        field_c = null;
        int var1 = 0;
        field_d = null;
    }

    final static vj a(java.awt.Component param0, byte param1, int param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            vj var5 = null;
            si var5_ref = null;
            int var6 = 0;
            vj stackIn_1_0 = null;
            si stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            vj stackOut_0_0 = null;
            si stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = Class.forName("mb");
                var5 = (vj) var4.newInstance();
                var6 = 0;
                var5.a(param0, 84, param2, param3);
                stackOut_0_0 = (vj) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new si();
                ((vj) (Object) var5_ref).a(param0, 107, param2, param3);
                stackOut_2_0 = (si) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (vj) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("ad.D(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw fk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -80 + ',' + param2 + ',' + param3 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, l param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_m != null) {
                param1.d(-1);
                break L1;
              } else {
                break L1;
              }
            }
            param1.field_m = ((ad) this).field_g.field_m;
            param1.field_p = ((ad) this).field_g;
            param1.field_m.field_p = param1;
            param1.field_p.field_m = param1;
            if (param0 == 0) {
              break L0;
            } else {
              l discarded$2 = ((ad) this).b(2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ad.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    public ad() {
        ((ad) this).field_g = new l();
        ((ad) this).field_g.field_p = ((ad) this).field_g;
        ((ad) this).field_g.field_m = ((ad) this).field_g;
    }

    final l b(int param0) {
        l var2 = null;
        var2 = ((ad) this).field_g.field_p;
        if (var2 != ((ad) this).field_g) {
          ((ad) this).field_e = var2.field_p;
          if (param0 != -22585) {
            field_b = false;
            return var2;
          } else {
            return var2;
          }
        } else {
          ((ad) this).field_e = null;
          return null;
        }
    }

    final static String a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_31_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        Object stackOut_30_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var9 = Chess.field_G;
        try {
          L0: {
            if (param0 != null) {
              var2_int = 0;
              var3 = param0.length();
              L1: while (true) {
                L2: {
                  if (var3 <= var2_int) {
                    break L2;
                  } else {
                    if (!cg.a(2, param0.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!cg.a(2, param0.charAt(var3 + -1))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var4 = var3 + -var2_int;
                  if (var4 <= param1) {
                    if (-13 >= var4) {
                      var5 = new StringBuilder(var4);
                      var6 = var2_int;
                      L5: while (true) {
                        if (var3 <= var6) {
                          if (var5.length() != 0) {
                            stackOut_32_0 = var5.toString();
                            stackIn_33_0 = stackOut_32_0;
                            break L0;
                          } else {
                            stackOut_30_0 = null;
                            stackIn_31_0 = stackOut_30_0;
                            return (String) (Object) stackIn_31_0;
                          }
                        } else {
                          L6: {
                            var7 = param0.charAt(var6);
                            if (gm.a((char) var7, (byte) -84)) {
                              var8 = uj.a((char) var7, (byte) 118);
                              if (var8 != 0) {
                                StringBuilder discarded$1 = var5.append((char) var8);
                                var6++;
                                break L6;
                              } else {
                                var6++;
                                break L6;
                              }
                            } else {
                              var6++;
                              break L6;
                            }
                          }
                          var6++;
                          continue L5;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (String) (Object) stackIn_16_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var2;
            stackOut_34_1 = new StringBuilder().append("ad.F(");
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L7;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L7;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
        return stackIn_33_0;
    }

    final l b(byte param0) {
        l var2 = null;
        Object var3 = null;
        var2 = ((ad) this).field_e;
        if (var2 != ((ad) this).field_g) {
          if (param0 > -64) {
            var3 = null;
            ((ad) this).a(-31, (l) null);
            ((ad) this).field_e = var2.field_p;
            return var2;
          } else {
            ((ad) this).field_e = var2.field_p;
            return var2;
          }
        } else {
          ((ad) this).field_e = null;
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_f = new dd[7];
    }
}
