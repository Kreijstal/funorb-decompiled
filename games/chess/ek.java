/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek {
    static int field_b;
    static mk field_d;
    static rk[] field_c;
    static int field_a;
    static String[] field_f;
    static String field_e;

    abstract int a(byte param0);

    final static void a(int param0, int param1, byte param2) {
        if (gb.field_A == null ||
          !(param1 <= gb.field_A.length)) {
          gb.field_A = new int[2 * param1];
        }
        if (null == hg.field_d) {
          hg.field_d = new int[param1 * 2];
          if (param2 < 52) {
            return;
          }
          if (hn.field_e == null ||
            !(hn.field_e.length >= param1)) {
            hn.field_e = new int[param1 * 2];
          }
          if (null == in.field_j ||
            !(in.field_j.length >= param1)) {
            in.field_j = new int[param1 * 2];
          }
          if (oc.field_n == null ||
            !(oc.field_n.length >= param1)) {
            oc.field_n = new int[2 * param1];
          }
          if (null == gh.field_a) {
            gh.field_a = new int[param1 * 2];
            if (null == vn.field_Ab ||
              !(param0 + param1 <= vn.field_Ab.length)) {
              vn.field_Ab = new int[(param0 + param1) * 2];
            }
            if (ok.field_Lb == null ||
              !(ok.field_Lb.length >= param1)) {
              ok.field_Lb = new boolean[2 * param1];
            }
          } else {
            if (param1 <= gh.field_a.length) {
              if (null == vn.field_Ab ||
                !(param0 + param1 <= vn.field_Ab.length)) {
                vn.field_Ab = new int[(param0 + param1) * 2];
              }
              if (ok.field_Lb == null ||
                !(ok.field_Lb.length >= param1)) {
                ok.field_Lb = new boolean[2 * param1];
              }
            } else {
              gh.field_a = new int[param1 * 2];
              if (null == vn.field_Ab ||
                !(param0 + param1 <= vn.field_Ab.length)) {
                vn.field_Ab = new int[(param0 + param1) * 2];
              }
              if (ok.field_Lb == null ||
                !(ok.field_Lb.length >= param1)) {
                ok.field_Lb = new boolean[2 * param1];
              }
            }
          }
        } else {
          if (param1 > hg.field_d.length) {
            hg.field_d = new int[param1 * 2];
            if (param2 < 52) {
              return;
            }
            if (hn.field_e == null ||
              !(hn.field_e.length >= param1)) {
              hn.field_e = new int[param1 * 2];
            }
            if (null == in.field_j ||
              !(in.field_j.length >= param1)) {
              in.field_j = new int[param1 * 2];
            }
            if (oc.field_n == null ||
              !(oc.field_n.length >= param1)) {
              oc.field_n = new int[2 * param1];
            }
            if (null == gh.field_a ||
              !(param1 <= gh.field_a.length)) {
              gh.field_a = new int[param1 * 2];
            }
            if (null == vn.field_Ab ||
              !(param0 + param1 <= vn.field_Ab.length)) {
              vn.field_Ab = new int[(param0 + param1) * 2];
            }
            if (ok.field_Lb == null) {
              ok.field_Lb = new boolean[2 * param1];
            } else {
              if (ok.field_Lb.length < param1) {
                ok.field_Lb = new boolean[2 * param1];
              }
            }
          } else {
            if (param2 < 52) {
              return;
            }
            if (hn.field_e == null) {
              hn.field_e = new int[param1 * 2];
              if (null == in.field_j ||
                !(in.field_j.length >= param1)) {
                in.field_j = new int[param1 * 2];
              }
              if (oc.field_n == null ||
                !(oc.field_n.length >= param1)) {
                oc.field_n = new int[2 * param1];
              }
              if (null == gh.field_a) {
                gh.field_a = new int[param1 * 2];
                if (null == vn.field_Ab ||
                  !(param0 + param1 <= vn.field_Ab.length)) {
                  vn.field_Ab = new int[(param0 + param1) * 2];
                }
                if (ok.field_Lb == null ||
                  !(ok.field_Lb.length >= param1)) {
                  ok.field_Lb = new boolean[2 * param1];
                }
              } else {
                if (param1 <= gh.field_a.length) {
                  if (null == vn.field_Ab ||
                    !(param0 + param1 <= vn.field_Ab.length)) {
                    vn.field_Ab = new int[(param0 + param1) * 2];
                  }
                  if (ok.field_Lb == null ||
                    !(ok.field_Lb.length >= param1)) {
                    ok.field_Lb = new boolean[2 * param1];
                  }
                } else {
                  gh.field_a = new int[param1 * 2];
                  if (null == vn.field_Ab ||
                    !(param0 + param1 <= vn.field_Ab.length)) {
                    vn.field_Ab = new int[(param0 + param1) * 2];
                  }
                  if (ok.field_Lb == null ||
                    !(ok.field_Lb.length >= param1)) {
                    ok.field_Lb = new boolean[2 * param1];
                  }
                }
              }
            } else {
              if (hn.field_e.length >= param1) {
                if (null == in.field_j ||
                  !(in.field_j.length >= param1)) {
                  in.field_j = new int[param1 * 2];
                }
                if (oc.field_n == null ||
                  !(oc.field_n.length >= param1)) {
                  oc.field_n = new int[2 * param1];
                }
                if (null == gh.field_a) {
                  gh.field_a = new int[param1 * 2];
                  if (null == vn.field_Ab ||
                    !(param0 + param1 <= vn.field_Ab.length)) {
                    vn.field_Ab = new int[(param0 + param1) * 2];
                  }
                  if (ok.field_Lb == null ||
                    !(ok.field_Lb.length >= param1)) {
                    ok.field_Lb = new boolean[2 * param1];
                  }
                } else {
                  if (param1 <= gh.field_a.length) {
                    if (null == vn.field_Ab ||
                      !(param0 + param1 <= vn.field_Ab.length)) {
                      vn.field_Ab = new int[(param0 + param1) * 2];
                    }
                    if (ok.field_Lb == null ||
                      !(ok.field_Lb.length >= param1)) {
                      ok.field_Lb = new boolean[2 * param1];
                    }
                  } else {
                    gh.field_a = new int[param1 * 2];
                    if (null == vn.field_Ab ||
                      !(param0 + param1 <= vn.field_Ab.length)) {
                      vn.field_Ab = new int[(param0 + param1) * 2];
                    }
                    if (ok.field_Lb == null ||
                      !(ok.field_Lb.length >= param1)) {
                      ok.field_Lb = new boolean[2 * param1];
                    }
                  }
                }
              } else {
                hn.field_e = new int[param1 * 2];
                if (null == in.field_j ||
                  !(in.field_j.length >= param1)) {
                  in.field_j = new int[param1 * 2];
                }
                if (oc.field_n == null ||
                  !(oc.field_n.length >= param1)) {
                  oc.field_n = new int[2 * param1];
                }
                if (null == gh.field_a) {
                  gh.field_a = new int[param1 * 2];
                  if (null == vn.field_Ab ||
                    !(param0 + param1 <= vn.field_Ab.length)) {
                    vn.field_Ab = new int[(param0 + param1) * 2];
                  }
                  if (ok.field_Lb == null ||
                    !(ok.field_Lb.length >= param1)) {
                    ok.field_Lb = new boolean[2 * param1];
                  }
                } else {
                  if (param1 <= gh.field_a.length) {
                    if (null == vn.field_Ab ||
                      !(param0 + param1 <= vn.field_Ab.length)) {
                      vn.field_Ab = new int[(param0 + param1) * 2];
                    }
                    if (ok.field_Lb == null ||
                      !(ok.field_Lb.length >= param1)) {
                      ok.field_Lb = new boolean[2 * param1];
                    }
                  } else {
                    gh.field_a = new int[param1 * 2];
                    if (null == vn.field_Ab ||
                      !(param0 + param1 <= vn.field_Ab.length)) {
                      vn.field_Ab = new int[(param0 + param1) * 2];
                    }
                    if (ok.field_Lb == null ||
                      !(ok.field_Lb.length >= param1)) {
                      ok.field_Lb = new boolean[2 * param1];
                    }
                  }
                }
              }
            }
          }
        }
        ed.field_b = 0;
        bj.field_gb = -2147483648;
        bh.field_F = 2147483647;
        nj.field_t = 2147483647;
        eb.field_y = -2147483648;
    }

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          try {
            if (!jk.field_c.startsWith("win")) {
              return false;
            }
            if (!param0.startsWith("http://") &&
              !param0.startsWith("https://")) {
              return false;
            }
            var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
            if (param1) {
              return true;
            }
            var3 = 0;
            while (true) {
              if (param0.length() <= var3) {
                Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                return true;
              }
              if (var2.indexOf((int) param0.charAt(var3)) != -1) {
                var3++;
                continue;
              }
              break;
            }
            return false;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_25_0 = var2_ref2;
          stackIn_25_1 = new StringBuilder().append("ek.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        if (param6 == 63) {
          wb.a(-param3 + param2, param1 - param3, param3 * 2 + param7 - param2, -param1 + param4 + param3 * 2, param3, param5, 170);
          wb.a(param2 - param3, -param3 + param1, param3 * 2 + param7 - param2, param4 - param1 + 2 * param3, param3, param0);
          return;
        }
        ek.a(90, -50, (byte) -48);
        wb.a(-param3 + param2, param1 - param3, param3 * 2 + param7 - param2, -param1 + param4 + param3 * 2, param3, param5, 170);
        wb.a(param2 - param3, -param3 + param1, param3 * 2 + param7 - param2, param4 - param1 + 2 * param3, param3, param0);
    }

    public static void b(byte param0) {
        if (param0 != 30) {
          return;
        }
        field_f = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    static {
        field_d = new mk();
        field_f = new String[]{"Total player time (minutes)"};
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
