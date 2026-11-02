/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static sk field_a;
    static Sprite field_g;
    private long field_d;
    private DualLinkNode field_e;
    private DualLinkNode[] field_f;
    private int field_b;
    static boolean field_c;
    static qe field_h;

    final static void a(boolean param0, boolean param1, byte param2) {
        qe var4 = null;
        qe var4Lifetime1;
        if (!param1) {
          ki.b();
          wa.a(true, param1);
          if (param2 <= 83) {
            var4 = (qe) null;
            ai.a(-76, (Sprite[]) null, 116, -1, (Sprite[]) null, 61, (qe) null, 62, (qe) null, 22, -36, -35, -61, -45);
            return;
          }
          return;
        }
        ki.b(0, 0, ki.field_j, ki.field_f, 0, 192);
        wa.a(true, param1);
        if (param2 <= 83) {
          var4Lifetime1 = (qe) null;
          ai.a(-76, (Sprite[]) null, 116, -1, (Sprite[]) null, 61, (qe) null, 62, (qe) null, 22, -36, -35, -61, -45);
          return;
        }
    }

    final DualLinkNode b(int param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        var4 = StarCannon.field_A;
        if (this.field_e == null) {
          return null;
        }
        var2 = this.field_f[(int)((long)(this.field_b - param0) & this.field_d)];
        while (true) {
          if (var2 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (this.field_e.field_j != this.field_d) {
            this.field_e = this.field_e.secondaryNext;
            continue;
          }
          break;
        }
        var3 = this.field_e;
        this.field_e = this.field_e.secondaryNext;
        return var3;
    }

    final static boolean a(byte param0) {
        int var1 = 99 % ((41 - param0) / 50);
        if (10 > bl.field_a) {
          return false;
        }
        if (IntrusiveDeque.field_d >= 13) {
          return true;
        }
        return false;
    }

    final static i a(ue param0, String param1, boolean param2, String param3, ue param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ue stackIn_2_0 = null;
        String stackIn_2_1 = null;
        boolean stackIn_3_2 = false;
        i stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (ue) (param0);
          stackIn_2_1 = (String) (param1);
          stackIn_3_2 = !(param2);
          var5_int = ((ue) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_3_2);
          var6 = param0.a(param3, param2, var5_int);
          stackIn_4_0 = ue.a(param4, (byte) -114, var6, var5_int, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("ai.H(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, Sprite[] param1, int param2, int param3, Sprite[] param4, int param5, qe param6, int param7, qe param8, int param9, int param10, int param11, int param12, int param13) {
        try {
          SecondaryNodeDequeIterator.a(123);
          if (param12 != 25574) {
            ai.a(-124);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ai.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    final DualLinkNode a(long param0, int param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = StarCannon.field_A;
        this.field_d = param0;
        if (param1 > 8) {
          var4 = this.field_f[(int)((long)(this.field_b - 1) & param0)];
          this.field_e = var4.secondaryNext;
          while (true) {
            if (var4 == this.field_e) {
              this.field_e = null;
              return null;
            }
            if (param0 != this.field_e.field_j) {
              this.field_e = this.field_e.secondaryNext;
              continue;
            }
            break;
          }
          var5 = this.field_e;
          this.field_e = this.field_e.secondaryNext;
          return var5;
        }
        this.a(-91L, 63);
        var4Lifetime1 = this.field_f[(int)((long)(this.field_b - 1) & param0)];
        this.field_e = var4Lifetime1.secondaryNext;
        while (true) {
          if (var4Lifetime1 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (param0 != this.field_e.field_j) {
            this.field_e = this.field_e.secondaryNext;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_e;
        this.field_e = this.field_e.secondaryNext;
        return var5Lifetime1;
    }

    final static void a(int param0, boolean param1, int param2) {
        if (null == oh.field_c) {
          oh.field_c = new int[param2 * 2];
          if (null == tk.field_f ||
            !(tk.field_f.length >= param2)) {
            tk.field_f = new int[param2 * 2];
          }
          if (nf.field_b == null ||
            !(param2 <= nf.field_b.length)) {
            nf.field_b = new int[param2 * 2];
          }
          if (null == gj.field_f ||
            !(param2 <= gj.field_f.length)) {
            gj.field_f = new int[2 * param2];
          }
          if (ab.field_G == null) {
            ab.field_G = new int[2 * param2];
            if (null == fg.field_b ||
              !(fg.field_b.length >= param2)) {
              fg.field_b = new int[2 * param2];
            }
            if (param1) {
              field_g = (Sprite) null;
            }
            if (null == jk.field_c ||
              !(jk.field_c.length >= param0 + param2)) {
              jk.field_c = new int[2 * (param2 + param0)];
            }
            if (le.field_d == null ||
              !(le.field_d.length >= param2)) {
              le.field_d = new boolean[2 * param2];
            }
          } else {
            if (param2 > ab.field_G.length) {
              ab.field_G = new int[2 * param2];
              if (null == fg.field_b ||
                !(fg.field_b.length >= param2)) {
                fg.field_b = new int[2 * param2];
              }
              if (param1) {
                field_g = (Sprite) null;
              }
              if (null == jk.field_c ||
                !(jk.field_c.length >= param0 + param2)) {
                jk.field_c = new int[2 * (param2 + param0)];
              }
              if (le.field_d == null ||
                !(le.field_d.length >= param2)) {
                le.field_d = new boolean[2 * param2];
              }
            } else {
              if (null == fg.field_b ||
                !(fg.field_b.length >= param2)) {
                fg.field_b = new int[2 * param2];
              }
              if (param1) {
                field_g = (Sprite) null;
                if (null == jk.field_c ||
                  !(jk.field_c.length >= param0 + param2)) {
                  jk.field_c = new int[2 * (param2 + param0)];
                }
                if (le.field_d == null ||
                  !(le.field_d.length >= param2)) {
                  le.field_d = new boolean[2 * param2];
                }
              } else {
                if (null == jk.field_c) {
                  jk.field_c = new int[2 * (param2 + param0)];
                  if (le.field_d == null ||
                    !(le.field_d.length >= param2)) {
                    le.field_d = new boolean[2 * param2];
                  }
                } else {
                  if (jk.field_c.length < param0 + param2) {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (le.field_d == null ||
                      !(le.field_d.length >= param2)) {
                      le.field_d = new boolean[2 * param2];
                    }
                  } else {
                    if (le.field_d == null) {
                      le.field_d = new boolean[2 * param2];
                    } else {
                      if (le.field_d.length < param2) {
                        le.field_d = new boolean[2 * param2];
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          if (oh.field_c.length >= param2) {
            if (null == tk.field_f ||
              !(tk.field_f.length >= param2)) {
              tk.field_f = new int[param2 * 2];
            }
            if (nf.field_b == null ||
              !(param2 <= nf.field_b.length)) {
              nf.field_b = new int[param2 * 2];
            }
            if (null == gj.field_f ||
              !(param2 <= gj.field_f.length)) {
              gj.field_f = new int[2 * param2];
            }
            if (ab.field_G == null) {
              ab.field_G = new int[2 * param2];
              if (null == fg.field_b ||
                !(fg.field_b.length >= param2)) {
                fg.field_b = new int[2 * param2];
              }
              if (param1) {
                field_g = (Sprite) null;
              }
              if (null == jk.field_c ||
                !(jk.field_c.length >= param0 + param2)) {
                jk.field_c = new int[2 * (param2 + param0)];
              }
              if (le.field_d == null ||
                !(le.field_d.length >= param2)) {
                le.field_d = new boolean[2 * param2];
              }
            } else {
              if (param2 > ab.field_G.length) {
                ab.field_G = new int[2 * param2];
                if (null == fg.field_b ||
                  !(fg.field_b.length >= param2)) {
                  fg.field_b = new int[2 * param2];
                }
                if (param1) {
                  field_g = (Sprite) null;
                }
                if (null == jk.field_c ||
                  !(jk.field_c.length >= param0 + param2)) {
                  jk.field_c = new int[2 * (param2 + param0)];
                }
                if (le.field_d == null ||
                  !(le.field_d.length >= param2)) {
                  le.field_d = new boolean[2 * param2];
                }
              } else {
                if (null == fg.field_b ||
                  !(fg.field_b.length >= param2)) {
                  fg.field_b = new int[2 * param2];
                }
                if (param1) {
                  field_g = (Sprite) null;
                  if (null == jk.field_c ||
                    !(jk.field_c.length >= param0 + param2)) {
                    jk.field_c = new int[2 * (param2 + param0)];
                  }
                  if (le.field_d == null ||
                    !(le.field_d.length >= param2)) {
                    le.field_d = new boolean[2 * param2];
                  }
                } else {
                  if (null == jk.field_c) {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (le.field_d == null ||
                      !(le.field_d.length >= param2)) {
                      le.field_d = new boolean[2 * param2];
                    }
                  } else {
                    if (jk.field_c.length < param0 + param2) {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (le.field_d == null ||
                        !(le.field_d.length >= param2)) {
                        le.field_d = new boolean[2 * param2];
                      }
                    } else {
                      if (le.field_d == null) {
                        le.field_d = new boolean[2 * param2];
                      } else {
                        if (le.field_d.length < param2) {
                          le.field_d = new boolean[2 * param2];
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            oh.field_c = new int[param2 * 2];
            if (null == tk.field_f ||
              !(tk.field_f.length >= param2)) {
              tk.field_f = new int[param2 * 2];
            }
            if (nf.field_b == null ||
              !(param2 <= nf.field_b.length)) {
              nf.field_b = new int[param2 * 2];
            }
            if (null == gj.field_f ||
              !(param2 <= gj.field_f.length)) {
              gj.field_f = new int[2 * param2];
            }
            if (ab.field_G == null) {
              ab.field_G = new int[2 * param2];
              if (null == fg.field_b ||
                !(fg.field_b.length >= param2)) {
                fg.field_b = new int[2 * param2];
              }
              if (param1) {
                field_g = (Sprite) null;
              }
              if (null == jk.field_c ||
                !(jk.field_c.length >= param0 + param2)) {
                jk.field_c = new int[2 * (param2 + param0)];
              }
              if (le.field_d == null) {
                le.field_d = new boolean[2 * param2];
              } else {
                if (le.field_d.length < param2) {
                  le.field_d = new boolean[2 * param2];
                }
              }
            } else {
              if (param2 > ab.field_G.length) {
                ab.field_G = new int[2 * param2];
                if (null == fg.field_b ||
                  !(fg.field_b.length >= param2)) {
                  fg.field_b = new int[2 * param2];
                }
                if (param1) {
                  field_g = (Sprite) null;
                }
                if (null == jk.field_c ||
                  !(jk.field_c.length >= param0 + param2)) {
                  jk.field_c = new int[2 * (param2 + param0)];
                }
                if (le.field_d == null ||
                  !(le.field_d.length >= param2)) {
                  le.field_d = new boolean[2 * param2];
                }
              } else {
                if (null == fg.field_b ||
                  !(fg.field_b.length >= param2)) {
                  fg.field_b = new int[2 * param2];
                }
                if (param1) {
                  field_g = (Sprite) null;
                  if (null == jk.field_c) {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (le.field_d == null ||
                      !(le.field_d.length >= param2)) {
                      le.field_d = new boolean[2 * param2];
                    }
                  } else {
                    if (jk.field_c.length < param0 + param2) {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (le.field_d == null ||
                        !(le.field_d.length >= param2)) {
                        le.field_d = new boolean[2 * param2];
                      }
                    } else {
                      if (le.field_d == null) {
                        le.field_d = new boolean[2 * param2];
                      } else {
                        if (le.field_d.length < param2) {
                          le.field_d = new boolean[2 * param2];
                        }
                      }
                    }
                  }
                } else {
                  if (null == jk.field_c) {
                    jk.field_c = new int[2 * (param2 + param0)];
                  } else {
                    if (jk.field_c.length < param0 + param2) {
                      jk.field_c = new int[2 * (param2 + param0)];
                    }
                  }
                  if (le.field_d == null) {
                    le.field_d = new boolean[2 * param2];
                  } else {
                    if (le.field_d.length < param2) {
                      le.field_d = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        }
        lh.field_s = -2147483648;
        t.field_u = 2147483647;
        ed.field_p = 0;
        og.field_b = 2147483647;
        mh.field_j = -2147483648;
    }

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        if (param0 != 0) {
          field_h = (qe) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    final void a(int param0, long param1, DualLinkNode param2) {
        DualLinkNode var5 = null;
        try {
          if (param2.secondaryPrevious != null) {
            param2.a(-6242);
          }
          var5 = this.field_f[(int)((long)(-1 + this.field_b) & param1)];
          param2.secondaryNext = var5;
          param2.secondaryPrevious = var5.secondaryPrevious;
          if (param0 != 2) {
            ai.a((byte) -112);
          }
          param2.secondaryPrevious.secondaryNext = param2;
          param2.field_j = param1;
          param2.secondaryNext.secondaryPrevious = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ai.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    ai(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.field_b = param0;
        this.field_f = new DualLinkNode[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.field_f[var2] = dupTemp$0;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_c = true;
        field_a = new sk();
    }
}
