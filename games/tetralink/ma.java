/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma {
    private int field_i;
    static int field_f;
    private tb[] field_b;
    private int[] field_a;
    private int field_e;
    static uf field_d;
    private int field_k;
    static boolean field_g;
    private int field_j;
    private int field_h;
    private tb field_c;

    final static String a(ah param0, String param1, int param2, String param3, byte param4) {
        if (param0.c(120)) {
          if (param4 != 15) {
            ma.d(54);
            return param3 + " - " + param0.e(-11337, param2) + "%";
          } else {
            return param3 + " - " + param0.e(-11337, param2) + "%";
          }
        } else {
          return param1;
        }
    }

    final static void a(String param0, long param1, java.applet.Applet param2, int param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              if (param3 >= 102) {
                L0: {
                  var8 = param2.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if (-1L >= (param1 ^ -1L)) {
                    var7 = var9 + "; Expires=" + ei.a((byte) 2, k.a(0) - -(1000L * param1)) + "; Max-Age=" + param1;
                    break L0;
                  } else {
                    var7 = var9 + "; Discard;";
                    break L0;
                  }
                }
                ii.a(-19149, "document.cookie=\"" + var7 + "\"", param2);
              } else {
                return;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var6 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final boolean b(int param0) {
        if (param0 == 0) {
          ((ma) this).field_j = ((ma) this).field_j + 1;
          if (((ma) this).field_j >= ((ma) this).field_c.field_f.length) {
            ((ma) this).field_e = ((ma) this).field_e + 1;
            if (!((ma) this).field_c.field_i) {
              if (((ma) this).field_e < ((ma) this).field_c.field_b) {
                if (-1 >= (((ma) this).field_c.field_k ^ -1)) {
                  if (((ma) this).field_c.field_f.length <= ((ma) this).field_c.field_k) {
                    ((ma) this).field_j = 0;
                    ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                    ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                    return false;
                  } else {
                    ((ma) this).field_j = ((ma) this).field_c.field_k;
                    ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                    ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                    return false;
                  }
                } else {
                  ((ma) this).field_j = 0;
                  ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                  ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (-1 >= (((ma) this).field_c.field_k ^ -1)) {
                if (((ma) this).field_c.field_f.length > ((ma) this).field_c.field_k) {
                  ((ma) this).field_j = ((ma) this).field_c.field_k;
                  ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                  ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                  return false;
                } else {
                  ((ma) this).field_j = 0;
                  ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                  ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                  return false;
                }
              } else {
                ((ma) this).field_j = 0;
                ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                return false;
              }
            }
          } else {
            ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
            ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
            return false;
          }
        } else {
          field_d = null;
          ((ma) this).field_j = ((ma) this).field_j + 1;
          if (((ma) this).field_j >= ((ma) this).field_c.field_f.length) {
            ((ma) this).field_e = ((ma) this).field_e + 1;
            if (!((ma) this).field_c.field_i) {
              if (((ma) this).field_e < ((ma) this).field_c.field_b) {
                if (-1 >= (((ma) this).field_c.field_k ^ -1)) {
                  if (((ma) this).field_c.field_f.length > ((ma) this).field_c.field_k) {
                    ((ma) this).field_j = ((ma) this).field_c.field_k;
                    ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                    ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                    return false;
                  } else {
                    ((ma) this).field_j = 0;
                    ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                    ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                    return false;
                  }
                } else {
                  ((ma) this).field_j = 0;
                  ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                  ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                  return false;
                }
              } else {
                return true;
              }
            } else {
              if (-1 >= (((ma) this).field_c.field_k ^ -1)) {
                if (((ma) this).field_c.field_f.length > ((ma) this).field_c.field_k) {
                  ((ma) this).field_j = ((ma) this).field_c.field_k;
                  ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                  ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                  return false;
                } else {
                  ((ma) this).field_j = 0;
                  ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                  ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                  return false;
                }
              } else {
                ((ma) this).field_j = 0;
                ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
                ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
                return false;
              }
            }
          } else {
            ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
            ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
            return false;
          }
        }
    }

    public static void d(int param0) {
        field_d = null;
        if (param0 != -3) {
            field_f = 127;
        }
    }

    final static String a(boolean param0, String param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        ud var7 = null;
        ud var8 = null;
        bc var9 = null;
        CharSequence var10 = null;
        var6 = TetraLink.field_J;
        var10 = (CharSequence) (Object) param1;
        if (!gi.a(param0, var10)) {
          return uk.field_u;
        } else {
          if ((ji.field_Tb ^ -1) == -3) {
            var8 = ke.a(param1, false);
            if (var8 != null) {
              mc discarded$2 = og.field_j.a((byte) -10, (mc) (Object) var8);
              L0: while (true) {
                var7 = (ud) (Object) og.field_j.a((byte) -70);
                if (var7 != null) {
                  var7.field_Rb = var7.field_Rb - 1;
                  continue L0;
                } else {
                  var8.b(false);
                  var8.e(0);
                  qi.field_q = qi.field_q - 1;
                  var9 = nd.field_Lb;
                  var9.f(param2, (byte) -92);
                  var9.field_t = var9.field_t + 1;
                  var5 = var9.field_t;
                  var9.a(1, param0);
                  var9.a(param1, 0);
                  var9.b(-var5 + var9.field_t, -2);
                  return null;
                }
              }
            } else {
              return sk.a(new String[1], sf.field_b, 127);
            }
          } else {
            return te.field_Q;
          }
        }
    }

    final void a(byte param0, tb param1) {
        this.a(109);
        ((ma) this).field_c = param1;
        ((ma) this).field_i = ((ma) this).field_c.field_f[((ma) this).field_j];
        ((ma) this).field_h = ((ma) this).field_c.field_l[((ma) this).field_j];
        if (param0 < 17) {
          ((ma) this).field_i = -96;
          ((ma) this).field_k = -1;
          return;
        } else {
          ((ma) this).field_k = -1;
          return;
        }
    }

    private final void a(int param0) {
        ((ma) this).field_j = 0;
        ((ma) this).field_e = 0;
        if (param0 < 65) {
            return;
        }
        ((ma) this).field_h = 0;
        ((ma) this).field_i = 0;
    }

    final fc a(boolean param0, int param1, fc param2, boolean param3) {
        int var6 = 77 / ((param1 - -78) / 40);
        fc var5 = param2.a(param3, false, !param0 ? true : false);
        var5.a(im.field_c, ((ma) this).field_i, (f) null, -1, 0, 0, param0);
        return var5;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                int var3 = 84 / ((72 - param1) / 34);
                param0.getAppletContext().showDocument(ai.a(var2, (byte) -119, param0), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        if (null != ((ma) this).field_b) {
          if (0 <= ((ma) this).field_k) {
            ((ma) this).field_a[((ma) this).field_k] = ((ma) this).field_a[((ma) this).field_k] - 1;
            if (((ma) this).field_a[((ma) this).field_k] < 0) {
              var2 = ((ma) this).field_k;
              ((ma) this).a((byte) 64, ((ma) this).field_b[((ma) this).field_k]);
              ((ma) this).field_k = var2;
              ((ma) this).field_b[((ma) this).field_k] = null;
              ((ma) this).field_k = ((ma) this).field_k + 1;
              if (((ma) this).field_b.length != ((ma) this).field_k) {
                if (((ma) this).field_b[((ma) this).field_k] == null) {
                  ((ma) this).field_k = -1;
                  if (((ma) this).field_c == null) {
                    return true;
                  } else {
                    ((ma) this).field_h = ((ma) this).field_h - 1;
                    if (((ma) this).field_h <= 0) {
                      return this.b(0);
                    } else {
                      var2 = -92 % ((param0 - -67) / 50);
                      return false;
                    }
                  }
                } else {
                  if (((ma) this).field_c == null) {
                    return true;
                  } else {
                    ((ma) this).field_h = ((ma) this).field_h - 1;
                    if (((ma) this).field_h <= 0) {
                      return this.b(0);
                    } else {
                      var2 = -92 % ((param0 - -67) / 50);
                      return false;
                    }
                  }
                }
              } else {
                L0: {
                  ((ma) this).field_k = 0;
                  if (((ma) this).field_b[((ma) this).field_k] == null) {
                    ((ma) this).field_k = -1;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (((ma) this).field_c == null) {
                  return true;
                } else {
                  ((ma) this).field_h = ((ma) this).field_h - 1;
                  if (((ma) this).field_h <= 0) {
                    return this.b(0);
                  } else {
                    var2 = -92 % ((param0 - -67) / 50);
                    return false;
                  }
                }
              }
            } else {
              if (((ma) this).field_c == null) {
                return true;
              } else {
                ((ma) this).field_h = ((ma) this).field_h - 1;
                if (((ma) this).field_h <= 0) {
                  return this.b(0);
                } else {
                  var2 = -92 % ((param0 - -67) / 50);
                  return false;
                }
              }
            }
          } else {
            if (((ma) this).field_c == null) {
              return true;
            } else {
              ((ma) this).field_h = ((ma) this).field_h - 1;
              if (((ma) this).field_h <= 0) {
                return this.b(0);
              } else {
                var2 = -92 % ((param0 - -67) / 50);
                return false;
              }
            }
          }
        } else {
          if (((ma) this).field_c == null) {
            return true;
          } else {
            ((ma) this).field_h = ((ma) this).field_h - 1;
            if (((ma) this).field_h <= 0) {
              return this.b(0);
            } else {
              var2 = -92 % ((param0 - -67) / 50);
              return false;
            }
          }
        }
    }

    final static void c(int param0) {
        bb.field_d = new String[co.field_q];
        bb.field_d[19] = uk.field_v;
        bb.field_d[20] = ok.field_e;
        bb.field_d[4] = kf.field_b;
        bb.field_d[16] = rb.field_Lb;
        bb.field_d[15] = wd.field_a;
        bb.field_d[21] = em.field_a;
        bb.field_d[11] = gh.field_b;
        if (param0 != 24657) {
          return;
        } else {
          bb.field_d[9] = ha.field_f;
          bb.field_d[17] = pg.field_e;
          bb.field_d[6] = qf.field_e;
          bb.field_d[18] = gm.field_c;
          bb.field_d[13] = nm.field_p;
          bb.field_d[7] = rj.field_a;
          bb.field_d[5] = dj.field_d;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 20;
        field_g = false;
    }
}
