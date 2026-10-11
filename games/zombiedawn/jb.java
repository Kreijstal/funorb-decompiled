/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jb implements io {
    static vo field_b;
    static String field_d;
    static String field_c;
    static vn[] field_a;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        vn var8 = null;
        try {
          if (param0 != 16777215) {
            return;
          }
          var6_int = param3.field_k + param4;
          var7 = param2 + param3.field_j;
          pb.a(var6_int, param3.field_n, var7, 48, param3.field_i);
          var8 = dj.field_k[1];
          if (param3 instanceof an &&
            ((an) (param3)).field_x) {
            var8.b(var6_int - (-1 - (-var8.field_r + param3.field_i >> 1)), 1 + var7 + (param3.field_n - var8.field_q >> 1), 256);
          }
          if (param3.e(-17741)) {
            on.b(param3.field_i - 4, -4 + param3.field_n, var6_int + 2, param0 - 16777157, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("jb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        if (null == j.field_b ||
          !(param0 <= j.field_b.length)) {
          j.field_b = new int[param0 * 2];
        }
        if (null == dj.field_g) {
          dj.field_g = new int[2 * param0];
          if (qo.field_r == null ||
            !(qo.field_r.length >= param0)) {
            qo.field_r = new int[2 * param0];
          }
          if (null == sg.field_kb) {
            sg.field_kb = new int[param0 * 2];
            if (null == jd.field_d ||
              !(jd.field_d.length >= param0)) {
              jd.field_d = new int[2 * param0];
            }
            if (qp.field_b == null ||
              !(param0 <= qp.field_b.length)) {
              qp.field_b = new int[param0 * 2];
            }
            if (null == qd.field_c ||
              !(qd.field_c.length >= param0 + param2)) {
              qd.field_c = new int[(param0 + param2) * 2];
            }
            if (ip.field_q == null ||
              !(param0 <= ip.field_q.length)) {
              ip.field_q = new boolean[2 * param0];
            }
          } else {
            if (param0 > sg.field_kb.length) {
              sg.field_kb = new int[param0 * 2];
              if (null == jd.field_d ||
                !(jd.field_d.length >= param0)) {
                jd.field_d = new int[2 * param0];
              }
              if (qp.field_b == null ||
                !(param0 <= qp.field_b.length)) {
                qp.field_b = new int[param0 * 2];
              }
              if (null == qd.field_c ||
                !(qd.field_c.length >= param0 + param2)) {
                qd.field_c = new int[(param0 + param2) * 2];
              }
              if (ip.field_q == null ||
                !(param0 <= ip.field_q.length)) {
                ip.field_q = new boolean[2 * param0];
              }
            } else {
              if (null == jd.field_d) {
                jd.field_d = new int[2 * param0];
                if (qp.field_b == null ||
                  !(param0 <= qp.field_b.length)) {
                  qp.field_b = new int[param0 * 2];
                }
                if (null == qd.field_c ||
                  !(qd.field_c.length >= param0 + param2)) {
                  qd.field_c = new int[(param0 + param2) * 2];
                }
                if (ip.field_q == null ||
                  !(param0 <= ip.field_q.length)) {
                  ip.field_q = new boolean[2 * param0];
                }
              } else {
                if (jd.field_d.length < param0) {
                  jd.field_d = new int[2 * param0];
                  if (qp.field_b == null ||
                    !(param0 <= qp.field_b.length)) {
                    qp.field_b = new int[param0 * 2];
                  }
                  if (null == qd.field_c ||
                    !(qd.field_c.length >= param0 + param2)) {
                    qd.field_c = new int[(param0 + param2) * 2];
                  }
                  if (ip.field_q == null ||
                    !(param0 <= ip.field_q.length)) {
                    ip.field_q = new boolean[2 * param0];
                  }
                } else {
                  if (qp.field_b == null ||
                    !(param0 <= qp.field_b.length)) {
                    qp.field_b = new int[param0 * 2];
                  }
                  if (null == qd.field_c ||
                    !(qd.field_c.length >= param0 + param2)) {
                    qd.field_c = new int[(param0 + param2) * 2];
                  }
                  if (ip.field_q == null) {
                    ip.field_q = new boolean[2 * param0];
                  } else {
                    if (param0 > ip.field_q.length) {
                      ip.field_q = new boolean[2 * param0];
                    }
                  }
                }
              }
            }
          }
        } else {
          if (param0 > dj.field_g.length) {
            dj.field_g = new int[2 * param0];
            if (qo.field_r == null ||
              !(qo.field_r.length >= param0)) {
              qo.field_r = new int[2 * param0];
            }
            if (null == sg.field_kb) {
              sg.field_kb = new int[param0 * 2];
              if (null == jd.field_d ||
                !(jd.field_d.length >= param0)) {
                jd.field_d = new int[2 * param0];
              }
              if (qp.field_b == null ||
                !(param0 <= qp.field_b.length)) {
                qp.field_b = new int[param0 * 2];
              }
              if (null == qd.field_c ||
                !(qd.field_c.length >= param0 + param2)) {
                qd.field_c = new int[(param0 + param2) * 2];
              }
              if (ip.field_q == null ||
                !(param0 <= ip.field_q.length)) {
                ip.field_q = new boolean[2 * param0];
              }
            } else {
              if (param0 > sg.field_kb.length) {
                sg.field_kb = new int[param0 * 2];
                if (null == jd.field_d ||
                  !(jd.field_d.length >= param0)) {
                  jd.field_d = new int[2 * param0];
                }
                if (qp.field_b == null ||
                  !(param0 <= qp.field_b.length)) {
                  qp.field_b = new int[param0 * 2];
                }
                if (null == qd.field_c ||
                  !(qd.field_c.length >= param0 + param2)) {
                  qd.field_c = new int[(param0 + param2) * 2];
                }
                if (ip.field_q == null ||
                  !(param0 <= ip.field_q.length)) {
                  ip.field_q = new boolean[2 * param0];
                }
              } else {
                if (null == jd.field_d) {
                  jd.field_d = new int[2 * param0];
                  if (qp.field_b == null ||
                    !(param0 <= qp.field_b.length)) {
                    qp.field_b = new int[param0 * 2];
                  }
                  if (null == qd.field_c ||
                    !(qd.field_c.length >= param0 + param2)) {
                    qd.field_c = new int[(param0 + param2) * 2];
                  }
                  if (ip.field_q == null ||
                    !(param0 <= ip.field_q.length)) {
                    ip.field_q = new boolean[2 * param0];
                  }
                } else {
                  if (jd.field_d.length < param0) {
                    jd.field_d = new int[2 * param0];
                    if (qp.field_b == null ||
                      !(param0 <= qp.field_b.length)) {
                      qp.field_b = new int[param0 * 2];
                    }
                    if (null == qd.field_c ||
                      !(qd.field_c.length >= param0 + param2)) {
                      qd.field_c = new int[(param0 + param2) * 2];
                    }
                    if (ip.field_q == null ||
                      !(param0 <= ip.field_q.length)) {
                      ip.field_q = new boolean[2 * param0];
                    }
                  } else {
                    if (qp.field_b == null ||
                      !(param0 <= qp.field_b.length)) {
                      qp.field_b = new int[param0 * 2];
                    }
                    if (null == qd.field_c ||
                      !(qd.field_c.length >= param0 + param2)) {
                      qd.field_c = new int[(param0 + param2) * 2];
                    }
                    if (ip.field_q == null) {
                      ip.field_q = new boolean[2 * param0];
                    } else {
                      if (param0 > ip.field_q.length) {
                        ip.field_q = new boolean[2 * param0];
                      }
                    }
                  }
                }
              }
            }
          } else {
            if (qo.field_r == null ||
              !(qo.field_r.length >= param0)) {
              qo.field_r = new int[2 * param0];
            }
            if (null == sg.field_kb) {
              sg.field_kb = new int[param0 * 2];
              if (null == jd.field_d ||
                !(jd.field_d.length >= param0)) {
                jd.field_d = new int[2 * param0];
              }
              if (qp.field_b == null ||
                !(param0 <= qp.field_b.length)) {
                qp.field_b = new int[param0 * 2];
              }
              if (null == qd.field_c ||
                !(qd.field_c.length >= param0 + param2)) {
                qd.field_c = new int[(param0 + param2) * 2];
              }
              if (ip.field_q == null) {
                ip.field_q = new boolean[2 * param0];
              } else {
                if (param0 > ip.field_q.length) {
                  ip.field_q = new boolean[2 * param0];
                }
              }
            } else {
              if (param0 > sg.field_kb.length) {
                sg.field_kb = new int[param0 * 2];
                if (null == jd.field_d ||
                  !(jd.field_d.length >= param0)) {
                  jd.field_d = new int[2 * param0];
                }
                if (qp.field_b == null ||
                  !(param0 <= qp.field_b.length)) {
                  qp.field_b = new int[param0 * 2];
                }
                if (null == qd.field_c ||
                  !(qd.field_c.length >= param0 + param2)) {
                  qd.field_c = new int[(param0 + param2) * 2];
                }
                if (ip.field_q == null ||
                  !(param0 <= ip.field_q.length)) {
                  ip.field_q = new boolean[2 * param0];
                }
              } else {
                if (null == jd.field_d) {
                  jd.field_d = new int[2 * param0];
                  if (qp.field_b == null ||
                    !(param0 <= qp.field_b.length)) {
                    qp.field_b = new int[param0 * 2];
                  }
                  if (null == qd.field_c ||
                    !(qd.field_c.length >= param0 + param2)) {
                    qd.field_c = new int[(param0 + param2) * 2];
                  }
                } else {
                  if (jd.field_d.length >= param0) {
                    if (qp.field_b == null ||
                      !(param0 <= qp.field_b.length)) {
                      qp.field_b = new int[param0 * 2];
                    }
                    if (null == qd.field_c ||
                      !(qd.field_c.length >= param0 + param2)) {
                      qd.field_c = new int[(param0 + param2) * 2];
                    }
                  } else {
                    jd.field_d = new int[2 * param0];
                    if (qp.field_b == null ||
                      !(param0 <= qp.field_b.length)) {
                      qp.field_b = new int[param0 * 2];
                    }
                    if (null == qd.field_c ||
                      !(qd.field_c.length >= param0 + param2)) {
                      qd.field_c = new int[(param0 + param2) * 2];
                    }
                  }
                }
                if (ip.field_q == null) {
                  ip.field_q = new boolean[2 * param0];
                } else {
                  if (param0 > ip.field_q.length) {
                    ip.field_q = new boolean[2 * param0];
                  }
                }
              }
            }
          }
        }
        ub.field_d = -2147483648;
        if (!param1) {
          field_a = (vn[]) null;
        }
        qn.field_e = 0;
        fe.field_O = 2147483647;
        sg.field_pb = 2147483647;
        me.field_Db = -2147483648;
    }

    public static void a(int param0) {
        int var1 = -81 / ((param0 - 37) / 47);
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static String a(int param0, long param1) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ni.field_d.setTime(new Date(param1));
        int var3 = ni.field_d.get(7);
        int var4 = ni.field_d.get(5);
        int var5 = ni.field_d.get(2);
        if (param0 == 2147483647) {
          var6 = ni.field_d.get(1);
          var7 = ni.field_d.get(11);
          var8 = ni.field_d.get(12);
          var9 = ni.field_d.get(13);
          return cn.field_e[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ln.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    final static void a(int param0, java.awt.Frame param1, ec param2) {
        int var3_int = 0;
        op var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawn.field_J;
        try {
          var3_int = -100 % ((62 - param0) / 39);
          while (true) {
            var4 = param2.a(param1, (byte) 52);
            while (var4.field_f == 0) {
              ld.a(10L, (byte) 115);
            }
            if (var4.field_f != 1) {
              ld.a(100L, (byte) 70);
              continue;
            }
            break;
          }
          param1.setVisible(false);
          param1.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("jb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String a(byte param0) {
        if (2 > ld.field_j) {
          return ki.field_V;
        }
        if (f.field_i != null) {
          if (!f.field_i.a((byte) 73)) {
            return cj.field_e;
          }
          return l.field_g;
        }
        if (!vo.field_d.a((byte) 73)) {
          return nb.field_o;
        }
        if (!vo.field_d.a(-1, "commonui")) {
          return el.field_m + " - " + vo.field_d.b("commonui", 88) + "%";
        }
        if (param0 >= -49) {
          return (String) null;
        }
        if (!da.field_l.a((byte) 73)) {
          return nd.field_d;
        }
        if (!da.field_l.a(-1, "commonui")) {
          return ba.field_e + " - " + da.field_l.b("commonui", 86) + "%";
        }
        if (!al.field_a.a((byte) 73)) {
          return ad.field_o;
        }
        if (!al.field_a.c(9001)) {
          return lo.field_p + " - " + al.field_a.e(-94) + "%";
        }
        return jh.field_l;
    }

    final static boolean a(byte param0, char param1) {
        if (param0 == 27) {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (c.a(param1, 441)) {
            return true;
          }
          if (param1 != 45 &&
            160 != param1 &&
            param1 != 32 &&
            param1 != 95) {
            return false;
          }
          return true;
        }
        jb.a(-97);
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (c.a(param1, 441)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 != 32 &&
          param1 != 95) {
          return false;
        }
        return true;
    }

    static {
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = new vo();
        field_c = "Continue";
    }
}
