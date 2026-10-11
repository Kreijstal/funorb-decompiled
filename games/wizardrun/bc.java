/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static kl field_a;
    static String field_c;
    static String field_b;

    final static void a(byte param0, int param1, int param2) {
        int var3;
        var3 = -116 / ((-20 - param0) / 43);
        if (null == he.field_m) {
          he.field_m = new int[param2 * 2];
          if (ug.field_I == null ||
            !(param2 <= ug.field_I.length)) {
            ug.field_I = new int[2 * param2];
          }
          if (sk.field_B == null ||
            !(sk.field_B.length >= param2)) {
            sk.field_B = new int[param2 * 2];
          }
          if (tf.field_c == null ||
            !(tf.field_c.length >= param2)) {
            tf.field_c = new int[param2 * 2];
          }
          if (mk.field_c != null &&
            param2 <= mk.field_c.length) {
            if (td.field_c == null) {
              td.field_c = new int[param2 * 2];
              if (sj.field_m == null ||
                !(sj.field_m.length >= param1 + param2)) {
                sj.field_m = new int[2 * (param2 + param1)];
              }
              if (di.field_g == null ||
                !(param2 <= di.field_g.length)) {
                di.field_g = new boolean[2 * param2];
              }
            } else {
              if (td.field_c.length < param2) {
                td.field_c = new int[param2 * 2];
                if (sj.field_m == null ||
                  !(sj.field_m.length >= param1 + param2)) {
                  sj.field_m = new int[2 * (param2 + param1)];
                }
                if (di.field_g == null ||
                  !(param2 <= di.field_g.length)) {
                  di.field_g = new boolean[2 * param2];
                }
              } else {
                if (sj.field_m == null) {
                  sj.field_m = new int[2 * (param2 + param1)];
                  if (di.field_g == null ||
                    !(param2 <= di.field_g.length)) {
                    di.field_g = new boolean[2 * param2];
                  }
                } else {
                  if (sj.field_m.length < param1 + param2) {
                    sj.field_m = new int[2 * (param2 + param1)];
                    if (di.field_g == null ||
                      !(param2 <= di.field_g.length)) {
                      di.field_g = new boolean[2 * param2];
                    }
                  } else {
                    if (di.field_g == null) {
                      di.field_g = new boolean[2 * param2];
                    } else {
                      if (param2 > di.field_g.length) {
                        di.field_g = new boolean[2 * param2];
                      }
                    }
                  }
                }
              }
            }
            dj.field_b = -2147483648;
            lg.field_d = 0;
            dg.field_d = 2147483647;
            gf.field_W = 2147483647;
            rb.field_e = -2147483648;
            return;
          }
          mk.field_c = new int[2 * param2];
          if (td.field_c == null ||
            !(td.field_c.length >= param2)) {
            td.field_c = new int[param2 * 2];
          }
          if (sj.field_m == null ||
            !(sj.field_m.length >= param1 + param2)) {
            sj.field_m = new int[2 * (param2 + param1)];
          }
          if (di.field_g == null ||
            !(param2 <= di.field_g.length)) {
            di.field_g = new boolean[2 * param2];
          }
        } else {
          if (he.field_m.length >= param2) {
            if (ug.field_I == null ||
              !(param2 <= ug.field_I.length)) {
              ug.field_I = new int[2 * param2];
            }
            if (sk.field_B == null ||
              !(sk.field_B.length >= param2)) {
              sk.field_B = new int[param2 * 2];
            }
            if (tf.field_c == null ||
              !(tf.field_c.length >= param2)) {
              tf.field_c = new int[param2 * 2];
            }
            if (mk.field_c != null &&
              param2 <= mk.field_c.length) {
              if (td.field_c == null) {
                td.field_c = new int[param2 * 2];
                if (sj.field_m == null ||
                  !(sj.field_m.length >= param1 + param2)) {
                  sj.field_m = new int[2 * (param2 + param1)];
                }
                if (di.field_g == null ||
                  !(param2 <= di.field_g.length)) {
                  di.field_g = new boolean[2 * param2];
                }
              } else {
                if (td.field_c.length < param2) {
                  td.field_c = new int[param2 * 2];
                  if (sj.field_m == null ||
                    !(sj.field_m.length >= param1 + param2)) {
                    sj.field_m = new int[2 * (param2 + param1)];
                  }
                  if (di.field_g == null ||
                    !(param2 <= di.field_g.length)) {
                    di.field_g = new boolean[2 * param2];
                  }
                } else {
                  if (sj.field_m == null) {
                    sj.field_m = new int[2 * (param2 + param1)];
                    if (di.field_g == null ||
                      !(param2 <= di.field_g.length)) {
                      di.field_g = new boolean[2 * param2];
                    }
                  } else {
                    if (sj.field_m.length < param1 + param2) {
                      sj.field_m = new int[2 * (param2 + param1)];
                      if (di.field_g == null ||
                        !(param2 <= di.field_g.length)) {
                        di.field_g = new boolean[2 * param2];
                      }
                    } else {
                      if (di.field_g == null) {
                        di.field_g = new boolean[2 * param2];
                      } else {
                        if (param2 > di.field_g.length) {
                          di.field_g = new boolean[2 * param2];
                        }
                      }
                    }
                  }
                }
              }
              dj.field_b = -2147483648;
              lg.field_d = 0;
              dg.field_d = 2147483647;
              gf.field_W = 2147483647;
              rb.field_e = -2147483648;
              return;
            }
            mk.field_c = new int[2 * param2];
            if (td.field_c == null ||
              !(td.field_c.length >= param2)) {
              td.field_c = new int[param2 * 2];
            }
            if (sj.field_m == null ||
              !(sj.field_m.length >= param1 + param2)) {
              sj.field_m = new int[2 * (param2 + param1)];
            }
            if (di.field_g == null ||
              !(param2 <= di.field_g.length)) {
              di.field_g = new boolean[2 * param2];
            }
          } else {
            he.field_m = new int[param2 * 2];
            if (ug.field_I == null ||
              !(param2 <= ug.field_I.length)) {
              ug.field_I = new int[2 * param2];
            }
            if (sk.field_B == null ||
              !(sk.field_B.length >= param2)) {
              sk.field_B = new int[param2 * 2];
            }
            if (tf.field_c == null ||
              !(tf.field_c.length >= param2)) {
              tf.field_c = new int[param2 * 2];
            }
            if (mk.field_c != null &&
              param2 <= mk.field_c.length) {
              if (td.field_c == null) {
                td.field_c = new int[param2 * 2];
                if (sj.field_m == null) {
                  sj.field_m = new int[2 * (param2 + param1)];
                  if (di.field_g == null ||
                    !(param2 <= di.field_g.length)) {
                    di.field_g = new boolean[2 * param2];
                  }
                } else {
                  if (sj.field_m.length < param1 + param2) {
                    sj.field_m = new int[2 * (param2 + param1)];
                    if (di.field_g == null ||
                      !(param2 <= di.field_g.length)) {
                      di.field_g = new boolean[2 * param2];
                    }
                  } else {
                    if (di.field_g == null) {
                      di.field_g = new boolean[2 * param2];
                    } else {
                      if (param2 > di.field_g.length) {
                        di.field_g = new boolean[2 * param2];
                      }
                    }
                  }
                }
              } else {
                if (td.field_c.length < param2) {
                  td.field_c = new int[param2 * 2];
                  if (sj.field_m == null ||
                    !(sj.field_m.length >= param1 + param2)) {
                    sj.field_m = new int[2 * (param2 + param1)];
                  }
                } else {
                  if (sj.field_m == null) {
                    sj.field_m = new int[2 * (param2 + param1)];
                  } else {
                    if (sj.field_m.length < param1 + param2) {
                      sj.field_m = new int[2 * (param2 + param1)];
                    }
                  }
                }
                if (di.field_g == null) {
                  di.field_g = new boolean[2 * param2];
                } else {
                  if (param2 > di.field_g.length) {
                    di.field_g = new boolean[2 * param2];
                  }
                }
              }
              dj.field_b = -2147483648;
              lg.field_d = 0;
              dg.field_d = 2147483647;
              gf.field_W = 2147483647;
              rb.field_e = -2147483648;
              return;
            }
            mk.field_c = new int[2 * param2];
            if (td.field_c == null ||
              !(td.field_c.length >= param2)) {
              td.field_c = new int[param2 * 2];
            }
            if (sj.field_m == null ||
              !(sj.field_m.length >= param1 + param2)) {
              sj.field_m = new int[2 * (param2 + param1)];
            }
            if (di.field_g != null &&
              param2 <= di.field_g.length) {
              dj.field_b = -2147483648;
              lg.field_d = 0;
              dg.field_d = 2147483647;
              gf.field_W = 2147483647;
              rb.field_e = -2147483648;
              return;
            }
            di.field_g = new boolean[2 * param2];
          }
        }
        dj.field_b = -2147483648;
        lg.field_d = 0;
        dg.field_d = 2147483647;
        gf.field_W = 2147483647;
        rb.field_e = -2147483648;
    }

    public static void a(int param0) {
        if (param0 == 2) {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
        bc.a(-78);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param0 < 122) {
              return;
            }
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(jl.a(-73, var2, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("bc.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw bd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = "OVER <%0>";
        field_c = "Achieved";
    }
}
