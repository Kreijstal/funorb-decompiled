/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeDeque {
    static boolean[][] field_a;
    static String field_c;
    static int field_d;
    IntrusiveNode sentinel;
    private IntrusiveNode cursor;

    final static void a(int param0, int param1) {
        if (param0 <= 11) {
          return;
        }
        hb.field_x = 1000000000L / (long)param1;
    }

    final IntrusiveNode last(int obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        if (obfuscationGuard == 0) {
          this.cursor = var2.previous;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final static String a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_12_0 = null;
        String stackIn_15_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 == param0) {
            stackIn_2_0 = n.field_b;
            return stackIn_2_0;
          }
          if (param0 == 6) {
            stackIn_5_0 = qp.field_b;
            return stackIn_5_0;
          }
          if (param0 == 7) {
            stackIn_9_0 = OptionsScreen.field_w;
            return stackIn_9_0;
          }
          if (param0 == 8) {
            stackIn_12_0 = vg.field_b;
            return stackIn_12_0;
          }
          if (param0 == 9) {
            stackIn_15_0 = BrickMotionPath.field_s;
            return stackIn_15_0;
          }
          if (param0 == 10) {
            stackIn_18_0 = MenuScreen.field_n;
            return stackIn_18_0;
          }
          if (param0 == 11) {
            stackIn_21_0 = AchievementIcon.field_o;
            return stackIn_21_0;
          }
          if (param2 != ~param0) {
            return null;
          }
          stackIn_25_0 = rd.a(fm.field_c, new String[]{param1}, (byte) 103);
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("vl.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != 100) {
          NodeDeque.a(false, 28);
          field_c = null;
          field_a = (boolean[][]) null;
          return;
        }
        field_c = null;
        field_a = (boolean[][]) null;
    }

    final void addFirst(boolean obfuscationGuard, IntrusiveNode node) {
        try {
          if (node.previous != null) {
            node.unlink((byte) 111);
          }
          node.previous = this.sentinel;
          node.next = this.sentinel.next;
          node.previous.next = node;
          if (!obfuscationGuard) {
            NodeDeque.a(107, 77);
          }
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "vl.F(" + obfuscationGuard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode first(int obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.next;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.next;
        if (obfuscationGuard < -6) {
          return var2;
        }
        IntrusiveNode var3 = (IntrusiveNode) null;
        this.addLast((IntrusiveNode) null, (byte) 60);
        return var2;
    }

    final int size(int obfuscationGuard) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        int var4 = BrickABrac.field_J ? 1 : 0;
        IntrusiveNode var3Lifetime1;
        int var2Lifetime1;
        if (obfuscationGuard >= 117) {
          var2 = 0;
          var3 = this.sentinel.next;
          while (this.sentinel != var3) {
            var2++;
            var3 = var3.next;
          }
          return var2;
        }
        field_a = (boolean[][]) null;
        var2Lifetime1 = 0;
        var3Lifetime1 = this.sentinel.next;
        while (this.sentinel != var3Lifetime1) {
          var2Lifetime1++;
          var3Lifetime1 = var3Lifetime1.next;
        }
        return var2Lifetime1;
    }

    final void addLast(IntrusiveNode node, byte obfuscationGuard) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != node.previous) {
            node.unlink((byte) 111);
          }
          node.previous = this.sentinel.previous;
          node.next = this.sentinel;
          node.previous.next = node;
          node.next.previous = node;
          if (obfuscationGuard == 3) {
            return;
          }
          this.removeFirst(-52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("vl.H(");
          if (node == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        sb.field_c = !param0 ? new vj(mh.field_Z, ji.field_b) : new vj(ie.field_u, t.field_f);
        qa.field_w = new mh(0L, (mh) null);
        qa.field_w.a(sb.field_c.field_d, 0);
        qa.field_w.a(ij.field_e, 0);
        wi.field_j = new mh(0L, MenuSelection.field_m);
        MembershipBenefitsScreen.field_t = new mh(0L, (mh) null);
        wi.field_j.a(pk.field_h, 0);
        wi.field_j.a(MembershipBenefitsScreen.field_t, 0);
        int var2 = -67 / ((1 - param1) / 63);
        MembershipBenefitsScreen.field_t.a(Ball.field_A, 0);
        MembershipBenefitsScreen.field_t.a(nd.field_a, 0);
        kj.a(true, param0);
    }

    final boolean isEmpty(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return false;
        }
        return this.sentinel == this.sentinel.next ? true : false;
    }

    final IntrusiveNode next(byte obfuscationGuard) {
        IntrusiveNode var2 = this.cursor;
        if (var2 == this.sentinel) {
          this.cursor = null;
          return null;
        }
        if (obfuscationGuard == 116) {
          this.cursor = var2.next;
          return var2;
        }
        return (IntrusiveNode) null;
    }

    final IntrusiveNode removeLast(int obfuscationGuard) {
        IntrusiveNode var2 = this.sentinel.previous;
        if (var2 != this.sentinel) {
          int var3 = 107 / ((51 - obfuscationGuard) / 59);
          var2.unlink((byte) 111);
          return var2;
        }
        return null;
    }

    final void clear(byte obfuscationGuard) {
        int var3;
        IntrusiveNode var5;
        IntrusiveNode var4;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard <= -43) {
          while (true) {
            var4 = this.sentinel.next;
            if (this.sentinel != var4) {
              var4.unlink((byte) 111);
              continue;
            }
            break;
          }
          this.cursor = null;
          return;
        }
        this.size(115);
        while (true) {
          var5 = this.sentinel.next;
          if (this.sentinel != var5) {
            var5.unlink((byte) 111);
            continue;
          }
          break;
        }
        this.cursor = null;
        return;
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
              if (param1 <= -42) {
                return;
              }
              NodeDeque.a(false, -57);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("vl.N(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw qb.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final IntrusiveNode a(byte param0, IntrusiveNode param1) {
        IntrusiveNode var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        IntrusiveNode stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 94) {
            this.cursor = (IntrusiveNode) null;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.sentinel.next;
          }
          if (var3 != this.sentinel) {
            this.cursor = var3.next;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.cursor = null;
          stackIn_7_0 = null;
          return (IntrusiveNode) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vl.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final IntrusiveNode removeFirst(int obfuscationGuard) {
        if (obfuscationGuard != 3) {
          return (IntrusiveNode) null;
        }
        IntrusiveNode var2 = this.sentinel.next;
        if (this.sentinel != var2) {
          var2.unlink((byte) 111);
          return var2;
        }
        return null;
    }

    final static void a(vm param0, int param1, boolean param2) {
        try {
          vj.a(param2, 256, (byte) 121, param0);
          if (param1 != -27300) {
            field_a = (boolean[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "vl.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode previous(int obfuscationGuard) {
        int var2 = 23 % ((obfuscationGuard + 65) / 45);
        IntrusiveNode var3 = this.cursor;
        if (this.sentinel == var3) {
          this.cursor = null;
          return null;
        }
        this.cursor = var3.previous;
        return var3;
    }

    public NodeDeque() {
        this.sentinel = new IntrusiveNode();
        this.sentinel.previous = this.sentinel;
        this.sentinel.next = this.sentinel;
    }

    static {
        field_c = "Played";
        field_d = 3;
    }
}
