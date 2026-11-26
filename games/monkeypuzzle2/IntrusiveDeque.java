/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntrusiveDeque {
    static PlatformTaskDispatcher field_g;
    static vd field_a;
    static kc field_b;
    static ta field_c;
    IntrusiveNode sentinel;
    static float field_h;
    static String field_d;
    private IntrusiveNode iterationCursor;

    final void clear(byte param0) {
        IntrusiveNode var2;
        int var3;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        while (true) {
          var2 = this.sentinel.previous;
          if (this.sentinel != var2) {
            var2.unlink(param0 - 19943);
            continue;
          }
          break;
        }
        if (param0 == 121) {
          this.iterationCursor = null;
          return;
        }
        field_b = (kc) null;
        this.iterationCursor = null;
        return;
    }

    final static byte[] a(int param0, CharSequence param1) {
        byte[] stackIn_68_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param1.length();
          var3 = new byte[var2_int];
          var4 = 0;
          if (param0 != 3231) {
            field_a = (vd) null;
          }
          while (var2_int > var4) {
            {
              var5 = param1.charAt(var4);
              if ((0 >= var5 ||
                128 <= var5) && (var5 < 160 ||
                var5 > 255)) {
                switch (var5) {
                  case 8364:
                    var3[var4] = (byte)-128;
                    break;
                  case 8218:
                    var3[var4] = (byte)-126;
                    break;
                  case 402:
                    var3[var4] = (byte)-125;
                    break;
                  case 8222:
                    var3[var4] = (byte)-124;
                    break;
                  case 8230:
                    var3[var4] = (byte)-123;
                    break;
                  case 8224:
                    var3[var4] = (byte)-122;
                    break;
                  case 8225:
                    var3[var4] = (byte)-121;
                    break;
                  case 710:
                    var3[var4] = (byte)-120;
                    break;
                  case 8240:
                    var3[var4] = (byte)-119;
                    break;
                  case 352:
                    var3[var4] = (byte)-118;
                    break;
                  case 8249:
                    var3[var4] = (byte)-117;
                    break;
                  case 338:
                    var3[var4] = (byte)-116;
                    break;
                  case 381:
                    var3[var4] = (byte)-114;
                    break;
                  case 8216:
                    var3[var4] = (byte)-111;
                    break;
                  case 8217:
                    var3[var4] = (byte)-110;
                    break;
                  case 8220:
                    var3[var4] = (byte)-109;
                    break;
                  case 8221:
                    var3[var4] = (byte)-108;
                    break;
                  case 8226:
                    var3[var4] = (byte)-107;
                    break;
                  case 8211:
                    var3[var4] = (byte)-106;
                    break;
                  case 8212:
                    var3[var4] = (byte)-105;
                    break;
                  case 732:
                    var3[var4] = (byte)-104;
                    break;
                  case 8482:
                    var3[var4] = (byte)-103;
                    break;
                  case 353:
                    var3[var4] = (byte)-102;
                    break;
                  case 8250:
                    var3[var4] = (byte)-101;
                    break;
                  case 339:
                    var3[var4] = (byte)-100;
                    break;
                  case 382:
                    var3[var4] = (byte)-98;
                    break;
                  case 376:
                    var3[var4] = (byte)-97;
                    break;
                  default:
                    var3[var4] = (byte)63;
                    break;
                }
              } else {
                var3[var4] = (byte)var5;
              }
            }
            var4++;
          }
          stackIn_68_0 = var3;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_71_0 = var2;
          stackIn_71_1 = new StringBuilder().append("pj.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static void a(int param0, d param1, boolean param2) {
        hb var7 = null;
        hb var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var7 = SectorCacheStore.field_c;
          var8 = var7;
          var8.b(param2, param0);
          var8.position = var8.position + 1;
          var4 = var8.position;
          var8.writeByte(1, -49152);
          var8.writeShort(param1.field_n, 121);
          var8.writeShort(param1.field_m, 88);
          var8.writeShort(param1.field_p, 62);
          var8.writeInt(-803539344, param1.field_o);
          var8.writeInt(-803539344, param1.field_i);
          var8.writeInt(-803539344, param1.field_j);
          var8.writeInt(-803539344, param1.field_l);
          var8.writeByte(param1.field_f.length, -49152);
          for (var5 = 0; param1.field_f.length > var5; var5++) {
            var7.writeInt(-803539344, param1.field_f[var5]);
          }
          var8.appendCrc32((byte) -108, var4);
          var8.backpatchByteLength(var8.position - var4, (byte) -124);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pj.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void addLast(IntrusiveNode param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param0.next) {
            param0.unlink(-19822);
          }
          param0.previous = this.sentinel.previous;
          param0.next = this.sentinel;
          param0.next.previous = param0;
          param0.previous.next = param0;
          if (param1 == 13) {
            return;
          }
          this.beginBackward((byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pj.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final IntrusiveNode removeFirst(byte param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          return null;
        }
        var2.unlink(-19822);
        if (param0 == -66) {
          return var2;
        }
        field_h = -1.0866156816482544f;
        return var2;
    }

    final IntrusiveNode removeLast(int param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != 4011) {
          field_c = (ta) null;
          var2 = this.sentinel.previous;
          if (var2 != this.sentinel) {
            var2.unlink(param0 - 23833);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (var2Lifetime1 != this.sentinel) {
          var2Lifetime1.unlink(param0 - 23833);
          return var2Lifetime1;
        }
        return null;
    }

    final static vk a(byte param0, byte[] param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        vk stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (vk) (stackIn_2_0);
          }
          if (param0 <= 9) {
            stackIn_5_0 = (vk) null;
            return stackIn_5_0;
          }
          var2 = new vk(param1, qc.field_P, mb.field_b, da.field_c, ra.field_ab, cb.field_b);
          gb.a(-63);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("pj.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void resetStaticState(int param0) {
        field_d = null;
        if (param0 >= 37) {
          field_c = null;
          field_b = null;
          field_a = null;
          field_g = null;
          return;
        }
        field_h = 1.3061877489089966f;
        field_c = null;
        field_b = null;
        field_a = null;
        field_g = null;
    }

    final int size(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = 0;
        IntrusiveNode var3 = this.sentinel.previous;
        while (this.sentinel != var3) {
          var3 = var3.previous;
          var2++;
        }
        int var4 = 61 / ((param0 - 78) / 46);
        return var2;
    }

    final IntrusiveNode nextForward(boolean param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2.next;
        if (param0) {
          return var2;
        }
        field_h = -0.11541689187288284f;
        return var2;
    }

    final IntrusiveNode nextBackward(byte param0) {
        IntrusiveNode var2 = this.iterationCursor;
        if (this.sentinel == var2) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 == 63) {
          this.iterationCursor = var2.previous;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode beginForward(int param0) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          this.iterationCursor = null;
          return null;
        }
        if (param0 == -1) {
          this.iterationCursor = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final boolean isEmpty(int param0) {
        if (param0 == 11253) {
          return this.sentinel == this.sentinel.previous ? true : false;
        }
        this.sentinel = (IntrusiveNode) null;
        return this.sentinel == this.sentinel.previous ? true : false;
    }

    final IntrusiveNode beginBackward(byte param0) {
        IntrusiveNode var2 = null;
        IntrusiveNode var2Lifetime1;
        if (param0 != -117) {
          IntrusiveDeque.a(false, 11);
          var2 = this.sentinel.previous;
          if (this.sentinel == var2) {
            this.iterationCursor = null;
            return null;
          }
          this.iterationCursor = var2.previous;
          return var2;
        }
        var2Lifetime1 = this.sentinel.previous;
        if (this.sentinel == var2Lifetime1) {
          this.iterationCursor = null;
          return null;
        }
        this.iterationCursor = var2Lifetime1.previous;
        return var2Lifetime1;
    }

    private final void movePrefixToFront(int param0, IntrusiveDeque param1, IntrusiveNode param2) {
        IntrusiveNode var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -16293) {
            field_d = (String) null;
          }
          var4 = this.sentinel.next;
          this.sentinel.next = param2.next;
          param2.next.previous = this.sentinel;
          if (param2 == this.sentinel) {
            return;
          }
          param2.next = param1.sentinel.next;
          param2.next.previous = param2;
          param1.sentinel.next = var4;
          var4.previous = param1.sentinel;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("pj.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void moveAllToFront(IntrusiveDeque param0, int param1) {
        if (param1 != 0) {
          return;
        }
        try {
          this.movePrefixToFront(-16293, param0, this.sentinel.previous);
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "pj.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String b(boolean param0) {
        if (!param0) {
          field_d = (String) null;
          return hf.field_b;
        }
        return hf.field_b;
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        byte[] var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = mk.a(sd.a(37, param1), 480);
          if (param0 < 78) {
            var3 = (byte[]) null;
            IntrusiveDeque.a((byte) -73, (byte[]) null);
          }
          if (var2 == null) {
            var2 = "";
          }
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("pj.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        vl var11 = null;
        int var8Lifetime1;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param1 != 31645) {
            field_b = (kc) null;
          }
          jk.field_B = jk.field_B + 1;
          if (kc.field_d != 0) {
            var2_int = -116 + qg.field_c;
            var3 = DirectByteStorage.field_e - 90;
            var4 = ee.field_F;
            var5 = 0;
            if (!param0) {
              stackIn_8_0 = kg.field_c;
            } else {
              stackIn_8_0 = fg.field_b;
            }
            var6 = stackIn_8_0;
            var7 = 0;
            if (param0) {
              for (var8 = 9; var8 >= 0; var8--) {
                if (0 == (var6 & 1 << var8)) {
                  var7 += 20;
                }
              }
            }
            var8Lifetime1 = var7 + 10;
            var9 = 0;
            while (true) {
              if (var9 < 10) {
                if ((!param0 ||
                  (1 << var9 & var6) != 0) &&
                  lf.a(-19864, var2_int, var3, 40, 40, var8Lifetime1, 10)) {
                  ee.field_F = var9;
                  var5 = 1;
                } else {
                  if (!param0 ||
                    (var6 & 1 << var9) != 0) {
                    var8Lifetime1 += 40;
                  }
                  var9++;
                  continue;
                }
              }
              if (var5 == 0) {
                break;
              }
              if (ee.field_F != var4) {
                break;
              }
              jk.field_B = 0;
              ee.field_F = -1;
              break;
            }
          }
          if (uk.field_r < 0 &&
            fj.field_E != null &&
            fj.field_E.field_j) {
            uk.field_r = fj.field_E.field_e;
            fg.field_b = fg.field_b & ~uk.field_r;
            fj.field_E = null;
            k.field_i = true;
            kg.field_c = kg.field_c | uk.field_r;
          }
          if (ok.a(false)) {
            return;
          }
          while (true) {
            var11 = (vl) (em.field_C.removeLast(4011));
            if (var11 == null) {
              return;
            }
            mh.a(var11, param1 - 31645, 4);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "pj.T(" + param0 + ',' + param1 + ')');
        }
    }

    final void addFirst(int param0, IntrusiveNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != param1.next) {
            param1.unlink(-19822);
          }
          param1.next = this.sentinel.next;
          param1.previous = this.sentinel;
          param1.next.previous = param1;
          param1.previous.next = param1;
          if (param0 == -8212) {
            return;
          }
          field_b = (kc) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("pj.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public IntrusiveDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.next = this.sentinel;
        this.sentinel.previous = this.sentinel;
    }

    static {
        field_b = null;
        field_d = "You have <%0> unread messages!";
    }
}
