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
        int var2 = 0;
        var2 = BrickABrac.field_J ? 1 : 0;
        if (oh.field_b == sm.field_b) {
          jq.field_p = jq.field_p + 1;
          if (-17 < (jq.field_p ^ -1)) {
            if (param0 >= 20) {
              return;
            } else {
              field_c = null;
              return;
            }
          } else {
            if (ln.field_k) {
              vb.k(0);
              sm.field_b = ii.field_q;
              if (param0 >= 20) {
                return;
              } else {
                field_c = null;
                return;
              }
            } else {
              ok.a(0);
              sm.field_b = ii.field_q;
              if (param0 >= 20) {
                return;
              } else {
                field_c = null;
                return;
              }
            }
          }
        } else {
          if (sm.field_b == ii.field_q) {
            if (og.h(-26090)) {
              sm.field_b = vl.field_d;
              if (param0 < 20) {
                field_c = null;
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
                    field_c = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  sm.field_b = vl.field_d;
                  if (param0 < 20) {
                    field_c = null;
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
                    field_c = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  sm.field_b = vl.field_d;
                  if (param0 >= 20) {
                    return;
                  } else {
                    field_c = null;
                    return;
                  }
                }
              }
            }
          } else {
            if (vl.field_d == sm.field_b) {
              jq.field_p = jq.field_p - 1;
              if (jq.field_p <= 0) {
                sm.field_b = sm.field_a;
                if (param0 < 20) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 < 20) {
                  field_c = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param0 < 20) {
                field_c = null;
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
        Object var3 = null;
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
          var3 = null;
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
        int var3 = 0;
        if (!m.a(true, param0)) {
          return false;
        } else {
          if (param1 != null) {
            var3 = param1.length();
            if (12 > var3) {
              if (!param2) {
                if (ik.a((byte) -9, param0)) {
                  if (0 == var3) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                field_e = null;
                if (ik.a((byte) -9, param0)) {
                  if (0 != var3) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 != 2048) {
                    field_b = null;
                }
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                param1.getAppletContext().showDocument(hg.a(param1, var2, -1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static byte[] a(String param0, byte param1) {
        int var2 = -66 / ((-63 - param1) / 43);
        return jf.field_c.a(124, "", param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Suggest muting this player";
        field_f = "Sweet!";
        field_d = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_b = "Status";
        field_i = "Macroing or use of bots";
    }
}
