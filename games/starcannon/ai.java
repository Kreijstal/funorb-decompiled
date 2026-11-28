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
    static BitmapFont field_h;

    final static void a(boolean param0, boolean param1, byte param2) {
        BitmapFont var4 = null;
        BitmapFont var4Lifetime1;
        if (!param1) {
          SoftwareRasterizer.clearRaster();
          wa.a(true, param1);
          if (param2 <= 83) {
            var4 = (BitmapFont) null;
            ai.a(-76, (Sprite[]) null, 116, -1, (Sprite[]) null, 61, (BitmapFont) null, 62, (BitmapFont) null, 22, -36, -35, -61, -45);
            return;
          }
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_f, 0, 192);
        wa.a(true, param1);
        if (param2 <= 83) {
          var4Lifetime1 = (BitmapFont) null;
          ai.a(-76, (Sprite[]) null, 116, -1, (Sprite[]) null, 61, (BitmapFont) null, 62, (BitmapFont) null, 22, -36, -35, -61, -45);
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

    final static CoverageBitmapFont a(ResourceArchive param0, String param1, boolean param2, String param3, ResourceArchive param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        ResourceArchive stackIn_2_0 = null;
        String stackIn_2_1 = null;
        boolean stackIn_3_2 = false;
        CoverageBitmapFont stackIn_4_0 = null;
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
          stackIn_2_0 = (ResourceArchive) (param0);
          stackIn_2_1 = (String) (param1);
          stackIn_3_2 = !(param2);
          var5_int = ((ResourceArchive) (Object) stackIn_2_0).getGroupIdByName(stackIn_2_1, stackIn_3_2);
          var6 = param0.getFileIdByName(param3, param2, var5_int);
          stackIn_4_0 = ResourceArchive.loadBitmapFont(param4, (byte) -114, var6, var5_int, param0);
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
          throw sd.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, Sprite[] param1, int param2, int param3, Sprite[] param4, int param5, BitmapFont param6, int param7, BitmapFont param8, int param9, int param10, int param11, int param12, int param13) {
        try {
          SecondaryNodeDequeIterator.a(123);
          if (param12 != 25574) {
            ai.clearStaticReferences(-124);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "ai.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
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
          if (null == AwtRasterBuffer.field_f ||
            !(AwtRasterBuffer.field_f.length >= param2)) {
            AwtRasterBuffer.field_f = new int[param2 * 2];
          }
          if (nf.field_b == null ||
            !(param2 <= nf.field_b.length)) {
            nf.field_b = new int[param2 * 2];
          }
          if (null == MouseWheelSource.field_f ||
            !(param2 <= MouseWheelSource.field_f.length)) {
            MouseWheelSource.field_f = new int[2 * param2];
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
            if (ProxyAuthenticationRequiredException.field_d == null ||
              !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
              ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
              if (ProxyAuthenticationRequiredException.field_d == null ||
                !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
                if (ProxyAuthenticationRequiredException.field_d == null ||
                  !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                  ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                }
              } else {
                if (null == jk.field_c) {
                  jk.field_c = new int[2 * (param2 + param0)];
                  if (ProxyAuthenticationRequiredException.field_d == null ||
                    !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                    ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                  }
                } else {
                  if (jk.field_c.length < param0 + param2) {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (ProxyAuthenticationRequiredException.field_d == null ||
                      !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                      ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                    }
                  } else {
                    if (ProxyAuthenticationRequiredException.field_d == null) {
                      ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                    } else {
                      if (ProxyAuthenticationRequiredException.field_d.length < param2) {
                        ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          if (oh.field_c.length >= param2) {
            if (null == AwtRasterBuffer.field_f ||
              !(AwtRasterBuffer.field_f.length >= param2)) {
              AwtRasterBuffer.field_f = new int[param2 * 2];
            }
            if (nf.field_b == null ||
              !(param2 <= nf.field_b.length)) {
              nf.field_b = new int[param2 * 2];
            }
            if (null == MouseWheelSource.field_f ||
              !(param2 <= MouseWheelSource.field_f.length)) {
              MouseWheelSource.field_f = new int[2 * param2];
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
              if (ProxyAuthenticationRequiredException.field_d == null ||
                !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
                if (ProxyAuthenticationRequiredException.field_d == null ||
                  !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                  ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
                  if (ProxyAuthenticationRequiredException.field_d == null ||
                    !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                    ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                  }
                } else {
                  if (null == jk.field_c) {
                    jk.field_c = new int[2 * (param2 + param0)];
                    if (ProxyAuthenticationRequiredException.field_d == null ||
                      !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                      ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                    }
                  } else {
                    if (jk.field_c.length < param0 + param2) {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (ProxyAuthenticationRequiredException.field_d == null ||
                        !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                        ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                      }
                    } else {
                      if (ProxyAuthenticationRequiredException.field_d == null) {
                        ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                      } else {
                        if (ProxyAuthenticationRequiredException.field_d.length < param2) {
                          ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            oh.field_c = new int[param2 * 2];
            if (null == AwtRasterBuffer.field_f ||
              !(AwtRasterBuffer.field_f.length >= param2)) {
              AwtRasterBuffer.field_f = new int[param2 * 2];
            }
            if (nf.field_b == null ||
              !(param2 <= nf.field_b.length)) {
              nf.field_b = new int[param2 * 2];
            }
            if (null == MouseWheelSource.field_f ||
              !(param2 <= MouseWheelSource.field_f.length)) {
              MouseWheelSource.field_f = new int[2 * param2];
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
              if (ProxyAuthenticationRequiredException.field_d == null) {
                ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
              } else {
                if (ProxyAuthenticationRequiredException.field_d.length < param2) {
                  ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
                if (ProxyAuthenticationRequiredException.field_d == null ||
                  !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                  ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
                    if (ProxyAuthenticationRequiredException.field_d == null ||
                      !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                      ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                    }
                  } else {
                    if (jk.field_c.length < param0 + param2) {
                      jk.field_c = new int[2 * (param2 + param0)];
                      if (ProxyAuthenticationRequiredException.field_d == null ||
                        !(ProxyAuthenticationRequiredException.field_d.length >= param2)) {
                        ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                      }
                    } else {
                      if (ProxyAuthenticationRequiredException.field_d == null) {
                        ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                      } else {
                        if (ProxyAuthenticationRequiredException.field_d.length < param2) {
                          ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
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
                  if (ProxyAuthenticationRequiredException.field_d == null) {
                    ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                  } else {
                    if (ProxyAuthenticationRequiredException.field_d.length < param2) {
                      ProxyAuthenticationRequiredException.field_d = new boolean[2 * param2];
                    }
                  }
                }
              }
            }
          }
        }
        lh.field_s = -2147483648;
        t.field_u = 2147483647;
        DelayedPcmStream.field_p = 0;
        og.field_b = 2147483647;
        EmailFormatValidator.field_j = -2147483648;
    }

    public static void clearStaticReferences(int param0) {
        field_a = null;
        field_g = null;
        if (param0 != 0) {
          field_h = (BitmapFont) null;
          field_h = null;
          return;
        }
        field_h = null;
    }

    final void a(int param0, long param1, DualLinkNode param2) {
        DualLinkNode var5 = null;
        try {
          if (param2.secondaryPrevious != null) {
            param2.unlinkSecondary(-6242);
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
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "ai.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
