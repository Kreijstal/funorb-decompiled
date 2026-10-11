/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iw {
    static sna field_a;
    static ee[] field_b;

    final static void a(int param0, boolean param1, po param2, po param3) {
        wfa.field_s = param0;
        fp.field_f = param2;
        jk.field_o = param3;
        if (param1) {
          return;
        }
        try {
          iea.a(dg.field_c / 2, dg.field_i / 2, (byte) -98);
          mja.a(param3.field_v, param2.field_v, 3, param3.field_B + param3.field_v, param2.field_v + param2.field_B);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iw.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 != -10410) {
          return;
        }
        if (un.field_a == null ||
          !(param2 <= un.field_a.length)) {
          un.field_a = new int[2 * param2];
        }
        if (gk.field_a == null) {
          gk.field_a = new int[2 * param2];
          if (mba.field_a == null ||
            !(param2 <= mba.field_a.length)) {
            mba.field_a = new int[param2 * 2];
          }
          if (null == sc.field_o ||
            !(sc.field_o.length >= param2)) {
            sc.field_o = new int[2 * param2];
          }
          if (uda.field_X == null) {
            uda.field_X = new int[2 * param2];
            if (uc.field_k == null ||
              !(uc.field_k.length >= param2)) {
              uc.field_k = new int[param2 * 2];
            }
            if (fn.field_k == null ||
              !(param0 + param2 <= fn.field_k.length)) {
              fn.field_k = new int[(param0 + param2) * 2];
            }
            if (null == sr.field_c ||
              !(sr.field_c.length >= param2)) {
              sr.field_c = new boolean[param2 * 2];
            }
          } else {
            if (param2 > uda.field_X.length) {
              uda.field_X = new int[2 * param2];
              if (uc.field_k == null ||
                !(uc.field_k.length >= param2)) {
                uc.field_k = new int[param2 * 2];
              }
              if (fn.field_k == null ||
                !(param0 + param2 <= fn.field_k.length)) {
                fn.field_k = new int[(param0 + param2) * 2];
              }
              if (null == sr.field_c ||
                !(sr.field_c.length >= param2)) {
                sr.field_c = new boolean[param2 * 2];
              }
            } else {
              if (uc.field_k == null) {
                uc.field_k = new int[param2 * 2];
                if (fn.field_k == null ||
                  !(param0 + param2 <= fn.field_k.length)) {
                  fn.field_k = new int[(param0 + param2) * 2];
                }
                if (null == sr.field_c ||
                  !(sr.field_c.length >= param2)) {
                  sr.field_c = new boolean[param2 * 2];
                }
              } else {
                if (uc.field_k.length < param2) {
                  uc.field_k = new int[param2 * 2];
                  if (fn.field_k == null ||
                    !(param0 + param2 <= fn.field_k.length)) {
                    fn.field_k = new int[(param0 + param2) * 2];
                  }
                  if (null == sr.field_c ||
                    !(sr.field_c.length >= param2)) {
                    sr.field_c = new boolean[param2 * 2];
                  }
                } else {
                  if (fn.field_k == null) {
                    fn.field_k = new int[(param0 + param2) * 2];
                    if (null == sr.field_c ||
                      !(sr.field_c.length >= param2)) {
                      sr.field_c = new boolean[param2 * 2];
                    }
                  } else {
                    if (param0 + param2 <= fn.field_k.length) {
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    } else {
                      fn.field_k = new int[(param0 + param2) * 2];
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          if (gk.field_a.length >= param2) {
            if (mba.field_a == null ||
              !(param2 <= mba.field_a.length)) {
              mba.field_a = new int[param2 * 2];
            }
            if (null == sc.field_o ||
              !(sc.field_o.length >= param2)) {
              sc.field_o = new int[2 * param2];
            }
            if (uda.field_X == null) {
              uda.field_X = new int[2 * param2];
              if (uc.field_k == null ||
                !(uc.field_k.length >= param2)) {
                uc.field_k = new int[param2 * 2];
              }
              if (fn.field_k == null ||
                !(param0 + param2 <= fn.field_k.length)) {
                fn.field_k = new int[(param0 + param2) * 2];
              }
              if (null == sr.field_c ||
                !(sr.field_c.length >= param2)) {
                sr.field_c = new boolean[param2 * 2];
              }
            } else {
              if (param2 > uda.field_X.length) {
                uda.field_X = new int[2 * param2];
                if (uc.field_k == null ||
                  !(uc.field_k.length >= param2)) {
                  uc.field_k = new int[param2 * 2];
                }
                if (fn.field_k == null ||
                  !(param0 + param2 <= fn.field_k.length)) {
                  fn.field_k = new int[(param0 + param2) * 2];
                }
                if (null == sr.field_c ||
                  !(sr.field_c.length >= param2)) {
                  sr.field_c = new boolean[param2 * 2];
                }
              } else {
                if (uc.field_k == null) {
                  uc.field_k = new int[param2 * 2];
                  if (fn.field_k == null ||
                    !(param0 + param2 <= fn.field_k.length)) {
                    fn.field_k = new int[(param0 + param2) * 2];
                  }
                  if (null == sr.field_c ||
                    !(sr.field_c.length >= param2)) {
                    sr.field_c = new boolean[param2 * 2];
                  }
                } else {
                  if (uc.field_k.length < param2) {
                    uc.field_k = new int[param2 * 2];
                    if (fn.field_k == null ||
                      !(param0 + param2 <= fn.field_k.length)) {
                      fn.field_k = new int[(param0 + param2) * 2];
                    }
                    if (null == sr.field_c ||
                      !(sr.field_c.length >= param2)) {
                      sr.field_c = new boolean[param2 * 2];
                    }
                  } else {
                    if (fn.field_k == null) {
                      fn.field_k = new int[(param0 + param2) * 2];
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    } else {
                      if (param0 + param2 <= fn.field_k.length) {
                        if (null == sr.field_c ||
                          !(sr.field_c.length >= param2)) {
                          sr.field_c = new boolean[param2 * 2];
                        }
                      } else {
                        fn.field_k = new int[(param0 + param2) * 2];
                        if (null == sr.field_c ||
                          !(sr.field_c.length >= param2)) {
                          sr.field_c = new boolean[param2 * 2];
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            gk.field_a = new int[2 * param2];
            if (mba.field_a == null ||
              !(param2 <= mba.field_a.length)) {
              mba.field_a = new int[param2 * 2];
            }
            if (null == sc.field_o ||
              !(sc.field_o.length >= param2)) {
              sc.field_o = new int[2 * param2];
            }
            if (uda.field_X == null) {
              uda.field_X = new int[2 * param2];
              if (uc.field_k == null ||
                !(uc.field_k.length >= param2)) {
                uc.field_k = new int[param2 * 2];
              }
              if (fn.field_k == null) {
                fn.field_k = new int[(param0 + param2) * 2];
                if (null == sr.field_c ||
                  !(sr.field_c.length >= param2)) {
                  sr.field_c = new boolean[param2 * 2];
                }
              } else {
                if (param0 + param2 <= fn.field_k.length) {
                  if (null == sr.field_c ||
                    !(sr.field_c.length >= param2)) {
                    sr.field_c = new boolean[param2 * 2];
                  }
                } else {
                  fn.field_k = new int[(param0 + param2) * 2];
                  if (null == sr.field_c ||
                    !(sr.field_c.length >= param2)) {
                    sr.field_c = new boolean[param2 * 2];
                  }
                }
              }
            } else {
              if (param2 > uda.field_X.length) {
                uda.field_X = new int[2 * param2];
                if (uc.field_k == null ||
                  !(uc.field_k.length >= param2)) {
                  uc.field_k = new int[param2 * 2];
                }
                if (fn.field_k == null ||
                  !(param0 + param2 <= fn.field_k.length)) {
                  fn.field_k = new int[(param0 + param2) * 2];
                }
                if (null == sr.field_c ||
                  !(sr.field_c.length >= param2)) {
                  sr.field_c = new boolean[param2 * 2];
                }
              } else {
                if (uc.field_k == null) {
                  uc.field_k = new int[param2 * 2];
                  if (fn.field_k == null) {
                    fn.field_k = new int[(param0 + param2) * 2];
                    if (null == sr.field_c ||
                      !(sr.field_c.length >= param2)) {
                      sr.field_c = new boolean[param2 * 2];
                    }
                  } else {
                    if (param0 + param2 <= fn.field_k.length) {
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    } else {
                      fn.field_k = new int[(param0 + param2) * 2];
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    }
                  }
                } else {
                  if (uc.field_k.length >= param2) {
                    if (fn.field_k == null) {
                      fn.field_k = new int[(param0 + param2) * 2];
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    } else {
                      if (param0 + param2 <= fn.field_k.length) {
                        if (null == sr.field_c ||
                          !(sr.field_c.length >= param2)) {
                          sr.field_c = new boolean[param2 * 2];
                        }
                      } else {
                        fn.field_k = new int[(param0 + param2) * 2];
                        if (null == sr.field_c ||
                          !(sr.field_c.length >= param2)) {
                          sr.field_c = new boolean[param2 * 2];
                        }
                      }
                    }
                  } else {
                    uc.field_k = new int[param2 * 2];
                    if (fn.field_k == null) {
                      fn.field_k = new int[(param0 + param2) * 2];
                      if (null == sr.field_c ||
                        !(sr.field_c.length >= param2)) {
                        sr.field_c = new boolean[param2 * 2];
                      }
                    } else {
                      if (param0 + param2 <= fn.field_k.length) {
                        if (null == sr.field_c ||
                          !(sr.field_c.length >= param2)) {
                          sr.field_c = new boolean[param2 * 2];
                        }
                      } else {
                        fn.field_k = new int[(param0 + param2) * 2];
                        if (null == sr.field_c ||
                          !(sr.field_c.length >= param2)) {
                          sr.field_c = new boolean[param2 * 2];
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        ut.field_l = 0;
        wt.field_u = -2147483648;
        af.field_c = -2147483648;
        waa.field_a = 2147483647;
        mt.field_r = 2147483647;
    }

    final static void a(int param0, byte param1) {
        if (param1 < -8) {
          on.field_t = param0;
          kw.field_k = new gs[15 * param0];
          oma.field_a = new int[3];
          qs.field_n = 0;
          return;
        }
        field_a = (sna) null;
        on.field_t = param0;
        kw.field_k = new gs[15 * param0];
        oma.field_a = new int[3];
        qs.field_n = 0;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 >= -101) {
          return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 2047) {
          field_b = (ee[]) null;
          return jb.field_p[2047 & param0];
        }
        return jb.field_p[2047 & param0];
    }

    static {
    }
}
