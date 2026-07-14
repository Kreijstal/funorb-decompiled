/*
 * Decompiled by CFR-JS 0.4.0.
 */
class im extends bd {
    static int field_g;
    static String field_i;
    static String field_f;
    private String field_e;
    private long field_h;

    final static void a(byte param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
                int var3 = 13 % ((param0 - -29) / 56);
                param1.getAppletContext().showDocument(nm.a(param1, var2, -31843), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static na a(int param0, byte param1) {
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackOut_7_0 = null;
        Object stackOut_6_0 = null;
        tf stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        if (param1 >= -28) {
          L0: {
            field_i = null;
            if (null != nk.field_q) {
              stackOut_7_0 = nk.field_q.a((long)param0, (byte) -102);
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = null;
              stackIn_8_0 = (tf) (Object) stackOut_6_0;
              break L0;
            }
          }
          return (na) (Object) stackIn_8_0;
        } else {
          L1: {
            if (null != nk.field_q) {
              stackOut_3_0 = nk.field_q.a((long)param0, (byte) -102);
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = null;
              stackIn_4_0 = (tf) (Object) stackOut_2_0;
              break L1;
            }
          }
          return (na) (Object) stackIn_4_0;
        }
    }

    final static void d(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var7 = jb.field_s;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        if (param0 != -24000) {
          field_i = null;
          var2 = 0;
          var3 = var7.length;
          L0: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          var3 = var7.length;
          L1: while (true) {
            if (var2 >= var3) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            }
          }
        }
    }

    final static void c(int param0) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        int var1 = -117 / ((param0 - 89) / 35);
        ab var2 = he.field_e;
        while (bl.d(0)) {
            var2.b((byte) -66, 8);
            var2.field_g = var2.field_g + 1;
            var3 = var2.field_g + 1;
            ho.a(-5534, var2);
            he.field_e.b(var2.field_g + -var3, (byte) 43);
        }
    }

    final static void a(String param0, int param1, String param2) {
        ff.a(false, param2, (byte) -97, param0);
        if (param1 != 0) {
            im.a((byte) -12);
        }
    }

    ch a(int param0) {
        if (param0 != 0) {
            field_i = null;
            return hk.field_m;
        }
        return hk.field_m;
    }

    final static wa a(int param0, String param1) {
        String var2 = null;
        Object var3 = null;
        wa var3_ref = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var3 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != ie.field_Qb) {
          if (param1 != null) {
            if (0 != param1.length()) {
              var6 = (CharSequence) (Object) param1;
              var2 = gk.a(var6, -13);
              if (param0 == 0) {
                if (var2 != null) {
                  var3_ref = (wa) (Object) ie.field_Qb.a((long)var2.hashCode(), (byte) -72);
                  L0: while (true) {
                    if (var3_ref != null) {
                      var8 = (CharSequence) (Object) var3_ref.field_Cb;
                      var4 = gk.a(var8, -13);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3_ref = (wa) (Object) ie.field_Qb.d(-107);
                        continue L0;
                      } else {
                        return var3_ref;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                im.a((byte) 70);
                if (var2 != null) {
                  var3_ref = (wa) (Object) ie.field_Qb.a((long)var2.hashCode(), (byte) -72);
                  L1: while (true) {
                    if (var3_ref != null) {
                      var7 = (CharSequence) (Object) var3_ref.field_Cb;
                      var4 = gk.a(var7, -13);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3_ref = (wa) (Object) ie.field_Qb.d(-107);
                        continue L1;
                      } else {
                        return var3_ref;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(wk param0, int param1) {
        param0.a(((im) this).field_h, (byte) 109);
        int var3 = 116 / ((-35 - param1) / 36);
        param0.a((byte) 7, ((im) this).field_e);
    }

    final static void a(int param0, gh param1, dl param2, java.awt.Component param3, int param4, boolean param5) {
        if (param4 != -22836) {
          field_f = null;
          sm.a(param4 ^ 22876, param5, param0, param1, param3, 1024, param2, param0);
          return;
        } else {
          sm.a(param4 ^ 22876, param5, param0, param1, param3, 1024, param2, param0);
          return;
        }
    }

    final static nc a(eg param0, int param1, eg param2, int param3, int param4) {
        if (fc.a(50, param0, param4, param1)) {
          if (param3 < 44) {
            field_i = null;
            return mi.a(param2.b(param1, 26219, param4), 45);
          } else {
            return mi.a(param2.b(param1, 26219, param4), 45);
          }
        } else {
          return null;
        }
    }

    im(long param0, String param1) {
        ((im) this).field_e = param1;
        ((im) this).field_h = param0;
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_f = null;
        if (param0 != -14) {
          var2 = null;
          im.a((String) null, -94, (String) null);
          field_i = null;
          return;
        } else {
          field_i = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 65;
        field_i = "Turn time remaining: <%0><br><br>It is currently your turn and time is ticking down.<br><br>If you don't move soon you will miss your go!";
        field_f = "OK";
    }
}
