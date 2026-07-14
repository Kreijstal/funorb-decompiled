/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc {
    static km[][] field_d;
    private v field_f;
    static long field_a;
    private um field_g;
    private um field_b;
    static int field_e;
    static String field_c;

    final dj a(byte param0, int param1) {
        dj var3 = null;
        dj var3_ref = null;
        byte[] var4 = null;
        var3 = (dj) ((qc) this).field_f.a((byte) -77, (long)param1);
        if (var3 == null) {
          L0: {
            if (param1 >= 32768) {
              var4 = ((qc) this).field_b.a(1, param1 & 32767, 5847);
              break L0;
            } else {
              var4 = ((qc) this).field_g.a(1, param1, 5847);
              break L0;
            }
          }
          if (param0 != 79) {
            return null;
          } else {
            L1: {
              var3_ref = new dj();
              if (var4 != null) {
                var3_ref.a(new p(var4), true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((param1 ^ -1) <= -32769) {
                var3_ref.f(32768);
                break L2;
              } else {
                break L2;
              }
            }
            ((qc) this).field_f.a((long)param1, param0 ^ 78, (Object) (Object) var3_ref);
            return var3_ref;
          }
        } else {
          return var3;
        }
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        var8 = Chess.field_G;
        if (param0 != null) {
          var3 = param0.length();
          if (1 <= var3) {
            if (12 >= var3) {
              var4 = ad.a(param0, -2);
              if (param2 >= 63) {
                if (var4 != null) {
                  if (var4.length() >= 1) {
                    L0: {
                      if (cg.a(2, var4.charAt(0))) {
                        break L0;
                      } else {
                        if (cg.a(2, var4.charAt(var4.length() + -1))) {
                          break L0;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L1: while (true) {
                            if (param0.length() <= var6) {
                              if (0 < var5) {
                                return am.field_a;
                              } else {
                                return null;
                              }
                            } else {
                              L2: {
                                var7 = param0.charAt(var6);
                                if (!cg.a(2, (char) var7)) {
                                  var5 = 0;
                                  break L2;
                                } else {
                                  var5++;
                                  break L2;
                                }
                              }
                              if (-3 < (var5 ^ -1)) {
                                var6++;
                                var6++;
                                continue L1;
                              } else {
                                if (!param1) {
                                  return ji.field_Q;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return am.field_a;
                  } else {
                    return sh.field_d;
                  }
                } else {
                  return sh.field_d;
                }
              } else {
                var9 = null;
                String discarded$1 = qc.a((CharSequence) null, false, (byte) 34);
                if (var4 != null) {
                  if (var4.length() >= 1) {
                    L3: {
                      if (cg.a(2, var4.charAt(0))) {
                        break L3;
                      } else {
                        if (cg.a(2, var4.charAt(var4.length() + -1))) {
                          break L3;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L4: while (true) {
                            if (param0.length() <= var6) {
                              if (0 < var5) {
                                return am.field_a;
                              } else {
                                return null;
                              }
                            } else {
                              L5: {
                                var7 = param0.charAt(var6);
                                if (!cg.a(2, (char) var7)) {
                                  var5 = 0;
                                  break L5;
                                } else {
                                  var5++;
                                  break L5;
                                }
                              }
                              if (-3 < (var5 ^ -1)) {
                                var6++;
                                var6++;
                                continue L4;
                              } else {
                                if (!param1) {
                                  return ji.field_Q;
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    return am.field_a;
                  } else {
                    return sh.field_d;
                  }
                } else {
                  return sh.field_d;
                }
              }
            } else {
              return sh.field_d;
            }
          } else {
            return sh.field_d;
          }
        } else {
          return sh.field_d;
        }
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != 7) {
            return;
        }
        field_d = null;
    }

    qc(int param0, um param1, um param2, ui param3) {
        ((qc) this).field_f = new v(64);
        ((qc) this).field_g = param1;
        ((qc) this).field_b = param2;
        if (null != ((qc) this).field_g) {
            int discarded$0 = ((qc) this).field_g.a((byte) -57, 1);
        }
        if (null != ((qc) this).field_b) {
            int discarded$1 = ((qc) this).field_b.a((byte) -98, 1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new km[2][7];
        field_c = "Hide players in <%0>'s game";
    }
}
