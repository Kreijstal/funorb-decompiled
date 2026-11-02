/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static int field_b;
    static lj field_a;
    static int field_f;
    static String[] field_d;
    IntrusiveNode sentinel;
    private IntrusiveNode cursor;

    final IntrusiveNode pollFirst(byte param0) {
        int var2 = 46 / ((param0 + 1) / 60);
        IntrusiveNode var3 = this.sentinel.next;
        if (var3 != this.sentinel) {
          var3.unlink(true);
          return var3;
        }
        return null;
    }

    final IntrusiveNode next(int param0) {
        IntrusiveNode var2 = this.cursor;
        if (var2 != this.sentinel) {
          if (param0 != -270) {
            field_b = 98;
          }
          this.cursor = var2.next;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final void addLast(IntrusiveNode param0, int param1) {
        try {
          if (param0.previous != null) {
            param0.unlink(true);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          if (param1 > -34) {
            field_f = 42;
          }
          param0.previous.next = param0;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "sl.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 25840) {
          field_b = 58;
        }
    }

    final IntrusiveNode first(byte param0) {
        int var3 = 29 / ((52 - param0) / 51);
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 != this.sentinel) {
          this.cursor = var2.next;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final static void a(boolean param0) {
        Sprite var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Sprite var9 = null;
        int var10 = 0;
        Sprite var11 = null;
        Sprite var12 = null;
        String var14 = null;
        Sprite var16 = null;
        String var17 = null;
        int[] var28 = null;
        int[] var29 = null;
        int[] var30 = null;
        int[] var31 = null;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        int stackIn_53_3 = 0;
        boolean stackIn_59_0 = false;
        boolean stackIn_68_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var9_intLifetime3;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0) {
            IntrusiveDeque.a(92, 123, -107);
          }
          if (IterableNodeHashTable.field_c != null &&
            IterableNodeHashTable.field_c.b(-7957) &&
            IterableNodeHashTable.field_c.b(5, "benefits") &&
            null != sf.field_a &&
            sf.field_a.b(-7957) &&
            sf.field_a.b(5, "benefits")) {
            IntrusiveNode.field_b = qk.a("benefits", "headline", IterableNodeHashTable.field_c, 0);
            me.field_e = qk.a("benefits", "blurbpane", IterableNodeHashTable.field_c, 0);
            NodeHashTableIterator.field_b = qk.a("benefits", "button", IterableNodeHashTable.field_c, 0);
            GzipDecoder.field_b = qk.a("benefits", "signup_text", IterableNodeHashTable.field_c, 0);
            SocketConnector.field_h = qk.a("benefits", "menu_text", IterableNodeHashTable.field_c, 0);
            ub.field_e = qk.a("benefits", "button_frame", IterableNodeHashTable.field_c, 0);
            le.field_e = qk.a("benefits", "arrow", IterableNodeHashTable.field_c, 0);
            tk.field_R = (BitmapFont) ((Object) FullscreenFocusCanvas.a(IterableNodeHashTable.field_c, sf.field_a, "benefits", "large_font", false));
            ek.field_G = (BitmapFont) ((Object) FullscreenFocusCanvas.a(IterableNodeHashTable.field_c, sf.field_a, "benefits", "small_font", false));
            var28 = SoftwareRasterizer.field_i;
            var2 = SoftwareRasterizer.field_g;
            var3 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.a(ck.field_c);
            var11 = new Sprite(4 + le.field_e.field_u, le.field_e.field_x + 4);
            var11.d();
            le.field_e.f(2, 2, vh.field_h);
            ih.a(var11.field_u, 0, 4, var11.field_x, 2, var11, 0, 1);
            le.field_e = var11;
            dh.field_ab = le.field_e.i();
            var12 = new Sprite(195, 221);
            var6 = var12.field_u / 2;
            var12.d();
            tk.field_R.a(ni.a(new String[]{kg.field_db}, 0, gh.field_v), var6, 40, 16777215, -1);
            ek.field_G.a(ni.a(new String[]{kg.field_db}, 0, jl.field_d), var6, 60, 16777215, -1);
            tk.field_R.a(ni.a(new String[]{LevelEntity.field_J}, 0, LocalizedStrings.field_t), var6, 110, 16777215, -1);
            ek.field_G.a(ni.a(new String[]{LevelEntity.field_J}, 0, di.field_n), var6, 130, 16777215, -1);
            tk.field_R.a(ub.field_m, var6, 180, 16777215, -1);
            ek.field_G.a(wi.field_b, var6, 200, 16777215, -1);
            ih.a(var12.field_u, 0, 4, var12.field_x, 3, var12, 0, 1);
            me.field_e.d();
            var12.g(-me.field_e.field_s + 18, -me.field_e.field_p + 241);
            for (var7 = 0; hb.field_g.length > var7; var7++) {
              SecondaryNodeDeque.field_i[var7].d();
              ek.field_G.a(hb.field_g[var7], 3, 3, SecondaryNodeDeque.field_i[var7].field_u - 6, SecondaryNodeDeque.field_i[var7].field_x - 6, vh.field_h, -1, 1, 1, ek.field_G.field_x + ek.field_G.field_K);
              ih.a(SecondaryNodeDeque.field_i[var7].field_u, 0, 4, SecondaryNodeDeque.field_i[var7].field_x, 3, SecondaryNodeDeque.field_i[var7], 0, 1);
            }
            hb.field_g = null;
            dg.field_R = GzipDecoder.field_b.c();
            dg.field_R.d();
            ii.a(SoftwareRasterizer.field_g, 2 * SoftwareRasterizer.field_f / 3, 64, 4, 0, 0);
            SoftwareRasterizer.a(var28, var2, var3);
            SoftwareRasterizer.b(ck.field_c);
            ii.field_a = 390 + (-ub.field_e.field_x + NodeHashTableIterator.field_b.field_x) / 2;
            wc.field_b = (NodeHashTableIterator.field_b.field_u - ub.field_e.field_u) / 2 + 231;
            IterableNodeHashTable.field_c = null;
            pf.field_e = (-ub.field_e.field_u + NodeHashTableIterator.field_b.field_u) / 2 + 434;
            bi.field_i = 390 + (NodeHashTableIterator.field_b.field_x - ub.field_e.field_x) / 2;
          }
          if (lj.field_f == null) {
            return;
          }
          if (vk.field_d != null &&
            tk.field_R != null) {
            var29 = SoftwareRasterizer.field_i;
            var2Lifetime1 = SoftwareRasterizer.field_g;
            var3Lifetime1 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.a(ck.field_c);
            var14 = ni.a(new String[]{nk.field_g[di.field_A]}, 0, ClientException.field_f);
            var5 = tk.field_R.b(var14, IterableNodeHashTable.field_f);
            var6Lifetime1 = tk.field_R.b(var14, IterableNodeHashTable.field_f, tk.field_R.field_K + tk.field_R.field_x);
            var7Lifetime1 = (IterableNodeHashTable.field_f - var5) / 2 + si.field_J;
            var5 += 6;
            var7Lifetime1 -= 3;
            var8 = vk.field_k + (pi.field_b - var6Lifetime1) / 2;
            if (var7Lifetime1 < 0) {
              var9_int = -var7Lifetime1;
              vk.field_d.field_q = vk.field_d.field_q + var9_int * 2;
              vk.field_d.field_s = vk.field_d.field_s + var9_int;
              var7Lifetime1 = var7Lifetime1 + var9_int;
              var5 = var5 + var9_int * 2;
              si.field_J = si.field_J + var9_int;
              rl.field_f = rl.field_f - var9_int;
            }
            var8 -= 3;
            var6Lifetime1 += 6;
            if (vk.field_d.field_q < var5 + var7Lifetime1) {
              var9_intLifetime1 = -vk.field_d.field_q + (var5 + var7Lifetime1);
              rl.field_f = rl.field_f - var9_intLifetime1;
              vk.field_d.field_q = vk.field_d.field_q + 2 * var9_intLifetime1;
              var7Lifetime1 = var7Lifetime1 + var9_intLifetime1;
              si.field_J = si.field_J + var9_intLifetime1;
              vk.field_d.field_s = vk.field_d.field_s + var9_intLifetime1;
              var5 = var5 + var9_intLifetime1 * 2;
            }
            if (var8 < 0) {
              var9_intLifetime2 = -var8;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime2;
              vk.field_d.field_p = vk.field_d.field_p + var9_intLifetime2;
              vk.field_d.field_v = vk.field_d.field_v + var9_intLifetime2 * 2;
              vk.field_k = vk.field_k + var9_intLifetime2;
              var8 = var8 + var9_intLifetime2;
              bh.field_t = bh.field_t - var9_intLifetime2;
            }
            if (vk.field_d.field_v < var6Lifetime1 + var8) {
              var9_intLifetime3 = var8 + (var6Lifetime1 - vk.field_d.field_v);
              vk.field_d.field_p = vk.field_d.field_p + var9_intLifetime3;
              vk.field_d.field_v = vk.field_d.field_v + 2 * var9_intLifetime3;
              var8 = var8 + var9_intLifetime3;
              bh.field_t = bh.field_t - var9_intLifetime3;
              var6Lifetime1 = var6Lifetime1 + 2 * var9_intLifetime3;
              vk.field_k = vk.field_k + var9_intLifetime3;
            }
            vk.field_d.g();
            var9 = new Sprite(vk.field_d.field_q, vk.field_d.field_v);
            var9.d();
            tk.field_R.a(var14, si.field_J, vk.field_k, IterableNodeHashTable.field_f, pi.field_b, 16777215, -1, 1, 1, tk.field_R.field_x + tk.field_R.field_K);
            ih.a(var9.field_q, 0, 4, var9.field_v, 3, var9, 0, 1);
            vk.field_d.d();
            var9.g(0, 0);
            cf.field_c = new Sprite(640, 480);
            cf.field_c.d();
            vk.field_d.b(rl.field_f + (vk.field_d.field_q >> 1), (vk.field_d.field_v >> 1) + bh.field_t, ImageProducerRasterBuffer.field_u, 4096);
            vk.field_d = null;
            cf.field_c.h();
            SoftwareRasterizer.a(var29, var2Lifetime1, var3Lifetime1);
            SoftwareRasterizer.b(ck.field_c);
          }
          if (null != ia.field_l &&
            ek.field_G != null) {
            var30 = SoftwareRasterizer.field_i;
            var2Lifetime2 = SoftwareRasterizer.field_g;
            var3Lifetime2 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.a(ck.field_c);
            var16 = new Sprite(412, 43);
            var17 = ni.a(new String[]{ia.field_l}, 0, DualLinkNode.field_n);
            ia.field_l = null;
            var16.d();
            ek.field_G.a(var17, 3, 3, var16.field_u - 6, var16.field_x - 6, 16777215, -1, 0, 1, ek.field_G.field_K + ek.field_G.field_x);
            ih.a(var16.field_u, 0, 4, var16.field_x, 3, var16, 0, 1);
            lj.field_f.d();
            var16.g(199 - lj.field_f.field_s, 83 - lj.field_f.field_p);
            SoftwareRasterizer.a(var30, var2Lifetime2, var3Lifetime2);
            SoftwareRasterizer.b(ck.field_c);
          }
          if (ProxySocketConnector.field_m != null &&
            null != ek.field_G) {
            var31 = SoftwareRasterizer.field_i;
            var2Lifetime3 = SoftwareRasterizer.field_g;
            var3Lifetime3 = SoftwareRasterizer.field_f;
            SoftwareRasterizer.a(ck.field_c);
            var4 = ek.field_G.b(ImageProducerRasterBuffer.field_r, 640) + 6;
            var5Lifetime1 = var4 + (ProxySocketConnector.field_m.field_q + 20);
            var6Lifetime2 = -(var5Lifetime1 / 2) + 427;
            var7Lifetime2 = 20 + (var6Lifetime2 + ProxySocketConnector.field_m.field_q);
            lj.field_f.d();
            ek.field_G.c(ImageProducerRasterBuffer.field_r, -lj.field_f.field_s + var7Lifetime2, ek.field_G.field_x + (155 - lj.field_f.field_p + ek.field_G.field_K), 16777215, -1);
            ih.a(var4, -lj.field_f.field_s + (var7Lifetime2 - 4), 4, 50, 3, lj.field_f, -lj.field_f.field_p + 155, 1);
            var8Lifetime1 = -((ProxySocketConnector.field_m.field_v - (3 + ek.field_G.field_x + ek.field_G.field_K)) / 2) + (-lj.field_f.field_p + 155);
            ProxySocketConnector.field_m.g(var6Lifetime2 - lj.field_f.field_s, var8Lifetime1);
            SoftwareRasterizer.a(var31, var2Lifetime3, var3Lifetime3);
            SoftwareRasterizer.b(ck.field_c);
            ProxySocketConnector.field_m = null;
          }
          SoftwareRasterizer.a(ck.field_c);
          SoftwareRasterizer.a(16, 16, 608, 112, 15, gf.field_u, ea.field_c);
          SoftwareRasterizer.a(231, 144, 393, 232, 15, gf.field_u, ea.field_c);
          if (IntrusiveNode.field_b != null) {
            IntrusiveNode.field_b.g(0, 0);
          }
          if (null != me.field_e) {
            me.field_e.g(0, 0);
          }
          lj.field_f.g(0, 0);
          if (cf.field_c != null) {
            cf.field_c.g(0, 0);
          }
          if (null != NodeHashTableIterator.field_b &&
            null != ub.field_e) {
            NodeHashTableIterator.field_b.g(231, 390);
            var1 = GzipDecoder.field_b;
            if (0 == of.field_c.field_j) {
              var1 = dg.field_R;
            }
            var1.g(0, 0);
            stackIn_52_0 = 40;
            stackIn_52_1 = 124;
            stackIn_52_2 = ub.field_h;
            if (of.field_c.field_j != 0) {
              stackIn_53_3 = 3;
            } else {
              stackIn_53_3 = 4;
            }
            var2Lifetime4 = (stackIn_52_0 * ga.$cfr$intArgs$a$f0c91481eb80(stackIn_52_1, stackIn_52_2 << stackIn_53_3) >> 16) + 40;
            if (var2Lifetime4 > 0) {
              NodeHashTableIterator.field_b.b(230, 389, var2Lifetime4);
              NodeHashTableIterator.field_b.b(232, 389, var2Lifetime4);
              NodeHashTableIterator.field_b.b(232, 391, var2Lifetime4);
              NodeHashTableIterator.field_b.b(230, 391, var2Lifetime4);
              var1.b(1, 1, var2Lifetime4);
              var1.b(-1, 1, var2Lifetime4);
              var1.b(1, -1, var2Lifetime4);
              var1.b(-1, -1, var2Lifetime4);
            }
            stackIn_59_0 = (of.field_c.field_j == 0);
            tj.a(stackIn_59_0, 5106, bi.field_i, wc.field_b);
          }
          if (null != NodeHashTableIterator.field_b &&
            ub.field_e != null) {
            NodeHashTableIterator.field_b.g(434, 390);
            SocketConnector.field_h.g(0, 0);
            if (of.field_c.field_j == 1) {
              ii.a(NodeHashTableIterator.field_b.field_u - 4, 7 * NodeHashTableIterator.field_b.field_x / 12, 64, 4, 436, 392);
            }
            stackIn_68_0 = (1 == of.field_c.field_j);
            tj.a(stackIn_68_0, 5106, ii.field_a, pf.field_e);
          }
          if (le.field_e != null) {
            var1_int = 357 - le.field_e.field_v / 2;
            le.field_e.g(-le.field_e.field_q + 269, var1_int);
            dh.field_ab.g(586, var1_int);
            if (var1_int < ph.field_d &&
              ph.field_d < le.field_e.field_x + var1_int) {
              var2Lifetime5 = (ga.$cfr$intArgs$a$f0c91481eb80(5, ub.field_h << 4) * 40 >> 16) + 40;
              if (var2Lifetime5 > 0) {
                if (-le.field_e.field_u + 269 < LocalizedStrings.field_u &&
                  LocalizedStrings.field_u < 269) {
                  le.field_e.b(269 + (-le.field_e.field_q - 1), -1 + var1_int, var2Lifetime5);
                  le.field_e.b(1 - le.field_e.field_q + 269, -1 + var1_int, var2Lifetime5);
                  le.field_e.b(268 - le.field_e.field_q, 1 + var1_int, var2Lifetime5);
                  le.field_e.b(1 + (-le.field_e.field_q + 269), var1_int + 1, var2Lifetime5);
                } else {
                  if (586 < LocalizedStrings.field_u &&
                    LocalizedStrings.field_u < le.field_e.field_u + 586) {
                    dh.field_ab.b(585, var1_int - 1, var2Lifetime5);
                    dh.field_ab.b(587, var1_int - 1, var2Lifetime5);
                    dh.field_ab.b(585, 1 + var1_int, var2Lifetime5);
                    dh.field_ab.b(587, 1 + var1_int, var2Lifetime5);
                  }
                }
              }
            }
            DualLinkNode.c(-128);
            SecondaryNodeDeque.field_i[oi.field_j].g(269, 340);
          } else {
            DualLinkNode.c(-128);
            SecondaryNodeDeque.field_i[oi.field_j].g(269, 340);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.wrapException((Throwable) ((Object) var1_ref), "sl.F(" + param0 + ')');
        }
    }

    final static PcmStreamMixer b(int param0) {
        if (param0 != -944) {
          return (PcmStreamMixer) null;
        }
        return GameKeyHandler.field_a;
    }

    final IntrusiveNode b(byte param0) {
        if (param0 != 65) {
          this.d((byte) 1);
        }
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel != var2) {
          this.cursor = var2.previous;
          return var2;
        }
        this.cursor = null;
        return null;
    }

    final void a(int param0) {
        IntrusiveNode var2;
        int var3;
        var3 = TorChallenge.field_F ? 1 : 0;
        while (true) {
          var2 = this.sentinel.next;
          if (var2 != this.sentinel) {
            var2.unlink(true);
            continue;
          }
          break;
        }
        this.cursor = null;
        if (param0 != -14341) {
          field_a = (lj) null;
        }
        return;
    }

    final boolean d(int param0) {
        if (param0 > -113) {
          return false;
        }
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        int stackIn_13_0 = 0;
        int stackIn_22_0 = 0;
        if (param2 == -1) {
          return false;
        }
        var4 = -1 & param2 >> 16;
        param2 = param2 & 65535;
        if (var4 >= 0) {
          if (var4 <= 1) {
            if (param2 >= 0) {
              stackIn_13_0 = (param2 < 3) ? 1 : 0;
            } else {
              stackIn_13_0 = 0;
            }
          } else {
            stackIn_13_0 = 0;
          }
        } else {
          stackIn_13_0 = 0;
        }
        var5 = stackIn_13_0;
        if (param3 != -22981) {
          IntrusiveDeque.a(false);
        }
        if (var5 == 0) {
          return false;
        }
        if (param1 == var4) {
          stackIn_22_0 = (param2 > param0) ? 1 : 0;
        } else {
          stackIn_22_0 = 0;
        }
        var6 = stackIn_22_0;
        return var6 != 0;
    }

    final IntrusiveNode d(byte param0) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 != this.sentinel) {
          if (param0 >= -103) {
            IntrusiveDeque.a(false);
          }
          var2.unlink(true);
          return var2;
        }
        return null;
    }

    final static void a(int param0, int param1, int param2) {
        sd.field_b = param1;
        if (param2 != -6665) {
          field_d = (String[]) null;
        }
        kj.field_G = param0;
    }

    final void a(byte param0, IntrusiveNode param1) {
        try {
          if (param0 < 76) {
            this.b((byte) 15);
          }
          if (param1.previous != null) {
            param1.unlink(true);
          }
          param1.previous = this.sentinel;
          param1.next = this.sentinel.next;
          param1.previous.next = param1;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.wrapException((Throwable) ((Object) runtimeException), "sl.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode e(byte param0) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        int var3 = 91 % ((param0 + 42) / 61);
        this.cursor = var2.previous;
        return var2;
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    static {
        field_d = new String[]{"Score and multiplier.", "Collected seals. Ordered from left to right by location on tower from bottom to top.", "Life force. The small growing hit point turns into a new hit point for every 5 seals that you collect.", "Lives remaining."};
        field_b = 0;
    }
}
