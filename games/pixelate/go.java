/*
 * Decompiled by CFR-JS 0.4.0.
 */
class go extends rg {
    private long field_g;
    static boolean field_f;
    private String field_j;
    static tf[] field_h;
    static tf field_i;
    static int field_k;

    final static int c(int param0) {
        int var1 = 0;
        return nf.field_c;
    }

    ea b(int param0) {
        if (param0 != -27096) {
            return null;
        }
        return te.field_Nb;
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        String var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        Object var14 = null;
        Object var15 = null;
        Object var16 = null;
        String var17 = null;
        String var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var41 = null;
        Object var42 = null;
        Object var43 = null;
        CharSequence var44 = null;
        L0: {
          var42 = null;
          var43 = null;
          var12 = Pixelate.field_H ? 1 : 0;
          var3 = 1;
          if (qo.field_z) {
            break L0;
          } else {
            if (ko.field_eb != null) {
              break L0;
            } else {
              var3 = 0;
              break L0;
            }
          }
        }
        L1: {
          var4 = -10;
          if (ce.field_d != 0) {
            break L1;
          } else {
            if (bn.field_S != null) {
              var3 = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (ce.field_d != 2) {
            break L2;
          } else {
            if (ra.a((byte) -96)) {
              break L2;
            } else {
              var3 = 0;
              break L2;
            }
          }
        }
        if (ke.field_a == 84) {
          L3: {
            if (var3 != 0) {
              if (mp.field_a.length() > 0) {
                var5_ref_String = mp.field_a.toString();
                var8 = var5_ref_String;
                var8 = var5_ref_String;
                if (bc.a(var5_ref_String, 1)) {
                  var14 = null;
                  var13 = null;
                  ti.a(0, (String) null, (String) null, (byte) -76, 2, mp.field_c);
                  var16 = null;
                  var15 = null;
                  ti.a(0, (String) null, (String) null, (byte) -21, 2, fd.field_d);
                  nd.a((byte) -23);
                  return true;
                } else {
                  L4: {
                    var6 = ce.field_d;
                    if (var6 != 0) {
                      break L4;
                    } else {
                      if (io.field_c == null) {
                        break L4;
                      } else {
                        var6 = 1;
                        break L4;
                      }
                    }
                  }
                  if (kl.a(var6, 0) != 2) {
                    dg.a(true, ce.field_d, -1, var5_ref_String, jo.field_k, 12);
                    nd.a((byte) -23);
                    break L3;
                  } else {
                    am.a(1, -26931, var6, 13);
                    dg.a(true, ce.field_d, -1, var5_ref_String, jo.field_k, 12);
                    nd.a((byte) -23);
                    break L3;
                  }
                }
              } else {
                nd.a((byte) -23);
                break L3;
              }
            } else {
              if (ce.field_d != 0) {
                nd.a((byte) 77);
                break L3;
              } else {
                return true;
              }
            }
          }
          return true;
        } else {
          if (ke.field_a == 85) {
            if (var3 != 0) {
              if (mp.field_a.length() > 0) {
                StringBuilder discarded$7 = nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
                return true;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            var5 = nj.field_f;
            if (ii.a(1, (char) var5)) {
              if (var3 != 0) {
                if (mp.field_a.length() < 80) {
                  L5: {
                    StringBuilder discarded$8 = mp.field_a.append((char) var5);
                    var6 = 485;
                    var32 = kn.field_J;
                    var8 = var32;
                    var8 = var32;
                    var17 = th.a(2, var32);
                    var8 = var17;
                    var8 = var17;
                    var33 = var17;
                    var8 = var33;
                    var8 = var33;
                    if (2 == ce.field_d) {
                      var44 = (CharSequence) (Object) jo.field_k;
                      var40 = sd.a(dg.field_b, 116, new String[1]);
                      var41 = sd.a(sk.field_c, 43, new String[1]);
                      var10 = vl.field_Q.c(var40);
                      var11 = vl.field_Q.c(var41);
                      if (var11 < var10) {
                        var6 = var6 - var10;
                        break L5;
                      } else {
                        var6 = var6 - var11;
                        if (~vl.field_Q.c(mp.field_a.toString()) >= ~var6) {
                          return true;
                        } else {
                          StringBuilder discarded$9 = nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
                          return true;
                        }
                      }
                    } else {
                      L6: {
                        var8 = "";
                        if (ce.field_d != 0) {
                          break L6;
                        } else {
                          L7: {
                            if (io.field_c != null) {
                              break L7;
                            } else {
                              if (!ge.field_f) {
                                break L7;
                              } else {
                                var8 = "[" + ul.field_m + "] ";
                                break L7;
                              }
                            }
                          }
                          if (io.field_c != null) {
                            if (!nc.field_b) {
                              var37 = "[" + sd.a(fk.field_q, 49, new String[1]) + "] ";
                              var38 = var37 + var33 + ": ";
                              var6 = var6 - vl.field_Q.c(var38);
                              if (~vl.field_Q.c(mp.field_a.toString()) >= ~var6) {
                                return true;
                              } else {
                                StringBuilder discarded$10 = nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
                                return true;
                              }
                            } else {
                              if (mn.field_f != null) {
                                var8 = "[" + mn.field_f + "] ";
                                break L6;
                              } else {
                                var35 = "[" + sd.a(fk.field_q, 49, new String[1]) + "] ";
                                var36 = var35 + var33 + ": ";
                                var6 = var6 - vl.field_Q.c(var36);
                                if (~vl.field_Q.c(mp.field_a.toString()) < ~var6) {
                                  StringBuilder discarded$11 = nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
                                  return true;
                                } else {
                                  return true;
                                }
                              }
                            }
                          } else {
                            var34 = var8 + var33 + ": ";
                            var6 = var6 - vl.field_Q.c(var34);
                            break L5;
                          }
                        }
                      }
                      var39 = var8 + var33 + ": ";
                      var6 = var6 - vl.field_Q.c(var39);
                      if (~vl.field_Q.c(mp.field_a.toString()) >= ~var6) {
                        return true;
                      } else {
                        StringBuilder discarded$12 = nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
                        return true;
                      }
                    }
                  }
                  if (~vl.field_Q.c(mp.field_a.toString()) >= ~var6) {
                    return true;
                  } else {
                    StringBuilder discarded$13 = nk.a(mp.field_a, -1 + mp.field_a.length(), ' ', 16736352);
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final void a(byte param0, we param1) {
        try {
            if (param0 != -12) {
                ((go) this).field_g = -108L;
            }
            param1.a(false, ((go) this).field_g);
            param1.a(-129, ((go) this).field_j);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "go.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        field_h = null;
    }

    final static wm a(int param0, int param1) {
        wm[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        wm[] var5 = null;
        var4 = Pixelate.field_H ? 1 : 0;
        var5 = dd.b((byte) 62);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_b == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    go(long param0, String param1) {
        try {
            ((go) this).field_j = param1;
            ((go) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "go.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
