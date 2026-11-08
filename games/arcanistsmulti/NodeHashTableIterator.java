/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static PacketBuffer field_a;
    private int field_b;
    private IntrusiveNode field_g;
    private IterableNodeHashTable field_c;
    static SceneWidget field_d;
    private IntrusiveNode field_h;
    static String field_i;
    static boolean field_e;
    static String field_f;
    static int field_j;

    final static void insertSorted(SocialListEntry param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        SocialListEntry var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2_int = 63 / ((64 - param1) / 44);
          param0.unlink(true);
          var3 = (SocialListEntry) (LinkButtonPainter.field_j.first(12623));
          while (var3 != null) {
            if (var3.sortsBefore((byte) 121, param0)) {
              var3 = (SocialListEntry) (LinkButtonPainter.field_j.next(0));
              continue;
            }
            break;
          }
          if (var3 != null) {
            da.insertBefore(var3, 20, param0);
            return;
          }
          LinkButtonPainter.field_j.addLast(param0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_c.field_c[-1 + this.field_b] != this.field_g) {
          var4 = this.field_g;
          this.field_g = var4.next;
          this.field_h = var4;
          return var4;
        }
        do {
          if (this.field_c.field_d <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var3 = this.field_c.field_c[fieldTemp$0].next;
        } while (this.field_c.field_c[-1 + this.field_b] == var3);
        this.field_h = var3;
        this.field_g = var3.next;
        return var3;
    }

    public final void remove() {
        if (null == this.field_h) {
          throw new IllegalStateException();
        }
        this.field_h.unlink(true);
        this.field_h = null;
    }

    private final void reset(int param0) {
        this.field_h = null;
        this.field_g = this.field_c.field_c[0].next;
        if (param0 == -1) {
          this.field_b = 1;
          return;
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (this.field_c.field_c[this.field_b - 1] != this.field_g) {
          return true;
        }
        while (true) {
          if (this.field_c.field_d <= this.field_b) {
            return false;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_c.field_c[fieldTemp$0].next == this.field_c.field_c[this.field_b - 1]) {
            this.field_g = this.field_c.field_c[-1 + this.field_b];
            continue;
          }
          break;
        }
        this.field_g = this.field_c.field_c[-1 + this.field_b].next;
        return true;
    }

    final static void setSettingsCookie(String param0, java.applet.Applet param1, int param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            vm.field_b = param0;
            try {
              var6 = param1.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (param0.length() != param2) {
                var5Lifetime6 = var7 + "; Expires=" + NodeHashTable.formatGmtDate(-62, 94608000000L + qj.monotonicTimeMillis(-26572)) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              JavaScriptBridge.evaluate("document.cookie=\"" + var5Lifetime6 + "\"", param1, param2 ^ 269);
            } catch (Throwable throwable) {
            }
            BattleUnit.updateBrowserLinks(-122, param1);
          } catch (RuntimeException runtimeException) {
            throw aa.wrapException((Throwable) ((Object) runtimeException), "jf.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_f = null;
        if (param0 < -59) {
          field_i = null;
          field_d = null;
          return;
        }
        field_i = (String) null;
        field_i = null;
        field_d = null;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_h = null;
        try {
          this.field_c = param0;
          this.reset(-1);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new PacketBuffer(256);
        field_f = "This is a <col=ff00ff><shad=0>level 2</col></shad> spell and is unavailable unless you also put the related <col=D4D0C8><shad=0>level 1</col></shad> spell <%0> into your spellbook.";
        field_i = "Spell types 2/2:";
    }
}
