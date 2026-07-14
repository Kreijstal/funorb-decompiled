/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uk extends q {
    static int[] field_i;
    private boolean field_n;
    static float field_j;
    static int field_o;
    static String field_p;
    static dm field_m;
    static String[] field_l;
    private String field_k;

    final void c(byte param0) {
        ((uk) this).field_k = null;
        if (param0 > -78) {
            field_j = -0.8683637976646423f;
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        param1 = qj.a(param1, "", '_', (byte) 119);
        var3 = bj.a(105, param2);
        if (param0 == 8) {
          if (0 == param1.indexOf(param2)) {
            if (0 != param1.indexOf(var3)) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_i = null;
          if (0 != param1.indexOf(param2)) {
            return true;
          } else {
            L0: {
              if (0 == param1.indexOf(var3)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static String a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Geoblox.field_C;
        if (param1 == 24146) {
          var2 = param0;
          if (-1 != var2) {
            if (var2 != 1) {
              if (-3 != var2) {
                if (var2 != 3) {
                  if (var2 != 5) {
                    return null;
                  } else {
                    return qh.field_S;
                  }
                } else {
                  return li.field_b;
                }
              } else {
                return vd.field_e;
              }
            } else {
              return oi.field_d;
            }
          } else {
            return vh.field_E;
          }
        } else {
          field_m = null;
          var2 = param0;
          if (-1 != var2) {
            if (var2 != 1) {
              if (-3 != var2) {
                if (var2 != 3) {
                  if (var2 != 5) {
                    return null;
                  } else {
                    return qh.field_S;
                  }
                } else {
                  return li.field_b;
                }
              } else {
                return vd.field_e;
              }
            } else {
              return oi.field_d;
            }
          } else {
            return vh.field_E;
          }
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        int var3 = 0;
        byte[] var4 = null;
        oj var5 = null;
        if (param2 != null) {
          var3 = -35 % ((44 - param1) / 57);
          if (param2 instanceof byte[]) {
            var4 = (byte[]) param2;
            if (param0) {
              return nk.a(var4, 0);
            } else {
              return var4;
            }
          } else {
            if (param2 instanceof oj) {
              var5 = (oj) param2;
              return var5.a((byte) 65);
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, boolean param2, df param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        hl.field_D[0] = bh.field_d.nextInt();
        hl.field_D[1] = bh.field_d.nextInt();
        hl.field_D[2] = (int)(ak.field_a >> -752938848);
        hl.field_D[3] = (int)ak.field_a;
        fc.field_d.field_f = 0;
        fc.field_d.c((byte) 95, hl.field_D[0]);
        fc.field_d.c((byte) 95, hl.field_D[1]);
        fc.field_d.c((byte) 95, hl.field_D[2]);
        fc.field_d.c((byte) 95, hl.field_D[3]);
        wh.a(fc.field_d, true);
        fc.field_d.e(param1, 28695);
        param3.a(124, fc.field_d);
        fj.field_q.field_f = 0;
        if (param2) {
          fj.field_q.d((byte) 121, 18);
          fj.field_q.field_f = fj.field_q.field_f + 2;
          var5 = fj.field_q.field_f;
          fj.field_q.c((byte) 95, f.field_ib);
          fj.field_q.b((byte) 116, lb.field_c);
          var6 = 0;
          if (param0 <= 20) {
            return;
          } else {
            L0: {
              if (!rb.field_c) {
                break L0;
              } else {
                var6 = var6 | 1;
                break L0;
              }
            }
            L1: {
              if (ll.field_e) {
                var6 = var6 | 4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param4) {
                break L2;
              } else {
                var6 = var6 | 8;
                break L2;
              }
            }
            L3: {
              if (null != fl.field_b) {
                var6 = var6 | 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              fj.field_q.d((byte) 127, var6);
              var7 = s.a(-1, k.c(111));
              if (var7 == null) {
                var7 = "";
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              fj.field_q.a(var7, 0);
              if (null != fl.field_b) {
                fj.field_q.a(fl.field_b, (byte) -126);
                break L5;
              } else {
                break L5;
              }
            }
            el.a(false, fc.field_d, (qc) (Object) fj.field_q, ld.field_c, vl.field_l);
            fj.field_q.a(-var5 + fj.field_q.field_f, true);
            cm.a(-1, -1);
            return;
          }
        } else {
          fj.field_q.d((byte) -116, 16);
          fj.field_q.field_f = fj.field_q.field_f + 2;
          var5 = fj.field_q.field_f;
          fj.field_q.c((byte) 95, f.field_ib);
          fj.field_q.b((byte) 116, lb.field_c);
          var6 = 0;
          if (param0 <= 20) {
            return;
          } else {
            L6: {
              if (!rb.field_c) {
                break L6;
              } else {
                var6 = var6 | 1;
                break L6;
              }
            }
            L7: {
              if (ll.field_e) {
                var6 = var6 | 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (!param4) {
                break L8;
              } else {
                var6 = var6 | 8;
                break L8;
              }
            }
            L9: {
              if (null != fl.field_b) {
                var6 = var6 | 16;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              fj.field_q.d((byte) 127, var6);
              var7 = s.a(-1, k.c(111));
              if (var7 == null) {
                var7 = "";
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              fj.field_q.a(var7, 0);
              if (null != fl.field_b) {
                fj.field_q.a(fl.field_b, (byte) -126);
                break L11;
              } else {
                break L11;
              }
            }
            el.a(false, fc.field_d, (qc) (Object) fj.field_q, ld.field_c, vl.field_l);
            fj.field_q.a(-var5 + fj.field_q.field_f, true);
            cm.a(-1, -1);
            return;
          }
        }
    }

    final String b(int param0, String param1) {
        String var3 = null;
        sl var4 = null;
        CharSequence var5 = null;
        var5 = (CharSequence) (Object) param1;
        var3 = oe.a((byte) 44, var5);
        if (var3 == null) {
          L0: {
            if (param1.equals((Object) (Object) ((uk) this).field_k)) {
              break L0;
            } else {
              var4 = cl.a((byte) 94, param1);
              if (var4 != null) {
                if (null == var4.field_e) {
                  ((uk) this).field_k = param1;
                  ((uk) this).field_n = var4.field_g;
                  break L0;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
          }
          if (param0 == 422) {
            if (!((uk) this).field_n) {
              return rh.field_j;
            } else {
              return ph.field_j;
            }
          } else {
            field_j = -0.46423107385635376f;
            if (!((uk) this).field_n) {
              return rh.field_j;
            } else {
              return ph.field_j;
            }
          }
        } else {
          return var3;
        }
    }

    uk(dj param0) {
        super(param0);
        ((uk) this).field_n = false;
    }

    final lh a(int param0, String param1) {
        sl var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        lh stackIn_7_0 = null;
        lh stackIn_14_0 = null;
        lh stackIn_23_0 = null;
        lh stackIn_30_0 = null;
        lh stackOut_29_0 = null;
        lh stackOut_28_0 = null;
        lh stackOut_22_0 = null;
        lh stackOut_21_0 = null;
        lh stackOut_13_0 = null;
        lh stackOut_12_0 = null;
        lh stackOut_6_0 = null;
        lh stackOut_5_0 = null;
        if (param0 == -257) {
          var6 = (CharSequence) (Object) param1;
          if (hc.a((byte) 82, var6)) {
            if (!param1.equals((Object) (Object) ((uk) this).field_k)) {
              var3 = cl.a((byte) 108, param1);
              if (var3 != null) {
                if (var3.field_e != null) {
                  return si.field_n;
                } else {
                  L0: {
                    ((uk) this).field_n = var3.field_g;
                    ((uk) this).field_k = param1;
                    if (((uk) this).field_n) {
                      stackOut_29_0 = kk.field_w;
                      stackIn_30_0 = stackOut_29_0;
                      break L0;
                    } else {
                      stackOut_28_0 = si.field_m;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                  return stackIn_30_0;
                }
              } else {
                return si.field_n;
              }
            } else {
              L1: {
                if (((uk) this).field_n) {
                  stackOut_22_0 = kk.field_w;
                  stackIn_23_0 = stackOut_22_0;
                  break L1;
                } else {
                  stackOut_21_0 = si.field_m;
                  stackIn_23_0 = stackOut_21_0;
                  break L1;
                }
              }
              return stackIn_23_0;
            }
          } else {
            return si.field_m;
          }
        } else {
          var4 = null;
          uk.a(false, (String) null);
          var5 = (CharSequence) (Object) param1;
          if (hc.a((byte) 82, var5)) {
            if (!param1.equals((Object) (Object) ((uk) this).field_k)) {
              var3 = cl.a((byte) 108, param1);
              if (var3 != null) {
                if (var3.field_e != null) {
                  return si.field_n;
                } else {
                  L2: {
                    ((uk) this).field_n = var3.field_g;
                    ((uk) this).field_k = param1;
                    if (((uk) this).field_n) {
                      stackOut_13_0 = kk.field_w;
                      stackIn_14_0 = stackOut_13_0;
                      break L2;
                    } else {
                      stackOut_12_0 = si.field_m;
                      stackIn_14_0 = stackOut_12_0;
                      break L2;
                    }
                  }
                  return stackIn_14_0;
                }
              } else {
                return si.field_n;
              }
            } else {
              L3: {
                if (((uk) this).field_n) {
                  stackOut_6_0 = kk.field_w;
                  stackIn_7_0 = stackOut_6_0;
                  break L3;
                } else {
                  stackOut_5_0 = si.field_m;
                  stackIn_7_0 = stackOut_5_0;
                  break L3;
                }
              }
              return stackIn_7_0;
            }
          } else {
            return si.field_m;
          }
        }
    }

    final static boolean g(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 29) {
          qg.b(9313);
          if (!fh.c(-117)) {
            if (hj.field_c) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          field_m = null;
          qg.b(9313);
          if (fh.c(-117)) {
            return true;
          } else {
            L0: {
              if (!hj.field_c) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static void a(boolean param0, String param1) {
        if (param0) {
            uk.d((byte) 81);
            v.field_e = param1;
            pc.a(12, param0);
            return;
        }
        v.field_e = param1;
        pc.a(12, param0);
    }

    public static void d(byte param0) {
        if (param0 < 70) {
          field_m = null;
          field_m = null;
          field_p = null;
          field_i = null;
          field_l = null;
          return;
        } else {
          field_m = null;
          field_p = null;
          field_i = null;
          field_l = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new int[8192];
        field_l = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
}
