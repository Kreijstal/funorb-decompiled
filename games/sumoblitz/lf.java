/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lf extends ka {
    static tg field_e;
    static mp field_c;
    static String[] field_d;

    final static void a(int param0, byte param1) {
        dj var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_19_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_18_0 = false;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            kr.field_c = param0;
            if (param1 == -58) {
              var2 = (dj) ((Object) jf.field_c.b(81));
              L1: while (true) {
                L2: {
                  L3: {
                    L4: {
                      if (var2 == null) {
                        break L4;
                      } else {
                        stackOut_5_0 = var2.field_k.a(false);
                        stackIn_19_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (var3 != 0) {
                          L5: while (true) {
                            L6: {
                              L7: {
                                if (stackIn_19_0) {
                                  break L7;
                                } else {
                                  var2.b(false);
                                  if (var3 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              var2.field_q.f(128 + kr.field_c * var2.field_p >> -834648856);
                              break L6;
                            }
                            var2 = (dj) ((Object) s.field_u.d((byte) 18));
                            if (var2 == null) {
                              break L2;
                            } else {
                              if (var3 == 0) {
                                stackOut_18_0 = var2.field_k.a(false);
                                stackIn_19_0 = stackOut_18_0;
                                continue L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                        } else {
                          L8: {
                            if (!stackIn_6_0) {
                              var2.b(false);
                              break L8;
                            } else {
                              var2.field_q.f(128 + var2.field_p * kr.field_c >> 1821625704);
                              if (var3 == 0) {
                                break L8;
                              } else {
                                var2.b(false);
                                break L8;
                              }
                            }
                          }
                          var2 = (dj) ((Object) jf.field_c.d((byte) 18));
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (null != s.field_u) {
                      var2 = (dj) ((Object) s.field_u.b(param1 ^ -123));
                      L9: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          if (var3 == 0) {
                            stackOut_18_0 = var2.field_k.a(false);
                            stackIn_19_0 = stackOut_18_0;
                            L10: {
                              L11: {
                                if (stackIn_19_0) {
                                  break L11;
                                } else {
                                  var2.b(false);
                                  if (var3 == 0) {
                                    break L10;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              var2.field_q.f(128 + kr.field_c * var2.field_p >> -834648856);
                              break L10;
                            }
                            var2 = (dj) ((Object) s.field_u.d((byte) 18));
                            continue L9;
                          } else {
                            break L3;
                          }
                        }
                      }
                    } else {
                      return;
                    }
                  }
                  return;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "lf.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        mf[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        mf var3 = null;
        int var4 = 0;
        mf[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = fh.field_n;
            var1 = var5;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 >= var5.length) {
                    break L3;
                  } else {
                    var3 = var5[var2];
                    io.a(109, var3);
                    var2++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 <= -113) {
                  break L2;
                } else {
                  lf.a(-101, 66);
                  return;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1_ref), "lf.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        boolean discarded$2 = false;
        if (param0 != 1821625704) {
          discarded$2 = lf.b(-118);
          field_e = null;
          field_c = null;
          field_d = null;
          return;
        } else {
          field_e = null;
          field_c = null;
          field_d = null;
          return;
        }
    }

    lf(fr param0) {
        jq discarded$0 = null;
        jq discarded$1 = null;
        jq discarded$2 = null;
        jq discarded$3 = null;
        ke discarded$4 = null;
        try {
            discarded$0 = new jq((fk) null, 5126, 3, 0);
            discarded$1 = new jq((fk) null, 5126, 2, 0);
            discarded$2 = new jq((fk) null, 5126, 3, 0);
            discarded$3 = new jq((fk) null, 5121, 4, 0);
            discarded$4 = new ke();
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "lf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        L0: {
          tt.field_l = param1;
          if (null != qc.field_e) {
            qc.field_e.b(param1, true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 0) {
          return;
        } else {
          L1: {
            if (qr.field_b == null) {
              break L1;
            } else {
              qr.field_b.a((byte) -43, param1);
              break L1;
            }
          }
          return;
        }
    }

    final static boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -251) {
          L0: {
            lf.a(98, (byte) -77);
            if (-251 <= (td.field_u ^ -1)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-251 <= (td.field_u ^ -1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        field_e = new tg();
        field_d = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_c = new mp();
    }
}
