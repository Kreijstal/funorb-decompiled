/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk {
    static String field_e;
    static String field_d;
    static String field_f;
    static String field_i;
    static mh field_a;
    static jp field_h;
    static String field_b;
    static mh field_g;
    static jp field_c;

    final static void a(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var2;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (oh.field_b == sm.field_b) {
          fieldTemp$0 = jq.field_p;
          jq.field_p = jq.field_p + 1;
          if (-17 < (fieldTemp$0 ^ -1)) {
            if (param0 >= 20) {
              return;
            } else {
              field_c = (jp) null;
              return;
            }
          } else {
            if (ln.field_k) {
              vb.k(0);
              sm.field_b = ii.field_q;
              if (param0 >= 20) {
                return;
              } else {
                field_c = (jp) null;
                return;
              }
            } else {
              ok.a(0);
              sm.field_b = ii.field_q;
              if (param0 >= 20) {
                return;
              } else {
                field_c = (jp) null;
                return;
              }
            }
          }
        } else {
          if (sm.field_b == ii.field_q) {
            if (og.h(-26090)) {
              sm.field_b = vl.field_d;
              if (param0 < 20) {
                field_c = (jp) null;
                return;
              } else {
                return;
              }
            } else {
              if (fj.field_Ub == null) {
                ae.b((byte) 117);
                if (wi.field_g) {
                  wi.field_g = false;
                  cp.a(false, 21543);
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = (jp) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = (jp) null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                bd.a(3, (byte) 25, fj.field_Ub);
                ae.b((byte) 117);
                if (wi.field_g) {
                  wi.field_g = false;
                  cp.a(false, 21543);
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = (jp) null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  sm.field_b = vl.field_d;
                  if (param0 >= 20) {
                    return;
                  } else {
                    field_c = (jp) null;
                    return;
                  }
                }
              }
            }
          } else {
            if (vl.field_d == sm.field_b) {
              fieldTemp$1 = jq.field_p;
              jq.field_p = jq.field_p - 1;
              if (fieldTemp$1 <= 0) {
                sm.field_b = sm.field_a;
                if (param0 < 20) {
                  field_c = (jp) null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 < 20) {
                  field_c = (jp) null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 < 20) {
                field_c = (jp) null;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        if (param1 == 30922) {
          if (param0 < 0) {
            if ((param0 ^ -1) > 65535) {
              return -2048 + si.field_d[134217728 / -param0];
            } else {
              return -si.field_d[-param0 >> 20750693];
            }
          } else {
            if ((param0 ^ -1) >= -65537) {
              return si.field_d[param0 >> 2106815557];
            } else {
              return -si.field_d[134217728 / param0] + 2048;
            }
          }
        } else {
          return -40;
        }
    }

    final static void a(byte param0, boolean param1) {
        java.applet.Applet var3;
        L0: {
          if (!gp.a(-4858)) {
            break L0;
          } else {
            param1 = false;
            break L0;
          }
        }
        ga.a(param1, -124);
        if (param0 != -25) {
          var3 = (java.applet.Applet) null;
          nk.a(-89, (java.applet.Applet) null);
          wh.a(21862);
          return;
        } else {
          wh.a(21862);
          return;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_f = null;
        field_a = null;
        if (param0 != 121) {
          return;
        } else {
          field_e = null;
          field_g = null;
          field_c = null;
          field_b = null;
          field_i = null;
          field_d = null;
          return;
        }
    }

    final static boolean a(char param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!m.a(true, param0)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param1 != null) {
                var3_int = param1.length();
                if (12 > var3_int) {
                  L1: {
                    if (!param2) {
                      break L1;
                    } else {
                      field_e = (String) null;
                      break L1;
                    }
                  }
                  if (ik.a((byte) -9, param0)) {
                    if (0 != var3_int) {
                      stackIn_18_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      stackIn_16_0 = 0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  stackIn_9_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("nk.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L2;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_18_0 != 0;
              }
            }
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              try {
                L0: {
                  L1: {
                    if (param0 == 2048) {
                      break L1;
                    } else {
                      field_b = (String) null;
                      break L1;
                    }
                  }
                  var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                  param1.getAppletContext().showDocument(hg.a(param1, var2, -1), "_top");
                  break L0;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("nk.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L2;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L2;
                }
              }
              throw qb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -66 / ((-63 - param1) / 43);
            stackIn_1_0 = jf.field_c.a(124, "", param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("nk.C(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_e = "Suggest muting this player";
        field_f = "Sweet!";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "Status";
        field_i = "Macroing or use of bots";
    }
}
