/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ao extends vh {
    of field_Sb;
    static int[] field_Nb;
    static ko field_Lb;
    vh field_Mb;
    vh field_Ob;
    vh field_Qb;
    static int field_Rb;
    static dd field_Pb;

    ao(long param0, ao param1, String param2, String param3) {
        this(param0, (vh) (Object) param1, param1.field_Sb.field_Sb, param1.field_Sb.field_Mb, param1.field_Ob, param2, param3);
    }

    final static int a(int param0, boolean param1, boolean param2, CharSequence param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_35_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < 2) {
                break L1;
              } else {
                if (param0 <= 36) {
                  L2: {
                    var4_int = 0;
                    var5 = 0;
                    var6 = 0;
                    var7 = param3.length();
                    var8 = 0;
                    if (param1) {
                      break L2;
                    } else {
                      var11 = null;
                      int discarded$1 = ao.a(-24, false, false, (CharSequence) null);
                      break L2;
                    }
                  }
                  L3: while (true) {
                    if (var8 >= var7) {
                      if (var5 != 0) {
                        stackOut_35_0 = var6;
                        stackIn_36_0 = stackOut_35_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L4: {
                        L5: {
                          var9 = param3.charAt(var8);
                          if (var8 != 0) {
                            break L5;
                          } else {
                            if (var9 != 45) {
                              if (43 != var9) {
                                break L5;
                              } else {
                                if (!param2) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            } else {
                              var4_int = 1;
                              break L4;
                            }
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (var9 < 65) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var9 < 97) {
                              break L9;
                            } else {
                              if (var9 > 122) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param0 > var9) {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var9 + var6 * param0;
                          if (var6 == var10 / param0) {
                            var5 = 1;
                            var6 = var10;
                            break L4;
                          } else {
                            throw new NumberFormatException();
                          }
                        } else {
                          throw new NumberFormatException();
                        }
                      }
                      var8++;
                      continue L3;
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("" + param0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var4;
            stackOut_37_1 = new StringBuilder().append("ao.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param3 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L11;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L11;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
        }
        return stackIn_36_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ao) this).field_qb = param0;
        ((ao) this).field_gb = param1;
        ((ao) this).field_eb = param7;
        ((ao) this).field_Db = param6;
        int var9 = -61 % ((63 - param2) / 51);
        ((ao) this).a(param5, param4, 0, param3);
    }

    final static int a(int param0, boolean param1) {
        return fb.field_a[param0 & 2047];
    }

    final static void a(byte param0, int param1, lr param2, lr param3) {
        try {
            wj.field_T = 480;
            gj.field_R = param3;
            dq.field_f = param2;
            nj.a(qh.field_f / 2, qh.field_l / 2, 97);
            kg.a(param3.field_L, true, param2.field_w + param2.field_L, param3.field_w + param3.field_L, param2.field_L);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ao.U(" + -83 + 44 + 480 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final static void c() {
        cb.field_d = 0;
    }

    ao(long param0, vh param1, vh param2, db param3, vh param4, String param5, String param6) {
        super(param0, param1);
        try {
            ((ao) this).field_Mb = new vh(0L, (vh) null);
            ((ao) this).field_Sb = new of(0L, ((ao) this).field_Mb, param2, param3);
            ((ao) this).field_Ob = new vh(0L, param4);
            ((ao) this).field_Qb = new vh(0L, param4);
            ((ao) this).field_Ob.field_nb = param5;
            ((ao) this).field_Qb.field_nb = param6;
            ((ao) this).a(28, (vh) (Object) ((ao) this).field_Sb);
            ((ao) this).a(116, ((ao) this).field_Ob);
            ((ao) this).a(22, ((ao) this).field_Qb);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "ao.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = (param3 + ((ao) this).field_gb) / 2;
        int var6 = -param0 + ((ao) this).field_Db;
        ((ao) this).field_Sb.a(param1, -param3 + var6, (byte) -112, param3, ((ao) this).field_gb, param2, 0);
        ((ao) this).field_Ob.field_Db = param0;
        ((ao) this).field_Ob.field_qb = 0;
        ((ao) this).field_Ob.field_gb = -param3 + var5;
        ((ao) this).field_Ob.field_eb = var6;
        ((ao) this).field_Qb.field_qb = var5;
        ((ao) this).field_Qb.field_gb = ((ao) this).field_gb - var5;
        ((ao) this).field_Qb.field_Db = param0;
        ((ao) this).field_Qb.field_eb = var6;
    }

    public static void d() {
        field_Pb = null;
        field_Nb = null;
        field_Lb = null;
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + dg.a(123, "\n", param1, "%0a"));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = new int[]{2, 20, 21, 49, 6, 5, 13};
        field_Rb = 0;
        field_Lb = null;
    }
}
