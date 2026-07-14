/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class po extends ka {
    private am field_f;
    private int field_g;
    private am field_b;
    private am field_k;
    static pa[] field_e;
    private int field_d;
    private am field_c;
    static int field_h;
    static int field_j;
    private ms field_i;

    final static void a(fp param0, byte param1, int param2) {
        dl var3 = null;
        var3 = q.field_p;
        var3.g(127, param2);
        if (param1 < 19) {
          field_h = -122;
          var3.b(-1336879960, ((fp) param0).field_f);
          var3.a(((fp) param0).field_e, 23385);
          return;
        } else {
          var3.b(-1336879960, ((fp) param0).field_f);
          var3.a(((fp) param0).field_e, 23385);
          return;
        }
    }

    final static rh a(int param0, int param1, al param2) {
        if (param1 != 0) {
            return (rh) null;
        }
        rh var3 = jo.a(param2, param0, (byte) -44);
        ((rh) var3).field_g.d(-1);
        return var3;
    }

    final static String a(int param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = AceOfSkies.field_G ? 1 : 0;
        if (param0 == -1) {
          var3 = ls.a(param1, param2, (byte) 21);
          if (var3 == null) {
            var4 = 0;
            L0: while (true) {
              if (((CharSequence) param1).length() > var4) {
                if (cg.a(((CharSequence) param1).charAt(var4), (byte) 118)) {
                  var4++;
                  continue L0;
                } else {
                  return wi.field_b;
                }
              } else {
                return null;
              }
            }
          } else {
            return var3;
          }
        } else {
          po.c(126);
          var3 = ls.a(param1, param2, (byte) 21);
          if (var3 == null) {
            var4 = 0;
            L1: while (true) {
              if (((CharSequence) param1).length() > var4) {
                if (cg.a(((CharSequence) param1).charAt(var4), (byte) 118)) {
                  var4++;
                  continue L1;
                } else {
                  return wi.field_b;
                }
              } else {
                return null;
              }
            }
          } else {
            return var3;
          }
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var3 = null;
            int var2 = -51 % ((param1 - -49) / 53);
            try {
                var3 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
                param0.getAppletContext().showDocument(jf.a(param0, var3, -53), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(int param0) {
        CharSequence var3 = null;
        if (null == ((po) this).field_c) {
          L0: {
            if (null != ((po) this).field_b) {
              ((po) this).field_b.a(true);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null != ((po) this).field_k) {
              ((po) this).field_k.a(true);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (null != ((po) this).field_f) {
              ((po) this).field_f.a(true);
              break L2;
            } else {
              break L2;
            }
          }
          if (param0 != 0) {
            L3: {
              var3 = (CharSequence) null;
              String discarded$2 = po.a(-108, (CharSequence) null, true);
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        } else {
          L5: {
            ((po) this).field_c.a(true);
            if (null != ((po) this).field_b) {
              ((po) this).field_b.a(true);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (null != ((po) this).field_k) {
              ((po) this).field_k.a(true);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (null != ((po) this).field_f) {
              ((po) this).field_f.a(true);
              break L7;
            } else {
              break L7;
            }
          }
          if (param0 == 0) {
            L8: {
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L8;
              } else {
                break L8;
              }
            }
            return;
          } else {
            L9: {
              var3 = (CharSequence) null;
              String discarded$3 = po.a(-108, (CharSequence) null, true);
              if (null != ((po) this).field_i) {
                ((po) this).field_i.b((byte) 29);
                break L9;
              } else {
                break L9;
              }
            }
            return;
          }
        }
    }

    public static void c(int param0) {
        field_e = null;
        if (param0 != -30534) {
            field_h = 87;
        }
    }

    po(bf param0, int param1, int param2, boolean param3, boolean param4) {
        ((po) this).field_d = param2;
        ((po) this).field_g = param1;
        if (!param3) {
            // ifeq L58
        }
        ((po) this).field_c = new am(cu.a((byte) 117, ((po) this).field_g, ((po) this).field_d));
        if (!param3) {
            // ifeq L104
        }
        ((po) this).field_b = new am(av.a(22847, ((po) this).field_d, ((po) this).field_g));
        if (!param3) {
            // ifeq L149
        }
        ((po) this).field_k = new am(hi.c(14834, ((po) this).field_g, ((po) this).field_d));
        if (!param3) {
            // ifeq L193
        }
        ((po) this).field_f = new am(ln.a(17, ((po) this).field_g, ((po) this).field_d));
        if (!param3) {
            // ifeq L237
        }
        ((po) this).field_i = new ms(hs.a(true, ((po) this).field_g, ((po) this).field_d));
    }

    static {
    }
}
